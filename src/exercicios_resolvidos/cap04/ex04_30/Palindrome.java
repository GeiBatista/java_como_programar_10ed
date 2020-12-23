package exercicios_resolvidos.cap04.ex04_30;

// Exercise 4.30 Solution: Palindrome.java
// Program tests for a palindrome
import java.util.Scanner;

public class Palindrome
{
   // checks if a 5-digit number is a palindrome
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number = 0;
      int digits = 0;

      // Ask for a number until it is five digits
      while (digits != 5)
      {
         System.out.print("Enter a 5-digit number: ");
         number = input.nextInt();

         if (number < 100000)
         {
            if (number > 9999)
               digits = 5;
            else
               System.out.println("Number must be 5 digits");
         } 
         else
            System.out.println("Number must be 5 digits");
      } 

      // get the digits
      int digit1 = number / 10000;
      int digit2 = number % 10000 / 1000;
      int digit4 = number % 10000 % 1000 % 100 / 10;
      int digit5 = number % 10000 % 1000 % 100 % 10;

      // print whether the number is a palindrome
      System.out.print(number);

      if (digit1 == digit5)
      {
         if (digit2 == digit4)
            System.out.println(" is a palindrome!!!");
         else
            System.out.println(" is not a palindrome.");
      }
      else
         System.out.println(" is not a palindrome.");
   } 
} // end class Palindrome


/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

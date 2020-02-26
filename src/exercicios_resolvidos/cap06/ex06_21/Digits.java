package exercicios_resolvidos.cap06.ex06_21;

// Exercise 6.21 Solution: Digits.java
// Program separates a five-digit number
// into its individual digits.
import java.util.Scanner;

public class Digits
{
   // displays the individual digits of a number
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print(
         "Enter an integer in the range 1-100000 (0 to exit): ");
      int number = input.nextInt();
      
      while (number != 0)
      {
         if (number <= 99999 && number >= 1)
            displayDigits(number);
         else 
            System.out.println("number must be between 1 and 99999");

         System.out.print(
            "Enter an integer in the range 1-100000 (0 to exit): ");
         number = input.nextInt();
      } 
   }

   // part A
   public static int quotient(int a, int b)
   {
      return a / b;
   }

   // part B
   public static int remainder(int a, int b)
   {
      return a % b;
   } 

   // part C
   public static void displayDigits(int number)
   {
      int divisor = 1, digit;
      String result = "";

      // Loop for highest divisor
      for (int i = 1; i < number; i *= 10)
         divisor = i;

      while (divisor >= 1) 
      {
         digit = quotient(number, divisor);

         result += digit + "  ";

         number = remainder(number, divisor);
         divisor = quotient(divisor, 10);
      } 

      System.out.println(result);
   } 
} // end class Digits


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

package exercicios_resolvidos.cap06.ex06_26;

// Exercise 6.26 Solution: Reverse.java
// Program takes a number and prints it out
// with its digits reversed.
import java.util.Scanner;

public class Reverse
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer (-1 to exit): ");
      int number = input.nextInt();
      
      while (number != -1)
      {
         System.out.printf("%d reversed is %d%n%n",
         number, reverseDigits(number));
         
         System.out.print("Enter an integer (-1 to exit): ");
         number = input.nextInt();
      } 
   } 

   // return parameter number with digits reversed
   public static int reverseDigits(int number)
   {
      int reverseNumber = 0; // the number in reverse order
      int placeValue; // the value at the current place
      
      while (number > 0)
      {
         placeValue = number % 10;
         number = number / 10;
         reverseNumber = reverseNumber * 10 + placeValue;
      } 
      
      return reverseNumber;
   } 
} // end class Reverse



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

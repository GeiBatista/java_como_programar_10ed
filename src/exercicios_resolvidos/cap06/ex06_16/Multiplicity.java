package exercicios_resolvidos.cap06.ex06_16;

// Exercise 6.16 Solution: Multiplicity.java
// Determines if the second number entered is a multiple of the first.
import java.util.Scanner;

public class Multiplicity
{
   // checks if the second number is a multiple of the first
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);

      int first; // the first number
      int second; // the second number 
      
      System.out.print("Enter first number (0 to exit): ");
      first = input.nextInt();
      
      // use 0 as the sentinel value, since we cannot divide by zero
      while (first != 0)
      {
         System.out.print("Enter second number: ");
         second = input.nextInt();

         if (multiple(first, second))
            System.out.printf("%d is a multiple of %d%n%n",
               second, first);
         else
            System.out.printf("%d is not a multiple of %d%n%n",
               second, first);
         
         System.out.print("Enter first number (0 to exit): ");
         first = input.nextInt();
      }
   } 

   // determine if first int is a multiple of the second
   public static boolean multiple(int firstNumber, int secondNumber)
   {
      return secondNumber % firstNumber == 0;
   } 
} // end class Multiplicity


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

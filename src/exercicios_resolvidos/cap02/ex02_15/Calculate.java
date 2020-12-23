package exercicios_resolvidos.cap02.ex02_15;

// Exercise 2.15 Solution: Calculate.java
// Prints the sum, product, difference and quotient of two numbers.
import java.util.Scanner;

public class Calculate 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int number1; // first number
      int number2; // second number
      
      System.out.print("Enter first integer: "); // prompt for input
      number1 = input.nextInt(); // read first integer

      System.out.print("Enter second integer: "); // prompt for input
      number2 = input.nextInt(); // read second integer

      // display results
      System.out.printf("%nSum is %d%n", (number1 + number2));
      System.out.printf("Product is %d%n", (number1 * number2));
      System.out.printf("Difference is %d%n", (number1 - number2));
      System.out.printf("Quotient is %d%n", (number1 / number2));
   } // end main
}  // end class Calculate



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

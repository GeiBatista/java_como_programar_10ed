package exercicios_resolvidos.cap02.ex02_16;

// Exercise 2.16 Solution: Larger.java
// Program that determines the larger of two numbers.
import java.util.Scanner;

public class Larger 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int number1; // first number to compare
      int number2; // second number to compare

      System.out.print("Enter first integer: "); // prompt for input
      number1 = input.nextInt(); // read first number

      System.out.print("Enter second integer: "); // prompt for input
      number2 = input.nextInt(); // read second number

      if (number1 > number2)
         System.out.printf("%d is larger%n", number1);

      if (number1 < number2)
         System.out.printf("%d is larger%n", number2);

      if (number1 == number2)
         System.out.println("These numbers are equal");
   } // end main
} // end class Larger


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

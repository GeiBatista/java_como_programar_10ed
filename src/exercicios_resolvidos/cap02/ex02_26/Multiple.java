package exercicios_resolvidos.cap02.ex02_26;

// Exercise 2.26 Solution: Multiple.java
// Program determines if the first number entered is a multiple 
// of the second number entered.
import java.util.Scanner;

public class Multiple 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int firstNumber; 
      int secondNumber;

      System.out.print("Enter first number: "); // prompt for input
      firstNumber = input.nextInt(); // read first number

      System.out.print("Enter second number: "); // prompt for input
      secondNumber = input.nextInt(); // read second number

      // determine whether firstNumber is a multiple of secondNumber
      if (firstNumber % secondNumber == 0)
         System.out.printf("%d is a multiple of %d%n", 
            firstNumber, secondNumber);
      
      if (firstNumber % secondNumber != 0)
         System.out.printf("%d is not a multiple of %d%n", 
            firstNumber, secondNumber);
   } // end main
} // end class Multiple


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

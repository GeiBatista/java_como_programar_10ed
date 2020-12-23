package exercicios_resolvidos.cap06.ex06_39;

// Exercise 6.39 Solution: ComputerAssistedInstructionTest.java
// Test application for class Multiply
import java.util.Scanner;

public class ComputerAssistedInstructionTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int difficultyLevel; // 1=single-digit numbers, 2=two-digit numbers, etc.
      int operationType; // 1=addition, 2=substraction, 3=multiplication, 4=division, 5=random

      System.out.println("NOTE: All operations use integer arithmetic.\n");

      // prompts the user to enter a grade level
      System.out.print(
         "Enter the difficulty level (1=single digits, 2=two digits, etc.): ");
      difficultyLevel = input.nextInt();

      // prompts the user to enter an operation type
      do
      {
         System.out.println("\n1 = addition");
         System.out.println("2 = subtraction");
         System.out.println("3 = mutiplication");
         System.out.println("4 = division");
         System.out.println("5 = mixed operations");
         System.out.print("Enter the operation (1 to 5): ");
         operationType = input.nextInt();
      } while ((operationType < 1) || (operationType > 5));

      ComputerAssistedInstruction application = 
         new ComputerAssistedInstruction(difficultyLevel, operationType);

      int guess; // the user's guess

      application.createQuestion(); // display the first question

      System.out.print("Enter your answer (-1 to exit): ");
      guess = input.nextInt();

      while (guess != -1)
      {
         application.checkResponse(guess);
         
         System.out.print("Enter your answer (-1 to exit): ");
         guess = input.nextInt();
      } // end while
   } // end main   
} // end class ComputerAssistedInstructionTest


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

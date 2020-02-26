package exercicios_resolvidos.cap06.ex06_35;

// Exercise 6.35 Solution: ComputerAssistedInstruction.java
// Program generates single-digit multiplication problems
import java.util.Random;

public class ComputerAssistedInstruction
{
   private static final Random randomNumbers = new Random();
   private int answer; // the correct answer
      
   // prints a new question and stores the corresponding answer
   public void createQuestion()
   {
      // get two random numbers between 0 and 9
      int digit1 = randomNumbers.nextInt(10);
      int digit2 = randomNumbers.nextInt(10);

      answer = digit1 * digit2;
      System.out.printf("How much is %d times %d?\n", digit1, digit2);
   } // end method createQuestion
   
   // checks if the user answered correctly
   public void checkResponse(int guess)
   {
      if (guess != answer)
         System.out.println("No. Please try again.");
      else
      {
         System.out.println("Very Good!\n");
         createQuestion();
      } // end else      
   } // end method checkResponse   
} // end class ComputerAssistedInstruction


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

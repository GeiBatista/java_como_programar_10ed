package exercicios_resolvidos.cap06.ex06_36;

// Exercise 6.36 Solution: ComputerAssistedInstruction.java
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
         System.out.println(createResponse(false));
      else
      {
         System.out.printf("%s\n\n", createResponse(true));
         createQuestion();
      } // end else      
   } // end method checkResponse   

   // create a new response
   public String createResponse(boolean correct)
   {
      if (correct)
         switch (randomNumbers.nextInt(4))
         {
            case 0:
               return("Very good!");

            case 1:
               return("Excellent!");

            case 2:
               return("Nice work!");

            case 3:
               return("Keep up the good work!");
         } // end switch

      // otherwise, assume incorrect
      switch (randomNumbers.nextInt(4))
      {
         case 0:
            return("No. Please try again.");

         case 1:
            return("Wrong. Try once more.");

         case 2:
            return("Don't give up!");

         case 3: default:
            return("No. Keep trying.");
      } // end switch
   } // end method createResponse
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

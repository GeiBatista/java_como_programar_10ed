package exercicios_resolvidos.cap06.ex06_38;

// Exercise 6.38 Solution: ComputerAssistedInstruction.java
// Program generates single-digit multiplication problems
import java.util.Random;

public class ComputerAssistedInstruction
{
   private static final Random randomNumbers = new Random();
   private int answer; // the correct answer
   private int questionsAnswered; // number of questions answered
   private int correctAnswers; // number of correct answers
   private int difficulty; // the question difficulty
      
   // constructor initializes the difficulty level
   public ComputerAssistedInstruction(int difficultyLevel)
   {
      if (difficultyLevel > 0)
         difficulty = difficultyLevel;
      else
      {
         System.out.println("Difficulty level must be greater than 0");
         System.out.println("Setting difficulty level to 1");
         difficulty = 1;
      } // end else
   } // end constructor

   // prints a new question and stores the corresponding answer
   public void createQuestion()
   {
      // determine the range of values
      int startRange = (int) Math.pow(10, difficulty - 1);
      int endRange = (int) Math.pow(10, difficulty);

      // allow 0 to start the range for single-digit numbers
      if (startRange == 1)
         startRange = 0;

      // get two random numbers from 0 up to range
      int number1 = getRandomNumberInRange(startRange, endRange);
      int number2 = getRandomNumberInRange(startRange, endRange);

      answer = number1 * number2;
      System.out.printf("How much is %d times %d?\n", number1, number2);
   } // end method createQuestion

   // pick random number in the range start to end - 1
   public int getRandomNumberInRange(int start, int end)
   {
      int number;

      do
      {
         number = randomNumbers.nextInt(end);
      } while (number < start);

      return number;
   } // end method getRandomNumberInRange
   
   // checks if the user answered correctly
   public void checkResponse(int guess)
   {
      ++questionsAnswered;

      if (guess != answer)
         System.out.println(createResponse(false));
      else
      {
         ++correctAnswers; 
         System.out.printf("%s\n\n", createResponse(true));

         if (questionsAnswered < 10)
            createQuestion();
      } // end else      

      if (questionsAnswered >= 10)
      {
         double percentage = calculatePercentage();

         System.out.printf("\nYou scored %.0f%%\n", percentage * 100);

         if (percentage < 0.75)
            System.out.println("Please ask your instructor for extra help.");

         // start over
         System.out.println();
         correctAnswers = 0;
         questionsAnswered = 0;
         createQuestion();
      } // end if   
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

   // determine how the user is faring
   public double calculatePercentage()
   {
      return (double) correctAnswers / questionsAnswered;
   } // end method calculatePercentage
   
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

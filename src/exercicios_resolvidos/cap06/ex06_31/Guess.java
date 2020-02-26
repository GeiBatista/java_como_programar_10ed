package exercicios_resolvidos.cap06.ex06_31;

// Exercise 6.31 Solution: Guess.java
// Program plays guess the number.
import java.util.Random;
import java.util.Scanner;

public class Guess
{
   private static final Random randomNumbers = new Random();
   private static int answer; 
   private static boolean gameOver = false; 
   private static int totalGuesses = 0;

   // play games of guess the number
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);      
            
      while (!gameOver)
      {
         newGame(); // start a new game

         do
         {
            System.out.print("Guess (1 - 1000): ");         
            checkUserGuess(input.nextInt());
         } while (!gameOver);

         if (gameOver)
         {
            System.out.print("Play again (1=yes, 2=no)? ");
            int playAgain = input.nextInt();

            // if playAgain is 1, set gameOver back to false
            if (playAgain == 1)
               gameOver = false;
         } 
      } 
   }

   // create a new number to guess
   public static int getNumber()
   {      
      return 1 + randomNumbers.nextInt(1000);
   }
   
   // starts a new game
   public static void newGame()
   {
      answer = getNumber();
      totalGuesses = 0; 
      System.out.printf("%nGuess a number between 1 and 1000%n");
   } 

   // checks user input
   public static void checkUserGuess(int userGuess)
   {
      ++totalGuesses; // increment count of user guesses

      if (userGuess < answer)
         System.out.printf("%d is too low. Try again.%n", userGuess);
      else if (userGuess > answer)
         System.out.printf("%d is too high. Try again.%n", userGuess);
      else
      {
         gameOver = true; 
         displayMessage();
      } 
   } 
   
   // print a message based on the number of tries
   public static void displayMessage()
   {
      System.out.printf("You guessed the number in %d tries%n", totalGuesses);
      
      if (totalGuesses < 10)
         System.out.printf("Either you know the secret or you got lucky!%n%n");
      else if (totalGuesses == 10)
        System.out.printf("Aha! You know the secret!%n%n");
      else
         System.out.printf("You should be able to do better!%n%n");
   } 
} // end class Guess


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

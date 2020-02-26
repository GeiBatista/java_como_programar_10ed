package exercicios_resolvidos.cap06.ex06_33;

// Exercise 6.33 Solution: Craps.java
// Craps class simulates the dice game craps.
import java.util.Random;
import java.util.Scanner;

public class Craps 
{
   // create random number generator for use in method rollDice
   private static final Random randomNumbers = new Random(); 

   // enumeration with constants that represent the game status
   private enum Status { CONTINUE, WON, LOST };

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   private static int bankBalance; // user's bank balance
   private static int wager; // the current wager   

   // allows the user to bet on games of Craps
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      bankBalance = 1000; // start the user off with $1000

      do
      {
         // prompt the user for a wager
         System.out.printf("Current balance is %d%n", bankBalance);
         System.out.print("Enter wager (-1 to quit): ");
         wager = input.nextInt();
         
         if (wager >= 0)
         {
            if (wager > bankBalance)
               System.out.println("You don't have enough money!");
            else
            {
               play(); // play a game
            
               if (bankBalance <= 0)
                  System.out.println("Sorry. You busted!");
               else
                  System.out.println(chatter());
            } // end else
            
            // reset the wager
            wager = 0;
            System.out.println();
         } 
      } while ((wager != -1) && (bankBalance > 0)); // terminate if the user quits or runs out of money
   } t
   
   // plays one game of craps
   public static void play()
   {
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int sumOfDice = rollDice(); // first roll of the dice

      // determine game status and point based on first roll 
      switch (sumOfDice) 
      {
         case SEVEN: // win with 7 on first roll
         case YO_LEVEN: // win with 11 on first roll           
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // lose with 2 on first roll
         case TREY: // lose with 3 on first roll
         case BOX_CARS: // lose with 12 on first roll
            gameStatus = Status.LOST;
            break;
         default: // did not win or lose, so remember point         
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point
            System.out.printf("Point is %d%n", myPoint);
            break; 
      } 

      // while game is not complete
      while (gameStatus == Status.CONTINUE) // not WON or LOST
      { 
         sumOfDice = rollDice(); // roll dice again

         // determine game status
         if (sumOfDice == myPoint) // win by making point
            gameStatus = Status.WON;
         else 
            if (sumOfDice == SEVEN) // lose by rolling 7 before point
               gameStatus = Status.LOST;
      } // end while 

      // display won or lost message and change the balance
      if (gameStatus == Status.WON)
      {
         System.out.println("Player wins");
         bankBalance += wager;
      } 
      else
      {
         System.out.println("Player loses");
         bankBalance -= wager;
      } 
   } 

   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      System.out.printf("Player rolled %d + %d = %d%n", 
         die1, die2, sum);

      return sum;
   } 

   // randomly chooses a phrase to respond to the player's action
   public static String chatter()
   {
      switch (randomNumbers.nextInt(5))
      {
         case 0:
            return "Oh, you're going for broke huh?";
         case 1:
            return "Aw cmon, take a chance!";
         case 2:
            return "You're up big. Now's the time to cash in your chips!";
         case 3:
            return "You're way too lucky! ";
         default:
            return "I'm betting all my money on you.";
      }
   }
} // end class Craps

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

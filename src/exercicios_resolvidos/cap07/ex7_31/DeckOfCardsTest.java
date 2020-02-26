package exercicios_resolvidos.cap07.ex7_31;

// Exercise 7.31 Solution: DeckOfCardsTest.java
// Card shuffling and dealing application.

public class DeckOfCardsTest
{
   // execute application
   public static void main(String[] args)
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      
      Card[] hand1 = new Card[5]; // store first hand
      Card[] hand2 = new Card[5]; // store second hand

      // get first five cards
      for (int i = 0; i < 5; i++)
      {
         hand1[i] = myDeckOfCards.dealCard(); // get next card
         hand2[i] = myDeckOfCards.dealCard(); // get next card
      } 

      // print hand1 and hand2
      System.out.printf("%-20s%-20s\n", "Left hand:", "Right hand:");

      for (int i = 0; i < hand1.length; i++)
         System.out.printf("%-20s%-20s\n", hand1[i], hand2[i]);

      // display result
      System.out.println("\nHand Values:");
      myDeckOfCards.compareTwoHands(hand1, hand2); // compare two hands
   } 
} // end class DeckOfCardsTest


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

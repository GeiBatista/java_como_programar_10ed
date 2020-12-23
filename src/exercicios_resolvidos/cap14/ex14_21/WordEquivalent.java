package exercicios_resolvidos.cap14.ex14_21;

// Exercise 14.21 Solution: WordEquivalent.java
// Application that outputs the word equivalent of a dollar amount
import java.util.Scanner;

public class WordEquivalent
{  
   public static void main(String args[]) 
   {
      // get amount
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a dollar amount:");
      String amount = scanner.next();

      // create DollarAmountInWord to convert amount
      DollarAmountInWord dollarAmountInWord = 
         new DollarAmountInWord(amount);
      String amountWord = dollarAmountInWord.getWord();

      //display result
      System.out.printf("\nDollar amount in word: %s\n", amountWord);
   } 
} // end class WordEquivalent

/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
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

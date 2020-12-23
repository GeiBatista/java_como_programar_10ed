package exercicios_resolvidos.cap14.ex14_17;

// Exercise 14.17 Solution: ThreeLetter.java
// Finding all 3-letter words in a 5-letter word. There are 
// 60 such combinations.
import java.util.Scanner;

public class ThreeLetter
{
   public static void main(String args[]) 
   {
      // get 5-letter word
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a 5-letter word");
      String word = scanner.next();

      // display all 3-letter words
      System.out.println("All 3-letter words:");

      // choose the first letter
      for (int first = 0; first <= 4; first++) 
      {
         // choose the second letter
         for (int second = 0; second <= 4; second++) 
         {
            // each letter can be used only once in a word
            if (second == first)
               continue;
            
            // choose the third letter
            for (int third = 0; third <= 4; third++) 
            {
               // each letter can be used only once in a word
               if (third == first || third == second)
                  continue;
               
               System.out.printf("%s%s%s\n", word.charAt(first), 
                  word.charAt(second), word.charAt(third));
            }
         } 
      } 
   } 
} // end class ThreeLetter

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

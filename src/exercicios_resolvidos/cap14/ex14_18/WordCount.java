package exercicios_resolvidos.cap14.ex14_18;

// Exercise 14.18b Solution: WordCount.java
// Application counts the number of words of each length in a string
import java.util.StringTokenizer;
import java.util.Scanner;

public class WordCount
{
    public static void main(String args[])
   {
      // get input string
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a string:");
      String input = scanner.nextLine();

      // split the string into words
      StringTokenizer token = new StringTokenizer(input, " ");
      int[] words = new int[20];

      // count number of n-letter words
      while(token.hasMoreTokens()) 
      {
         String word = token.nextToken();
         words[word.length()]++;
      } 

      // display output
      System.out.println("\nResult:\nNo. of letter\tCount");

      for(int i = 1; i < 20; i++) 
         System.out.printf("%d\t\t%d\n", i, words[i]);
   } 
} // end class WordCount

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

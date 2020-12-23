package exercicios_resolvidos.cap14.ex14_18;

// Exercise 14.18c Solution: WordTypeCount.java
// Application counts the number of occurences of each word in a string
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordTypeCount
{
   public static void main(String args[])
   {
      // get input string
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a string:");
      String input = scanner.nextLine();

      // count input string
      WordCounter counter = new WordCounter();
      StringTokenizer tokenizer = 
         new StringTokenizer(input, " \n\r\t");
               
      while(tokenizer.hasMoreTokens())
         counter.addWord(tokenizer.nextToken().toLowerCase());
               
      // display result
      System.out.printf("\nResults:\n%-15s%-20s\n", "Word", "Count");
      System.out.println(counter.getWords());
   }
} // end class WordTypeCount

class WordCounter 
{
   private int currentWords;
   private String words[];
   private int count[];
   
   // initialize instance variables
   public WordCounter() 
   {
      currentWords = 0;
      words = new String[80];
      count = new int[80];
   } 
   
   // add a word to our count
   public void addWord(String input) 
   {
      for (int i = 0; i < currentWords; i++) 
      {
         // if we have seen the word already
         if (input.equals(words[i])) 
         {
            count[i]++;
            return;
         } 
      } 
      
      // if we have not seen the word before
      words[currentWords] = input;
      count[currentWords] = 1;
      currentWords++;  
   } 
   
   // create an output string
   public String getWords() 
   {
      String output = "";

      for(int i = 0; i < currentWords; i++)
         output += 
            String.format("%-15s%-20d\n", words[i], count[i]);
      
      return output;
   } 
} // end class WordCounter

      
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
   

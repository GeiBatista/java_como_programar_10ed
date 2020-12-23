package exercicios_resolvidos.cap16.ex16_16;

// Exercise 16.16 Solution: Duplicates.java
// Program stores the number of duplicate words in a sentence.
import java.util.HashSet;
import java.util.Scanner;

public class Duplicates
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in); // create scanner

      System.out.println("Please enter a sentence:");
      String sentence = scanner.nextLine(); // read setence

      // display result of call to method countDuplicates
      System.out.printf("There are %d words that are duplicates.%n", 
         countDuplicates(sentence));
   } 

   // count number of duplicate words in input sentence
   private static int countDuplicates(String sentence)
   {
      HashSet<String> set = new HashSet<String>();
      int duplicates = 0;

      // count duplicates
      for (String word : sentence.split("\\s+"))
      {
         // remove punctuation and convert to lowercase
         word = word.toLowerCase().replaceAll("\\W", "");

         // see if item is already in set
         if (set.contains(word))
            ++duplicates; // increment duplicate count
         else // not already there; add it to the set
            set.add(word);
      }

      return duplicates;
   } 
} // end class Duplicates


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

package exercicios_resolvidos.cap15.ex15_10;

// Exercise 15.10 Solution: PhishingScanner.java
// Calculates the phishing score of a message.
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PhishingScanner
{
   // list of phishing words
   private static final String[] phishingWords = {
      "amazon", "official", "bank", "security", "urgent", "alert",
      "important", "information", "ebay", "password", "credit", "verify",
      "confirm", "account", "bill", "immediately", "address", "telephone",
      "ssn", "charity", "check", "secure", "personal", "confidential",
      "atm", "warning", "fraud", "citibank", "irs", "paypal"};

   // parallel array of point values
   private static final int phishingPoints[] = {2, 2, 1, 1, 1, 1, 1, 2,
      3, 3, 3, 1, 1, 1, 1, 1, 2, 2, 3, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1};

   public static void main(String[] args)
   {
      // ensure correct number of arguments
      if (args.length != 1)
      {
         System.out.println("Please specify a file name");
         System.exit(1);
      } 

      // count number of times each word occurs in file
      int[] count = countOccurrences(new File(args[0]));

      // display results
      displayResults(count);
   } 

   private static int[] countOccurrences(File file)
   {
      Scanner input = null; // used to read data from file

      // try to open file
      try
      {
         input = new Scanner(file);
      } 
      catch (FileNotFoundException exception)
      {
         System.out.println(exception);
         System.exit(1);
      } 

      // count occurrences of phishing words
      int[] wordCount = new int[phishingWords.length];

      while (input.hasNext())
      {
         String word = input.next();

         for (int i = 0; i < phishingWords.length; i++)
            if (phishingWords[i].equals(word.toLowerCase()))
               ++wordCount[i]; // increment occurrence count
      } 

      return wordCount;
   } 

   private static void displayResults(int[] count)
   {
      int totalPoints = 0;

      // display header
      System.out.printf("%20s %10s %10s\n", "Word", "Count", "Points");

      for (int i = 0; i < count.length; i++)
      {
         // don't display if word was not found
         if (count[i] == 0)
            continue;

         int points = count[i] * phishingPoints[i];
         totalPoints += points;
         System.out.printf("%20s %10d %10d\n",
               phishingWords[i], count[i], points);
      } 

      System.out.printf("Total points: %d\n", totalPoints);
   } 
}


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
 **************************************************************************/

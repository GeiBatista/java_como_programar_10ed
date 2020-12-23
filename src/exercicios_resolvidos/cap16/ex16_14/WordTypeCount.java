package exercicios_resolvidos.cap16.ex16_14;

// Exercise 16.14 Solution: WordTypeCount.java
// Program counts the number of occurrences of each word in a String.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount
{
   public static void main(String[] args)
   {
      // create HashMap to store String keys and Integer values
      Map<Character, Integer> map = new HashMap<>();

      createMap(map);
      displayMap(map); 
   } 

   // create map from user input
   private static void createMap(Map<Character, Integer> map)
   {
      Scanner scanner = new Scanner(System.in); // create scanner
      System.out.println("Enter a string:"); // prompt for user input
      String input = scanner.nextLine();

      // convert to lowercase and remove all non-letters
      input = input.toLowerCase().replaceAll("[^a-z]", "");

      // processing input text
      for (char letter : input.toCharArray())
      {
         // if the map contains the word
         if (map.containsKey(letter)) // is letter in map?
         {
            int count = map.get(letter); // get current count
            map.put(letter, count + 1); // increment count
         } 
         else 
            map.put(letter, 1); // add new word with a count of 1 to map
      }
   } 
   
   // display map content
   private static void displayMap(Map<Character, Integer> map) 
   {      
      Set<Character> keys = map.keySet(); // get keys

      // sort keys
      TreeSet<Character> sortedKeys = new TreeSet<Character>(keys);

      System.out.printf("%nMap contains:\nKey\t\tValue%n");

      // generate output for each key in map
      for (char key : sortedKeys)
         System.out.printf("%-10s%10s%n", key, map.get(key));
      
      System.out.printf(
         "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
   } 
} // end class WordTypeCount


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

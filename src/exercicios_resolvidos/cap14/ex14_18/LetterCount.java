package exercicios_resolvidos.cap14.ex14_18;

// Exercise 14.18a Solution: LetterCount.java
// Application counts the occurences of each letter in a string
import java.util.Scanner;

public class LetterCount
{
   public static void main(String args[])
   {
      // get input string
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a string:");
      String input = scanner.nextLine();

      // counts the occurences of each letter in a string
      int[] letters = new int[26];
               
      for (int i = 0; i < input.length(); i++)
      {
         if (Character.isLetter(input.charAt(i)))
            letters[Character.toUpperCase(input.charAt(i)) - 'A']++;
      } 
       
      // display result
      System.out.println("\nResult:\nchar\tcount");

      for (int i = 0; i < 26; i++)
         System.out.printf(
            "%s\t%d\n", (char)(i + 'A'), letters[i]);
   } 
} // end class LetterCount

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

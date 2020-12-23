package exercicios_resolvidos.cap14.ex14_04;

// Exercise 14.4 Solution: Compare.java
// Application compares two Strings.
import java.util.Scanner;

public class Compare
{
   public static void main(String args[])
   {
      // get two strings from user
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter first string:");
      String firstString = scanner.nextLine();
      System.out.println("Please enter second string:");
      String secondString = scanner.nextLine();

      // get number of character to compare and starting index
      System.out.println("Please enter number of characters:");
      int numberOfCharacters = scanner.nextInt();
      System.out.println("Please enter starting index:");
      int index = scanner.nextInt();

      // compare strings
      boolean match = firstString.regionMatches(
         true, index, secondString, index, numberOfCharacters);

      // compare and display result
      System.out.println("\nCompare Result:");

      if (match)
         System.out.println("The strings are equivalent.");
      else
         System.out.println("The strings are not equivalent.");
   }
} // end class Compare

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

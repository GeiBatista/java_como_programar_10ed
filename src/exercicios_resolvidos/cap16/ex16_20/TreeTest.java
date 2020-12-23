package exercicios_resolvidos.cap16.ex16_20;

// Exercise 16.20 Solution: TreeTest.java
// Program tokenizes text input by user and places each
// token in a tree. Sorted tree elements are then printed.
import java.util.Scanner;
import java.util.TreeSet;
import java.util.StringTokenizer;

public class TreeTest 
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in); // create scanner

      System.out.println("Please enter a line of text:");
      String input = scanner.nextLine(); // get input text

      TreeSet<String> tree = new TreeSet<String>();
      StringTokenizer tokenizer = new StringTokenizer(input);

      // process input text
      while (tokenizer.hasMoreTokens())
         tree.add(tokenizer.nextToken()); // add text to tree

      // print tree elements
      System.out.println("Elements in tree: " + tree);
   } 
} // end class TreeTest



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

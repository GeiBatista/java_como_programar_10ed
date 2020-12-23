package exercicios_resolvidos.cap14.ex14_09;

// Exercise 14.9 Solution: TokenTest.java
// Application displays tokens in reverse order.
import java.util.Scanner;

public class TokenTest
{
   public static void main(String args[])
   {
      // get user input
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a sentence to be reversed");
      String sentence = scanner.nextLine();

      // display tokens in reverse order
      System.out.println("\nReversed sentence:");
      String[] tokens = sentence.split(" ");

      for (int i = tokens.length - 1; i >= 0; --i)
         System.out.printf("%s ", tokens[i]);
      System.out.println();
   } 
} // end class TokenTest

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

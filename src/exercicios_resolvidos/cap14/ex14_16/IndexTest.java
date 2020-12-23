package exercicios_resolvidos.cap14.ex14_16;

// Exercise 14.16 Solution: IndexTest.java
// Application uses our own versions of String indexing methods
import java.util.Scanner;

public class IndexTest
{
   public static void main(String args[])
   {
      // get input string
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a string:");
      String input = scanner.nextLine();

      // get search character
      System.out.println("Please enter a character:");
      char searchKey = scanner.next().charAt(0);

      // display index of first occurrence
      System.out.printf("\nFirst '%s' occurs at index %d\n", 
         searchKey, FindIndex.indexOf(input, searchKey));
   
      // display index of last occurrence
      System.out.printf("Last '%s' occurs at index %d\n", 
         searchKey, FindIndex.lastIndexOf(input, searchKey));
   } 
} // end class IndexTest

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

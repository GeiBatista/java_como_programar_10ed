package exercicios_resolvidos.cap14.ex14_11;

// Exercise 14.11 Solution: Index.java
// Application outputs the number of times a search character was found.
import java.util.Scanner;

public class Index
{
   public static void main(String args[])
   {
      // get text
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter text to be searched");
      String text = scanner.nextLine();

      // get searching character
      System.out.println("Please enter a character:");
      char key = scanner.next().charAt(0);

      // search for input character
      int count = 0;
      int current = text.indexOf(key, 0);

      while (current != -1) 
      {
         count++;
         current = text.indexOf(key, current + 1);
      } 

      // display result
      System.out.printf("Number of %s's: %d\n", key, count);
   } 
} // end class Index

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

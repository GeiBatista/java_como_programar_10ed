package exercicios_resolvidos.cap14.ex14_14;

// Exercise 14.14 Solution: LastED.java
// Application outputs strings that end with "ED"
import java.util.StringTokenizer;
import java.util.Scanner;

public class LastED
{
   public static void main(String args[])
   {
      // get input string
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a string:");
      String input = scanner.nextLine();

      // display Strings ending with "ED"
      System.out.println("\nStrings end with \"ED\":");
      StringTokenizer tokens = new StringTokenizer(input);

      while (tokens.hasMoreTokens()) 
      {
         String test = tokens.nextToken();

         if (test.endsWith("ED"))
            System.out.printf("%s\n", test);
      } 
   }
} // end class LastED

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

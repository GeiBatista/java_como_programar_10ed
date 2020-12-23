package exercicios_resolvidos.cap14.ex14_13;

// Exercise 14.13 Solution: FirstB.java
// Application outputs strings that begin with "b"
import java.util.Scanner;

public class FirstB
{
   public static void main(String args[])
   {
      // get user input
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a string:");
      String input = scanner.nextLine();

      // display Strings beginning with "b"
      System.out.println("\nStrings beginning with \"b\":");
      String[] tokens = input.split(" ");

      for (int i = 0; i < tokens.length; ++i)
         if (tokens[i].startsWith("b"))
            System.out.printf("%s\n", tokens[i]);
   } 
} // end class FirstB

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

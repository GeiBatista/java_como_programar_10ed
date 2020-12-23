package exercicios_resolvidos.cap14.ex14_03;

// Exercise 14.3 Solution: CompareStrings.java
// Application compares two strings.
import java.util.Scanner;

public class CompareStrings
{
   public static void main(String args[])
   {
      // get two strings from user
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter first string:");
      String firstString = scanner.nextLine();
      System.out.println("Please enter second string:");
      String secondString = scanner.nextLine();

      // compare two strings
      int value = firstString.compareTo(secondString); 

      // display result
      System.out.println("\nCompare Result:");

      if (value == 0)
         System.out.printf("%s == %s\n", firstString, secondString);
      else if (value > 0)
         System.out.printf("%s > %s\n", firstString, secondString);
      else
         System.out.printf("%s < %s\n", firstString, secondString);
   } 
} // end class CompareStrings

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

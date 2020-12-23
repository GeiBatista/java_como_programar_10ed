package exercicios_resolvidos.cap05.ex05_24;

// Exercise 5.24 Solution: Diamond.java
// Program prints a diamond with minimal output statements
public class Diamond
{
   // draws a diamond of asterisks
   public static void main(String[] args)
   {
      // top half (1st five lines)
      for (int row = 1; row <= 5; row++)
      {
         for (int spaces = 5; spaces > row; spaces--)
            System.out.print(" ");

         for (int stars = 1; stars <= (2 * row) - 1; stars++)
            System.out.print("*");

         System.out.println();
      } 

      // bottom half (last four rows)
      for (int row = 4; row >= 1; row--)
      {
         for (int spaces = 5; spaces > row; spaces--)
            System.out.print(" ");

         for (int stars = 1; stars <= (2 * row) - 1; stars++)
            System.out.print("*");

         System.out.println();
      } // end for statement
   } 
} // end class Diamond


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

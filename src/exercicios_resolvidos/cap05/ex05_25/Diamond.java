package exercicios_resolvidos.cap05.ex05_25;

// Exercise 5.25 Solution: Diamond.java
// Program prints a diamond of a user-specified size
import java.util.Scanner;

public class Diamond
{
   // draws a diamond of asterisks
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int row; // current row
      int numRows; // number of rows

      // ask user for an entry until within range
      do
      {
         System.out.print(
            "Enter number of rows (odd number 1 to 19): ");
         numRows = input.nextInt();
      } while ((numRows > 19) || (numRows < 0) || (numRows % 2 == 0));

      // top half
      for (row = 1; row < (numRows / 2) + 1; row++)
      {
         for (int spaces = numRows / 2; spaces >= row; spaces--)
            System.out.print(" ");

         for (int stars = 1; stars <= (2 * row) - 1; stars++)
            System.out.print("*");

         System.out.println();
      } 

      // bottom half, note that the first clause of the for
      // loop isn't needed; row is already defined
      for (; row >= 1; row--)
      {
         for (int spaces = numRows / 2; spaces >= row; spaces--)
            System.out.print(" ");

         for (int stars = 1; stars <= (2 * row) - 1; stars++)
            System.out.print("*");

         System.out.println();
      } 
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

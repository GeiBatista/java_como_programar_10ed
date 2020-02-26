package exercicios_resolvidos.cap05.ex05_22;

// Exercise 5.22 Solution: Triangles.java
// Program prints four triangles side by side
public class Triangles
{
   // draws four triangles
   public static void main(String[] args)
   {
      // print one row at a time, tabbing between triangles
      for (int row = 1; row <= 10; row++)
      {
         // triangle one
         for (int column = 1; column <= row; column++)
            System.out.print("*");

         for (int space = 1; space <= 10 - row; space++)
            System.out.print(" ");

         System.out.print("\t");

         // triangle two
         for (int column = 10; column >= row; column--)
            System.out.print("*");

         for (int space = 1; space < row; space++)
            System.out.print(" ");

         System.out.print("\t");

         // triangle three
         for (int space = 1; space < row; space++)
            System.out.print(" ");

         for (int column = 10; column >= row; column--)
            System.out.print("*");

         System.out.print("\t");

         // triangle four
         for (int space = 10; space > row; space--)
            System.out.print(" ");

         for (int column = 1; column <= row; column++)
            System.out.print("*");

         System.out.println();
      } 
   } 
} // end class Triangles


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

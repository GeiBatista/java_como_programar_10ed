package exercicios_resolvidos.cap06.ex06_18;

// Exercise 6.18 Solution: Square.java
// Program draws a square of asterisks.
import java.util.Scanner;

public class Square
{
   // obtain value from user
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter square size: ");
      int size = input.nextInt();
      
      squareOfAsterisks(size);
   } 

   // draw a square of asterisks
   public static void squareOfAsterisks(int side)
   {
      for (int row = 1; row <= side; row++)
      {
         for (int column = 1; column <= side; column++)
            System.out.print("*");

         System.out.println();
      } 
   } 
} // end class Square



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

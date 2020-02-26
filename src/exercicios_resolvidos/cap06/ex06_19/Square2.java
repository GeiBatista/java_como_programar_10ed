package exercicios_resolvidos.cap06.ex06_19;

// Exercise 6.19 Solution: Square2.java
// Program draws a square of asterisks
import java.util.Scanner;

public class Square2
{
   // obtain value from user
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter square size: ");
      int size = input.nextInt();
      
      System.out.print("Enter fill character: ");
      char fillCharacter = input.next().charAt(0);
      
      fillSquare(size, fillCharacter);
   } 

   // draw a square of the specified character
   public static void fillSquare(int side, char fillCharacter)
   {
      for (int row = 1; row <= side; row++)
      {
         for (int column = 1; column <= side; column++)
            System.out.print(fillCharacter);

         System.out.println();
      } 
   } 
} // end class Square2



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

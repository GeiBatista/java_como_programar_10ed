package exercicios_resolvidos.cap04.ex04_36;

// Exercise 4.36 Solution: Triangle2.java
// Program takes three integers and determines if they
// form the sides of a right triangle.
import java.util.Scanner;

public class Triangle2
{
   // checks if three sides can form a right triangle
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      // get values of three sides
      System.out.print("Enter side 1: ");
      int side1 = input.nextInt();

      System.out.print("Enter side 2: ");
      int side2 = input.nextInt();

      System.out.print("Enter side 3: ");
      int side3 = input.nextInt();
      
      // square the sides
      int side1Square = side1 * side1;
      int side2Square = side2 * side2;
      int side3Square = side3 * side3;

      // test if these form a right triangle
      boolean isRightTriangle = false;

      if ((side1Square + side2Square) == side3Square)
        isRightTriangle = true;
      else if ((side1Square + side3Square) == side2Square)
         isRightTriangle = true;
      else if ((side2Square + side3Square) == side1Square)
         isRightTriangle = true;
      
      if (isRightTriangle)
         System.out.println("These are the sides of a right triangle.");
      else 
         System.out.println("These do not form a right triangle.");      
   } // end main
} // end class Triangle2


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

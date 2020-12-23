package exercicios_resolvidos.cap04.ex04_35;

// Exercise 4.35 Solution: Triangle1.java
// Program takes three values and determines if
// they form the sides of a triangle.
import java.util.Scanner;

public class Triangle1
{
   // checks if three sides can form a triangle
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
 
      // get values of three sides
      System.out.print("Enter side 1: ");
      double side1 = input.nextDouble();

      System.out.print("Enter side 2: ");
      double side2 = input.nextDouble();

      System.out.print("Enter side 3: ");
      double side3 = input.nextDouble();

      // triangle testing
      boolean isTriangle = false;
      
      if (side1 + side2 > side3)
      {
         if (side2 + side3 > side1)
         {
            if (side3 + side1 > side2)
               System.out.println("These could be sides to a triangle ");
            else 
               System.out.println("These do not form a triangle.");         
         } 
      }
   } 
} // end class Triangle1


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

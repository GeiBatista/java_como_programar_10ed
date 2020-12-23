package exercicios_resolvidos.cap06.ex06_15;

// Exercise 6.15 Solution: Triangle.java
// Program calculates the hypotenuse of a right triangle.
import java.util.Scanner;

public class Triangle
{
   // reads in two sides and prints the hypotenuse
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      double side1; // first side of triangle
      double side2; // second side of triangle
      
      System.out.print("Enter side 1 (negative to quit): ");
      side1 = input.nextDouble();
      
      while (side1 > 0)
      {
         System.out.print("Enter side 2: ");
         side2 = input.nextDouble();
      
         System.out.printf("Hypotenuse is: %f%n%n",
            hypotenuse(side1, side2));
         
         System.out.print("Enter side 1 (negative to quit): ");
         side1 = input.nextDouble();
      } 
   } 

   // calculate hypotenuse given lengths of two sides
   public static double hypotenuse(double side1, double side2)
   {
      double hypotenuseSquared = Math.pow(side1, 2) + 
         Math.pow(side2, 2);

      return Math.sqrt(hypotenuseSquared);
   }
 } // end class Triangle
 

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

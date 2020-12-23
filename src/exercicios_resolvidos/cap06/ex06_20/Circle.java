package exercicios_resolvidos.cap06.ex06_20;

// Exercise 6.20 Solution: Circle.java
// Program calculates the area of a circle.
import java.util.Scanner;

public class Circle
{
   // calculate the areas of circles
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
 
      System.out.print("Enter the radius (negative to quit): ");
      double radius = input.nextDouble();
      
      while (radius >= 0)
      {
         System.out.printf("Area is %f%n%n", circleArea(radius));
         
         System.out.print("Enter the radius (negative to quit): ");
         radius = input.nextDouble();
      } 
   }

   // calculate area
   public static double circleArea(double radius)
   {
      return Math.PI * radius * radius;
   } 
} // end class Circle



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

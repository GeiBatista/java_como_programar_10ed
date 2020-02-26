package exercicios_resolvidos.cap02.ex02_28;

// Exercise 2.28 Solution: Circle.java
// Program that calculates area, circumference
// and diameter for a circle.
import java.util.Scanner;

public class Circle 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int radius; // radius of circle

      System.out.print("Enter radius: "); // prompt for input
      radius = input.nextInt(); // read number

      System.out.printf("Diameter is %d%n", (2 * radius)); 
      System.out.printf("Circumference is %f%n", 
         (2 * Math.PI * radius));
      System.out.printf("Area is %f%n", (Math.PI * radius * radius)); 
   } // end main
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

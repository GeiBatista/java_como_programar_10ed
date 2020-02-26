package exercicios_resolvidos.cap06.ex06_32;

// Exercise 6.32 Solution: Points.java
// Program calculates the distance between two points.
import java.util.Scanner;

public class Points
{
   // calculates the distance between two points
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.printf("%s%n   %s%n   %s%n", 
         "Type the end-of-file indicator to terminate", 
         "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter");
      System.out.print("Or Enter X1: ");

      // continually read in inputs until the user terminates
      while (input.hasNext())
      {
         double x1 = input.nextDouble();
         System.out.print("Enter Y1: ");
         double y1 = input.nextDouble();
         System.out.print("Enter X2: ");
         double x2 = input.nextDouble();
         System.out.print("Enter Y2: ");
         double y2 = input.nextDouble();
         
         double distance = distance(x1, y1, x2, y2);
         System.out.printf("Distance is %f%n%n", distance);
 
         System.out.printf("%s%n   %s%n   %s%n", 
            "Type the end-of-file indicator to terminate", 
            "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
            "On Windows type <Ctrl> z then press Enter");
         System.out.print("Or Enter X1: ");
      } 
   } 

   // calculate distance between two points
   public static double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow((x1 - x2), 2) + 
         Math.pow((y1 - y2), 2));
   } 
} // end class Points


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

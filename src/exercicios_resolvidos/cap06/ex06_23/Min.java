package exercicios_resolvidos.cap06.ex06_23;

// Exercise 6.23 Solution: Min.java
// Program finds the minimum of 3 numbers
import java.util.Scanner;

public class Min
{
   // find the minimum of three numbers
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);

      double one; // first number
      double two; // second number
      double three; // third number
      
      System.out.printf("%s%n   %s%n   %s%n", 
         "Type the end-of-file indicator to terminate", 
         "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter");
      System.out.print("Or enter first number: ");
      
      while (input.hasNext())
      {
         one = input.nextDouble();
         System.out.print("Enter second number: ");
         two = input.nextDouble();
         System.out.print("Enter third number: ");
         three = input.nextDouble();
         
         System.out.printf("Minimum is %f%n",
            minimum3(one, two, three));
         
         System.out.printf("%n%s%n   %s%n   %s%n", 
            "Type the end-of-file indicator to terminate", 
            "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
            "On Windows type <Ctrl> z then press Enter");
         System.out.print("Or enter first number: ");
      } 
   } 

   // determine the smallest of three numbers
   public static double minimum3(double one, double two, double three)
   {
      // use a nested pair of min statements
      return Math.min(Math.min(one, two), three);
   } 
} // end class Min


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

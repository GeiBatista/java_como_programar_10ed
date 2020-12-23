package exercicios_resolvidos.cap06.ex06_09;

// Exercise 6.9 Solution: Test.java
// Program tests Math.floor.
import java.util.Scanner;

public class RoundingTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.printf("%s%n%s%n   %s%n   %s%n", 
         "Enter decimal numbers.", 
         "Type the end-of-file indicator to terminate input:", 
         "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter");

      while (input.hasNext())
      {
         double x = input.nextDouble();

         System.out.printf("Number: %f\tMath.floor(x + .5): %f%n",
            x, Math.floor(x + .5));
      }
   }
} // end class RoundingTest


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

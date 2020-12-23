package exercicios_resolvidos.cap04.ex04_37.part_c;

// Exercise 4.37 Part C Solution: EtoX.java
// Program calculates e raised to x.
import java.util.Scanner;

public class EtoX
{
   // approximates the value of e to the x
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number = 1;
      int factorial = 1;
      double e = 1.0;
      double exponent = 1.0;

      System.out.print("Enter exponent: ");
      int x = input.nextInt();

      System.out.print("Enter desired accuracy of e: ");
      int accuracy = input.nextInt();
      
      // calculate estimation
      while (number < accuracy)
      {
         exponent *= x;
         factorial *= number;
         e += exponent / factorial;
         ++number;
      } 

      System.out.printf("e to the %d is %f%n", x, e);
   } 
} // end class EtoX


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

package exercicios_resolvidos.cap18.ex18_11;

// Exercise 18.11 Solution: Divisor.java
// Program finds the greatest common divisor of two numbers.
import java.util.Scanner;

public class Divisor
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first number (-1 to exit): ");
      int num1 = input.nextInt();

      while (num1 != -1)
      {
         System.out.print("Enter second number: ");
         int num2 = input.nextInt();
      
         System.out.printf("GCD is: %d%n%n", gcd(num1, num2));
         
         System.out.print("Enter first number (-1 to exit): ");
         num1 = input.nextInt();
      } 
   } 

   // calculate the greatest common divisor using Euclid's Algorithm
   // alternatively, you can simply check every number up to the
   // lesser of x or y to see if it divides both x and y.
   public static int gcd(int x, int y)
   {
      if (y == 0)
         return x;
      else
         return gcd(y, x % y);
   } 
} // end class Divisor


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

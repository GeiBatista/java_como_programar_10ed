package exercicios_resolvidos.cap06.ex06_14;

// Exercise 6.14 Solution: Power.java
// Program calculates an exponent
import java.util.Scanner;

public class Power
{
   // begin calculating integer powers
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter base (negative to quit): ");
      int base = input.nextInt();
      
      // use a negative exponent as a sentinel
      while (base >= 0)
      {
         System.out.print("Enter exponent: ");      
         int exponent = input.nextInt();

         System.out.printf("%d to the %d power is %d%n%n",
            base, exponent, integerPower(base, exponent));

         System.out.print("Enter base (negative to quit): ");
         base = input.nextInt();
      }
   }

   // raise integer base to the exponent power
   public static int integerPower(int base, int exponent)
   {
      int product = 1;

      for (int i = 1; i <= exponent; i++)
         product *= base;

      return product;
   } 
} // end class Power


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

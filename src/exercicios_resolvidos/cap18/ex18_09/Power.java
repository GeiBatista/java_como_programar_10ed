package exercicios_resolvidos.cap18.ex18_09;

// Exercise 18.9 Solution: Power.java
// Program calculates an exponent.
import java.util.Scanner;

public class Power
{
   // recursively calculate value of exponent
   public static int integerPower(int base, int exponent)
   {
      if (exponent == 1)
         return base;
      else
         return base * integerPower(base, exponent - 1);

   } 

   // get user input and calculate number
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter base: ");
      int base = scanner.nextInt(); // get base from user

      System.out.print("Enter exponent: ");
      int exponent = scanner.nextInt(); // get exponent from user

      // raise to exponent if appropriate
      if (exponent > 0)
      {
         int result = integerPower(base, exponent);
         System.out.printf("Value is %d%n", result);
      }
      else
         System.out.println("Invalid Exponent.");
   } 
} // end class Power

/*************************************************************************
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

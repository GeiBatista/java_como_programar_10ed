package exercicios_resolvidos.cap04.ex04_31;

// Exercise 4.31 Solution: Binary.java
// Program prints the decimal equivalent of a binary number.
import java.util.Scanner;

public class Binary
{
   // converts a binary number to decimal
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int bit = 1; // bit positional value
      int decimal = 0; // decimal value

      // prompt for and read in a binary number
      System.out.print("Enter a binary number: ");
      int binary = input.nextInt(); // binary value

      // convert to decimal equivalent
      while (binary != 0)
      {
         decimal += binary % 10 * bit;
         binary /= 10;
         bit *= 2;
      } 

      System.out.printf("Decimal is: %d%n", decimal);
   } 
} // end class Binary


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

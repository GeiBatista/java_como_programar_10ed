package exercicios_resolvidos.cap02.ex02_30;

// Exercise 2.30 Solution: Five.java
// Program breaks apart a five-digit number
import java.util.Scanner;

public class Five 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int number; // number input by user
      int digit1; // first digit
      int digit2; // second digit
      int digit3; // third digit
      int digit4; // fourth digit
      int digit5; // fifth digit

      System.out.print("Enter five-digit integer: "); // prompt
      number = input.nextInt(); // read number 

      // determine the five digits
      digit1 = number / 10000;
      digit2 = number % 10000 / 1000;
      digit3 = number % 1000 / 100;
      digit4 = number % 100 / 10;
      digit5 = number % 10;

      // output results
      System.out.printf("Digits in %d are %d  %d  %d  %d  %d%n", 
         number, digit1, digit2, digit3, digit4, digit5);
   } // end main
} // end class Five



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

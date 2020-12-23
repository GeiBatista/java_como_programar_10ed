package exercicios_resolvidos.cap14.ex14_15;

// Exercise 14.15 Solution: IntegerToChar.java
// Application converts from an integer value to a character
import java.util.Scanner;

public class IntegerToChar
{
   public static void main(String args[])
   {
      // get integer
      Scanner scanner = new Scanner(System.in);
      System.out.println( "Please enter an integer between 0 and 255:");
      int input = scanner.nextInt();

      // display character for the integer
      if (0 < input && input <= 255)
         System.out.printf("Character value: %s\n", (char) input);
      else
         System.out.println("Error: integer out of range");
   } 
} // end class IntegerToChar

/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
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

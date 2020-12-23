package exercicios_resolvidos.cap14.ex14_23;

// Exercise 14.23 Solution: Convert.java
// Application converts from selected units to other selected units.
// NOTE: unit names must always be entered in the plural form.
import java.util.Scanner;

public class Convert
{
   public static void main(String args[])
   {
      // get from unit
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter the source unit:");
      String from = scanner.nextLine();

      // get to unit
      System.out.println("Please enter the destination unit:");
      String to = scanner.nextLine();

      // get amount
      System.out.println("Please enter the amount to convert");
      int amount = scanner.nextInt();

      // get converted value
      double result = UnitConverter.convert(from, to, amount);

      // display result
      if (result == (double) amount)
         System.out.println("\ninvalid conversion\n");
      else
         System.out.printf(
            "\n%d %s = %.4f %s\n", amount, from, result, to);
   } 
}  // end class Convert

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

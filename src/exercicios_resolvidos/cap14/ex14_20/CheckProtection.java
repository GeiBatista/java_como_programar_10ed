package exercicios_resolvidos.cap14.ex14_20;

// Exercise 14.20 Solution: CheckProtection.java
// Application that protects number values on checks
import java.util.Scanner;

public class CheckProtection
{
   public static void main(String args[]) 
   {
      // get amount
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a dollar amount:");
      String amount = scanner.next();
      String temp = "";
               
      // add asterisks to fill up the 9 spaces
      for (int i = 9; i > amount.length(); i--)
         temp += "*";
               
      temp += amount;
                 
      // display result
      System.out.printf("\nProtected number: %s\n", temp);
   }
} // end class CheckProtection

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

package exercicios_resolvidos.cap14.ex14_08;

// Exercise 14.8 Solution: Phone.java
// Application separates phone area code from the other seven digits.
import java.util.Scanner;

public class Phone
{
   public static void main(String args[])
   {
      // get user phone number
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter phone number:");
      String phoneNumber = scanner.nextLine();

      // check for valid input
      if (!phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}"))
      {
         System.out.println("Invalid input.");
         System.exit(1);
      }

      // tokenize phone number
      String[] tokens = phoneNumber.split("\\) ");
      String areaCode = tokens[0].substring(1);
      tokens = tokens[1].split("-");
      String number = tokens[0] + tokens[1];
      System.out.printf(
         "Area Code: %s\nPhone Number: %s\n", areaCode, number);
   } 
} // end class Phone

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

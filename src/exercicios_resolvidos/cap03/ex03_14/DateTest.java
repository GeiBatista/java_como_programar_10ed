package exercicios_resolvidos.cap03.ex03_14;

// Exercise 3.14 Solution: DateTest.java
// Application to test class Date.

public class DateTest
{
   public static void main(String[] args)
   {
      Date date1 = new Date(7, 4, 2004);
      
      System.out.print("The initial date is: ");
      date1.displayDate();

      // change date values
      date1.setMonth(11);
      date1.setDay(1);
      date1.setYear(2003);

      System.out.printf("%nDate with new values is: ");
      date1.displayDate();

      System.out.println(); // output a newline
   } // end main
} // end class DateTest


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

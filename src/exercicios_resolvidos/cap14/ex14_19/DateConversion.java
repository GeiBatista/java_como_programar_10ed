package exercicios_resolvidos.cap14.ex14_19;

// Exercise 14.19 Solution: DateConversion.java
// Application to convert a date from mm/dd/yyyy format to
// month day, year format.
import java.util.Scanner;
import java.util.StringTokenizer;

public class DateConversion
{
   public static void main(String args[]) 
   {
      // names of the months
      String[] months = {"", "January", "February", "March", "April", 
         "May", "June", "July", "August", "September", "October", 
         "November", "December"};

      // get input date
      Scanner scanner = new Scanner(System.in);
      System.out.println("please enter a date in mm/dd/yyyy format:");
      String date = scanner.next();

      // split the string into pieces
      StringTokenizer tokenize = new StringTokenizer(date, "/");
               
      // get the day, month and year as integers
      int month = Integer.parseInt(tokenize.nextToken());
      int day = Integer.parseInt(tokenize.nextToken());
      int year = Integer.parseInt(tokenize.nextToken());
               
      // get the name of the month
      String monthName = months[month];  
      System.out.printf("\nDisplay date in other format: ");
      System.out.printf("%s %d, %d\n", monthName, day, year);
   }
} // end class DateConversion

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

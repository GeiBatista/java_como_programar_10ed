package exercicios_resolvidos.cap08.ex8_08;

// Exercise 8.8 Solution: Date.java
// Date class declaration.

public class Date 
{
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year)
   {
      // validate year greater than or equal to 0
      if (year < 0) 
         throw new IllegalArgumentException("year must be greater than 0");

      // check if month in range
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");

      // check if day in range for month
      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day + 
            ") out-of-range for the specified month and year");

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0)))
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

      this.month = month;
      this.day = day;
      this.year = year;

      System.out.printf(
         "Date object constructor for date %s%n", this);
   } 
   
   // return a String of the form month/day/year
   public String toString()
   { 
      return String.format("%d/%d/%d", month, day, year); 
   } 

   // increment the day and check if doing so will change the month
   public void nextDay()
   {
      // check if day in range for month
      if ((day + 1) > daysPerMonth[month] && !(month == 2 && day == 29))
      {
         day = 1;
         nextMonth();
      }
      else 
         ++day;
   }

   // increment the month and check if doing so will change the year
   public void nextMonth()
   {
      if (month + 1 == 13)
      {
         month = 1;
         ++year;
      }
      else
         ++month;
   } 
} // end class Date




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

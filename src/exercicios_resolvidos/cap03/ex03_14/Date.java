package exercicios_resolvidos.cap03.ex03_14;

// Exercise 3.14 Solution: Date.java
// Date class with instance variables for the month, day and year.

public class Date
{
   private int month;
   private int day;
   private int year;

   // constructor
   public Date(int month, int day, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
   }

   // set the month
   public void setMonth(int month)
   {
      this.month = month;
   } 

   // return the month
   public int getMonth()
   {
      return month;
   }

   // set the day
   public void setDay(int day)
   {
      this.day = day;
   }

   // return the day
   public int getDay()
   {
      return day;
   }

   // set the year
   public void setYear(int year)
   {
      this.year = year;
   } 
   
   // return the year
   public int getYear()
   {
      return year;
   } 

   // display the date
   public void displayDate()
   {
      System.out.printf("%d/%d/%d", getMonth(), getDay(), getYear());
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

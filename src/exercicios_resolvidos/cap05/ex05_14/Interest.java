package exercicios_resolvidos.cap05.ex05_14;

// Exercise 5.14 Solution: Interest.java
// Calculating compound interest
public class Interest
{
   public static void main(String[] args)
   {
      double amount; // amount on deposit at the end of a given year 
      double principal = 1000.0; // initial deposit
      
      // print out statistics for each rate
      for (int interestRate = 5; interestRate <= 10; interestRate++)
      {
         double rate = interestRate / 100.0;
         System.out.printf("%nInterest Rate: %d%%%n", interestRate);
         System.out.println("Year\tAmount on deposit");

         // for each rate, print a ten-year forecast
         for (int year = 1; year <= 10; year++)
         {
            // calculate new amount for specified year
            amount = principal * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%d\t%.2f%n", year, amount);
         } 
      } 
   } 
} // end class Interest


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

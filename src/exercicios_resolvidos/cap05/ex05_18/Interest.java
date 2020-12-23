package exercicios_resolvidos.cap05.ex05_18;

// Exercise 5.18: Interest.java
// Calculating compound interest.
public class Interest
{
   public static void main(String[] args)
   {
      int amount; // amount on deposit at end of each year
      int principal = 100000; // initial amount (number of pennies)
      double rate = 0.05; // interest rate

      // print the headers
      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; year++)
      {
         // calculate new amount for specified year
         amount = 
            (int) (principal * Math.pow(1.0 + rate, year));
         
         int dollars = amount / 100;
         int cents = amount % 100; 

         // print the year, the dollars portion and a decimal point
         System.out.printf("%4d%,17d.", year, dollars);
         
         // print the cents portion (with a leading zero if cents < 10)
         System.out.printf("%02d%n", cents);
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

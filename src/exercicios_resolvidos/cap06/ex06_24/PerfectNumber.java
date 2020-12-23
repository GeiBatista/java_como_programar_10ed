package exercicios_resolvidos.cap06.ex06_24;

// Exercise 6.24 Solution: PerfectNumber.java
// Program displays all perfect numbers between 1 and 1000.

public class PerfectNumber
{
   // finds all the perfect numbers from 2 to 1000
   public static void main(String args[])
   {
      for (int number = 2; number <= 1000; number++)
      {
         String result = isPerfect(number);

         if (result != null)
            System.out.printf ("%d is perfect.%n\tFactors: %s%n",
               number, result);
      } 
   } 

   // returns a string of factors if parameter is a
   // perfect number, or null if it isn't.
   public static String isPerfect(int value)
   {
      int factorSum = 1;
      String factors = "1 ";

      for (int test = 2; test <= value / 2; test++)
      {
         if (value % test == 0)
         {
            factorSum += test;
            factors += test + " ";
         }
      } 

      if (factorSum == value)
         return factors;

      return null;
   } 
} // end class PerfectNumber



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

package exercicios_resolvidos.cap06.ex06_25.part_c;

// Exercise 6.25 Part C Solution: PrimeNum2.java
// Program calculates prime numbers more efficiently
public class PrimeNum2
{
   // find the prime numbers between 1 and 10,000
   public static void main(String args[])
   {
      System.out.println("Prime numbers between 2 and 10,000 are: ");

      // test all numbers between 2 and 10000
      for (int m = 2; m <= 10000; m++)
         if (isPrime(m))
            System.out.println(m);
   } // end main

   // a helper method for determining if a number is prime
   public static boolean isPrime(int n)
   {
      int max = (int) Math.sqrt(n); // the highest number to test
      
      for (int v = 2; v <= max; v++)
         if (n % v == 0)
            return false;

      return true;
   } // end method isPrime
} // end class PrimeNum2



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

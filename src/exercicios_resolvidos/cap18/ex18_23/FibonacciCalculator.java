package exercicios_resolvidos.cap18.ex18_23;

// Exercise 18.23 Solution: FibonacciCalculator.java
// Recursive fibonacci method.
import java.math.BigInteger;

public class FibonacciCalculator
{
   private static BigInteger TWO = BigInteger.valueOf(2);
   private static long count;

   // recursive declaration of method fibonacci
   public static BigInteger fibonacci(BigInteger number)
   {
      ++count; // increment call count

      if (number.equals(BigInteger.ZERO) || 
           number.equals(BigInteger.ONE)) // base cases
         return number;
      else // recursion step
         return fibonacci(number.subtract(BigInteger.ONE)).add(
            fibonacci(number.subtract(TWO)));
   } // end method fibonacci

   // displays the fibonacci values from 0-40
   public static void main(String[] args)
   {
      for (int counter = 0; counter <= 40; counter++)
      {
         // convert counter to BigInteger
         BigInteger counterBig = BigInteger.valueOf(counter);
         count = 0; // reset call count

         // time fibonacci calculation
         long start = System.currentTimeMillis();
         BigInteger result = fibonacci(counterBig);
         long difference = System.currentTimeMillis() - start;

         // display results
         System.out.printf("Fibonacci of %d is: %d%n", counter, result);
         System.out.printf("   took %d milliseconds%n", difference);
         System.out.printf("   took %d recursive calls%n", count);
      }
   }
} // end class FibonacciCalculator

/*************************************************************************
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

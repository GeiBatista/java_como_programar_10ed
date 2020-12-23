package exercicios_resolvidos.cap16.ex16_19;

// Exercise 16.19 Solution: PrimeFactors.java
// Program finds the prime factors of a number using sets.
import java.util.Scanner;
import java.util.HashSet;

public class PrimeFactors 
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in); // create scanner
      System.out.println("Please enter a number, -1 to terminate:");
      int inputNumber = scanner.nextInt(); // get number
      
      // process user input numbers
      while (inputNumber != -1)
      {
         HashSet<Integer> factorSet = new HashSet<Integer>();
         factorize(inputNumber, factorSet);

         if (factorSet.isEmpty()) // prime number
            System.out.println(
               "   " + inputNumber + " is a prime number.");
         else
            System.out.println(
               "   Factors are: " + factorSet);

         // get next number
         System.out.println(
            "Please enter a number, -1 to terminate:");
         inputNumber = scanner.nextInt(); // get number
      } 
   }

   // find prime factors
   public static boolean factorize(int number, HashSet<Integer> set)
   {
      if (number == 0 || number == 1)
         return false;

      // loop through numbers that are less than or equal to number/2
      for (int factor = 2 ; factor <= number / 2; factor++) 
      {
         // has factor
         if (number % factor == 0) 
         {
            set.add(factor); // save the factor

            // just look at what's left over for more factors
            if (!factorize((number / factor), set))
               set.add(number / factor);
            return true;
         } 
      }

      return false;
   } 
} // end class PrimeFactors


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

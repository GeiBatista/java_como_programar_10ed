package exercicios_resolvidos.cap05.ex05_20;

// Exercise 5.20 Solution: Pi.java
// Program calculates Pi from the infinite series.

public class Pi
{
   public static void main(String[] args)
   {
      double piValue = 0; // current approximation of pi
      double number = 4.0; // numerator of fraction
      double denominator = 1.0; // denominator
      int accuracy = 200000; // maximum number of terms in series

      System.out.printf("Accuracy: %d%n%n", accuracy);
      System.out.println("Term\t\tPi");

      for (int term = 1; term <= accuracy; term++)
      {
         if (term % 2 != 0)
            piValue += number / denominator;
         else
            piValue -= number / denominator;

         System.out.printf("%d\t\t%.16f%n", term, piValue);
         denominator += 2.0;
      } 
   } 
} // end class Pi

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

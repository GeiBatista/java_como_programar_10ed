package exercicios_resolvidos.cap05.ex05_13;

// Exercise 5.13 Solution: Factorial.java
// Program calculates factorials.
public class Factorial
{
   public static void main(String[] args)
   {
      System.out.printf("n\tn!%n%n");

      for (long number = 1; number <= 20; number++)
      {
         long factorial = 1;

         for (long smaller = 1; smaller <= number; smaller++)
            factorial *= smaller;

         System.out.printf("%d\t%d%n", number, factorial);
      } 
   } 
} // end class Factorial


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

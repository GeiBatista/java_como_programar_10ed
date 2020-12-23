package exercicios_resolvidos.cap18.ex18_10;

// Exercise 18.10: FactorialCalculator.java
// Recursive factorial method.

public class FactorialCalculator
{
   // recursive definition of method factorial
   public static long factorial(long number, int step)
   {
      String indentation = "";
      step++;

      System.out.printf("Step %d: ", step);

      // create proper indentation for output
      for (int i = 0; i < step; i++)
         indentation += "   ";

      // base case
      if (number <= 1)
      {
         System.out.printf("%s1%n", indentation);
         return 1; 
      } 
      else // recursion step
      {
         System.out.printf("%s%d * factorial(%d)%n",
            indentation, number, number - 1);
         return number * factorial(number - 1, step);
      }
   }

   // output factorials for values 0-21
   public static void main(String[] args)
   {
      // calculate the factorials of 0 through 21
      for (int counter = 0; counter <= 21; counter++)
         System.out.printf("%d! = %d%n", counter, factorial(counter, 0));
   } 
} // end class FactorialCalculator

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

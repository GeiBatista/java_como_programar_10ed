package exercicios_resolvidos.cap18.ex18_08;

// Exercise 18.8 Solution: SumCalculator.java

public class SumCalculator
{
   public static void main(String args[])
   {
      int result = sum(6);
      System.out.print("Result is: " + result);
   }

   public static int sum(int n)
   {
      if (n == 0)
         return 0;
      else
         return n + sum(n - 1);
   } 
} // end class SumCalculator

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

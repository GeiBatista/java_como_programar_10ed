package exercicios_resolvidos.cap05.ex05_12;

// Exercise 5.12 Solution: Odd.java
// Program prints the product of the odd integers from 1 to 15
public class Odd
{
   public static void main(String[] args)
   {
      int product = 1; // the product of all the odd numbers

      // loop through all odd numbers from 3 to 15
      for (int x = 3; x <= 15; x += 2)
         product *= x;

      // show results
      System.out.printf("Product is %d%n", product);      
   } 
} // end class Odd



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

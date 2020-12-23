package exercicios_resolvidos.cap05.ex05_28;

// Exercise 5.28 Solution: ContinueTest.java
// Alternative to the continue statement in a for statement
public class ContinueTest 
{
   public static void main(String[] args)
   {
      for (int count = 1; count <= 10; count++) // loop 10 times
         if (count != 5) // if count is not 5 
            System.out.printf("%d ", count); // print

      System.out.println("\nRemoved continue to skip printing 5");
   } 
} // end class ContinueTest



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

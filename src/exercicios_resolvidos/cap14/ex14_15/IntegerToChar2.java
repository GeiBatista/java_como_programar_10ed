package exercicios_resolvidos.cap14.ex14_15;

// Exercise 14.15 Solution: IntegerToChar2.java
// Application converts from an integer value to a character

public class IntegerToChar2
{
   public static void main(String args[])
   {
      // display character value for each integer
      for (int i = 0; i <= 255; i++) 
      {
         if (i % 7 == 0)
            System.out.println();
         
         System.out.printf("\t%04d %s", i, (char) i);
      } 

      System.out.println();
   } 
} // end class IntegerToChar2

/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
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

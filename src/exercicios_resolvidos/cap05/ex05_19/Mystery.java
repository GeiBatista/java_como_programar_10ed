package exercicios_resolvidos.cap05.ex05_19;

// Exercise 5.19 Solution: Mystery.java
// Printing conditional expressions outputs 'true' or 'false'.
public class Mystery 
{
   public static void main(String[] args)
   {
      int i = 1;
      int j = 2;
      int k = 3;
      int m = 2;

      // part a
      System.out.println(i == 1); 
      
      // part b
      System.out.println(j == 3); 

      // part c
      System.out.println((i >= 1) && (j < 4)); 
      
      // part d
      System.out.println((m <= 99) & (k < m)); 

      // part e
      System.out.println((j >= i) || (k == m)); 

      // part f
      System.out.println((k + m < j) | (3 - j >= k)); 

      // part g
      System.out.println(!(k > m)); 
   } 
} // end class Mystery



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

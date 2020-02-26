package exercicios_resolvidos.cap05.ex05_23;

// Exercise 5.23 Solution: DeMorgan.java
// Program tests DeMorgan's laws.
public class DeMorgan
{
   public static void main(String[] args)
   {
      int x = 6;
      int y = 0;

      // part a
      System.out.printf("!(x < 5) && !(y >= 7) is %b%n", 
         (!(x < 5) && !(y >= 7)));
      System.out.printf("!((x < 5) || (y >= 7) is %b%n", 
         (!((x < 5) || (y >= 7))));

      int a = 8;
      int b = 22;
      int g = 88;

      // part b
      System.out.printf("!(a == b) || !(g != 5) is %b%n", 
         (!(a == b) || !(g != 5)));
      System.out.printf("!((a == b) && (g != 5)) is %b%n", 
         (!((a == b) && (g != 5))));

      x = 8;
      y = 2;

      // part c
      System.out.printf("!((x <= 8) && (y > 4)) is %b%n", 
         (!((x <= 8) && (y > 4))));
      System.out.printf("!(x <= 8) || !(y > 4) is %b%n", 
         (!(x <= 8) || !(y > 4)));

      int i = 0;
      int j = 7;

      // part d
      System.out.printf("!((i > 4) || (j <= 6)) is %b%n", 
         (!((i > 4) || (j <= 6))));
      System.out.printf("!(i > 4) && !(j <= 6) is %b%n", 
         (!(i > 4) && !(j <= 6)));
   } 
} // end class DeMorgan


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

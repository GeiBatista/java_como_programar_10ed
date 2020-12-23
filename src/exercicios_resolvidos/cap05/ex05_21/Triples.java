package exercicios_resolvidos.cap05.ex05_21;

// Exercise 5.21 Solution: Triples.java
// Program calculates Pythagorean triples
public class Triples
{
   public static void main(String[] args)
   {
      // declare the three sides of a triangle
      int side1;
      int side2;
      int hypotenuse;

      System.out.printf("%-8s%-8s%s%n", 
		  "Side 1", "Side 2", "Hypotenuse");

      for (side1 = 1; side1 <= 500; side1++)
         for (side2 = 1; side2 <= 500; side2++)
            for (hypotenuse = 1; hypotenuse <= 500; hypotenuse++)
               // use Pythagorean Theorem to print right triangles
               if ((side1 * side1) + (side2 * side2) ==
                  (hypotenuse * hypotenuse))
                  System.out.printf("%-8d%-8d%d%n",
                     side1, side2, hypotenuse);      
   } 
} // end class Triples


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

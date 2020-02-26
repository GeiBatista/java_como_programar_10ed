package exercicios_resolvidos.cap06.ex06_12;

// Exercise 6.12 Solution: RandomRange.java
import java.util.Random;

public class RandomRange
{
   public static void main(String[] args)
   {
      Random randomNumbers = new Random();      
      
      // a)
      System.out.println(1 + randomNumbers.nextInt(2));
      
      // b)
      System.out.println(1 + randomNumbers.nextInt(100));

      // c)
      System.out.println(randomNumbers.nextInt(10));

      // d)
      System.out.println(1000 + randomNumbers.nextInt(113));

      // e)
      System.out.println(-1 + randomNumbers.nextInt(3));

      // f)
      System.out.println(-3 + randomNumbers.nextInt(15));    
   } 
} // end class RandomRange


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

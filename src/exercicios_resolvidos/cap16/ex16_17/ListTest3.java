package exercicios_resolvidos.cap16.ex16_17;

// Exercise 16.17 Solution: ListTest3.java
// Program inserts and sorts random numbers in a list,
// prints the sum, and displays the average.
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class ListTest3 
{
   public static void main(String[] args)
   {
      LinkedList<Integer> list = new LinkedList<Integer>();
      int newNumber;
      Random randomNumber = new Random();

      // Create objects to store in the List
      for (int k = 0; k <25; k++)
      {
         newNumber = randomNumber.nextInt(101);
         list.add(newNumber);
      }

      Collections.sort(list);
      System.out.println(list);

      int count = 0;
      Iterator<Integer> iterator = list.iterator();

      // calculate total
      while (iterator.hasNext()) 
         count += iterator.next();

      System.out.printf("Sum is: %d%nAverage is: %.2f", count,
            ((double) count / list.size()));
   }
}  // end class ListTest3

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

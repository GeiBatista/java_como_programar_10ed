package exercicios_resolvidos.cap16.ex16_21;

// Exercise 16.21 Solution: PriorityQueueTest.java
// Order PriorityQueue with a Comparator.
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest
{
   public static void main(String[] args)
   {
      // queue of capacity 5 and a new Comparator
      PriorityQueue<Double> queue =
         new PriorityQueue<Double>(5, new DoubleComparator());

      // insert elements to queue
      queue.offer(3.2);
      queue.offer(9.8);
      queue.offer(5.4);

      System.out.print("Polling from queue: ");

      // display elements in queue
      while (queue.size()> 0)
      {
         System.out.printf("%.1f ", queue.peek()); // view top element
         queue.poll(); // remove top element
      } 
   } 

   private static class DoubleComparator implements Comparator<Double>
   {
      public int compare(Double first, Double second)
      {
         return -Double.compare(first, second);
      }
   } 
} // end class PriorityQueueTest

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

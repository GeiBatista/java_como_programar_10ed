package exercicios_resolvidos.cap19.ex19_05;

// Exercise 19.5 Solution: BubbleSortTest.java
// Test the bubble sort class.

public class BubbleSortTest
{
   public static void main(String[] args)
   {
      // create object to perform bubble sort
      BubbleSort sortArray = new BubbleSort(10);
      
      System.out.println("Before:");
      System.out.println(sortArray); // print unsorted array

      sortArray.sort(); // sort array

      System.out.println("After:");
      System.out.println(sortArray); // print sorted array
   }
} // end class BubbleSortTest


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

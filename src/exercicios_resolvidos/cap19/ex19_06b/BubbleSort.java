package exercicios_resolvidos.cap19.ex19_06b;

// Exercise 19.6b Solution: BubbleSort.java
// Sort an array's values into ascending order.
import java.util.Random;

public class BubbleSort 
{
   private int[] data; // array of values
   private static Random generator = new Random();

   // create array of given size and fill with random integers
   public BubbleSort(int size)
   {
      data = new int[size]; // create space for array

      // fill array with random ints in range 10-99
      for (int i = 0; i < size; i++)
         data[i] = 10 + generator.nextInt(90);
   }

   // sort elements of array with bubble sort                
   public void sort()
   {
      // did a swap take place during pass?
      boolean didSwap;

      // loop for data.length - 1 passes
      for (int pass = 1; pass < data.length; pass++)
      {
         didSwap = false; // no swaps have been done for this pass

         // loop over elements in array
         for (int index = 0; index < data.length - pass; index++) 
         {
            // swap adjacent elements if first is greater than second
            if (data[index] > data[index + 1])
            {
               swap(index, index + 1); // swap adjacent elements
               didSwap = true; // indicate swap happened
            }
         } 

         // if no swaps, terminate bubble sort
         if (!didSwap)
            return;
      } 
   } 

   // helper method to swap values in two elements
   public void swap(int first, int second)
   {
      int temporary = data[first]; // store first in temporary
      data[first] = data[second]; // replace first with second
      data[second] = temporary; // put temporary in second
   } 

   // method to output values in array
   public String toString()
   {
      StringBuilder temporary = new StringBuilder();

      // iterate through array
      for (int element : data)
         temporary.append(element + " ");
     
      temporary.append("\n");  // add endline character
      return temporary.toString();
   }
} // end class BubbleSort


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

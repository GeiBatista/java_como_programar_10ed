package exercicios_resolvidos.cap19.ex19_09;

// Exercise 19.9 Solution: BinaryArray.java
// Class that contains an array of random integers and a method 
// that uses binary search to find an integer.
import java.util.Random;
import java.util.Arrays;

public class BinaryArray
{
   private int[] data; // array of values
   private static Random generator = new Random();

   // create array of given size and fill with random integers
   public BinaryArray(int size)
   {
      data = new int[size]; // create space for array

      // fill array with random ints in range 10-99
      for (int i = 0; i < size; i++)
         data[i] = 10 + generator.nextInt(90);

      Arrays.sort(data);
   } 

   // perform a binary search on the data
   public int binarySearch(int searchElement)
   {
      int low = 0; // low end of the search area
      int high = data.length - 1; // high end of the search area

      return recursiveBinarySearch(searchElement, low, high);
   }

   public int recursiveBinarySearch(
      int searchElement, int low, int high)
   {
      if (low > high) // test base case; no element left to check
         return -1;

      // middle of the search area; element we will test first
      int middle = (low + high + 1) / 2;

      // print remaining elements of array
      System.out.print(remainingElements(low, high));

      // output spaces for alignment
      for (int i = 0; i < middle; i++)
         System.out.print("   ");
      System.out.println(" * "); // indicate current middle

      // variable to return; -1 if the value was not found
      int location = -1; 

      // if the element is found
      if (searchElement == data[middle])
         location = middle; // location is the current middle
      // middle element is too high
      else if (searchElement < data[middle])
         // eliminate the higher half
         location = recursiveBinarySearch(
            searchElement, low, middle - 1); 
      else // middle element is too low
         // eliminate the lower half
         location = recursiveBinarySearch(
            searchElement, middle + 1, high); 

      return location; // return location of search key
   } 

   // method to output certain values in array
   public String remainingElements(int low, int high)
   {
      StringBuilder temporary = new StringBuilder();

      // output spaces for alignment
      for (int i = 0; i < low; i++)
         temporary.append("   ");

      // output elements left in array
      for (int i = low; i <= high; i++)
         temporary.append(data[i] + " ");

      temporary.append("\n");
      return temporary.toString();
   } 

   // method to output values in array
   public String toString()
   {
      return remainingElements(0, data.length - 1);
   } 
} // end class BinaryArray


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

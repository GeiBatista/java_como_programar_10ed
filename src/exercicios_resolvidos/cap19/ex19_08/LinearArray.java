package exercicios_resolvidos.cap19.ex19_08;

// Exercise 19.8 Solution: LinearArray.java
// Class that contains an array of random integers and a method 
// that will search that array sequentially.
import java.util.Random;

public class LinearArray
{
   private int[] data; // array of values
   private static Random generator = new Random();

   // create array of given size and fill with random integers
   public LinearArray(int size)
   {
      data = new int[size]; // create space for array

      // fill array with random ints in range 10-99
      for (int i = 0; i < size; i++)
         data[i] = 10 + generator.nextInt(90);
   } 

   // perform a linear search on the data
   public int linearSearch(int search)
   {
      return recursiveLinearSearch(search, 0);
   } 

   public int recursiveLinearSearch(int search, int start)
   {
      int location; // variable to store return value

      if (start >= data.length) // if at end of array
         location = -1; // value not found
      else
      {
         // if item is equal to search key
         if (data[start] == search)
            location = start; // return current location
         else
            // recursively search rest of array
            location = recursiveLinearSearch(search, start + 1);
      }

      return location; // return location of search key
   }

   // method to output values in array
   public String toString()
   {
      StringBuilder temporary = new StringBuilder();

      // iterate through array
      for (int element : data)
         temporary.append(element + " ");

      temporary.append("\n"); // add endline character
      return temporary.toString();
   }
} // end class LinearArray


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
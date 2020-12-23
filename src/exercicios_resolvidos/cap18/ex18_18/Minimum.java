package exercicios_resolvidos.cap18.ex18_18;

// Exercise 18.18 Solution: Minimum.java
// Program finds the minimum value in an array.

public class Minimum 
{
   // call helper function to do work
   public static int recursiveMinimum(int[] array)
   {
      return recursiveMinimumHelper(array, 0);
   }

   // recursively find minimum value in array
   private static int recursiveMinimumHelper(int[] array, int index)
   {
      if (index + 1 == array.length)
         return array[index];

      return Math.min(array[index],
         recursiveMinimumHelper(array, index + 1));
   } 

   // initialize array and draw array values
   public static void main(String args[])
   {
      int array[] = {22, 88, 8, 94, 78, 84, 96, 73, 34};

      // display array
      for (int current : array)
         System.out.printf("%d ", current);

      // display minimum
      System.out.printf("%nThe smallest value in the array is: %d%n",
         recursiveMinimum(array));
   } 
} // end class Minimum

/*************************************************************************
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

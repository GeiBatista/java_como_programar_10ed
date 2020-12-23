package exercicios_resolvidos.cap18.ex18_16;

// Exercise 18.16 Solution: Print.java
// Program prints an array.

public class Print
{
   // call helper function to do work
   public static void printArray(int[] array)
   {
      printArrayHelper(array, 0);
      System.out.println(); // add ending newline
   }

   // recursively print array
   private static void printArrayHelper(int[] array, int startIndex)
   {
      if (startIndex == array.length)
         return;

      System.out.print(array[startIndex] + " ");
      printArrayHelper(array, startIndex + 1);
   } 

   // initializes values
   public static void main(String args[])
   {
      int array[] = {8, 22, 88, 34, 84, 21, 94};

      System.out.print("Array is: ");
      printArray(array); // print array
   }
} // end class Print

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

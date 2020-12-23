package exercicios_resolvidos.cap18.ex18_17;

// Exercise 18.17 Solution: Reverse.java
// Application prints an input string backward.
import java.util.Scanner;

public class Reverse
{
   // call helper function
   public static void stringReverse(char[] array)
   {
      stringReverseHelper(array, 0);
      System.out.println();
   }

   // print out an array of chars in reverse order
   private static void stringReverseHelper(char[] array, int index)
   {
      // reached beginning of string
      if (index == array.length)
         return;

      stringReverseHelper(array, index + 1);
      System.out.print(array[index]);
   } 

   // takes user-input string and prints it reversed
   public static void main(String args[])
   {
      System.out.print("Enter a string: ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      stringReverse(input.toCharArray());
   } 
} // end class Reverse

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

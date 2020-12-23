package exercicios_resolvidos.cap06.ex06_17;

// Exercise 6.17 Solution: EvenOdd.java
// Program determines if a number is odd or even.
import java.util.Scanner;

public class EvenOdd
{
   // determines whether numbers are even or odd
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.printf("%s%n%s%n   %s%n   %s%n", 
         "Enter numbers to determine if they are even or odd.", 
         "Type the end-of-file indicator to terminate input:", 
         "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter");
      
      while (input.hasNext())
      {
         int number = input.nextInt();

         if (isEven(number))
            System.out.printf("%d is even%n%n", number);
         else
            System.out.printf("%d is odd%n%n", number);
      } 
   } 

   // return true if number is even
   public static boolean isEven(int number)
   {
      return number % 2 == 0;
   } 
} // end class EvenOdd



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

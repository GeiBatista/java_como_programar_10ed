package exercicios_resolvidos.cap05.ex05_11;

// Exercise 5.11 Solution: Small.java
// Program finds the smallest of several integers.
import java.util.Scanner;

public class Small
{
   // finds the smallest integer
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int smallest = 0; // smallest number
      int number = 0; // number entered by user
      int integers; // number of integers

      System.out.print("Enter number of integers: ");
      integers = input.nextInt();

      for (int counter = 1; counter <= integers; counter++)
      {
         System.out.print("Enter integer: ");
         number = input.nextInt();

         if (counter == 1)
            smallest = number;
         else if (number < smallest)
            smallest = number;
      } 

      System.out.printf("Smallest Integer is: %d%n", smallest);
   } 
} // end class Small


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

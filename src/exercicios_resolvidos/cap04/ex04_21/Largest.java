package exercicios_resolvidos.cap04.ex04_21;

// Exercise 4.21 Solution: Largest.java
// Program determines and prints the largest of 10 numbers.
import java.util.Scanner;

public class Largest
{
   // determines the largest of 10 numbers
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // get first number and assign it to variable largest
      System.out.print("Enter number: ");
      int largest = input.nextInt();

      int counter = 1;

      // get rest of the numbers and find the largest
      while (counter < 10)
      {
         System.out.print("Enter number: ");
         int number = input.nextInt();

         if (number > largest)
            largest = number;

         ++counter;
      } 

      System.out.printf("Largest number is %d%n", largest);
   } 
} // end class Largest


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

package exercicios_resolvidos.cap04.ex04_23;

// Exercise 4.23 Solution: TwoLargest.java
// Program determines and prints the two largest of 10 numbers.
import java.util.Scanner;

public class TwoLargest
{
   // determines the two largest of 10 numbers
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // get first number and assign it to variable largest
      System.out.print("Enter number: ");
      int largest = input.nextInt();
      
      // get second number and compare it with first number
      System.out.print("Enter number: ");
      int number = input.nextInt();

      int nextLargest; // second largest number

      if (number > largest)
      {
         nextLargest = largest;
         largest = number;
      } // end if
      else
         nextLargest = number;

      int counter = 2; // number of values entered

      // get rest of the numbers and find the largest and nextLargest
      while (counter < 10)
      {
         System.out.print("Enter number: ");
         number = input.nextInt();
         
         if (number > largest) {
            nextLargest = largest;
            largest = number;
         }
         else if (number > nextLargest)
            nextLargest = number;

         ++counter;
      } 

      System.out.printf("Largest is %d%nSecond largest is %d%n",
         largest, nextLargest);
   }
} // end class TwoLargest


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

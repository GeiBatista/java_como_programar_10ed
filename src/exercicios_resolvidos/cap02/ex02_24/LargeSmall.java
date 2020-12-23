package exercicios_resolvidos.cap02.ex02_24;

// Exercise 2.24 Solution: LargeSmall.java
// Program calculates the largest and smallest
// of five integers entered one at a time.
import java.util.Scanner;

public class LargeSmall 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      // numbers to be entered
      int firstNumber;
      int secondNumber;
      int thirdNumber; 
      int fourthNumber;
      int fifthNumber;

      // largest and smallest
      int largest;
      int smallest;

      System.out.print("Enter first number: "); // prompt for input
      firstNumber = input.nextInt(); // read first number

      // initially firstNumber is the smallest and the largest
      smallest = firstNumber;
      largest = firstNumber;

      System.out.print("Enter second number: "); // prompt for input
      secondNumber = input.nextInt(); // read second number

      // determine whether secondNumber is the smallest
      if (secondNumber < smallest) 
         smallest = secondNumber;

      // determine whether secondNumber is the largest
      if (secondNumber > largest)
         largest = secondNumber;

      System.out.print("Enter third number: "); // prompt for input
      thirdNumber = input.nextInt(); // read third number

      // determine whether thirdNumber is the smallest
      if (thirdNumber < smallest) 
         smallest = thirdNumber;

      // determine whether thirdNumber is the largest
      if (thirdNumber > largest)
         largest = thirdNumber;

      System.out.print("Enter fourth number: "); // prompt for input
      fourthNumber = input.nextInt(); // read fourth number

      // determine whether fourthNumber is the smallest
      if (fourthNumber < smallest) 
         smallest = fourthNumber;

      // determine whether fourthNumber is the largest
      if (fourthNumber > largest)
         largest = fourthNumber;

      System.out.print("Enter fifth number: "); // prompt for input
      fifthNumber = input.nextInt(); // read fifth number

      // determine whether fifthNumber is the smallest
      if (fifthNumber < smallest) 
         smallest = fifthNumber;

      // determine whether fifthNumber is the largest
      if (fifthNumber > largest)
         largest = fifthNumber;

      // display results
      System.out.printf("Numbers input: %d %d %d %d %d%n%n", firstNumber,
         secondNumber, thirdNumber, fourthNumber, fifthNumber); 
      System.out.printf("Smallest number is: %d%n", smallest);
      System.out.printf("Largest number is: %d%n", largest);
   } // end main
} // end class LargeSmall


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

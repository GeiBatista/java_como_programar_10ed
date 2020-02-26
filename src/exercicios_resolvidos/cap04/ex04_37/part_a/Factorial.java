package exercicios_resolvidos.cap04.ex04_37.part_a;

// Exercise 4.37 Part A Solution: Factorial.java
// Program calculates a factorial.
import java.util.Scanner;

public class Factorial
{
   // calculates the factorial of a number
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int factorial = 1;

      System.out.print("Enter a positive Integer: ");
      int number = input.nextInt();
      
      System.out.printf("%d! is ", number);

      // calculate factorial
      while (number > 1)
      {
         factorial *= number;
         number--;
      } 

      System.out.println(factorial);
   }
} // end class Factorial


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

package exercicios_resolvidos.cap04.ex04_20;

// Exercise 4.20 Solution: Wages.java
// Program calculates wages.
import java.util.Scanner;

public class Wages
{
   // calculates wages for 3 employees
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int count = 1; // number of employees

      // repeat calculation for 3 employees
      while (count <= 3)
      {
         System.out.print("Enter hourly rate: ");
         double rate = input.nextDouble(); 
         
         System.out.printf("Enter hours worked: ");
         double hours = input.nextDouble(); 

         double pay; // gross pay

         // calculate wages
         if (hours > 40) // with overtime
            pay = (40.0 * rate) + (hours - 40) * (rate * 1.5);
         else // straight time
            pay = hours * rate;

         // print the pay for the current employee
         System.out.printf("Pay for Employee %d is $%.2f%n", count, pay);

         ++count;
      } 
   } 
} // end class Wages


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

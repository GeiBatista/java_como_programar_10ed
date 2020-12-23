package exercicios_resolvidos.cap04.ex04_19;

// Exercise 4.19 Solution: Sales.java
// Program calculates commissions based on sales.
import java.util.Scanner;

public class Sales
{
   // calculate sales for individual products
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double gross = 0.0; // total gross sales
      double earnings; // earnings made from sales
      int product = 0; // the product number
      int numberSold; // number sold of a given product

      while (product < 4)
      {
         ++product;

         // prompt and read number of the product sold from user
         System.out.printf("Enter number sold of product #%d: ",
            product);
         numberSold = input.nextInt();

         // determine gross of each individual product and add to total
         if (product == 1)
            gross += numberSold * 239.99;
         else if (product == 2)
            gross += numberSold * 129.75;
         else if (product == 3)
            gross += numberSold * 99.95;
         else if (product == 4)
            gross += numberSold * 350.89;
      }

      earnings = 0.09 * gross + 200; // calculate earnings
      System.out.printf("Earnings this week: $%.2f%n", earnings);
   } 
} // end class Sales


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

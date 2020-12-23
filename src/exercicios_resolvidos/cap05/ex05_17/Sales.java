package exercicios_resolvidos.cap05.ex05_17;

// Exercise 5.17 Solution: Sales.java
// Program calculates sales, based on an input of product
// number and quantity sold
import java.util.Scanner;

public class Sales
{
   // calculates sales for 5 products
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double total = 0; // total of all products sold
      int productID; // specifies product entered by the user

      // determine the product chosen
      System.out.print("Enter product number (1-5 or 0 to stop): ");
      productID = input.nextInt();

      // ask user for product number until flag value entered
      while (productID != 0)
      {
         if (productID >= 1 && productID <= 5)
         {
            // determine the number sold of the item
            System.out.print("Enter quantity sold: ");
            int quantity = input.nextInt();

            // increment the total for the item by the
            // price times the quantity sold
            switch (productID)
            {
               case 1:
                  total += quantity * 2.98;
                  break;
               case 2:
                  total += quantity * 4.50;
                  break;
               case 3:
                  total += quantity * 9.98;
                  break;
               case 4:
                  total += quantity * 4.49;
                  break;
               case 5:
                  total += quantity * 6.87;
                  break;
            } 
         } 
         else if (productID != 0)
            System.out.println(
               "Product number must be between 1 and 5 or 0 to stop");

         // determine the product chosen
         System.out.print("Enter product number (1-5 or 0 to stop): ");
         productID = input.nextInt();
      } 

      // print summary
      System.out.println();
      System.out.printf("Total retail value of all products sold is: $%.2f%n", total);
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

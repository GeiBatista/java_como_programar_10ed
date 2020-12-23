package exercicios_resolvidos.cap06.ex06_08;

// Exercise 6.8 Solution: Garage.java
// Program calculates charges for parking
import java.util.Scanner;

public class Garage
{
   // begin calculating charges
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double totalReceipts = 0.0; // total fee collected for the day
      double fee; // the charge for the current customer
      double hours; // hours for the current customer
            
      // read in the first customer's hours
      System.out.print("Enter number of hours (-1 to quit): ");
      hours = input.nextDouble();
      
      while (hours >= 0.0)
      {
         // calculate and print the charges
         fee = calculateCharges(hours);
         totalReceipts += fee;
         System.out.printf(
            "Current charge: $%.2f, Total receipts: $%.2f%n",
            fee, totalReceipts);

         // read in the next customer's hours
         System.out.print("Enter number of hours (-1 to quit): ");
         hours = input.nextDouble();
      } 
   } 

   // determines fee based on time
   public static double calculateCharges(double hours)
   {
      // apply minimum charge
      double charge = 2.0;

      // add extra fees as applicable
      if (hours > 3.0)
         charge = 2.0 + 0.5 * Math.ceil(hours - 3.0);

      // apply maximum charge if needed
      if (charge > 10.0)
         charge = 10.0;

      return charge;
   } 
} // end class Garage


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

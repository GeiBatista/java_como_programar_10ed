package exercicios_resolvidos.cap02.ex02_35;

// Exercise 2.35 Solution: DailyDrivingCost.java
// Determine daily driving cost based on total miles driven per day,
// cost per gallong of gas, average miles per gallon, parking fees per day
// and tolls per day.
import java.util.Scanner;

public class DailyDrivingCost 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int milesDriven; // miles driven per day
      int costPerGallon; // cost per gallon of gas (in cents)
      int averageMilesPerGallon; // average miles per gallon of gas
      int parkingFees; // parking fees per day
      int tolls; // tolls per day
      
      // obtain weight in pounds and height in inches
      System.out.println("Welcome to the Daily Driving Cost calculator");
      System.out.print("Enter the number of miles you drive per day: ");
      milesDriven = input.nextInt();
      System.out.print("Enter the cost per gallon of gas (in cents): ");
      costPerGallon = input.nextInt();
      System.out.print("Enter average miles per gallon of gas: ");
      averageMilesPerGallon = input.nextInt();
      System.out.print("Enter the parking fees per day (in cents): ");
      parkingFees = input.nextInt();
      System.out.print("Enter the tolls per day (in cents): ");
      tolls = input.nextInt();

      // calculate and display daily driving cost
      System.out.printf("%nYour daily driving cost is $%.2f%n", 
         costPerGallon / 100.0 * milesDriven / averageMilesPerGallon + 
         parkingFees / 100.0 + tolls / 100.0);
   } // end main 
} // end class DailyDrivingCost


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

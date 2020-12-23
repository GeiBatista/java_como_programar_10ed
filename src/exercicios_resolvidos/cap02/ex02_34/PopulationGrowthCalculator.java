package exercicios_resolvidos.cap02.ex02_34;

// Exercise 2.34 Solution: PopulationGrowthCalculator.java
// Based on the current annual population growth rate and current
// world population, calcualte the world population after one, 
// two, three, four and five years.

// Note: Due to the size of the numbers and the percentage needed 
// to calculate population growth, this problem cannot be solved
// with int variables. So you'll need to tell your students to use
// type double and to input values with Scanner method nextDouble.
// Also, you should have them output the values using 
// System.out.printf and the format specifier %.0f.
import java.util.Scanner;

public class PopulationGrowthCalculator 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double currentPopulation; // today's world population
      double growthRate; // growth rate (1.14% would be .0114)
      double futurePopulation; // future population based on growth rate

      // obtain weight in pounds and height in inches
      System.out.println("Welcome to the world population calculator");
      System.out.print("Enter the current world population: ");
      currentPopulation = input.nextDouble();
      System.out.println("Enter the current growth rate");
      System.out.print("(e.g., 1.14% should be entered as .0114): ");
      growthRate = input.nextDouble();

      // calculate and display future population numbers
      futurePopulation = currentPopulation * (1 + growthRate);
      System.out.printf("%nAfter 1 year, the world population will be %.0f%n", 
         futurePopulation);

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.printf("After 2 years, the world population will be %.0f%n", 
         futurePopulation);

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.printf("After 3 years, the world population will be %.0f%n", 
         futurePopulation);

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.printf("After 4 years, the world population will be %.0f%n", 
         futurePopulation);

      futurePopulation = futurePopulation * (1 + growthRate);
      System.out.printf("After 5 years, the world population will be %.0f%n", 
         futurePopulation);
   } // end main 
} // end class PopulationGrowthCalculator


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

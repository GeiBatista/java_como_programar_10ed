package exercicios_resolvidos.cap04.ex04_39;

// Exercise 4.39 Solution: WorldPopulationGrowth.java
// Based on the current annual population growth rate and current
// world population, calcualte the world population after one, 
// two, three, four and five years.
import java.util.Scanner;

public class WorldPopulationGrowth 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      // obtain weight in pounds and height in inches
      System.out.println("Welcome to the world population calculator");
      System.out.print("Enter the current world population: ");
      long currentPopulation = input.nextLong();
      System.out.print("Enter the current growth rate: (e.g, 1.14% would be .0114): ");
      double growthRate = input.nextDouble();

      int year = 1; // year counter 
      System.out.printf("%4s%22s%24s%n", "Year", "Estimated Population", 
         "Change from prior Year");
      
      while (year <= 75)
      {
         double futurePopulation = currentPopulation * (1 + growthRate);
         System.out.printf("%4d%22d%24d%n", 
            year, (long) futurePopulation, (long) futurePopulation - currentPopulation);
         currentPopulation = (long) futurePopulation; // keep track 
         ++year;
      } // end while
   } // end main 
} // end class WorldPopulationGrowth


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

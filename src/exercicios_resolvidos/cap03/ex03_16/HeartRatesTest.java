package exercicios_resolvidos.cap03.ex03_16;

// Exercise 3.16 Solution: HeartRatesTest.java
// Tests class HeartRates.
public class HeartRatesTest
{
   public static void main(String[] args)
   {
      // create a HeartRates object for a person born in 1975;
      // rates calculated based on current year 2009.
      HeartRates bob = new HeartRates("Bob", "Blue", 1975, 2009);
      
      System.out.printf("First name: %s%n", bob.getFirstName());
      System.out.printf("Last name: %s%n", bob.getLastName());
      System.out.printf("Age: %d%n", bob.getAge());
      System.out.printf("Maximum heart rate: %d%n", bob.getMaximumHeartRate());
      System.out.println("Target heart rate range:");
      System.out.printf("   Minimum: %.0f%n", bob.getMinimumTargetHeartRate());
      System.out.printf("   Maximum: %.0f%n", bob.getMaximumTargetHeartRate());
   } // end main
} // end class HeartRatesTest


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

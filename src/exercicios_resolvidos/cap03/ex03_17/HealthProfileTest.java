package exercicios_resolvidos.cap03.ex03_17;

// Exercise 3.17 Solution: HealthProfileTest.java
// Tests class HealthProfile.
import java.util.Scanner;

public class HealthProfileTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter first name: ");
      String firstName = input.next();
      System.out.print("Enter last name: ");
      String lastName = input.next();
      System.out.print("Enter gender: ");
      String gender = input.next();
      System.out.print("Enter height in inches: ");
      double height = input.nextDouble();
      System.out.print("Enter weight in pounds: ");
      double weight = input.nextDouble();
      System.out.print("Enter year of birth: ");
      int birthYear = input.nextInt();
      System.out.print("Enter current year: ");
      int currentYear = input.nextInt();

      // create a HealthProfile object for a person based on the user input
      HealthProfile person = 
         new HealthProfile(firstName, lastName, gender, height, 
            weight, birthYear, currentYear);
      
      // display user's health profile
      person.displayHealthProfile();
   } // end main
} // end class HealthProfileTest


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

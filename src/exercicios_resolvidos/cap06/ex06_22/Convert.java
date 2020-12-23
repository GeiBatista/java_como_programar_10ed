package exercicios_resolvidos.cap06.ex06_22;

// Exercise 6.22 Solution: Convert.java
// Program converts Fahrenheit to Celsius and vice versa.
import java.util.Scanner;

public class Convert
{
   // convert temperatures
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      int choice; // the user's choice in the menu
      
      do
      {
         // print the menu
         System.out.println("1. Fahrenheit to Celsius");
         System.out.println("2. Celsius to Fahrenheit");
         System.out.println("3. Exit");
         System.out.print("Choice: ");
         choice = input.nextInt();
         
         if (choice == 1 || choice == 2)
         {
            System.out.print("Enter temperature: ");
            int oldTemperature = input.nextInt();

            // convert the temperature appropriately
            switch (choice)
            {
               case 1:
                  System.out.printf("%d Fahrenheit is %d Celsius%n%n",
                     oldTemperature, celsius(oldTemperature));
                  break;
               case 2:
                  System.out.printf("%d Celsius is %d Fahrenheit%n%n",
                     oldTemperature, fahrenheit(oldTemperature));
                  break;
            } 
         } 
      } while (choice != 3);
   } 

   // return Celsius equivalent of Fahrenheit temperature
   public static int celsius(int fahrenheitTemperature)
   {
      return ((int) (5.0 / 9.0 * (fahrenheitTemperature - 32)));
   } 

   // return Fahrenheit equivalent of Celsius temperature
   public static int fahrenheit(int celsiusTemperature)
   {
      return ((int) (9.0 / 5.0 * celsiusTemperature + 32));
   } 
} // end class Convert



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

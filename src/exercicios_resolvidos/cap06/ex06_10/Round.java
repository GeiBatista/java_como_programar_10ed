package exercicios_resolvidos.cap06.ex06_10;

// Exercise 6.10 Solution: Round.java
// Program tests rounding with Math.floor
import java.util.Scanner;

public class Round
{
   // prints the various roundings for a number
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.printf("%s%n%s%n   %s%n   %s%n", 
         "Enter decimal numbers.", 
         "Type the end-of-file indicator to terminate input:", 
         "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter");
      
      while (input.hasNext())
      {
         double x = input.nextDouble();

         // print the various roundings
         System.out.printf("The number: %f%n", x);
         System.out.printf("rounded to Integer: %f%n", 
            roundToInteger(x));
         System.out.printf("rounded to Tenth: %f%n", 
            roundToTenths(x));
         System.out.printf("rounded to Hundredth: %f%n", 
            roundToHundredths(x));
         System.out.printf("rounded to Thousandth: %f%n%n", 
            roundToThousandths(x));
      } 
   }

   // round to ones place
   public static double roundToInteger(double number)
   {
      return(Math.floor(number + .5));
   } 

   // round to tenths place
   public static double roundToTenths(double number)
   {
      return(Math.floor(number * 10 + .5) / 10);
   } 

   // round to hundredths place
   public static double roundToHundredths(double number)
   {
      return(Math.floor(number * 100 + .5) / 100);
   } 

   // round to thousandths place
   public static double roundToThousandths(double number)
   {
      return(Math.floor(number * 1000 + .5) / 1000);
   } 
} // end class Round


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

package exercicios_resolvidos.cap04.ex04_29;

// Exercise 4.29 Solution: Hollow.java
// Program prints a hollow square.
import java.util.Scanner;

public class Hollow
{
   // draw a hollow box surrounded by stars
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // prompt and read the length of the side from the user
      System.out.print("Enter length of side:");
      int stars = input.nextInt(); // number of stars on a side

      if (stars < 1)
      {
         stars = 1;
         System.out.printf("Invalid Input%nUsing default value 1%n");
      } 
      else if (stars > 20)
      {
         stars = 20;
         System.out.printf("Invalid Input%nUsing default value 20%n");
      } 
      
      int row = 1; // the current row of the square being printed

      // repeat for as many rows as the user entered
      while (row <= stars)
      {
         int column = 1; // the current column of the square being printed
         
         // and for as many columns as rows         
         while (column <= stars)
         {
            if (row == 1)
               System.out.print("*");
            else if (row == stars)
               System.out.print("*");
            else if (column == 1)
               System.out.print("*");
            else if (column == stars)
               System.out.print("*");
            else
               System.out.print(" ");

            column++;
         } 

         System.out.println();
         row++;
      } 
   } 
} // end class Hollow



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

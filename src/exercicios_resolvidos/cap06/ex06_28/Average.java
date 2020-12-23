package exercicios_resolvidos.cap06.ex06_28;

// Exercise 6.28 Solution: Average.java
// Program displays a number
// representing the student's average.
import java.util.Scanner;

public class Average
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter average (-1 to quit): ");
      int inputNumber = input.nextInt();

      while (inputNumber != -1)
      {
         if (inputNumber >= 0 && inputNumber <= 100)
            System.out.printf("Point is: %d%n",
               qualityPoints(inputNumber));
         else
            System.out.println("Invalid input.");
         
         System.out.print("Enter average (-1 to quit): ");
         inputNumber = input.nextInt();
      }
   }

   // return single-digit value of grade
   public static int qualityPoints(int grade)
   {
      if (grade >= 90)
         return 4;
      else if (grade >= 80)
         return 3;
      else if (grade >= 70)
         return 2;
      else if (grade >= 60)
         return 1;
      else
         return 0;
   } 
} // end class Average


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

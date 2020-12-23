package exercicios_resolvidos.cap06.ex06_29;

// Exercise 6.29 Solution: Coin.java
// Program simulates tossing a coin.
import java.util.Random;
import java.util.Scanner;

public class Coin
{
   private static final Random randomNumbers = new Random();
   
   // flips a coin many times
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      
      int heads = 0; 
      int tails = 0;
      
      do
      {
         // display a menu
         System.out.println("1. Toss Coin");
         System.out.println("2. Exit");
         System.out.print("Choice: ");
         int choice = input.nextInt();
         
         if (choice == 1)
         {
            if (flip())
               heads++;
            else
               tails++;

            System.out.printf("Heads: %d, Tails: %d\n", heads, tails);
         } 
         
      } while (choice != 2);
   } 

   // simulate flipping
   public static boolean flip()
   {
      return randomNumbers.nextInt(2) == 1;
   } 
} // end class Coin


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

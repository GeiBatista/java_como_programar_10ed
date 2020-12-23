package exercicios_resolvidos.cap04.ex04_18;

// Exercise 4.18 Solution: Credit.java
// Program monitors accounts.
import java.util.Scanner;

public class Credit
{
   // calculates the balance on several credit accounts
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Account Number (or -1 to quit): ");
      int account = input.nextInt(); // read in account number

      // exit if the input is -1; otherwise, proceed with the program
      while (account != -1)
      {
         System.out.print("Enter Balance: ");
         double oldBalance = input.nextDouble(); // read in original balance

         System.out.print("Enter Charges: ");
         double charges = input.nextDouble(); // read in charges

         System.out.print("Enter Credits: ");
         double credits = input.nextDouble(); // read in credits

         System.out.print("Enter Credit Limit: ");
         double creditLimit = input.nextDouble(); // read in credit limit

         // calculate and display new balance
         double newBalance = oldBalance + charges - credits;
         System.out.printf("New balance is $%.2f%n", newBalance);

         // display a warning if the user has exceed the credit limit
         if (newBalance > creditLimit)
            System.out.println("Credit limit exceeded");

         System.out.printf("%nEnter Account Number (or -1 to quit): ");
         account = input.nextInt(); // read in next account number
      } 
   } 
} // end class Credit


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

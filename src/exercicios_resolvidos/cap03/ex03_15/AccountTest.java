package exercicios_resolvidos.cap03.ex03_15;

// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      // display initial balance of each object
      displayAccount(account1); // display account1 accountName/balance
      displayAccount(account2); // display account1 accountName/balance

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
      displayAccount(account1); // display account1 accountName/balance
      displayAccount(account2); // display account1 accountName/balance

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      displayAccount(account1); // display account1 accountName/balance
      displayAccount(account2); // display account1 accountName/balance
   } // end main

   // method to display an Account's accountName and balance
   public static void displayAccount(Account accountToDisplay) 
   {
      System.out.printf("%s balance: $%.2f%n",
         accountToDisplay.getName(), // retrieve accountName 
         accountToDisplay.getBalance()); // retrieve balance
   } 
} // end class AccountTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
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

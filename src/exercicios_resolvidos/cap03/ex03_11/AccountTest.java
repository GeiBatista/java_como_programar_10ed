package exercicios_resolvidos.cap03.ex03_11;

// Exercise 3.11 Solution: AccountTest.java
// Create and manipulate an Account object.
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance()); 

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter withdrawal amount for account1: "); // prompt
      double withdrawalAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nsubtracting %.2f from account1 balance%n", withdrawalAmount);
      account1.withdraw(withdrawalAmount); // subtract amount from account1

      // display balances
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance()); 

      System.out.print("Enter withdrawal amount for account2: "); // prompt
      withdrawalAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nsubtracting %.2f from account2 balance%n", withdrawalAmount);
      account2.withdraw(withdrawalAmount); // subtract amount from account2

      // display balances
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance()); 
   } // end main
} // end class AccountTest


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
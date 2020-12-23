// Exercise 15.5 Solution: TransactionRecord.java
// A class that represents one transaction record.

public class TransactionRecord
{
   private int account;
   private double amount;
   
   // no-argument constructor calls other constructor with default values
   public TransactionRecord() 
   {
      this(0, 0.0);
   } 

   // initialize a record
   public TransactionRecord(int acct, double amt)
   {
      setAccount(acct);
      setAmount(amt);
   } 

   // set account number   
   public void setAccount(int acct)
   {
      account = acct;
   } 

   // get account number   
   public int getAccount() 
   { 
      return account; 
   } 

   // set amount  
   public void setAmount(double amt)
   {
      amount = amt;
   } 

   // get amount
   public double getAmount() 
   { 
      return amount;
   } 
} 

/*************************************************************************
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
// Exercise 15.6 Solution: FileMatch.java
// Combine account file and a transactions file into a new account file.
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Formatter;

public class FileMatch
{
   private static ObjectInputStream inOldMaster;
   private static ObjectInputStream inTransaction;
   private static ObjectOutputStream outNewMaster;
   private static Formatter logFile;
   private static TransactionRecord transaction;
   private static AccountRecordSerializable account;

   public FileMatch()
   {
      transaction = new TransactionRecord();
      account = new AccountRecordSerializable();
   } 

   public void openFiles()
   {
      try
      {
         // file streams for input and output files
         inOldMaster = new ObjectInputStream(
            new FileInputStream("oldmast.ser"));
         inTransaction = new ObjectInputStream(
            new FileInputStream("trans.ser"));
         outNewMaster = new ObjectOutputStream(
            new FileOutputStream("newmast.ser"));
         logFile = new Formatter("log.txt");
      } 
      catch (IOException io)
      {
         System.err.println("Error opening the files.");
         System.exit(1);
      } 
   } 

   public void processFiles()
   {
      int transactionAccountNumber;
      int accountNumber;

      try // block for reading/writing all records
      {
         // get a transaction record and its account number
         transaction = getTransactionRecord();
            
         // if the transaction is null, we are done
         if (transaction == null)
            return;
            
         transactionAccountNumber = transaction.getAccount();
               
         // get an account record and its account number
         account = getAccountRecord();
            
         // if the account is null, we are done
         if (account == null)
               return;
               
         accountNumber = account.getAccount();
          
         while (true)
         {
            while (accountNumber < transactionAccountNumber)
            {
               // there is no transaction for this account
               outNewMaster.writeObject(account);

               account = getAccountRecord(); // get a new account

               if (account == null)
                  return;
               
               accountNumber = account.getAccount();
            } 
            
            // if there is a transaction for this account
            if (accountNumber == transactionAccountNumber)
            {
               while (accountNumber == transactionAccountNumber)
               {
                  // combine the records
                  account.combine(transaction);

                  // get a new transaction
                  transaction = getTransactionRecord();

                  if (transaction == null)
                     return;
            
                  transactionAccountNumber = transaction.getAccount();
               } 
                  
               // write the account object to the master file
               outNewMaster.writeObject(account);
               
               // get a new account
               account = getAccountRecord();

               if (account == null)
                  return;
            
               accountNumber = account.getAccount();
            } 
         
            while (transactionAccountNumber < accountNumber)
            {
               // there is no account for this transaction
               logFile.format("%s %d\n", 
                  "Unmatched transaction record for account number", 
                  transactionAccountNumber);
                  
               // get a new transaction
               transaction = getTransactionRecord();

               if (transaction == null)
                  return;
                  
               transactionAccountNumber = transaction.getAccount();
            } 
         } 
      } 
      catch (IOException io)
      {
         System.err.println("Error reading or writing the files.");
         System.exit(1);
      } 
      catch (ClassNotFoundException noClass)
      {
         System.err.println("Error reading the files.");
         System.exit(1);
      } 
   } 

   public void closeFiles()
   {
      try // close the files
      {
         if (inTransaction != null)
            inTransaction.close();

         if (outNewMaster != null)
            outNewMaster.close();

         if (inOldMaster != null)
            inOldMaster.close();

         if (logFile != null)
            logFile.close();
      } 
      catch (IOException io)
      {
         System.err.println("Error closing the files.");
         System.exit(1);
      } 
   } 

   // get a transaction record
   private TransactionRecord getTransactionRecord() 
      throws IOException, ClassNotFoundException
   {
      TransactionRecord transaction;

      try // try to read the record
      {
         transaction = (TransactionRecord) inTransaction.readObject();
      } 
      catch (EOFException eof) // if we hit end of transaction file
      {
         try
         {
            // read the remaining records from the old master
            while (true)
               outNewMaster.writeObject(inOldMaster.readObject());
         } 
         catch (EOFException eof2) // we have hit end of old master file
         {
            return null;
         } 
      } 

      // return a transaction if we successfully read it
      return transaction; 
   } 

   // get an account record
   private AccountRecordSerializable getAccountRecord() 
      throws IOException, ClassNotFoundException
   {      
      AccountRecordSerializable account;

      // try to read an account record
      try
      {
         account = (AccountRecordSerializable) inOldMaster.readObject();
      } 
      catch (EOFException eof) // we hit end of old master file
      {
         try
         {
            // all of these records are transactions without accounts
            while (true)
            {
               logFile.format("%s %d\n",
                  "Unmatched transaction record for account number", 
                  transaction.getAccount());
               transaction = 
                  (TransactionRecord) inTransaction.readObject();
            } 
         } 
         catch (EOFException eof2) // we hit end of transaction file
         {
            return null;
         } 
      } 

      return account;   
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

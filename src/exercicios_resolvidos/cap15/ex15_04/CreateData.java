package exercicios_resolvidos.cap15.ex15_04;

// Exercise 15.4 Solution: CreateData.java
// Create data to put into an account file and a transactions file.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;

public class CreateData
{
   public static void main(String[] args)
   {
      Formatter outOldMaster = null;
      Formatter outTransaction = null;
      AccountRecord[] accounts = new AccountRecord[4];
      TransactionRecord[] transactions = new TransactionRecord[4];

      // create account records
      accounts[0] = new AccountRecord(100, "Alan", "Jones", 348.17);
      accounts[1] = new AccountRecord(300, "Mary", "Smith", 27.19);
      accounts[2] = new AccountRecord(500, "Sam", "Sharp", 0.00);
      accounts[3] = new AccountRecord(700, "Suzy", "Green", -14.22);

      // create transactions
      transactions[0] = new TransactionRecord(100, 27.14);
      transactions[1] = new TransactionRecord(300, 62.11);
      transactions[2] = new TransactionRecord(400, 100.56);
      transactions[3] = new TransactionRecord(900, 82.17);

      try
      {
         // file stream for output file
         outOldMaster = new Formatter("oldmast.txt");

         for (int i = 0; i < accounts.length; i++)
         {
            outOldMaster.format("%d %s %s %.2f\n",
               accounts[i].getAccount(), accounts[i].getFirstName(),
               accounts[i].getLastName(), accounts[i].getBalance());
         } 

         // file stream for output file
         outTransaction = new Formatter("D:\\Documentos\\Cursos\\JAVA como programar (Deitel)\\java_como_programar_10ed\\src\\exercicios_resolvidos\\cap15\\ex15_04\\trans.txt");

         for (int i = 0; i < transactions.length; i++)
         {
            outTransaction.format("%d %.2f\n",
               transactions[i].getAccount(),
               transactions[i].getAmount());
         } 
      } 
      catch (SecurityException securityException)
      {
         System.err.println(
            "You do not have write access to this file.");
         System.exit(1);
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error creating file.");
         System.exit(1);
      } 
      catch (IllegalFormatException formatException)
      {
         System.err.println("Error with output.");
         System.exit(1);
      } 
      catch (FormatterClosedException closedException)
      {
         System.err.println(
            "Error writing to file - file has been closed.");
         System.exit(1);
      } 
      finally
      {
         if (outOldMaster != null)
            outOldMaster.close();

         if (outTransaction != null)
            outTransaction.close();
      } 
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

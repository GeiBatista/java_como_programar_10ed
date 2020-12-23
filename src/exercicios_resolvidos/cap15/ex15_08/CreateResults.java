package exercicios_resolvidos.cap15.ex15_08;

// Exercise 15.8 Solution: CreateResults.java
// Create poll results and output them to a file.
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateResults
{
   private static int getValue()
   {
      int result = -1;
      Scanner scanner = new Scanner(System.in);

      // prompt the user for input
      System.out.print(
         "Enter integer result (1 - 5), -1 to quit: ");

      try
      {
         result = scanner.nextInt();

         // ensure input is in the correct range
         while (result != -1 && (result < 1 || result > 5))
         {
            System.out.print("Invalid result, try again: ");
            result = scanner.nextInt();
         } 
      } 
      catch (NoSuchElementException noSuchElementException)
      {
         System.err.println("Error with input.");
         System.exit(1);
      } 

      return result;
   }

   public static void main(String[] args)
   {
      Formatter pollNumbers = null;

      try
      {
         // create the output stream
         pollNumbers = new Formatter("D:\\Documentos\\Cursos\\JAVA como programar (Deitel)\\java_como_programar_10ed\\src\\exercicios_resolvidos\\cap15\\ex15_04\\numbers.txt");

         int pollValue = getValue(); // get a number from the user

         // test for the sentinel value
         while (pollValue != -1)
         {
            pollNumbers.format("%d\n", pollValue); // write the value
            pollValue = getValue(); // get another value
         } 

         pollNumbers.close(); // close the file
      } 
      catch(SecurityException securityException)
      {
         System.err.println("Error opening file.");
      } 
      catch(FileNotFoundException fileNotFoundException)
      {
         System.err.println("Output file cannot be found.");
      } 
      catch(IllegalFormatException illegalFormatException)
      {
         System.err.println("Error with the output's format.");
      } 
      catch(FormatterClosedException formatterClosedException)
      {
         System.err.println("File has been closed.");
      } 
      finally
      {
         if (pollNumbers != null)
            pollNumbers.close();
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

package exercicios_resolvidos.cap15.ex15_08;

// Exercise 15.8 Solution: StudentPoll.java
// Read poll results from a file and output ratings.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentPoll
{
   public static void main(String[] args)
   {
      int[] frequency = new int[6];

      Formatter writer = null;
      Scanner pollNumbers = null;
      
      try
      {
         pollNumbers = new Scanner(
            new File("D:\\Documentos\\Cursos\\JAVA como programar (Deitel)\\java_como_programar_10ed\\src\\exercicios_resolvidos\\cap15\\ex15_04\\numbers.txt"));

         writer = new Formatter("D:\\Documentos\\Cursos\\JAVA como programar (Deitel)\\java_como_programar_10ed\\src\\exercicios_resolvidos\\cap15\\ex15_04\\output.txt");

         writer.format("%-12s%-12s\n", "Rating", "Frequency");

         // for each answer, use that value as subscript to 
         // determine element to increment
         while (pollNumbers.hasNext())
            ++frequency[pollNumbers.nextInt()];
   
         // append frequencies to String output
         for (int rating = 1; rating < frequency.length; rating++)
            writer.format("%-12d%-12d\n", rating, frequency[rating]);  
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error: Files cannot be opened.");
      }  
      catch (FormatterClosedException formatterClosedException)
      {
         System.err.println("Error: Output file is closed.");
      }  
      catch (SecurityException securityException)
      {
         System.err.println("Error opening file for writing.");
      } 
      catch (IllegalFormatException illegalFormatException)
      {
         System.err.println("Error writing data to file.");
      } 
      catch (NoSuchElementException noSuchElementException)
      {
         System.err.println("Error reading from file.");
      } 
      catch (IllegalStateException illegalStateException)
      {
         System.err.println("Error: Input file is closed.");
      } 
      finally
      {
         if (writer != null)
            writer.close();

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
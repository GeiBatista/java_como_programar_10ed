package exercicios_resolvidos.cap15.ex15_07;

// Exercise 15.7 Solution: Phone.java
// Note: phone number must be input in the form #######.
// Only the digits 2 through 9 are recognized.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;

public class Phone
{
   private static final String[][] letters = { {" ", " ", " "},
      {" ", " ", " "}, {"A", "B", "C"}, {"D", "E", "F"},
      {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"},
      {"P", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y"} };

   private int[] phoneNumber;

   // output letter combinations to file
   public void calculate(int phoneNumber)
   {

      int[] digits = new int[7];

      for (int i = 6; i >= 0; i--)
      {
         digits[i] = (int)(phoneNumber % 10);
         phoneNumber /= 10;
      } 

      Formatter output = null;

      try
      {
         output = new Formatter("phone.txt");
      } 
      catch (SecurityException securityException)
      {
         System.err.println(
            "You do not have write access to 'phone.txt'");
         System.exit(1);
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error creating file 'phone.txt'");
         System.exit(1);
      } 

      System.out.println("Please wait...");

      try
      {
         int loop1; // loop counter for first digit of phone number
         int loop2; // loop counter for second digit of phone number
         int loop3; // loop counter for third digit of phone number
         int loop4; // loop counter for fourth digit of phone number
         int loop5; // loop counter for fifth digit of phone number
         int loop6; // loop counter for sixth digit of phone number
         int loop7; // loop counter for seventh digit of phone number

         // output all possible combinations
         for (loop1 = 0; loop1 <= 2; loop1++)
         {
            for (loop2 = 0; loop2 <= 2; loop2++)
            {
               for (loop3 = 0; loop3 <= 2; loop3++)
               {
                  for (loop4 = 0; loop4 <= 2; loop4++)
                  {
                     for (loop5 = 0; loop5 <= 2; loop5++)
                     {
                        for (loop6 = 0; loop6 <= 2; loop6++)
                        {
                           for (loop7 = 0; loop7 <= 2; loop7++)
                           {
                              output.format("%s%s%s%s%s%s%s\n",
                                 letters[digits[0]][loop1],
                                 letters[digits[1]][loop2],
                                 letters[digits[2]][loop3],
                                 letters[digits[3]][loop4],
                                 letters[digits[4]][loop5],
                                 letters[digits[5]][loop6],
                                 letters[digits[6]][loop7]);
                           } 
                        } 
                     } 
                  } 
               } 
            } 
         } 
      } 
      catch (IllegalFormatException illegalFormatException)
      {
         System.err.println("Error in format of output.");
         System.exit(1);
      } 
      catch (FormatterClosedException formatterClosedException)
      {
         System.err.println(
            "Error sending output; File has been closed.");
         System.exit(1);
      } 
      finally
      {
         System.out.println("Done.");

         if (output != null)
            output.close(); // close output stream
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

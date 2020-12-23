package exercicios_resolvidos.cap14.ex14_10;

// Exercise 14.10 Solution: Convert2.java
// Application outputs text in uppercase and lowercase.
import java.util.Scanner;

public class Convert2 
{
   public static void main(String args[])
   {
      // get sentence
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a sentence:");
      String sentence = scanner.nextLine();

      // display converted text
      System.out.printf("\nConvert Result:\n%s\n%s\n", 
         sentence.toUpperCase(), sentence.toLowerCase());
   }
} // end class Convert2

/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
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

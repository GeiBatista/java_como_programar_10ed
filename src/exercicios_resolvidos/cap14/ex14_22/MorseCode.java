package exercicios_resolvidos.cap14.ex14_22;

// Exercise 14.22 Solution: MorseCode.java
// Application that outputs the Morse code for a string
import java.util.Scanner;

public class MorseCode
{
   public static void main(String args[]) 
   {
      // get input phrase
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a phrase:");
      String phrase = scanner.nextLine();

      // display result
      System.out.println("\nMorseCode:");
      String morseCode = TextToMorseCode.getMorseCode(phrase);
      System.out.println(morseCode);
   } 
} // end class MorseCode

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

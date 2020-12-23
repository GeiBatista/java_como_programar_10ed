package exercicios_resolvidos.cap14.ex14_22;

// Exercise 14.22 Solution: MorseToNormalText.java
// Application that outputs the normal text for a Morse code.
import java.util.Scanner;

public class MorseToNormalText
{
    public static void main(String[] args) 
   {
      // get Morse code
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a Morse code:");
      String morseCode = scanner.nextLine();

      // display result
      System.out.println("\nNormal Text:");
      String text = MorseCodeToText.getText(morseCode);
      System.out.println(text);
   }
} // end class MorseToNormalText


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

package exercicios_resolvidos.cap14.ex14_22;

// Exercise 14.22 Solution: MorseCodeToText.java
// Application that outputs the normal text for a Morse code.
import java.util.StringTokenizer;

public class MorseCodeToText
{
   // Morse code numbers and letters
   static String[] morseCharacters = {"-----", ".----", "..---", 
      "...--", "....-", ".....", "-....", "--...", "---..", "----.", 
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
      ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
      "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

   // normal English characters
   static String[] normalCharacters = {"0", "1", "2", "3", "4", "5", 
      "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
      "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
      "W", "X", "Y", "Z"};

   // translate Morse code phrase to normal text
   public static String getText(String morseCode)
   {
      String result = "";
      int start = 0, length = 0;
      int threeSpaces = morseCode.indexOf("   ");
      String word;
      
      // while we have not reached the end of Morse code
      while (length < morseCode.length())
      {
         if (threeSpaces != -1) 
         {
            word = morseCode.substring(start, threeSpaces);
            length = threeSpaces;
         } 
         else 
         {
            word = morseCode.substring(start, morseCode.length());
            length = morseCode.length();
         } 

         StringTokenizer letters = new StringTokenizer(word);
         
         // decode letter
         while (letters.hasMoreTokens())
            result += decode(letters.nextToken());

         result += " ";
         start = threeSpaces + 3;
         threeSpaces = morseCode.indexOf("   ", start);
      }

      return result;
   }

   // decode Morse code letter
   private static String decode(String morseCode)
   {
      for (int i = 0; i < morseCharacters.length; i++)
      {
         if (morseCode.equals(morseCharacters[i]))
            return normalCharacters[i];
      }

      return "";
   } 
} // end class MorseCodeToText


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

package exercicios_resolvidos.cap14.ex14_22;

// Exercise 14.22 Solution: TextToMorseCode.java
// Application that outputs the Morse code for a string
public class TextToMorseCode 
{
   // the numbers from 0 to 9
   private static final String[] numbers = {"-----", ".----", "..---", 
      "...--", "....-", ".....", "-....", "--...", "---..", "----."};
      
   // the letters from a to z
   private static final String[] letters = {".-", "-...", "-.-.", "-..", 
      ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", 
      "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
      ".--", "-..-", "-.--", "--.."};

   // convert normal text to Morse code
   public static String getMorseCode(String phrase) 
   {
      String morseCode = "";

      // convert each character
      for (int i = 0; i < phrase.length(); i++) 
      {
         char alpha = phrase.charAt(i);
                  
         // if the character is a number, access the number array
         if (Character.isDigit(alpha))
            morseCode += numbers[alpha - '0'] + " ";
                  
         // if the character is a letter, access the letter array
         if (Character.isLetter(alpha))
            morseCode += 
               letters[Character.toUpperCase(alpha) - 'A'] + " ";
                  
         // if the character is a space, output two extra spaces
         if (alpha == ' ')
            morseCode += "   ";
      } 

      return morseCode;
   } 
} // end class TextToMorseCode

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

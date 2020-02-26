package exercicios_resolvidos.cap06.ex06_34;

// Exercise 6.34 Solution: NumberSystem.java
// Converting a decimal number to binary, octal and hexadecimal.
public class NumberSystem
{
   // displays conversions in binary, octal, and hexadecimal
   public static void main(String args[])
   {
      System.out.printf("%-8s%-12s%-8s%-8s%n",
         "Decimal", "Binary", "Octal", "Hexadecimal");

      // print out binary, octal and hexadecimal representation
      // for each number
      for (int i = 1; i <= 256; i++)
      {
         String binary = convertToBinary(i); // binary representation
         String octal = convertToOctal(i); // octal representation
         String hexadecimal = convertToHex(i); // hexadecimal representaion

         System.out.printf("%-8d%-12s%-8s%-8s%n",
            i, binary, octal, hexadecimal);
      } 
   } 
   
   // returns a String represention of the decimal number in binary
   public static String convertToBinary(int decimal)
   {
      String binary = "";
      
      while (decimal >= 1)
      {
         int value = decimal % 2;
         binary = value + binary;
         decimal /= 2;
      } 
      
      return binary;
   } 
   
   // returns a String represention of the number in octal
   public static String convertToOctal(int decimal)
   {
      String octal = "";
      
      // get octal representation
      while (decimal >= 1)
      {
         int value = decimal % 8;
         octal = value + octal;
         decimal /= 8;
      } 

      return octal;
   } 
      
   // returns a String represention of the number in hexadecimal
   public static String convertToHex(int decimal)
   {
      String hexadecimal = "";
      
      // get hexadecimal representation
      while (decimal >= 1)
      {
         int value = decimal % 16;

         switch (value)
         {
            case 10:
               hexadecimal = "A" + hexadecimal;
               break;
            case 11:
               hexadecimal = "B" + hexadecimal;
               break;
            case 12:
               hexadecimal = "C" + hexadecimal;
               break;  
            case 13:
               hexadecimal = "D" + hexadecimal;
               break;
            case 14:
               hexadecimal = "E" + hexadecimal;
               break;
            case 15:
               hexadecimal = "F" + hexadecimal;
               break;
            default:
               hexadecimal = value + hexadecimal;
               break;
         } 

         decimal /= 16;
      }
      
      return hexadecimal;
   }  
} // end class NumberSystem



/**************************************************************************
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

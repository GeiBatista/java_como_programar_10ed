package exercicios_resolvidos.cap14.ex14_21;

// Exercise 14.21 Solution: DollarAmountInWord.java
// Application that outputs the word equivalent of a dollar amount
import java.util.StringTokenizer;

public class DollarAmountInWord  
{
   private static final String[] ones = {"", "ONE ", "TWO ", "THREE ",
      "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE "};
   private static final String[] teens = {"TEN ", "ELEVEN ", "TWELVE ", 
      "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ", "SEVENTEEN ", 
      "EIGHTEEN ", "NINETEEN "};
   private static final String[] tens = {"", "TEN ", "TWENTY ", 
      "THIRTY ", "FORTY ", "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ", 
      "NINETY "};
   private String amountInWord = "";
   private StringTokenizer money;
   
   public DollarAmountInWord(String amount)
   {    
      int dollar = getDollars(amount); // get the dollar value
      int change = getChange(amount); // get any change
               
      // if there is a hundreds component
      if (dollar >= 100)
         amountInWord += dollarString(dollar / 100) + "hundred ";
               
      // output the rest of the dollars
      amountInWord += dollarString(dollar % 100) + "and ";
               
      amountInWord += changeString(change); // output the change
   }

   private int getDollars(String amount)
   {
      money = new StringTokenizer(amount, ".");
      return Integer.parseInt(money.nextToken());
   }

   private int getChange(String amount)
   {
      if (money.hasMoreTokens())
         return Integer.parseInt(money.nextToken());
      else
         return 0;
   }

   private String dollarString(int dollar) 
   {
      // if there is less than ten dollars
      if (dollar < 10)
         return ones[dollar]; // access the ones array
      else if (dollar < 20) // if the amount is in the teens
         return teens[dollar - 10]; // access the teens array
      else // if the amount is more than 20
         // create the amount with the tens and the ones arrays
         return tens[dollar / 10] + ones[dollar % 10];
   } 

   private String changeString(int change) 
   {
      return change + "/100"; // output the change out of 100
   } 

   public String getWord() 
   {
      return amountInWord;
   } 
} // end class DollarAmountInWord

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

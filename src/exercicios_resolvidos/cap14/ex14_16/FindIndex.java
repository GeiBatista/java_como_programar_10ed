package exercicios_resolvidos.cap14.ex14_16;

// Exercise 14.16 Solution: FindIndex.java
// Application defines our own versions of String indexing methods

public class FindIndex
{
   public static int indexOf(String input, char search)
   {
      // loop through the characters
      for(int i = 0; i < input.length(); i++) 
      {
         if (input.charAt(i) == search)
            return i;
      } 
      
      return -1; // if we do not find it
   }

   public static int lastIndexOf(String input, char search)
   {
      // loop through the characters in reverse
      for(int i = input.length() - 1; i >= 0; i--)  
      {
         if (input.charAt(i) == search)
            return i;
      } 

      return -1; // if we do not find it
   } 
} // end class FindIndex

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

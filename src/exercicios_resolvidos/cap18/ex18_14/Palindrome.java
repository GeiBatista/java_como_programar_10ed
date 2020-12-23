package exercicios_resolvidos.cap18.ex18_14;

// Exercise 18.14 Solution: Palindrome.java
// Program tests for a palindrome.
import java.util.Scanner;

public class Palindrome 
{
   // recursively test if array is palindrome
   public static boolean testPalindrome(String text, int left, int right)
   {
      // remove punctuation on left of current substring
      while (!Character.isLetterOrDigit(text.charAt(left)))
         left++;

      // remove punctuation on right of current substring
      while (!Character.isLetterOrDigit(text.charAt(right)))
         right--;

      // if there are no characters left in array to analyze
      if (left >= right)
         return true;

      // if the current characters to compare are not equal
      else if (text.charAt(left) != text.charAt(right))
         return false;
      else
         return testPalindrome(text, left + 1, right - 1);
   } 

   // obtain user input and call method testPalindrome
   public static void main(String args[])
   {
      System.out.print("Enter a string: ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      // if result of testPalindrome is 1, string is a palindrome
      if (testPalindrome(input, 0, input.length() - 1))
         System.out.println("Palindrome");
      else
         System.out.println("Not a palindrome");
   }
} // end class Palindrome

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

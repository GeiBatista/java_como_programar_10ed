package exercicios_resolvidos.cap14.ex14_12;

// Exercise 14.12 Solution: Index2.java
// Application outputs the number of times each character of 
// the alphabet was found.
import java.util.Scanner;

public class Index2 
{
   public static void main(String args[])
   {
      // get text
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter text to be searched");
      String text = scanner.nextLine().toLowerCase();

      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      int last = -1;
      int count[] = new int[26];

      // count occurences of each letter
      for (int j = 0; j < alphabet.length(); j++)
      {
         int current = text.indexOf(alphabet.charAt(j), last);

         while (current != -1)
         {
            last = current;
            count[j]++;
            current = text.indexOf(alphabet.charAt(j), last + 1);
         } 

         last = -1;
      } 

      // display results
      System.out.println("\nletter\tcount");

      for (int y = 0; y < count.length; y++)
         System.out.printf("%s:\t%s\n", 
            alphabet.charAt(y), count[y]);
   }
} // end class Index2

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

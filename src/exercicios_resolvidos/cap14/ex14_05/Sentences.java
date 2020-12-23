package exercicios_resolvidos.cap14.ex14_05;

// Exercise 14.5 Solution: Sentences.java
// Application randomly generates sentences.
import java.util.Random;

public class Sentences
{
   public static void main(String args[])
   {
      Random generator = new Random();

      String article[] = {"the ", "a ", "one ", "some ", "any "};
      String noun[] = {"boy", "girl", "dog", "town", "car"};
      String verb[] =
         {" drove", " jumped", " ran", " walked", " skipped"};
      String preposition[] =
         {" to ", " from ", " over ", " under ", " on "};

      // randomly create sentence
      for (int j = 0; j < 20; j++)
      {
         int article1 = generator.nextInt(article.length);
         int noun1 = generator.nextInt(noun.length);
         int verb1 = generator.nextInt(verb.length);
         int preposition1 = generator.nextInt(preposition.length);
         int article2 = generator.nextInt(article.length);
         int noun2 = generator.nextInt(noun.length);

         StringBuilder buffer = new StringBuilder();

         // concatenate words and add period
         buffer.append(article[article1] + noun[noun1] +
            verb[verb1] + preposition[preposition1] +
            article[article2] + noun[noun2] + ".\n");

         // capitalize first letter and display
         buffer.setCharAt(
            0, Character.toUpperCase(buffer.charAt(0)));
         System.out.println(buffer.toString());
      } 
   } 
}  // end class Sentences


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

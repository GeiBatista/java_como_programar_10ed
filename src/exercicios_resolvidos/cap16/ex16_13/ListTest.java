package exercicios_resolvidos.cap16.ex16_13;

// Exercise 16.13 Solution: ListTest.java
// Program stores first names in Set.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListTest 
{
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String args[])
   {
      Set<String> names = new HashSet<String>();

      getNames(names); // get input from user
      searchNames(names); // search for names 
   }

   // get names
   public static void getNames(Set<String> names)
   {
      // get name from standard input
      System.out.println(
         "Add a name to set, use end to terminate input:");
      String inputName = scanner.next();

      // obtain input until end entered
      while (!inputName.equals("end"))
      {
         // insert name
         if (!names.contains(inputName)) 
         {
            names.add(inputName);
            System.out.println(inputName + " inserted");
         }
         else // name already exists in list
            System.out.println(inputName + " exists in set");

         // get next name
         System.out.println(
            "Add a name to set, use end to terminate input:");
         inputName = scanner.next();
      } 
   } 

   // search names from list
   private static void searchNames(Set<String> names)
   {
      // get name from standard input
      System.out.println(
         "Search a name, use end to terminate searching:");
      String inputName = scanner.next();

      // obtain input until end entered
      while (!inputName.equals("end"))
      {
         // name found
         if (names.contains(inputName))
            System.out.println(inputName + " found in set");
         else  // name not found
            System.out.println(inputName + " not found in set");

         // get next search name
         System.out.println(
            "Search a name, use end to terminate searching:");
         inputName = scanner.next();
      }
   } 
} // end class ListTest


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

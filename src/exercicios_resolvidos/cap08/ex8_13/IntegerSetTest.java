package exercicios_resolvidos.cap08.ex8_13;

// Exercise 8.13 Solution: IntegerSetTest.java
// Program that tests IntegerSet
import java.util.Scanner;

public class IntegerSetTest
{
   public static void main(String[] args) 
   {
      // initialize two sets
      System.out.println("Input Set A");
      IntegerSet set1 = inputSet();
      System.out.println("Input Set B");
      IntegerSet set2 = inputSet();
      
      IntegerSet union = set1.union(set2);
      IntegerSet intersection = set1.intersection(set2);
      
      // prepare output
      System.out.println("Set A contains elements:");
      System.out.println(set1.toString());
      System.out.println("Set B contains elements:");
      System.out.println(set2.toString());
      System.out.println(
         "Union of Set A and Set B contains elements:");
      System.out.println(union.toString());
      System.out.println(
         "Intersection of Set A and Set B contains elements:");
      System.out.println(intersection.toString());

      // test whether two sets are equal
      if (set1.isEqualTo(set2))
         System.out.println("Set A is equal to set B");
      else
         System.out.println("Set A is not equal to set B");

      // test insert and delete
      System.out.println("Inserting 77 into set A...");
      set1.insertElement(77);
      System.out.println("Set A now contains elements:");
      System.out.println(set1.toString());

      System.out.println("Deleting 77 from set A...");
      set1.deleteElement(77);
      System.out.println("Set A now contains elements:");
      System.out.println(set1.toString());

      // test constructor
      int[] intArray = {25, 67, 2, 9, 99, 105, 45, -5, 100, 1};
      IntegerSet set5 = new IntegerSet(intArray);

      System.out.println("New Set contains elements:");
      System.out.println(set5.toString());
   } // end main

   // creates a new set by reading numbers from the user
   private static IntegerSet inputSet()
   {
      Scanner input = new Scanner(System.in);
      IntegerSet temp = new IntegerSet();
      
      System.out.print("Enter number (-1 to end): ");
      int number = input.nextInt();
     
      while (number != -1)
      {
         temp.insertElement(number);

         System.out.print("Enter number (-1 to end): ");
         number = input.nextInt();
      } // end while
      
      return temp;
   } // end method inputSet
} // end class IntegerSetTest




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

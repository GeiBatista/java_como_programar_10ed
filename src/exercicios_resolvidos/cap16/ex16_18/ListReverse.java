package exercicios_resolvidos.cap16.ex16_18;

// Exercise 16.18 Solution: ListReverse.java
// Program creates a list, then creates a reverse of the list
import java.util.LinkedList;
import java.util.List;

public class ListReverse 
{
   public static void main(String args[])
   {
      // create two linked lists
      LinkedList<Character> list1 = new LinkedList<Character>();
      LinkedList<Character> list2 = new LinkedList<Character>();

      // use List insert methods
      list1.addFirst('5');
      list1.addFirst('@');
      list1.addLast('V');
      list1.addLast('+');
      list1.addFirst('P');
      list1.addFirst('c');
      list1.addLast('M');
      list1.addLast('&');
      list1.addFirst('y');
      list1.addLast('X');
      
      System.out.println("List: ");
      System.out.println(list1);

      list2 = reverse(list1); // reverse lists using method reverse
      System.out.println("Reversed list is:");
      System.out.println(list2);
   } 

   // reverses a list and returns it to the caller
   public static LinkedList<Character> reverse(List<Character> one)
   {
      LinkedList<Character> reversed = new LinkedList<Character>();
      
      for (char element : one)
         reversed.addFirst(element);
      
      return reversed;
   } 
} // end class ListReverse

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

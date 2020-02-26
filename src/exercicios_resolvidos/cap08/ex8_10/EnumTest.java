package exercicios_resolvidos.cap08.ex8_10;

// Exercise 8.10 Solution: EnumTest.java
// Testing enum type TrafficLight.

public class EnumTest 
{
   public static void main(String[] args) 
   {
      System.out.printf("Light\tDuration%n%n");

      // print all traffic lights and their duration                                       
      for (TrafficLight light : TrafficLight.values())          
         System.out.printf("%s\t%d%n", light, light.getDuration());
   } 
} // end class EnumTest

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

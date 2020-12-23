package exercicios_resolvidos.cap12.ex12_15;

// Exercise 12.15 Solution: Events.java
// Program displays events that occur during execution.
import javax.swing.JFrame;

public class Events
{
   public static void main(String[] args)
   {
      EventsFrame eventsFrame = new EventsFrame(); // create EventsFrame
      eventsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      eventsFrame.setSize(375, 325); // set frame size
      eventsFrame.setVisible(true); // display frame
   } 
} // end class Events


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
 **************************************************************************/

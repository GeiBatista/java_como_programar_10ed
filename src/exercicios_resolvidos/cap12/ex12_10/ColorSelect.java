package exercicios_resolvidos.cap12.ex12_10;

// Exercise 12.10 Solution: ColorSelect.java
// This program creates a simple GUI
import javax.swing.JFrame;

public class ColorSelect
{
   // execute application
   public static void main (String[] args)
   {
      ColorSelectFrame colorSelectFrame = new ColorSelectFrame(); 
      colorSelectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      colorSelectFrame.setSize(300, 125); // set frame size
      colorSelectFrame.setVisible(true); // display frame
   } 
} // end class ColorSelect


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

package exercicios_resolvidos.cap04.ex04_gcs2.part_a;

// GCS Exercise 4.2 Part A: Lines2.java
// Draws lines using a loop
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lines2 extends JPanel
{
   // draws lines from one edge to another
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      int increments = 15; // number of increments each side is divided
      
      int width = getWidth(); // total width
      int height = getHeight(); // total height
      
      int widthStep = width / increments; // width increment
      int heightStep = height / increments; // height increment
      
      int count = 0; // loop counter
      
      // draws lines in a pattern between adjacent edges
      while (count < increments)
      {
         // left to bottom
         g.drawLine(0, count * heightStep,
            (count + 1) * widthStep, height);
         
         ++count;
      } 
   } // end method paintComponent
} // end class Lines2

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

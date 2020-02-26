package exercicios_resolvidos.cap04.ex04_gcs1.part_b;

// GCS Exercise 4.1 Part B: Lines1.java
// Draws lines using a loop
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lines1 extends JPanel
{
   // draws lines that fan out from the corners and intersect
   // along the center
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      int increments = 15; // number of increments each side is divided
      
      int width = getWidth(); // total width
      int height = getHeight(); // total height
      
      int widthStep = width / increments; // width increment
      int heightStep = height / increments; // height increment
      
      int count = 0; // loop counter

      while (count < increments)
      {
         // lines fanning from the top-left
         g.drawLine(0, 0, count * widthStep, height - count * heightStep);
         
         // lines fanning from the bottom-right
         g.drawLine(width, height, count * widthStep, height - count * heightStep);
         
         // lines fanning from the bottom-left
         g.drawLine(0, height, count * widthStep, count * heightStep);
         
         // lines fanning from the top-right
         g.drawLine(width, 0, count * widthStep, count * heightStep);
         
         ++count;
      } 
   } // end method paintComponent
} // end class Lines1


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

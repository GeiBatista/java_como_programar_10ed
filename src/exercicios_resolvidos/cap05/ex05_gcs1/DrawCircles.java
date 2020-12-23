package exercicios_resolvidos.cap05.ex05_gcs1;

// GCS Exercise 5.1: DrawCircles.java
// Draws Circles
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawCircles extends JPanel
{
   // draws concentric circles at the center of the panel
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int circles = 12; // number of circles
      int radius = 10; // radius of a circle
      
      // find the middle of the panel
      int centerX = getWidth() / 2;
      int centerY = getHeight() / 2;

      int counter = 1; // initialize the counter
      
      // draws circles starting with the innermost
      do
      {
         // draw the circle
         g.drawOval(centerX - counter * radius,
            centerY - counter * radius, 
            counter * radius * 2, counter * radius * 2);
         ++counter;
      } while (counter <= circles);
   }
} // end class DrawCircles



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

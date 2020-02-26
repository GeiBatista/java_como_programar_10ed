package exercicios_resolvidos.cap06.ex6_gcs1;

// GCS Exercise 6.1: AlternateColors.java
// Demonstrates colors and filled shapes.
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class AlternateColors extends JPanel
{
   private Random randomNumbers = new Random();
   private Color color1; // first color
   private Color color2; // second color
   
   // no-argument constructor
   public AlternateColors()
   {
      // randomly generate two colors
      color1 = new Color(randomNumbers.nextInt(256),
         randomNumbers.nextInt(256), randomNumbers.nextInt(256));
      color2 = new Color(randomNumbers.nextInt(256),
         randomNumbers.nextInt(256), randomNumbers.nextInt(256));
   } // end AlternateColors constructor
   
   // draws a "bull's-eye" with two alternating colors
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int circles = 5; // number of circles
      int radius = 25; // radius of a circle
      
      // find the middle of the panel
      int centerX = getWidth() / 2;
      int centerY = getHeight() / 2;
     
      // draws circles starting with the outermost
      for (int counter = circles; counter > 0; counter--)
      {
         // set the colors based on the current color choice
         if (counter % 2 == 0)
            g.setColor(color1);
         else
            g.setColor(color2);

         // draw the oval
         g.fillOval(centerX - counter * radius,
            centerY - counter * radius, 
            counter * radius * 2, counter * radius * 2);
      } // end for
   } // end method paintComponent
} // end class AlternateColors


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

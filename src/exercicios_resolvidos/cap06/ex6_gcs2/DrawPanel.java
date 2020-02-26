package exercicios_resolvidos.cap06.ex6_gcs2;

// GCS Exercise 6.2: DrawPanel.java
// Demonstrates drawing random shapes and random colors.
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private Random randomNumbers = new Random();
   
   // draws random shapes in random colors
   public void paintComponent(Graphics g)
   {
      int maxWidth = getWidth(); // get the width of the panel
      int maxHeight = getHeight(); // get the height of the panel
      
      // draw ten random shapes
      for (int i = 0; i < 10; i++)
      {
         // generate a random color
         Color color = new Color(randomNumbers.nextInt(256),
            randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256));
         g.setColor(color); // set the color to the random color
         
         // pick a shape at random
         switch (randomNumbers.nextInt(2))
         {
            case 0: // draw a random rectangle
               g.fillRect(randomNumbers.nextInt(maxWidth) + 1,
                  randomNumbers.nextInt(maxHeight) + 1,
                  randomNumbers.nextInt(maxWidth / 2) + 1,
                  randomNumbers.nextInt(maxHeight / 2) + 1);
               break;
            case 1: // draw a random oval
               g.fillOval(randomNumbers.nextInt(maxWidth) + 1,
                  randomNumbers.nextInt(maxHeight) + 1,
                  randomNumbers.nextInt(maxWidth / 2) + 1,
                  randomNumbers.nextInt(maxHeight / 2) + 1);
               break;
         } // end switch
      } // end for
   } // end method paintComponent
} // end class DrawPanel


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
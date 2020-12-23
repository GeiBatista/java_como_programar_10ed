package exercicios_resolvidos.cap18.ex18_19;

// Exercise 18.19 Solution: Fractal2.java
// Modified user interface for drawing star fractal.
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;

public class Fractal2 extends JFrame 
{
   private final int WIDTH = 400;
   private final int HEIGHT = 480;
   private final int MIN_LEVEL = 0, MAX_LEVEL = 15;
   private Color color = Color.GREEN;

   private JButton increaseLevelJButton, decreaseLevelJButton;
   private JLabel levelJLabel;
   private FractalJPanel2 drawSpace;
   private JPanel mainJPanel, controlJPanel;
 
   // set up GUI
   public Fractal2()
   {
      super("Fractal");

      // set up control panel
      controlJPanel = new JPanel();
      controlJPanel.setLayout(new FlowLayout());

      // set up decrease level button to add to control panel and 
      // register listener
      decreaseLevelJButton = new JButton("Decrease Level");
      controlJPanel.add(decreaseLevelJButton);
      decreaseLevelJButton.addActionListener(
         new ActionListener() // anonymous inner class
         {
            // process decreaseLevelJButton event
            public void actionPerformed(ActionEvent event)
            {
               int level = drawSpace.getLevel();
               level--;

               if ((level >= MIN_LEVEL) &&
                  (level <= MAX_LEVEL))
               {
                  levelJLabel.setText("Level: " + level);
                  drawSpace.setLevel(level);
                  repaint(); 
               } 
            } 
         } 
      ); // end addActionListener

      // set up increase level button to add to control panel
      // and register listener
      increaseLevelJButton = new JButton("Increase Level");
      controlJPanel.add(increaseLevelJButton);
      increaseLevelJButton.addActionListener(
         new ActionListener() // anonymous inner class
         {
            // process increaseLevelJButton event
            public void actionPerformed(ActionEvent event)
            {
               int level = drawSpace.getLevel();
               level++;

               if ((level >= MIN_LEVEL) &&
                  (level <= MAX_LEVEL))
               {
                  levelJLabel.setText("Level: " + level);
                  drawSpace.setLevel(level);
                  repaint();
               } 
            }
         } 
     ); // end addActionListener

      // set up levelJLabel to add to controlJPanel
      levelJLabel = new JLabel("Level: 0");
      controlJPanel.add(levelJLabel);

      drawSpace = new FractalJPanel2(0);
 
      mainJPanel = new JPanel();
      mainJPanel.add(controlJPanel);
      mainJPanel.add(drawSpace);

      add(mainJPanel);

      setSize(WIDTH, HEIGHT);
      setVisible(true);
   }

   public static void main(String args[])
   {
      Fractal2 demo = new Fractal2();
      demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
} // end class Fractal2

/*************************************************************************
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

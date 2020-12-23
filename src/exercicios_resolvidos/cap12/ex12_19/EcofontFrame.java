package exercicios_resolvidos.cap12.ex12_19;

// Exercise 12.19 Solution: EcofontFrame.java
// Displays text using Ecofont.
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EcofontFrame extends JFrame implements ActionListener
{
   private JButton increaseButton; // button to increase font size
   private JButton decreaseButton; // button to decrease font size
   private JTextArea text; // displays example text
   private int fontSize = 9; // current font size

   public EcofontFrame()
   {
      super("Ecofont Demonstration");
      setLayout(new BorderLayout()); // set layout

      // create buttons and add this as an action listener
      increaseButton = new JButton("Increase font size");
      increaseButton.addActionListener(this);
      decreaseButton = new JButton("Decrease font size");
      decreaseButton.addActionListener(this);

      // create text area and set initial font
      text = new JTextArea("Example text");
      text.setFont(new Font("Spranq eco sans", Font.PLAIN, fontSize));

      // add GUI components to frame
      JPanel panel = new JPanel(); // used to get proper layout
      panel.add(decreaseButton);
      panel.add(increaseButton);
      add(panel, BorderLayout.NORTH); // add buttons at top
      add(new JScrollPane(text)); // allow scrolling
   } 

   // change font size when user clicks on a button
   public void actionPerformed(ActionEvent event)
   {
      // change current font size depending on which button was clicked
      if (event.getSource() == increaseButton)
         ++fontSize;
      else
         --fontSize;

      // update text area with new font size
      text.setFont(new Font("Spranq eco sans", Font.PLAIN, fontSize));
   } 
} // end class EcofontFrame


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

package exercicios_resolvidos.cap12.ex12_08;

// Exercise 12.8 Solution: AlignFrame.java
// Program creates a simple GUI.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlignFrame extends JFrame 
{
   private JButton okJButton;
   private JButton cancelJButton;
   private JButton helpJButton;
   private JTextField xJTextField;
   private JTextField yJTextField;
   private JCheckBox snapJCheckBox;
   private JCheckBox showJCheckBox;
   private JLabel xJLabel;
   private JLabel yJLabel;
   private JPanel checkJPanel;
   private JPanel buttonJPanel;
   private JPanel fieldJPanel1;
   private JPanel fieldJPanel2;
   private JPanel fieldJPanel;

   // constructor sets up GUI
   public AlignFrame()
   {
      super("Align");

      // build checkJPanel
      snapJCheckBox = new JCheckBox("Snap to Grid");
      showJCheckBox = new JCheckBox("Show Grid");
      checkJPanel = new JPanel();
      checkJPanel.setLayout(new GridLayout(2, 1)); // use gridlayout
      checkJPanel.add(snapJCheckBox); // add snap checkbox
      checkJPanel.add(showJCheckBox); // add show checkbox

      // build field panel1
      xJLabel = new JLabel("X: ");
      xJTextField = new JTextField("8", 3); // set width of textfield
      fieldJPanel1 = new JPanel();
      fieldJPanel1.setLayout(new FlowLayout()); // use flowlayout
      fieldJPanel1.add(xJLabel);
      fieldJPanel1.add(xJTextField);

      // build field panel2
      yJLabel = new JLabel("Y: ");
      yJTextField = new JTextField("8", 3); // set width of textfield
      fieldJPanel2 = new JPanel();
      fieldJPanel2.setLayout(new FlowLayout()); // use flowlayout
      fieldJPanel2.add(yJLabel);
      fieldJPanel2.add(yJTextField);

      // build field panel
      fieldJPanel = new JPanel();
      fieldJPanel.setLayout(new BorderLayout()); // use border layout
      fieldJPanel.add(fieldJPanel1, BorderLayout.NORTH);
      fieldJPanel.add(fieldJPanel2, BorderLayout.SOUTH);

      // build button panel
      okJButton = new JButton("Ok");
      cancelJButton = new JButton("Cancel");
      helpJButton = new JButton("Help");
      buttonJPanel = new JPanel();
      buttonJPanel.setLayout(new GridLayout(3, 1, 10, 5));
      buttonJPanel.add(okJButton);
      buttonJPanel.add(cancelJButton);
      buttonJPanel.add(helpJButton);

      // use flowlayout center-aligned and add components
      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
      add(checkJPanel);
      add(fieldJPanel);
      add(buttonJPanel);
   } // end AlignFrame constructor
} // end class AlignFrame

/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
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

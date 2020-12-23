package exercicios_resolvidos.cap12.ex12_10;

// Exercise 12.10 Solution: ColorSelectFrame.java
// This program creates a simple GUI
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ColorSelectFrame extends JFrame 
{
   private JButton okJButton;
   private JButton cancelJButton;
   private JCheckBox backgroundJCheckBox;
   private JCheckBox foregroundJCheckBox;
   private JComboBox<String> colorJComboBox;
   private JPanel panel;
   private JPanel panel2;

   // constructor creates components and adds them to applet
   public ColorSelectFrame()
   {
      super("ColorSelect");

      setLayout(new BorderLayout());

      colorJComboBox = new JComboBox<String>();
      colorJComboBox.addItem("RED");
      add(colorJComboBox, BorderLayout.NORTH); 

      panel = new JPanel(); // create a panel
      backgroundJCheckBox = new JCheckBox("Background"); 
      foregroundJCheckBox = new JCheckBox("Foreground"); 
      panel.add(backgroundJCheckBox);
      panel.add(foregroundJCheckBox); 
      add(panel, BorderLayout.CENTER);

      okJButton = new JButton("Ok"); 
      cancelJButton = new JButton("Cancel"); 
      panel2 = new JPanel(); 
      panel2.add(okJButton);
      panel2.add(cancelJButton); 
      add(panel2, BorderLayout.SOUTH); 
   } 
} // end class ColorSelectFrame


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

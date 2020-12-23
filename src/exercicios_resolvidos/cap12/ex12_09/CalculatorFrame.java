package exercicios_resolvidos.cap12.ex12_09;

// Exercise 12.9 Solution: CalculatorFrame.java
// Program creates a GUI that resembles a calculator.
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame 
{
   private JButton[] keys;
   private JPanel keyPadJPanel;
   private JTextField lcdJTextField;

   // constructor sets up GUI
   public CalculatorFrame()
   {
      super("Calculator");

      lcdJTextField = new JTextField(20); // create lcdJTextField
      lcdJTextField.setEditable(true); // allow user input 

      keys = new JButton[16]; // array keys contains 16 JButtons 

      // initialize all digit key buttons
      for (int i = 0; i <= 9; i++)
         keys[i] = new JButton(String.valueOf(i));

      // initialize all function key buttons
      keys[10] = new JButton("/");
      keys[11] = new JButton("*");
      keys[12] = new JButton("-");
      keys[13] = new JButton("+");
      keys[14] = new JButton("=");
      keys[15] = new JButton(".");

      // set keyPadJPanel layout to grid layout
      keyPadJPanel = new JPanel();
      keyPadJPanel.setLayout(new GridLayout(4, 4));

      // add buttons to keyPadJPanel panel
      // 7, 8, 9, divide
      for (int i = 7; i <= 10; i++)
         keyPadJPanel.add(keys[i]);

      // 4, 5, 6
      for (int i = 4; i <= 6; i++)
         keyPadJPanel.add(keys[i]);

      // multiply
      keyPadJPanel.add(keys[11]);

      // 1, 2, 3
      for (int i = 1; i <= 3; i++)
         keyPadJPanel.add(keys[i]);

      // subtract
      keyPadJPanel.add(keys[12]);

      // 0
      keyPadJPanel.add(keys[0]);

      // ., =, add
      for (int i = 15; i >= 13; i--)
         keyPadJPanel.add(keys[i]);

      // add components to (default) border layout
      add(lcdJTextField, BorderLayout.NORTH);
      add(keyPadJPanel, BorderLayout.CENTER);
   } 
} // end class CalculatorFrame

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

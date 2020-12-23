package exercicios_resolvidos.cap12.ex12_11;

// Exercise 12.11 Solution: PrinterFrame.java
// This program creates a simple Printer GUI
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PrinterFrame extends JFrame 
{
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JCheckBox check1;
   private JCheckBox check2;
   private JCheckBox check3;
   private JCheckBox check4;
   private JRadioButton radio1;
   private JRadioButton radio2;
   private JRadioButton radio3;
   private ButtonGroup radioGroup;
   private JComboBox<String> comboBox;
   private JLabel label1;
   private JLabel label2;
   private JPanel panel1;
   private JPanel panel2;
   private JPanel panel3;
   private JPanel panel4;
   private JPanel panel5;
   private JPanel panel6;
   private JPanel panel7;
   private JPanel panel8;

   // constructor sets up GUI
   public PrinterFrame()
   {
      super("Printer");

      // build left north panel
      label1 = new JLabel("Printer: MyPrinter");
      panel1 = new JPanel();
      panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
      panel1.add(label1);

      // build right east panel
      button1 = new JButton("OK");
      button2 = new JButton("Cancel");
      button3 = new JButton("Setup...");
      button4 = new JButton("Help");
      panel2 = new JPanel();
      panel2.setLayout(new GridLayout(4, 1, 5, 5));
      panel2.add(button1);
      panel2.add(button2);
      panel2.add(button3);
      panel2.add(button4);

      // build left south panel
      label2 = new JLabel("Print Quality: ");
      comboBox = new JComboBox<String>();
      comboBox.addItem("High");
      check1 = new JCheckBox("Print to File");
      panel3 = new JPanel();
      panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
      panel3.add(label2);
      panel3.add(comboBox);
      panel3.add(check1);

      // build left east panel
      check2 = new JCheckBox("Image");
      check3 = new JCheckBox("Text");
      check4 = new JCheckBox("Code");
      panel4 = new JPanel();
      panel4.setLayout(new BorderLayout());
      panel4.add(check2, BorderLayout.NORTH);
      panel4.add(check3, BorderLayout.CENTER);
      panel4.add(check4, BorderLayout.SOUTH);

      // build left west panel
      radio1 = new JRadioButton("Selection", false);
      radio2 = new JRadioButton("All", true);
      radio3 = new JRadioButton("Applet", false);
      panel5 = new JPanel();
      panel5.setLayout(new BorderLayout());
      panel5.add(radio1, BorderLayout.NORTH);
      panel5.add(radio2, BorderLayout.CENTER);
      panel5.add(radio3, BorderLayout.SOUTH);

      // group the radio buttons
      radioGroup = new ButtonGroup();
      radioGroup.add(radio1);
      radioGroup.add(radio2);
      radioGroup.add(radio3);

      // build left center
      panel8 = new JPanel();
      panel8.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));
      panel8.setBackground(Color.WHITE);
      panel8.add(panel4);
      panel8.add(panel5);

      // set up left panel
      panel6 = new JPanel();
      panel6.setLayout(new BorderLayout());
      panel6.add(panel1, BorderLayout.NORTH);
      panel6.add(panel8, BorderLayout.CENTER);
      panel6.add(panel3, BorderLayout.SOUTH);

      // set up layout
      panel7 = new JPanel();
      panel7.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
      panel7.add(panel6);
      panel7.add(panel2);
      add(panel7);
   } // end PrinterFrame constructor
} // end class PrinterFrame


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

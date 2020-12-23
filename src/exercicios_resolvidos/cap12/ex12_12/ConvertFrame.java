package exercicios_resolvidos.cap12.ex12_12;

// Exercise 12.12 Solution: ConvertFrame.java
// Temperature-conversion program
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertFrame extends JFrame 
{
   private JLabel prompt; // label to prompt user to enter Fahrenheit
   private JLabel display; // label to display temperature in Celsius
   private JTextField temperatureF; // textfield to enter temperature

   // constructor sets up GUI
   public ConvertFrame()
   {
      super("Temperature converter");

      prompt = new JLabel("Enter Fahrenheit temperature:");
      temperatureF = new JTextField(10); // textfield for Fahrenheit

      // register anonymous action listener
      temperatureF.addActionListener(
         new ActionListener() // anonymous inner class
         {
            public void actionPerformed(ActionEvent e)
            {
               int temp = Integer.parseInt(temperatureF.getText());
               int celsius = (int) (5.0f / 9.0f * (temp - 32));
               display.setText("Temperature in Celsius is: " + celsius);
            } 
         } // end anonymous inner class
     ); // end call to addActionListener

      display = new JLabel("Temperature in Celsius is:");

      add(prompt, BorderLayout.NORTH); // north region
      add(temperatureF, BorderLayout.CENTER); // center region
      add(display, BorderLayout.SOUTH); // south region
   } // end ConvertFrame constructor
} // end class ConvertFrame


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

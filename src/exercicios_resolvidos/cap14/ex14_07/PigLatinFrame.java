package exercicios_resolvidos.cap14.ex14_07;

// Exercise 14.7 Solution: PigLatinFrame.java
// Application translates English to Pig Latin.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PigLatinFrame extends JFrame
{
   private JTextField input; // for entering sentences to be converted
   private JTextArea output; // log of converted pig Latin phrases

   public PigLatinFrame()
   {
      super("Pig Latin Conversion");

      // create input text field and add event handler
      input = new JTextField(30);
      input.addActionListener(
         new ActionListener() // anonymous inner class
         {
            public void actionPerformed(ActionEvent e)
            {
               convertPhrase(input.getText());
               input.setText("");
            } 
         } 
      ); 

      // create output text area
      output = new JTextArea(6, 30);
      output.setEditable(false);

      // set layout and add components
      setLayout(new FlowLayout());
      add(input);
      add(new JScrollPane(output)); // use a JScrollPane to allow scrolling
   } 

   // convert a phrase to pig Latin and display it
   private void convertPhrase(String phrase)
   {
      // translate user input 
      String[] words = phrase.split(" ");

      // print words converted to pig Latin one at a time
      for (String word : words)
         printLatinWord(word);

      output.append("\n"); // add newline to output
   }

   // convert a single word to pig Latin and add to output text area
   private void printLatinWord(String word)
   {
      output.append(word.substring(1));
      output.append("" + Character.toLowerCase(word.charAt(0)));
      output.append("ay ");
   }
} // end class PigLatin


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

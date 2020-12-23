package exercicios_resolvidos.cap14.ex14_27;

// Exercise 14.27 Solution: SpamScannerFrame.java
// Calculates the spam score of a message.
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SpamScannerFrame extends JFrame implements ActionListener
{
   // list of spam words, retrieved from:
   // http://www.wilsonweb.com/wmt8/spamfilter_phrases.htm
   // http://codex.wordpress.org/Spam_Words
   private static final String[] spamWords = {
      "nigerian", "disclaimer", "urgent", "necessary", "free", "4u",
      "guarantee", "profits", "congratulations", "opportunity",
      "unlimited", "scam", "casino", "profits", "amazing", "mailto",
      "mlm", "unsecured", "winner", "winning", "hormone", "insurance",
      "spam", "ringtones", "pharmacy", "blackjack", "cwas", "chatroom",
      "duty-free", "shoes"};
   private JTextArea messageArea; // lets user input message
   private JButton scanButton; // clicked to calculate score
   private JTextField scoreField; // displays spam score
   private JTextField percentField; // displays percentage of spam words

   public SpamScannerFrame()
   {
      super("Spam Scanner"); // call JFrame's constructor to set title
      setLayout(new BorderLayout()); // set layout manager

      // create text area
      messageArea = new JTextArea();

      // create button
      scanButton = new JButton("Scan message");
      scanButton.addActionListener(this);

      // create text fields
      scoreField = new JTextField(3);
      scoreField.setEditable(false);
      percentField = new JTextField(3);
      percentField.setEditable(false);

      // use a JPanel to get proper layout
      JPanel panel = new JPanel();
      panel.add(scanButton);
      panel.add(new JLabel("Score:"));
      panel.add(scoreField);
      panel.add(new JLabel("Spam likelihood:"));
      panel.add(percentField);

      // add components to frame
      add(new JScrollPane(messageArea)); // allow scrolling
      add(panel, BorderLayout.SOUTH);
   } 

   // scan text in messageArea and display spam score when button clicked
   public void actionPerformed(ActionEvent event)
   {
      Scanner scanner = new Scanner(messageArea.getText());
      int spamCount = 0, wordCount = 0; // count spam and total words

      while (scanner.hasNext())
      {
         String word = scanner.next();
         ++wordCount; // increment word count

         for (String spamWord : spamWords)
            if (word.toLowerCase().equals(spamWord))
               ++spamCount; // increment spam word count
      }

      // update text in text fields
      scoreField.setText(String.valueOf(spamCount));
      int percent = (wordCount == 0 ? 0 : 100 * spamCount / wordCount);
      percentField.setText(percent + "%");
   } 
} // end class SpamScannerFrame


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

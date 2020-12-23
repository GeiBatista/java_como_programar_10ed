package exercicios_resolvidos.cap14.ex14_26;

// Exercise 14.26 Solution: HealthierIngredientsFrame.java
// Converts a recipe to use healthier ingredients.
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class HealthierIngredientsFrame extends JFrame
   implements ActionListener
{
   private JTextArea inputArea; // lets user input message
   private JButton convertButton; // clicked to convert recipe
   private JTextArea outputArea; // normal english output

   // control what substitutions to make
   private JCheckBox cholesterolCheckBox;
   private JCheckBox weightLossCheckBox;

   public HealthierIngredientsFrame()
   {
      super("Recipe converter");
      setLayout(new BorderLayout());

      // create text areas
      inputArea = new JTextArea(15, 15);
      outputArea = new JTextArea(10, 15);
      outputArea.setEditable(false); // disallow editing for output

      // create button
      convertButton = new JButton("Convert >>>");
      convertButton.addActionListener(this);

      // create check boxes
      cholesterolCheckBox = new JCheckBox("High cholesterol");
      weightLossCheckBox = new JCheckBox("Weight loss");

      // add components to central box
      Box centerBox = Box.createVerticalBox();
      centerBox.add(convertButton);
      centerBox.add(cholesterolCheckBox);
      centerBox.add(weightLossCheckBox);

      // add components to main box
      Box mainBox = Box.createHorizontalBox();
      mainBox.add(new JScrollPane(inputArea));
      mainBox.add(centerBox);
      mainBox.add(new JScrollPane(outputArea));

      add(mainBox); // add box to frame

      // add warning label on bottom
      add(new JLabel("Always consult your physician before making " +
         "significant changes to your diet"), BorderLayout.SOUTH);
   }

   // convert recipe to use healthier ingredients
   public void actionPerformed(ActionEvent event)
   {
      Scanner scanner = new Scanner(inputArea.getText());
      StringBuilder output = new StringBuilder();

      // translate recipe, one item at a time
      while (scanner.hasNextLine())
      {
         try
         {
            // attempt to translate line of recipe
            output.append(convert(scanner.nextLine()));
            output.append('\n');
         }
         catch (Exception exception)
         {
            JOptionPane.showMessageDialog(this, "Could not parse recipe.",
               "Error", JOptionPane.ERROR_MESSAGE);
            return;
         }
      }

      outputArea.setText(output.toString()); // show translated text
   } 

   // convert single recipe item
   private String convert(String word)
   {
      // split out quantity, unit, and item
      String[] tokens = word.split("\\s+", 3);
      double amount = readAmount(tokens[0]);
      String unit = tokens[1]; // unit of measure
      String item = tokens.length == 2 ? "" : tokens[2]; // type

      // do all necessary conversions
      // eggs don't have a unit, so type is parsed as
      if (unit.matches("eggs?") && cholesterolCheckBox.isSelected())
         return String.format("%.2f egg whites", amount * 2);
      else if (item.equals("milk") && cholesterolCheckBox.isSelected())
         return String.format("%.2f %s soy milk", amount, unit);
      else if (item.equals("sugar") && weightLossCheckBox.isSelected())
         return String.format("%.2f %s molasses", amount, unit);
      else if (item.equals("butter") && cholesterolCheckBox.isSelected())
         return String.format("%.2f %s margarine", amount, unit);
      else if (item.equals("flour"))
         return String.format("%.2f %s rye flour", amount, unit);
      else if (item.equals("mayonnaise") && cholesterolCheckBox.isSelected())
         return String.format("%.2f %s cottage cheese", amount, unit);
      else if (item.equals("oil") && weightLossCheckBox.isSelected())
         return String.format("%.2f %s applesauce", amount, unit);
      else if (item.equals("lemon juice"))
         return String.format("%.2f %s vinegar", amount / 2, unit);
      else if (item.equals("sour cream") && cholesterolCheckBox.isSelected())
         return String.format("%.2f %s yogurt", amount, unit);
      else
         return word; // no conversion; use original item
   }

   private double readAmount(String amount)
   {
      // attempt simple case first
      if (amount.matches("\\d+(\\.\\d+)?"))
         return Double.parseDouble(amount);

      // deal with fractions
      String[] tokens = amount.split("/");
      double numerator = Double.parseDouble(tokens[0]);
      double denominator = Double.parseDouble(tokens[1]);
      return numerator / denominator;
   }
} // end class HealthierIngredientsFrame


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

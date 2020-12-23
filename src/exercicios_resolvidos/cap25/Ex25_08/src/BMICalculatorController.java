// BMICalculatorController.java
// Controller that handles calculateButton and tipPercentageSlider events
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BMICalculatorController 
{
   // GUI controls defined in FXML and used by the controller's code
   @FXML 
   private TextField weightTextField; 

   @FXML
   private TextField heightTextField;

   @FXML
   private TextField bmiTextField;

   @FXML
   private RadioButton englishRadioButton;

   @FXML
   private RadioButton metricRadioButton;

   // calculates and displays the tip and total amounts
   @FXML
   private void calculateButtonPressed(ActionEvent event) 
   {
      double weight = Double.parseDouble(weightTextField.getText());
      double height = Double.parseDouble(heightTextField.getText());
      
      double bmi;
      
      if (englishRadioButton.isSelected())
      {
         bmi = (weight * 703) / (height * height);
      }
      else // metric
      {
         bmi = weight / (height * height);
      }
      
      bmiTextField.setText(String.format("%.2f", bmi));
   }

   // called by FXMLLoader to initialize the controller
   public void initialize() 
   {
      ToggleGroup group = new ToggleGroup();
      englishRadioButton.setToggleGroup(group);
      metricRadioButton.setToggleGroup(group);
   }
}

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
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

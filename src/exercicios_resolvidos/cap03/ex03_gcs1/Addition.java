package exercicios_resolvidos.cap03.ex03_gcs1;

// GCS Exercise 3.1: Addition.java
// Modification of addition example from Chapter 2
import javax.swing.JOptionPane; // uses JOptionPane instead of Scanner

public class Addition
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      String firstNumber; // first string entered by user
      String secondNumber; // second string entered by user

      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2

      // read in first number from user as a String
      firstNumber = JOptionPane.showInputDialog("Enter first integer");

      // read in second number from user as a String
      secondNumber =
         JOptionPane.showInputDialog("Enter second integer");

      // convert numbers from type String to type int
      number1 = Integer.parseInt(firstNumber);
      number2 = Integer.parseInt(secondNumber);

      sum = number1 + number2; // add numbers

      // create the message
      String message = String.format("The sum is %d", sum);
      
      // display result
      JOptionPane.showMessageDialog(null, message);
   } // end main
} // end class Addition


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
 *************************************************************************/

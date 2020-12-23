package exercicios_resolvidos.cap12.ex12_09;

// Exercise 12.9 Solution: Calculator.java
// Program creates a GUI that resembles a calculator.
import javax.swing.JFrame;

public class Calculator
{
   public static void main(String[] args)
   {
      CalculatorFrame calculatorFrame = new CalculatorFrame(); 
      calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      calculatorFrame.setSize(200, 200); // set frame size
      calculatorFrame.setVisible(true); // display frame
   } 
}  // end class Calculator

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

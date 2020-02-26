package exercicios_resolvidos.cap05.ex05_gcs2;

// GCS Exercise 5.2: Graphs.java
// Program prints 5 histograms with lengths determined by user.
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Graphs extends JPanel
{
   private int number1 = 0; 
   private int number2 = 0; 
   private int number3 = 0; 
   private int number4 = 0; 
   private int number5 = 0; 

   // Constructor, reads in 5 numbers
   public Graphs()
   {
      String inputNumber; // number entered by user

      // read in 5 individual numbers
      for (int counter = 1; counter <= 5; counter++)
      {
         inputNumber = JOptionPane.showInputDialog("Enter Number");
         
         switch (counter)
         {
            case 1:
               number1 = Integer.parseInt(inputNumber);
               break;
            case 2:
               number2 = Integer.parseInt(inputNumber);
               break; 
            case 3:
               number3 = Integer.parseInt(inputNumber);
               break; 
            case 4:
               number4 = Integer.parseInt(inputNumber);
               break; 
            case 5:
               number5 = Integer.parseInt(inputNumber);
               break; 
         } 
      }
   } 

   // draws a histogram with bar lengths corresponding to the input
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      int value = 0; // value of current number, determines bar length
      
      for (int counter = 1; counter <= 5; counter++)
      {
         switch (counter)
         {
            case 1:
               value = number1;
               break; 
            case 2:
               value = number2;
               break; 
            case 3:
               value = number3;
               break; 
            case 4:
               value = number4;
               break; 
            case 5:
               value = number5;
               break; 
         } 
         
         // start at -1 so it looks like the bar is coming
         // right out of the edge
         g.drawRect(-1, counter * 30, value * 10, 20);
      } 
   }
} // end class Graphs


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

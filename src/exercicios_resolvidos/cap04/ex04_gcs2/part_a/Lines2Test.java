package exercicios_resolvidos.cap04.ex04_gcs2.part_a;

// GCS Exercise 4.2 Part A: Lines2Test.java
// Application to display class Lines2
import javax.swing.JFrame;

public class Lines2Test
{
   public static void main(String[] args)
   {
      Lines2 panel = new Lines2(); // create the panel with the drawing
      JFrame application = new JFrame(); // create a new frame

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel); // add the panel to the frame
      application.setSize(300, 300); // set the size
      application.setVisible(true); // show the frame
   } 
} // end class Lines2Test

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

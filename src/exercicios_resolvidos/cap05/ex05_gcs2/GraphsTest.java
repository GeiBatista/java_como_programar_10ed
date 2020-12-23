package exercicios_resolvidos.cap05.ex05_gcs2;

 // GCS Exercise 5.2: GraphsTest.java
// Test application for class Graphs
import javax.swing.JFrame;

public class GraphsTest
{   
   public static void main(String[] args)
   {
      Graphs panel = new Graphs();      
      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(550, 250);
      application.setVisible(true);
   } 
} // end class GraphsTest



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

package exercicios_resolvidos.cap15.ex15_09;

// Exercise 15.9 Solution: TestDraw.java
// Test application to display a DrawFrame
import javax.swing.JFrame;

public class TestDraw
{
   public static void main(String[] args)
   {
      DrawFrame application = new DrawFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.setSize(600, 500);
      application.setVisible(true);
   } 
} 

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

package exercicios_resolvidos.cap15.ex15_09;

// Exercise 15.9 Solution: MyOval.java
// Declaration of class MyOval.
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape
{
   // call default superclass constructor
   public MyOval()
   {
      super();
   } 

   // call superclass constructor passing parameters
   public MyOval(int x1, int y1, int x2, int y2,
      Color color, boolean isFilled)
   {
      super(x1, y1, x2, y2, color, isFilled);
   } 

   // draw oval
   public void draw(Graphics g)
   {
      g.setColor(getColor());
      
      if (isFilled())
         g.fillOval(getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight());
      else
         g.drawOval(getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight());
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

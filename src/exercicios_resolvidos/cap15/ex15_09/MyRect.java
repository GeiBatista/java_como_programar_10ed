package exercicios_resolvidos.cap15.ex15_09;

// Exercise 15.9 Solution: MyRect.java
// Declaration of class MyRect.
import java.awt.Color;
import java.awt.Graphics;

public class MyRect extends MyBoundedShape
{
   // call default superclass constructor
   public MyRect()
   {
      super();
   } 

   // call superclass constructor passing parameters
   public MyRect(int x1, int y1, int x2, int y2,
      Color color, boolean isFilled)
   {
      super(x1, y1, x2, y2, color, isFilled);
   } 

   // draw rectangle
   public void draw(Graphics g)
   {
      g.setColor(getColor());
      
      if (isFilled())
         g.fillRect(getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight());
      else
         g.drawRect(getUpperLeftX(), getUpperLeftY(),
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

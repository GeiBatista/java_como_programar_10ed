package exercicios_resolvidos.cap15.ex15_09;

// Exercise 15.9 Solution: MyBoundedShape.java
// Declaration of class MyBoundedShape.
import java.awt.Color;
import java.awt.Graphics;

public abstract class MyBoundedShape extends MyShape
{
   private boolean filled; // whether this shape is filled
   
   // call default superclass constructor
   public MyBoundedShape()
   {
      super();
      setFilled(false);
   } 

   // call superclass constructor passing parameters
   public MyBoundedShape(int x1, int y1, int x2, int y2,
      Color color, boolean isFilled)
   {
      super(x1, y1, x2, y2, color);
      setFilled(isFilled);
   } 

   // get upper left x coordinate
   public int getUpperLeftX()
   {
      return Math.min(getX1(), getX2());
   } 

   // get upper left y coordinate
   public int getUpperLeftY()
   {
      return Math.min(getY1(), getY2());
   } 

   // get shape width
   public int getWidth()
   {
      return Math.abs(getX2() - getX1());
   } 

   // get shape height
   public int getHeight()
   {
      return Math.abs(getY2() - getY1());
   } 

   // determines whether this shape is filled
   public boolean isFilled()
   {
      return filled;
   } 

   // sets whether this shape is filled
   public void setFilled(boolean isFilled)
   {
      filled = isFilled;
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

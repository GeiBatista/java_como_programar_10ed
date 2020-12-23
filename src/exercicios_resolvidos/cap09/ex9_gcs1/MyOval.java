package exercicios_resolvidos.cap09.ex9_gcs1;

// GCS Exercise 8.1 Solution: MyOval.java
// Declaration of class MyOval.
import java.awt.Color;
import java.awt.Graphics;

public class MyOval
{
   private int x1; // x coordinate of first endpoint
   private int y1; // y coordinate of first endpoint
   private int x2; // x coordinate of second endpoint
   private int y2; // y coordinate of second endpoint
   private Color myColor; // Color of this oval
   private boolean filled; // whether this shape is filled

   // constructor initializes private vars with default values
   public MyOval()
   {
      this(0, 0, 0, 0, Color.BLACK, false); // call constructor
   }

   // constructor with input values
   public MyOval(int x1, int y1, int x2, int y2,
      Color myColor, boolean filled)
   {
      this.x1 = (x1 >= 0 ? x1 : 0);
      this.y1 = (y1 >= 0 ? y1 : 0);
      this.x2 = (x2 >= 0 ? x2 : 0);
      this.y2 = (y2 >= 0 ? y2 : 0);
      this.myColor = myColor; 
      this.filled = filled;
   } 

   // set the x-coordinate of the first point
   public void setX1(int x1)
   {
      this.x1 = (x1 >= 0 ? x1 : 0);
   } 

   // get the x-coordinate of the first point
   public int getX1()
   {
      return x1;
   } 

   // set the x-coordinate of the second point
   public void setX2(int x2)
   {
      this.x2 = (x2 >= 0 ? x2 : 0);
   } 

   // get the x-coordinate of the second point
   public int getX2()
   {
      return x2;
   } 

   // set the y-coordinate of the first point
   public void setY1(int y1)
   {
      this.y1 = (y1 >= 0 ? y1 : 0);
   } 

   // get the y-coordinate of the first point
   public int getY1()
   {
      return y1;
   }

   // set the y-coordinate of the second point
   public void setY2(int y2)
   {
      this.y2 = (y2 >= 0 ? y2 : 0);
   } 

   // get the y-coordinate of the second point
   public int getY2()
   {
      return y2;
   }

   // set the color
   public void setColor(Color color)
   {
       myColor = color;
   } 

   // get the color
   public Color getColor()
   {
      return myColor;
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
   
   // draws an oval in the specified color
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
} // end class MyOval


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
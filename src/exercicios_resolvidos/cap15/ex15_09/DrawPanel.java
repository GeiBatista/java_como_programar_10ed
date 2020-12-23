package exercicios_resolvidos.cap15.ex15_09;

// Exercise 15.9 Solution: DrawPanel.java
// JPanel that allows the user to draw shapes with the mouse. 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private MyShape[] shapes; // array containing all the shapes
   private int shapeCount; // statistic on the number of each shape

   private int shapeType; // the type of shape to draw
   private MyShape currentShape; // the current shape being drawn
   private Color currentColor; // the color of the shape
   private boolean filledShape; // whether this shape is filled
   
   private JLabel statusLabel; // label displaying mouse coordinates
   
   // constructor
   public DrawPanel(JLabel status)
   {
      shapes = new MyShape[100]; // create the array
      shapeCount = 0; // initially we have no shapes
      
      setShapeType(0); // initially draw lines
      setDrawingColor(Color.BLACK); // start drawing with black
      setFilledShape(false);// not filled by default
      currentShape = null; // not drawing anything initially
            
      setBackground(Color.WHITE); // set a white background
      
      // add the mouse listeners
      MouseHandler mouseHandler = new MouseHandler();
      addMouseListener(mouseHandler);
      addMouseMotionListener(mouseHandler);
      
      // set the status label for displaying mouse coordinates
      statusLabel = status;
   } 

   // draw shapes using polymorphism
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      for (int i = 0; i < shapeCount; i++)
         shapes[i].draw(g);
      
      if (currentShape != null)
         currentShape.draw(g);
   } // end method paintComponent

   // sets the type of shape to draw
   public void setShapeType(int shapeType)
   {
      if (shapeType < 0 || shapeType > 2)
         shapeType = 0;
      
      this.shapeType = shapeType;
   } 

   // sets the drawing color
   public void setDrawingColor(Color c)
   {
      currentColor = c;
   } 

   // clears the last shape drawn
   public void clearLastShape()
   {
      if (shapeCount > 0)
      {
         shapeCount--;
         repaint();
      } 
   } 

   // clears all drawings on this panel
   public void clearDrawing()
   {
      shapeCount = 0;
      repaint();
   } 

   // sets whether to draw a filled shape
   public void setFilledShape(boolean isFilled)
   {
      filledShape = isFilled;
   } 

   // load saved drawing
   public void loadDrawing()
   {
      ObjectInputStream input = null;

      try // user selects file, shapes are input
      {
         // use JFileChooser to select file
         JFileChooser fileChooser = new JFileChooser();

         int result = fileChooser.showOpenDialog(this);

         // if user clicked Cancel button on dialog, return
         if (result == JFileChooser.CANCEL_OPTION)
            return;

         // get selected file
         File fileName = fileChooser.getSelectedFile();

         // display error if invalid
         if ((fileName == null) ||
            (fileName.getName().equals("")))
         {
            JOptionPane.showMessageDialog(this,
               "Invalid File Name", "Invalid File Name",
               JOptionPane.ERROR_MESSAGE);
            return;
         } 

         // open file for input
         input = new ObjectInputStream(
            new FileInputStream(fileName));

         // read in number of shapes using deserialization
         shapeCount = (Integer) input.readObject();

         // read in shapes using deserialization
         // set shapes to be displayed on drawPanel
         shapes = (MyShape []) input.readObject();

         repaint(); // redraw shapes
      } 
      catch (EOFException eofException)
      {
         JOptionPane.showMessageDialog(this, 
            "No more records in file.", "End of File",
            JOptionPane.ERROR_MESSAGE);
      } 
      catch (ClassNotFoundException classNotFoundException)
      {
         JOptionPane.showMessageDialog(this,
            "Unable to create object.", "Class Not Found",
            JOptionPane.ERROR_MESSAGE);
      } 
      catch (IOException ioException)
      {
         JOptionPane.showMessageDialog(this,
            "Error opening file.", "Error",
            JOptionPane.ERROR_MESSAGE);
      } 
      finally
      {
         try
         {
            if (input != null)
               input.close(); // close file and stream
         } 
         catch (IOException ioException)
         {
            JOptionPane.showMessageDialog(this,
               "Error closing file.", "Error",
               JOptionPane.ERROR_MESSAGE);
         } 
      } 
   } 

   // save drawing as serialized objects
   public void saveDrawing()
   {
      ObjectOutputStream output = null;

      try
      {
         // use JFileChooser to select file
         JFileChooser fileChooser = new JFileChooser();

         int result = fileChooser.showSaveDialog(this);

         // if user clicked Cancel button on dialog, return
         if (result == JFileChooser.CANCEL_OPTION)
            return;

         // get selected file
         File fileName = fileChooser.getSelectedFile();

         // display error if invalid
         if ((fileName == null) || 
            (fileName.getName().equals("")))
         {
            JOptionPane.showMessageDialog(this,
               "Invalid File Name", "Invalid File Name",
               JOptionPane.ERROR_MESSAGE);
            return;
         } 

         // open file for output
         output = new ObjectOutputStream(
            new FileOutputStream(fileName));

         // write number of shapes to file
         output.writeObject(shapeCount);

         // write shapes to file using serialization
         output.writeObject(shapes);
      } 
      catch (IOException ioException)
      {
         JOptionPane.showMessageDialog(this,
            "Error Opening File", "Error.",
            JOptionPane.ERROR_MESSAGE);
      } 
      finally
      {
         try
         {
            if (output != null)
               output.close(); // close file and stream
         } 
         catch (IOException ioException)
         {
            JOptionPane.showMessageDialog(this,
               "Error closing file.", "Error",
               JOptionPane.ERROR_MESSAGE);
         } 
      } 
   } 

   // Handles mouse events for this JPanel
   private class MouseHandler extends MouseAdapter
      implements MouseMotionListener
   {
      // creates and sets the initial position for the new shape
      public void mousePressed(MouseEvent e)
      {
         if (currentShape != null)
            return;

         // create the appropriate shape based on shapeType
         switch (shapeType)
         {
            case 0:
               currentShape = new MyLine(e.getX(), e.getY(),
                  e.getX(), e.getY(), currentColor);      
               break;
            case 1:
               currentShape = new MyOval(e.getX(), e.getY(),
                  e.getX(), e.getY(), currentColor, filledShape);      
               break;
            case 2:
               currentShape = new MyRect(e.getX(), e.getY(),
                  e.getX(), e.getY(), currentColor, filledShape);      
               break;
         } 
      } 

      // fixes the current shape onto the panel
      public void mouseReleased(MouseEvent e)
      {
         if (currentShape == null)
            return;
         
         // set the second point on the shape
         currentShape.setX2(e.getX());
         currentShape.setY2(e.getY());
         
         // only set the shape if there is room in the array
         if (shapeCount < shapes.length)
         {
            shapes[shapeCount] = currentShape;
            shapeCount++;
         } 
         
         currentShape = null; // clear the temporary drawing shape     
         repaint();
      } 

      // update the shape to the current mouse position while dragging
      public void mouseDragged(MouseEvent e)
      {
         if (currentShape != null)
         {
            currentShape.setX2(e.getX());
            currentShape.setY2(e.getY());
            repaint();
         } 

         mouseMoved(e); // update status bar
      } 

      // updates the status bar to show the current mouse coordinates
      public void mouseMoved(MouseEvent e)
      {
         statusLabel.setText(
            String.format("(%d,%d)", e.getX(), e.getY()));
      } 
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

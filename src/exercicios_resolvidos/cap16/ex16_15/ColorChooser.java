package exercicios_resolvidos.cap16.ex16_15;

// Exercise 16.15 Solution: ColorChooser.java
// Class that uses a HashMap to store color-name/object pairs.
import java.awt.Color;
import java.util.HashMap;
import java.util.Set;

public class ColorChooser 
{
   private HashMap<String , Color> hashMap;
   
   public ColorChooser() 
   {
      hashMap = new HashMap<String, Color>();
      
      // add the 13 colors to the hashMap
      hashMap.put("black", Color.BLACK);
      hashMap.put("blue", Color.BLUE);
      hashMap.put("cyan", Color.CYAN);
      hashMap.put("darkGray", Color.DARK_GRAY);
      hashMap.put("gray", Color.GRAY);
      hashMap.put("green", Color.GREEN);
      hashMap.put("lightGray", Color.LIGHT_GRAY);
      hashMap.put("magenta", Color.MAGENTA);
      hashMap.put("orange", Color.ORANGE);
      hashMap.put("pink", Color.PINK);
      hashMap.put("red", Color.RED);
      hashMap.put("white", Color.WHITE);
      hashMap.put("yellow", Color.YELLOW);
   } 

   // return the selected color
   public Color getColor(String name) 
   {
      return hashMap.get(name);
   }

   // return all the color names
   public Set<String> getKeySet() 
   {
      return hashMap.keySet();
   }
} // end class ColorChooser

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

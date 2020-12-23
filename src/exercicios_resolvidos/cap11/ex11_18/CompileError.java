package exercicios_resolvidos.cap11.ex11_18;

// Exercise 11.18 Solution: CompileError.java
// Catching base class exception before derived class exception.
import java.io.IOException;

public class CompileError 
{
   public static void main(String[] args)
   {
      try 
      {
         throw new IOException();
      }
      catch (Exception exception) // superclass exception
      {
         exception.printStackTrace();
      }
      catch (IOException ioException) // subclass exception
      {
         System.err.println("IOException");
      }
   }
} // end class CompileError

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
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
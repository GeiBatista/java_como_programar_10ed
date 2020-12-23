package exercicios_resolvidos.cap12.ex12_20;

// Exercise 12.20 Solution: TypingTutor.java
// Driver program for typing tutor.
import javax.swing.JFrame;

public class TypingTutor
{
   public static void main(String[] args)
   {
      TypingTutorFrame typingTutorFrame = new TypingTutorFrame();
      typingTutorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      typingTutorFrame.setSize(760, 540); // set frame size
      typingTutorFrame.setVisible(true); // display frame
   }
} // end class TypingTutor

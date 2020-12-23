package exercicios_resolvidos.cap18.ex18_20;

// Exercise 18.20 Solution: Maze.java
// Program traverses a maze.
import java.util.Scanner;

public class Maze
{
   static final int DOWN = 0;
   static final int RIGHT = 1;
   static final int UP = 2;
   static final int LEFT = 3;
   static final int X_START = 2;
   static final int Y_START = 0;
   static int move = 0;
   static char maze[][] =
      { { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
        { '#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#' },
        { '.', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#' },
        { '#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#' },
        { '#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '.' },
        { '#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
        { '#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
        { '#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
        { '#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#' },
        { '#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#' },
        { '#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#' },
        { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' } };

   static Scanner scanner = new Scanner(System.in);

   // method calls mazeTraversal with correct starting point and direction
   public void traverse()
   {
      boolean result = mazeTraversal(maze, X_START, Y_START);

      if (!result)
         System.out.println("Maze has no solution.");
   } // end method traverse

   // traverse maze recursively
   public boolean mazeTraversal(char maze2[][], int x, int y)
   {
      maze[x][y] = 'x';
      move++;
      printMaze();

      // if returned to starting location
      if (x == X_START && y == Y_START && move > 1)
      {
         System.out.print("Returned to starting location!");
         return false;
      } 
      // if maze exited
      else if (mazeExited(x, y) && move > 1)
      {
         System.out.println("Maze successfully exited!");
         return true;
      }
      else // make next move
      {
         System.out.print("Enter 'y' to continue, 'n' to exit: ");
         char response = scanner.nextLine().charAt(0);

         // if user enters 'n', exit program
         if (response == 'n')
            System.exit(0);

         // determine where next move should be made
         for (int count = 0; count < 4; count++) 
         {
            // checks to see if the space to the right is free. If 
            // so, moves there and continues maze traversal. If not, 
            // breaks out of switch and tries new value of move in
            // for statement.
            switch (count)
            {
               case DOWN: // move down

                  // if user can move down without hitting wall
                  if (validMove(x + 1, y)) 
                  {
                     if (mazeTraversal(maze2, x + 1, y))
                        return true;
                  } 
   
                  break;
               case RIGHT: // move right

                  // if user can move right without hitting wall
                  if (validMove(x, y + 1)) 
                  {
                     if (mazeTraversal(maze2, x, y + 1))
                        return true;
                  } 

                  break;
               case UP: // move up

                  // if user can move up without hitting wall
                  if (validMove(x - 1, y)) 
                  {
                     if (mazeTraversal(maze2, x - 1, y))
                        return true;
                  } 

                  break;
               case LEFT: // move left

                  // if user can move left without hitting wall
                  if (validMove(x, y - 1)) 
                  {
                     if (mazeTraversal(maze2, x, y - 1))
                        return true;
                  } 
            }
         } 

         // if no valid moves available
         maze2[x][y] = '0';

         // recursive backtracking -- if no directions possible,
         // back up to previous method call
         return false;
      } 
   } 

   // check if move is valid
   public static boolean validMove(int row, int column)
   {
      return row >= 0 && row <= 11 && column >= 0 && column <= 11 &&
         maze[row][column] == '.';
   }

   // check if location is on edge of maze
   public static boolean mazeExited(int row, int column)
   {
      return row == 0 || row == 11 || column == 0 || column == 11;
   } 

   // draw maze
   public void printMaze()
   {
      int x = 5, y = 30;

      // for each space in maze
      for (int row = 0; row < maze.length; row++)
      {
         for (int column = 0; column < maze[row].length;
            column++)
         {
            if (maze[row][column] == '0')
               System.out.print(" .");
            else
               System.out.print(" " + maze[row][column]);
         }

         y += 10;
         x = 5;
         System.out.println();
      }

      System.out.println();
   } 
} // end class Maze

/*************************************************************************
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

package exercicios_resolvidos.cap18.ex18_22;

// Exercise 18.22 Solution: Maze.java
// Program traverses a maze.
import java.util.Scanner;

public class Maze
{
   final int DOWN = 0;
   final int RIGHT = 1;
   final int UP = 2;
   final int LEFT = 3;
   final int MAX_ROWS = 30;
   final int MAX_COLS = 30;
   final int MIN_ROWS = 5;
   final int MIN_COLS = 5;
   int move = 0;
   int flag;
   int xStart = 0;
   int yStart = 0;
   int rows;
   int cols;
   int numDots;
   char maze[][];

   static Scanner scanner = new Scanner(System.in);

   public Maze()
   {
      rows = (int) (MIN_ROWS + Math.random() *
         (MAX_ROWS - MIN_ROWS));
      cols = (int) (MIN_COLS + Math.random() *
         (MAX_COLS - MIN_COLS));
      maze = new char[rows][cols];
      numDots = (rows * cols) / 4 * 3;

      // create block of '#' characters
      for (int j = 0; j < maze.length; j++)
         for (int k = 0; k < maze[j].length; k++)
            maze[j][k] = '#';

      mazeGenerator(maze);
   } 

   // method calls mazeTraversal with correct starting point and direction
   public void traverse()
   {
      boolean result = mazeTraversal(maze, xStart, yStart);

      if (!result)
         System.out.println("Maze has no solution.");
   }

   // traverse maze recursively
   public boolean mazeTraversal(char maze2[][], int x, int y)
   {
      maze[x][y] = 'x';
      move++;
      printMaze();

      // if returned to starting location
      if (x == xStart && y == yStart && move > 1)
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
   public boolean validMove(int row, int column)
   {
      return row >= 0 && row < rows && column >= 0 && column < cols &&
         maze[row][column] == '.';
   } 

   // check if location is on edge of maze
   public boolean mazeExited(int row, int column)
   {
      return row == 0 || row == rows - 1 || column == 0 || column == cols - 1;
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

   // create a new maze
   public void mazeGenerator(char board[][])
   {
      int exitX, exitY, entry, exit;

      xStart = 0; // create start location
      yStart = 0;

      // create random entry and exit point, make sure not same point
      do
      {
         entry = (int) (1 + Math.random() * 4);
         exit = (int) (1 + Math.random() * 4);
      } while (entry == exit);

      // determine entry position
      if (entry == 0)
      {
         // avoid corners
         xStart = (int) (1 + Math.random() * (rows - 2)); 
         yStart = 0;
      } 
      else if (entry == 1)
      {
         xStart = 0;
         yStart = (int) (1 + Math.random() * (cols - 2));
      } 
      else if (entry == 2)
      {
         xStart = (int) (1 + Math.random() * (rows - 2));
         yStart = cols - 1;
      } 
      else
      {
         xStart = rows - 1;
         yStart = (int) (1 + Math.random() * (cols - 2));
      } 

      board[xStart][yStart] = '.';

      // determine exit location
      if (exit == 0)
      {
         exitX = (int) (1 + Math.random() * (rows - 2));
         exitY = 0;
      } 
      else if (exit == 1)
      {
         exitX = 0;
         exitY = (int) (1 + Math.random() * (cols - 2));
      } 
      else if (exit == 2)
      {
         exitX = (int) (1 + Math.random() * (rows - 2));
         exitY = 0;
      } 
      else
      {
         exitX = rows - 1;
         exitY = (int) (1 + Math.random() * (cols - 2));
      }

      board[exitX][exitY] = '.';

      // create paths by adding dots randomly
      // Note: maze doesn't necessarily have a solution
      for (int loop = 1; loop < numDots; loop++)
      {
         int xValue = (int) (1 + Math.random() * (rows - 2));
         int yValue = (int) (1 + Math.random() * (cols - 2));
         board[xValue][yValue] = '.';
      } 
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

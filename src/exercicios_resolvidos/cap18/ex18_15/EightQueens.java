package exercicios_resolvidos.cap18.ex18_15;

// Exercise 18.15 Solution: EightQueens.java
// Recursive solution to Eight Queens problem.

public class EightQueens
{
   char chessBoard[][];

   // constructor initializes board
   public EightQueens()
   {
      chessBoard = new char[8][8];

      // all spaces on board begin with '*'
      for (int i = 0; i < chessBoard.length; i++)
         for (int j = 0; j < chessBoard[i].length; j++)
            chessBoard[i][j] = '*';
   }

   // helper method - calls recursiveSolve with first column
   public void solve()
   {
      recursiveSolve(0);
   } 

   // recursive method solves Eight Queens problem
   public boolean recursiveSolve(int column)
   {
      // if ninth column reached, problem solved
      if (column == 8)
         return true;
      else // still columns left to analyze
      {
         // for each cell in current column
         for (int i = 0; i < 8; i++)
         {
            // if cell is valid
            if (isValid(i, column))
            {
               // set queen on current cell
               chessBoard[i][column] = 'Q';

               // solve rest of board
               // if true is returned from recursive call,
               // problem solved
               if (recursiveSolve(column + 1))
                  return true;
               
               // problem not solvable with queen in 
               // current cell, remove queen
               chessBoard[i][column] = '*';
            } 
         } 

         // no cells in current row will solve problem,
         // return false to return to previous column
         // demonstrates recursive backtracking
         return false;
      } 
   } 

   // method determines if location on board is valid
   public boolean isValid(int row, int column)
   {
      // for each cell in current cell’s row or column
      for (int i = 0; i < 8; i++)
      {
         // if there are queens in current cell's
         // row or column, cell is not valid
         if ((chessBoard[row][i] == 'Q') ||
            (chessBoard[i][column] == 'Q'))
            return false;
      }

      // for each row
      for (int i = 0; i < 8; i++)
      {
         // for each column
         for (int j = 0; j < 8; j++)
         {
            int rowDifference = Math.abs(row - i);
            int columnDifference = Math.abs(column - j);

            // if the current cell is the same number of rows and columns
            // away from cell passed to method, cells are in same diagonal
            if (rowDifference == columnDifference &&
               chessBoard[i][j] == 'Q')
               return false;
         } 
      } 

      return true;
   } 

   // method display the board for the user
   public void printBoard()
   {
      // for each row
      for (int i = 0; i < chessBoard.length; i++)
      {
         // for each column
         for (int j = 0; j < chessBoard[i].length; j++)
            System.out.printf("%c ", chessBoard[i][j]);

         System.out.println();
      } 

      System.out.println();
   } 
} // end class EightQueens

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

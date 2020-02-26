package estudo.cap04.ex04_32;

/*(Padr�o de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instru��es de sa�da
System.out.print("* ");
System.out.print(" ");
System.out.println();
para exibir o padr�o de tabuleiro de damas a seguir. Uma chamada de m�todo System.out.println sem argumentos faz com que o programa
gere sa�da de um �nico caractere de nova linha. [Dica: as instru��es de repeti��o s�o requeridas.]
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *  */

public class Asteriscos
{
   public static void main(String[] args)
   {
      int linha = 1;

      while (linha <= 8)
      {
         int coluna = 1;

         if (linha % 2 == 0)
            System.out.print(" ");

         while (coluna <= 8)
         {
            System.out.print("* ");
            coluna++;
         } 

         System.out.println();
         linha++;
      } 
   } 
} // fm da class Asteriscos


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

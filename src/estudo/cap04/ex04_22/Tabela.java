package estudo.cap04.ex04_22;
/*(Saída no formato de tabela) Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
N 10*N 100*N 1000*N
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000*/
public class Tabela
{
   public static void main(String[] args)
   {
      int n = 1;

      System.out.printf("N\t10*N\t100*N\t1000*N%n%n");

      while (n <= 5)
      {
         System.out.printf("%d\t%d\t%d\t%d%n",
            n,  (10 * n), (100 * n), (1000 * n));
         ++n;
      }    
   } 
} // fim da classe Tabela


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

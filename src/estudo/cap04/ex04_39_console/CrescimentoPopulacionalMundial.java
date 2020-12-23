package estudo.cap04.ex04_39_console;

/*(Crescimento demogr�fico mundial) A popula��o mundial cresceu consideravelmente ao longo dos s�culos. O crescimento cont�nuo
pode, por fim, desafiar os limites de ar respir�vel, �gua pot�vel, terra f�rtil para agricultura e outros recursos limitados. H� evid�ncia de que
o crescimento tem reduzido a velocidade nos �ltimos anos e que a popula��o mundial pode chegar ao ponto m�ximo em algum momento
nesse s�culo e, ent�o, come�ar a diminuir.
Para esse exerc�cio, pesquise quest�es de crescimento demogr�fico mundial on-line. N�o deixe de investigar v�rios pontos de vista.
Obtenha estimativas da popula��o mundial atual e sua taxa de crescimento (a porcentagem pela qual provavelmente aumentar� neste
ano). Escreva um programa que calcule o crescimento demogr�fico mundial anual dos pr�ximos 75 anos, utilizando a premissa simplificadora
de que a taxa de crescimento atual ficar� constante. Imprima os resultados em uma tabela. A primeira coluna deve exibir os anos
do ano 1 ao ano 75. A segunda coluna deve exibir a popula��o mundial esperada no fim desse ano. A terceira deve exibir o aumento num�rico
na popula��o mundial que ocorreria nesse ano. Utilizando os seus resultados, determine o ano em que a popula��o dobraria com rela��o
ao n�mero de hoje se a taxa de crescimento do ano atual persistisse.*/
import java.util.Scanner;

public class CrescimentoPopulacionalMundial 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
     
      System.out.println("Bem-vindo � calculadora da popula��o mundial");
      System.out.print("Digite a popula��o atual do mundo: ");
      long populacaoAtual = input.nextLong();
      System.out.print("Digite a taxa de crescimento atual: (e.g, 1.14% seria .0114): ");
      double TaxaDeCrescimento = input.nextDouble();

      int Ano = 1; // contador de ano
      System.out.printf("%4s%22s%24s%n", "Ano", "Popula��o Estimada", 
         "Mudan�a do ano anterior");
      
      while (Ano <= 75)
      {
         double PopulacaoFutura = populacaoAtual * (1 + TaxaDeCrescimento);
         System.out.printf("%4d%22d%24d%n", 
            Ano, (long) PopulacaoFutura, (long) PopulacaoFutura - populacaoAtual);
         populacaoAtual = (long) PopulacaoFutura; // observar
         ++Ano;
      } // fim do while
   } // fim do main
} // fim da CrescimentoPopulacionalMundial


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

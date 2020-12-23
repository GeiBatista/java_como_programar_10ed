package estudo.cap04.ex04_39_console;

/*(Crescimento demográfico mundial) A população mundial cresceu consideravelmente ao longo dos séculos. O crescimento contínuo
pode, por fim, desafiar os limites de ar respirável, água potável, terra fértil para agricultura e outros recursos limitados. Há evidência de que
o crescimento tem reduzido a velocidade nos últimos anos e que a população mundial pode chegar ao ponto máximo em algum momento
nesse século e, então, começar a diminuir.
Para esse exercício, pesquise questões de crescimento demográfico mundial on-line. Não deixe de investigar vários pontos de vista.
Obtenha estimativas da população mundial atual e sua taxa de crescimento (a porcentagem pela qual provavelmente aumentará neste
ano). Escreva um programa que calcule o crescimento demográfico mundial anual dos próximos 75 anos, utilizando a premissa simplificadora
de que a taxa de crescimento atual ficará constante. Imprima os resultados em uma tabela. A primeira coluna deve exibir os anos
do ano 1 ao ano 75. A segunda coluna deve exibir a população mundial esperada no fim desse ano. A terceira deve exibir o aumento numérico
na população mundial que ocorreria nesse ano. Utilizando os seus resultados, determine o ano em que a população dobraria com relação
ao número de hoje se a taxa de crescimento do ano atual persistisse.*/
import java.util.Scanner;

public class CrescimentoPopulacionalMundial 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
     
      System.out.println("Bem-vindo à calculadora da população mundial");
      System.out.print("Digite a população atual do mundo: ");
      long populacaoAtual = input.nextLong();
      System.out.print("Digite a taxa de crescimento atual: (e.g, 1.14% seria .0114): ");
      double TaxaDeCrescimento = input.nextDouble();

      int Ano = 1; // contador de ano
      System.out.printf("%4s%22s%24s%n", "Ano", "População Estimada", 
         "Mudança do ano anterior");
      
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

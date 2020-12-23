package estudo.cap04.ex04_23;

/*(Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores
entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]*/
import java.util.Scanner;

public class DoisMaiores
{
	// determina os dois maiores de 10 números
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
   // obtém o primeiro número e o atribui à variável maior
      System.out.print("Digite um número: ");
      int maior = input.nextInt();
      
   // obtém o segundo número e compara com o primeiro número
      System.out.print("Digite outro número: ");
      int numero = input.nextInt();

      int segundoMaior; // segundo maior numero

      if (numero > maior)
      {
         segundoMaior = maior;
         maior = numero;
      } // fim do if
      else
         segundoMaior = numero;

      int contador = 2; // numero de valores digitados

   // obtenha o resto dos números e encontre o maior e o próximoLargest
      while (contador < 10)
      {
         System.out.print("Digite um número: ");
         numero = input.nextInt();
         
         if (numero > maior) {
            segundoMaior = maior;
            maior = numero;
         }
         else if (numero > segundoMaior)
            segundoMaior = numero;

         ++contador;
      } 

      System.out.printf("Maior número é %d%nSegundo maior é %d%n",
         maior, segundoMaior);
   }
} // fim da classe DoisMaiores


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

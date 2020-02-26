package estudo.cap04.ex04_24;

// Exercise 4.24 Solution: Analysis.java
// Program performs analysis of examination results.
import java.util.Scanner; // program uses class Scanner

public class Analise 
{
	/*(Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores
	entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]*/
   public static void main(String[] args)
   {
	// cria Scanner para obter entrada da janela de comando
      Scanner input = new Scanner(System.in);

   // inicializando a declaração da variaveis
      int aprovados = 0; // numero de aprovados
      int reprovados = 0; // numero de reprovados
      int contadorEstudante = 1; // contador de estudantes

   // processar 10 alunos usando o loop controlado por contador
      while (contadorEstudante <= 10) 
      {
    	// solicitar ao usuário informações e obter valor do usuário
         System.out.print("Digite resultado (1 = aprovado, 2 = reprovado): ");
         int resultado = input.nextInt();

         // if...else aninhad em while 
         if (resultado == 1)
         {
            aprovados = aprovados + 1;
            contadorEstudante = contadorEstudante + 1;  
         } 
         else if (resultado == 2)
         {
            reprovados = reprovados + 1;
            contadorEstudante = contadorEstudante + 1;  
         } 
         else
            System.out.println("Entrada inválida");
      } 

   // fase de terminação; preparar e exibir resultados
      System.out.printf("Aprovados: %d%nReprovados: %d%n", aprovados, reprovados);

   // determinar se mais de 8 alunos passaram
      if (aprovados > 8)
         System.out.println("Bonus para o instrutor!");
   }
} // fim da classe Analise


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

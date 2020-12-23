package estudo.cap04.ex04_29;

/*(Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um
quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis
entre 1 e 20.*/
import java.util.Scanner;

public class Vazio
{
	// desenhe uma caixa oca rodeada de estrelas
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
   // solicitar e ler o comprimento do lado do usuário
      System.out.print("Digite o comprimento dos lado:");
      int asteriscos = input.nextInt(); // numero de asteriscos de um lado

      if (asteriscos < 1)
      {
         asteriscos = 1;
         System.out.printf("Entrada Inválida%nUsando valor padrão 1%n");
      } 
      else if (asteriscos > 20)
      {
         asteriscos = 20;
         System.out.printf("Entrada Inválida%nUsando valor padrão 20%n");
      } 
      
      int linha = 1;    // a linha atual do quadrado sendo impresso

   // repita para quantas linhas o usuário tiver inserido
      while (linha <= asteriscos)
      {
         int coluna = 1; // a coluna atual do quadrado sendo impresso
         
      // e para tantas colunas quanto linhas        
         while (coluna <= asteriscos)
         {
            if (linha == 1)
               System.out.print("*");
            else if (linha == asteriscos)
               System.out.print("*");
            else if (coluna == 1)
               System.out.print("*");
            else if (coluna == asteriscos)
               System.out.print("*");
            else
               System.out.print(" ");

            coluna++;
         } 

         System.out.println();
         linha++;
      } 
   } 
} // fim da classe Vazio



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

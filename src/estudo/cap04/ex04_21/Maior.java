package estudo.cap04.ex04_21;
/*(Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um
programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor
que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada
uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:
a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 números
foram processados).
b) number: o inteiro mais recentemente inserido pelo usuário.
c) largest: o maior número encontrado até agora.*/
import java.util.Scanner;

public class Maior
{
	// determina o maior dos 10 números
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
   // obtém o primeiro número e o atribui à variável maior
      System.out.print("Digite um número: ");
      int maior = input.nextInt();

      int contador = 1;

   // obtenha o resto dos números e encontre o maior
      while (contador < 10)
      {
         System.out.print("Digite um número: ");
         int numero = input.nextInt();

         if (numero > maior)
            maior = numero;

         ++contador;
      } 

      System.out.printf("O maior número é %d%n", maior);
   } 
} //fim da classe maior


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

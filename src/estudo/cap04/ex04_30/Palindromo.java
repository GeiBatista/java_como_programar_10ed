package estudo.cap04.ex04_30;

import java.util.Scanner;

/*(Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por
exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em
um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de
erro e permita que o usuário insira um novo valor.
import java.util.Scanner;*/

public class Palindromo
{
	// verifica se um número de 5 dígitos é um palíndromo
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int numeros = 0;
      int digitos = 0;

   // Peça um número até que ele tenha cinco dígitos
      while (digitos != 5)
      {
         System.out.print("Digite um numero de 5-digitos: ");
         numeros = input.nextInt();

         if (numeros < 100000)
         {
            if (numeros > 9999)
               digitos = 5;
            else
               System.out.println("Numero deve ter 5 dígitos");
         } 
         else
            System.out.println("Numero deve ter 5 dígitos");
      } 

   // obter os dígitos
      int digit1 = numeros / 10000;
      int digit2 = numeros % 10000 / 1000;
      int digit4 = numeros % 10000 % 1000 % 100 / 10;
      int digit5 = numeros % 10000 % 1000 % 100 % 10;

   // imprime se o número é um palíndromo
      System.out.print(numeros);

      if (digit1 == digit5)
      {
         if (digit2 == digit4)
            System.out.println(" é um palindromo!!!");
         else
            System.out.println(" não é um palindromo.");
      }
      else
         System.out.println(" não é um palindromo.");
   } 
} // fim da Palindromo


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

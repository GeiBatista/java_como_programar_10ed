package estudo.cap04.ex04_31;
/*(Imprimindo o equivalente decimal de um n�mero bin�rio) Escreva um aplicativo que insere um n�mero inteiro que cont�m somente
0s e 1s (isto �, um n�mero inteiro bin�rio) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divis�o para
pegar os d�gitos do n�mero bin�rio um de cada vez da direita para a esquerda. No sistema de n�meros decimais, o d�gito mais � direita
tem um valor posicional de 1 e o pr�ximo d�gito � esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
n�mero decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de n�mero bin�rio, o d�gito mais � direita tem um
valor posicional de 1, o pr�ximo d�gito � esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
do bin�rio 1.101 � 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]*/

import java.util.Scanner;

public class Binario
{
	// converte um n�mero bin�rio em decimal
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int bit = 1; // valor posicional do bit
      int decimal = 0; // valor decimal

   // solicitar e ler em um n�mero bin�rio
      System.out.print("Digite um n�mero binario: ");
      int binario = input.nextInt(); // valor binario

      // converte para o decimal equivalente
      while (binario != 0)
      {
         decimal += binario % 10 * bit;
         binario /= 10;
         bit *= 2;
         System.out.println(decimal);
      } 

      System.out.printf("Decimal �: %d%n", decimal);
   } 
} // fim da classe Binario


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

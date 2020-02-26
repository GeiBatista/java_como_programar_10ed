package estudo.cap04.ex04_37.parte_c;
/*Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.

*/import java.util.Scanner;

public class EtoX
{
	// aproxima o valor de e para x
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int numero = 1;
      int fatorial = 1;
      double e = 1.0;
      double expoente = 1.0;

      System.out.print("Digite o expoente: ");
      int x = input.nextInt();

      System.out.print("Digite a precisão desejada de e: ");
      int precisao = input.nextInt();
      
      // calculate estimation
      while (numero < precisao)
      {
         expoente *= x;
         fatorial *= numero;
         e += expoente / fatorial;
         ++numero;
      } 

      System.out.printf("e para o expoente %d é %f%n", x, e);
   } 
} // end class EtoX


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

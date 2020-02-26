package estudo.cap04.ex04_37.parte_b;

/*b) Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a seguir. Permita ao usuário inserir o número
de termos a calcular.
*/
import java.util.Scanner;

public class E
{
	// aproxima o valor de E
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int numero = 1;
      int fatorial = 1;
      double e = 1.0;

      System.out.print("Insira a precisão desejada de e:");
      int precisao = input.nextInt();
      
   // calcular estimativa
      while (numero < precisao)
      {
         fatorial *= numero;
         e += 1.0 / fatorial;
         numero++;
      } 

      System.out.print("e  ");
      System.out.println(e);      
   } // fim de main
} // fim da classe E


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

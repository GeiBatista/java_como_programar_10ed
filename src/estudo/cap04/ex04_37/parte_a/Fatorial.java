package estudo.cap04.ex04_37.parte_a;

/*a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.*/
import java.util.Scanner;

public class Fatorial
{
	// calcula o fatorial de um número
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int fatorial = 1;

      System.out.print("Digite um inteiro positivo: ");
      int numero = input.nextInt();
      
      System.out.printf("%d! é ", numero);

      // calculate factorial
      while (numero > 1)
      {
         fatorial *= numero;
         numero--;
      } 

      System.out.println(fatorial);
   }
} // end class Fatorial


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

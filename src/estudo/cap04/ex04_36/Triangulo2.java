package estudo.cap04.ex04_36;
/*(Lados de um triângulo direito) Escreva um aplicativo que lê três inteiros diferentes de zero, determina e imprime se eles poderiam
representar os lados de um triângulo direito.*/
import java.util.Scanner;

public class Triangulo2
{
	// verifica se três lados podem formar um triângulo
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      // obtém valores de três lados
      System.out.print("Digite o lado 1: ");
      int lado1 = input.nextInt();

      System.out.print("Digite o lado 2: ");
      int lado2 = input.nextInt();

      System.out.print("Digite o lado 3: ");
      int lado3 = input.nextInt();
      

   // esquadre os lados
      int side1Square = lado1 * lado1;
      int side2Square = lado2 * lado2;
      int side3Square = lado3 * lado3;

   // testa se eles formam um triângulo retângulo
      boolean eTrianguloRetangulo = false;

      if ((side1Square + side2Square) == side3Square)
        eTrianguloRetangulo = true;
      else if ((side1Square + side3Square) == side2Square)
         eTrianguloRetangulo = true;
      else if ((side2Square + side3Square) == side1Square)
         eTrianguloRetangulo = true;
      
      if (eTrianguloRetangulo)
         System.out.println("These are the sides of a right triangle.");
      else 
         System.out.println("These do not form a right triangle.");      
   } // end main
} // end class Triangulo2


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

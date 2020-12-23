package estudo.cap04.ex04_35;

/*(Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, determina e imprime se eles
poderiam representar os lados de um triângulo.*/
import java.util.Scanner;

public class Triangulo1
{
	// verifica se três lados podem formar um triângulo
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
 
   // obtém valores de três lados
      System.out.print("Enter side 1: ");
      double lado1 = input.nextDouble();

      System.out.print("Enter side 2: ");
      double lado2 = input.nextDouble();

      System.out.print("Enter side 3: ");
      double lado3 = input.nextDouble();

      // triangle testing
      boolean eTriangulo = false;
      
      if (lado1 + lado2 > lado3)
      {
         if (lado2 + lado3 > lado1)
         {
            if (lado3 + lado1 > lado2)
               System.out.println("Estes podem ser lados de um triângulo ");
            else 
               System.out.println("Estes não formam um triângulo.");         
         } 
      }
   } 
} // end class Triangulo1


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

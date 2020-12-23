package estudo.cap04.ex04_20;
/*(Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados.*/

import java.util.Scanner;

public class Salarios
{
	// calcula salários para 3 funcionários
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int contador = 1; // numero de empregados

   // repita o cálculo para 3 funcionários
      while (contador <= 3)
      {
         System.out.print("Digite o valor da hora: ");
         double valorHora = input.nextDouble(); 
         
         System.out.printf("Digite quantidade de horas trabalhadas: ");
         double horas = input.nextDouble(); 

         double pagamento; // pagamento bruto

      // calcula salários
         if (horas > 40) // com horas extras
            pagamento = (40.0 * valorHora) + (horas - 40) * (valorHora * 1.5);
         else // sem horas extras
            pagamento = horas * valorHora;

      // imprime o pagamento para o empregado atual
         System.out.printf("Pagamento para o empregado %d é R$%.2f%n", contador, pagamento);

         ++contador;
      } 
   } 
} // end class Wages


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

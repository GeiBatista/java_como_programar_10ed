package estudo.cap04.ex04_19;

/*(Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas
recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de vendas
de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens
vendidos por cada vendedor. Os valores desses itens são como segue:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula e exibe os rendimentos
do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.*/

import java.util.Scanner;

public class Vendas {
	// calcula vendas por produtos individuais
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double vendaBruta = 0.0; // total de venda bruta
		double ganhos; // ganhos com vendas
		int produto = 0; // numero do produto
		int numeroVendido; // número vendido de um dado produto

		while (produto < 4) {
			++produto;

			// solicitar e ler o número do produto vendido do usuário
			System.out.printf("Digite o número de produtos vendidos #%d: ", produto);
			numeroVendido = input.nextInt();

			// determinar a venda bruta de cada produto individual e adicionar ao total
			if (produto == 1)
				vendaBruta += numeroVendido * 239.99;
			else if (produto == 2)
				vendaBruta += numeroVendido * 129.75;
			else if (produto == 3)
				vendaBruta += numeroVendido * 99.95;
			else if (produto == 4)
				vendaBruta += numeroVendido * 350.89;
		}

		ganhos = 0.09 * vendaBruta + 200; // calcula ganhos
		System.out.printf("Ganhos essa semana: $%.2f%n", ganhos);
	}
} // fim da classe venda

/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/

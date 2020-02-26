package estudo.cap04.ex04_17;

import java.util.Scanner;

/*(Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou
várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.*/

public class Combustivel {

	// executa cálculos de milhas por litro
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int totalQuilometros = 0; // total de quilometros por viagem
		int totalLitros = 0; // total de litros por viagem

		// solicita ao usuário a quilometragem e obtém a entrada do mesmo
		System.out.print("Digite os quilômetros (-1 para sair): ");
		int quilometros = input.nextInt(); // quilometros por tanque cheio

		// sai se a entrada for -1; caso contrário, continue com o programa
		while (quilometros != -1) {
			// solicitar ao usuário a quantidade de litros gastos e obter a entrada do mesmo
			System.out.print("Digite os lítros: ");
			int litros = input.nextInt(); // lítros por tanque cheio

			// adiciona litros e quilômetrs  desse tanque ao total
			totalQuilometros += quilometros;
			totalLitros += litros;

			// calcula quilômetros por litro para o tanque atual
			if (litros != 0) {
				double quilometrosPorLitro = (double) quilometros / litros;
				System.out.printf("KPL desse tanque cheio: %.2f%n", quilometrosPorLitro);
			}

			// calcula quilômetros por lítro para a viagem total
			if (totalLitros != 0) {
				double totalquilometrosPorLitro = (double) totalQuilometros / totalLitros;
				System.out.printf("Total KPL: %.2f%n", totalquilometrosPorLitro);
			}

			// solicitar ao usuário um novo valor para quilômetros
			System.out.print("Digite os quilômetros (-1 to quit): ");
			quilometros = input.nextInt();
		}
	}
} // fim da classe Combustivel

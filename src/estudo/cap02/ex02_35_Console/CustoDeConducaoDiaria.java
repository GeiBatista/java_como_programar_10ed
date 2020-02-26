package estudo.cap02.ex02_35_Console;

import java.util.Scanner;
//Determinar o custo de condução diária com base no total de quilometros percorridos por dia,
//custo por litro de gasolina, média de quilôlemtros por litro, taxas de estacionamento por dia
//e pedágios por dia.
public class CustoDeConducaoDiaria {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int quilometrosDirigidos; // quilômetros dirigidos por dia
		int valorPorLitro; // valor do litro de gasolina (em centavos)
		int mediaQuilometrosPorLitro; // quilômetros médios por litro de gasolina
		int taxaEstacionamento; // taxa de estacionamento por dia
		int pedagios; // pedágios por dia

		System.out.println("Bem-vindo à calculadora do Custo Diário de Condução");
		System.out.print("Digite o número de quilômetros que você dirige por dia: ");
		quilometrosDirigidos = entrada.nextInt();
		System.out.print("Digite o valor por lítro de gasolina (em centavos): ");
		valorPorLitro = entrada.nextInt();
		System.out.print("Digite a média de km por litro de gasolina: ");
		mediaQuilometrosPorLitro = entrada.nextInt();
		System.out.print("Digite a taxa de estacionamento por dia (em centavos): ");
		taxaEstacionamento = entrada.nextInt();
		System.out.print("Digite o valor de pedágio por dia (em centavos): ");
		pedagios = entrada.nextInt();

		// calcular e exibir o custo de condução diário
		System.out.printf("%nSeu custo de condução diario é $%.2f%n",
				valorPorLitro / 100.0 * quilometrosDirigidos / mediaQuilometrosPorLitro + taxaEstacionamento / 100.0 + pedagios / 100.0);

	}

}
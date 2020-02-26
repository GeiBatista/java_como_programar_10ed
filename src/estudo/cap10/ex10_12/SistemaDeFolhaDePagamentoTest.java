package estudo.cap10.ex10_12;

import java.util.Scanner;

import exemplos.cap10.Fig10_04_09.BasePlusCommissionEmployee;
import exemplos.cap10.Fig10_04_09.Employee;

public class SistemaDeFolhaDePagamentoTest {

	public static void main(String[] args) {

		EmpregadoAssalariado assalariado = 
				new EmpregadoAssalariado(
				"Vini", "Batista", "111.111.111-11", 28, 07, 1995, 800.00);
		EmpregadoHorista horista =
				new EmpregadoHorista(
				"Luna", "Sarno", "222.222.222-22", 16, 11, 2011, 16.75, 40);
		EmpregadoComissionado comissionado = 
				new EmpregadoComissionado(
				"Geisi", "Batista", "333.333.333-33",03, 01, 2000, 10000,	.06);
		EmpregadoAssalariadoComissionado assalariadoComissionado = 
				new EmpregadoAssalariadoComissionado(
				"Luiza", "Sarno", "444.444.444-44",28, 02, 2002, 5000, .04, 300);

		System.out.println("Empregados processados ​​individualmente:");

		System.out.printf("%n%s%n%s: $%,.2f%n%n", assalariado, "ganhos", assalariado.salario());
		System.out.printf("%s%n%s: $%,.2f%n%n", horista, "ganhos", horista.salario());
		System.out.printf("%s%n%s: $%,.2f%n%n", comissionado, "ganhos", comissionado.salario());
		System.out.printf("%s%n%s: $%,.2f%n%n", assalariadoComissionado, "ganhos", assalariadoComissionado.salario());

		Empregado[] empregados = new Empregado[4];

		empregados[0] = assalariado;
		empregados[1] = horista;
		empregados[2] = comissionado;
		empregados[3] = assalariadoComissionado;
		
		Scanner input = new Scanner(System.in); // to get current month
	      int mesAtual;

	      // get and validate current month
	      do
	      {
	         System.out.print("Digite mÊs atual (1 - 12): ");
	         mesAtual = input.nextInt();
	         System.out.println();
	      } while ((mesAtual < 1) || (mesAtual > 12));

		System.out.printf("Empregados processados polimorficamente:%n%n");

		for (Empregado empregadoAtual : empregados) {
			System.out.println(empregadoAtual);

			// determine whether element is a BasePlusCommissionEmployee
			if (empregadoAtual instanceof EmpregadoAssalariadoComissionado) {
				// downcast Employee reference to
				// BasePlusCommissionEmployee reference
				EmpregadoAssalariadoComissionado empregado = (EmpregadoAssalariadoComissionado) empregadoAtual;

				double oldSalarioBase = empregado.getSalarioBase();
				empregado.setSalarioBase(1.10 * oldSalarioBase);

				System.out.printf("novo salário com 10%% de aumento é: $%,.2f%n", empregado.getSalarioBase());
				 if (mesAtual == empregadoAtual.getDataDeNascimento().getMes())
			            System.out.printf(
			               "earned $%,.2f %s\n\n", empregadoAtual.salario(), 
			               "plus $100.00 birthday bonus");
			         else
			            System.out.printf(
			               "earned $%,.2f\n\n", empregadoAtual.salario());
			      } // end for


		for (int j = 0; j < empregados.length; j++)
			System.out.printf("Empregado %d é um %s%n", j, empregados[j].getClass().getName());
		}
	}

}

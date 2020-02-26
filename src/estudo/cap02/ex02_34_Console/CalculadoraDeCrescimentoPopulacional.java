package estudo.cap02.ex02_34_Console;

import java.util.Scanner;

//Utilize a internet para descobrir a população mundial atual e a taxa de crescimento
//demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada
//depois de um, dois, três, quatro e cinco anos.
public class CalculadoraDeCrescimentoPopulacional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double populacaoCorrente;
		double taxaDeCrescimento;
		double populacaoFutura;
		
		System.out.println("Bem-vindo à calculadora da população mundial");
		System.out.print("Informe à população mundial atual: ");
		populacaoCorrente = entrada.nextDouble();
		System.out.println("Digite à taxa de crescimento atual");
		System.out.print("(ex.:, 1.14% deverá ser digitado como ,0114): ");
		taxaDeCrescimento = entrada.nextDouble();
		
		populacaoFutura = populacaoCorrente * (1 + taxaDeCrescimento);
		 System.out.printf("Depois de 1 Ano, a população mundial será %.0f%n",populacaoFutura);

		 populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento);
		 System.out.printf("Depois de 2 Anos, a população mundial será %.0f%n",populacaoFutura);
		 
		 populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento);
		 System.out.printf("Depois de 3 Anos, a população mundial será %.0f%n",populacaoFutura);
		 
		 populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento);
		 System.out.printf("Depois de 4 Anos, a população mundial será %.0f%n",populacaoFutura);
		 
		 populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento);
		 System.out.printf("Depois de 5 Anos, a população mundial será %.0f%n",populacaoFutura);




	}

}

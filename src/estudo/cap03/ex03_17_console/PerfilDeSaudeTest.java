package estudo.cap03.ex03_17_console;

import java.util.Scanner;
import exercicios_resolvidos.cap03.ex03_17.HealthProfile;

public class PerfilDeSaudeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = input.next();
		System.out.print("Digite o sobrenome: ");
		String sobreNome = input.next();
		System.out.print("Digite o sexo: ");
		String sexo = input.next();
		System.out.print("Digite a altura em metros: ");
		double altura = input.nextDouble();
		System.out.print("Digite o peso em Kg: ");
		double peso = input.nextDouble();
		System.out.print("Digite o ano de nascimento: ");
		int aniversario = input.nextInt();
		System.out.print("Digite o ano atual: ");
		int anoAtual = input.nextInt();

		PerfilDeSaude pessoa = new PerfilDeSaude(nome, sobreNome, sexo, aniversario, anoAtual,  altura, peso);

		pessoa.exibirPerfilDeSaude();
	}
}

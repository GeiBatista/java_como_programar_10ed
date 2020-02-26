package estudo.cap03.ex03_11;

import java.util.Scanner;

public class ContaTest {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Jane Green", 50.00);
		Conta conta2 = new Conta("John Blue", -7.53);

		// exibe o saldo inicial de cada objeto
		System.out.printf("%s saldo: $%.2f%n", conta1.getConta(), conta1.getSaldo());
		System.out.printf("%s saldo: $%.2f%n%n", conta2.getConta(), conta2.getSaldo());

		// cria um Scanner para obter entrada da janela de comando
		Scanner input = new Scanner(System.in);

		System.out.print("Insira o valor de retirada da conta1: "); // prompt
		double valorDeSaque = input.nextDouble(); // obtêm entrada do usuário
		System.out.printf("%nsubtraindo %.2f do saldo da conta1%n", valorDeSaque);
		conta1.saque(valorDeSaque); // subtraindo valor da conta1

		// exibição de saldo
		System.out.printf("%s saldo: $%.2f%n", conta1.getConta(), conta1.getSaldo());
		System.out.printf("%s saldo: $%.2f%n%n", conta2.getConta(), conta2.getSaldo());

		System.out.print("Insira o valor de retirada da conta2: "); // prompt
		valorDeSaque = input.nextDouble(); // obtêm entrada do usuário
		System.out.printf("%nsubtraindo %.2f do saldo da conta2%n", valorDeSaque);
		conta1.saque(valorDeSaque); // subtraindo valor da conta1

		// exibição de saldo
		System.out.printf("%s saldo: $%.2f%n", conta1.getConta(), conta1.getSaldo());
		System.out.printf("%s saldo: $%.2f%n%n", conta2.getConta(), conta2.getSaldo());
	}
}

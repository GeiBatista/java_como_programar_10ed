package estudo.cap03.ex03_15;

import java.util.Scanner;
//import estudo.cap03.exer3_15.Conta;

public class ContaTest {

		
	public static void main(String[] args) {
		Conta conta1 = new Conta("Maria", 50.00);
		Conta conta2 = new Conta("João",-7.53);
		
		mostrarConta(conta1);
		mostrarConta(conta2);
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do depósito para conta1: ");
		double vlrDeposito = entrada.nextDouble();
		System.out.printf("%nAdicionando %.2f ao Saldo da Conta1%n%n", vlrDeposito);
		conta1.deposito(vlrDeposito);
		
		mostrarConta(conta1);
		mostrarConta(conta2);
		
		System.out.print("Digite o valor do depósito para conta2: ");
		vlrDeposito = entrada.nextDouble();
		System.out.printf("%nAdicionando %.2f ao Saldo da Conta2%n%n", vlrDeposito);
		conta2.deposito(vlrDeposito);
		
		mostrarConta(conta1);
		mostrarConta(conta2);
				
	}
	public static void mostrarConta(Conta exibirConta)
	{
		System.out.printf("Saldo da %s = R$%.2f%n", 
				exibirConta.getNome(),
				exibirConta.getSaldo());
		
	}

}

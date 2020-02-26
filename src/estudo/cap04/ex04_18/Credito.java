package estudo.cap04.ex04_18;
/*(Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o
limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e
determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve
exibir a mensagem "Limite de crédito excedido".*/

import java.util.Scanner;

public class Credito 
{
	// calcula o saldo em várias contas de crédito
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número da conta (ou -1 para sair): ");
		int conta = input.nextInt(); // leia o umero da conta

		// sai se a entrada for -1; caso contrário, continue com o programa
		while (conta != -1) {
			System.out.print("Digite o saldo: ");
			double saldoAntigo = input.nextDouble(); // leia no saldo original

			System.out.print("Digite uma compra: ");
			double cobrancas = input.nextDouble(); // leia em cobrancas

			System.out.print("Digite um pagamento: ");
			double pagamentos = input.nextDouble(); // leia em pagamentos

			System.out.print("Digite o limite de crédito: ");
			double 	limiteDeCredito = input.nextDouble(); // leia em limite de credito

			// calcula e exibe o novo saldo
			double novoSaldo = saldoAntigo + cobrancas - pagamentos;
			System.out.printf("O novo saldo é: $%.2f%n", novoSaldo);

			// exibe um aviso se o usuário exceder o limite de crédito
			if (novoSaldo > limiteDeCredito)
				System.out.println("Limite de crédito excedido");

			System.out.print("Digite o número da conta (ou -1 para sair): ");
			conta = input.nextInt(); // leia o numero da proxima conta
		}
	}
} // fim da classe Credito

package estudo.cap03.ex03_11;
//Modifique a classe Account (Figura 3.8) para fornecer um método chamado saque que retira dinheiro
//de uma Conta. Assegure que o valor de débito não exceda o saldo de Conta. Se exceder, o saldo deve ser deixado inalterado
//e o método deve imprimir uma mensagem que indica "O montante de saque excedeu o saldo da conta" [Valor de débito
//excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw.
public class Conta {

	private String conta;
	private double saldo;

	public Conta(String conta, double saldo) {
		this.conta = conta; // atribui nome ao nome da variável de instância

		// valida que o saldo é maior que 0,0; se não for,
		// o saldo da variável da instância mantém seu valor inicial padrão de 0.0
		if (saldo > 0.0) // se o saldo for válido
			this.saldo = saldo; // atribui ao balanceamento de variável de instância
	}

	// método que deposita (adiciona) apenas um valor válido no saldo
	public void deposito(double valorDeDeposito) {
		if (valorDeDeposito > 0.0) // se o valor do depósito for válido
			saldo = saldo + valorDeDeposito; // será adicionado ao caldo
	}

	// retira uma quantia da conta
	public void saque(double valorDeSaque) {
		if (valorDeSaque > saldo)
			System.out.println("Valor do saque excedeu o saldo da conta.");

		if (valorDeSaque <= saldo)
			saldo = saldo - valorDeSaque;
	}

	// método retorna o saldo da conta
	public double getSaldo() {
		return saldo;
	}

	// método que configura a conta
	public void setConta(String conta) {
		this.conta = conta;
	}

	// método retorna a conta
	public String getConta() {
		return conta;
	}
}

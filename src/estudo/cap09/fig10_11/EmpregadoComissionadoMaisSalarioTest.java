package estudo.cap09.fig10_11;

import estudo.cap09.fig09_06_07.EmpregadoComissionadoMaisSalarioBase;

public class EmpregadoComissionadoMaisSalarioTest {

	public static void main(String[] args) {

		EmpregadoComissionadoMaisSalarioBase empregado = new EmpregadoComissionadoMaisSalarioBase("Luna",
				"Sarno Batista", "333-33-3333", 5000, .04, 300);

		System.out.println("Informações do funcionário obtidas pelos métodos get:");
		System.out.printf("%n%s %s%n", "Primeiro nome é: ", empregado.getNome());
		System.out.printf("%s %s%n", "Sobrenome é", empregado.getSobrenome());
		System.out.printf("%s %s%n", "O número do seguro social é", empregado.getSeguroSocial());
		System.out.printf("%s %.2f%n", "Venda Bruta é", empregado.getVendaBruta());
		System.out.printf("%s %.2f%n", "Comissão é", empregado.getComissao());
		System.out.printf("%s %.2f%n", "Base salary is", empregado.getSalarioBase());

		empregado.setSalarioBase(1000);

		empregado.setVendaBruta(500);
		empregado.setComissao(.1);

		System.out.printf("%n%s:%n%n%s%n", "Informações atualizadas sobre os funcionários obtidas pelo toString",
				empregado.toString());
	}

}

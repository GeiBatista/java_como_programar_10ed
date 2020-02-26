package estudo.cap03.ex03_13;

public class EmpregadoTest {

	public static void main(String[] args) {

		Empregado empregado1 = new Empregado("Gei", "Batista", 5253.54);
		Empregado empregado2 = new Empregado("Barbara", "Sarno", 8267.40);
								
		// exibe funcionários
		System.out.printf("O salário Anual de %s %s é: %.2f%n", 
				empregado1.getNome(),empregado1.getSobrenome(),empregado1.getSalariomensal() * 12);
		System.out.printf("O salário Anual de %s %s é: %.2f%n%n", 
				empregado2.getNome(),empregado2.getSobrenome(),empregado2.getSalariomensal() * 12);
		
		// aumenta os salários dos empregados em 10%
	      System.out.printf("%nAumentando os salários dos empregados em 10%%%n");
	      empregado1.setSalariomensal(empregado1.getSalariomensal() * 1.10);
	      empregado2.setSalariomensal(empregado2.getSalariomensal() * 1.10);
			
		// exibe funcionários com salário atualizado
		System.out.printf("O salário Anual de %s %s é: %.2f%n", 
				empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalariomensal() * 12);
		System.out.printf("O salário Anual de %s %s é: %.2f%n%n", 
				empregado2.getNome(),empregado2.getSobrenome(), empregado2.getSalariomensal() * 12);
		
		
	}

}

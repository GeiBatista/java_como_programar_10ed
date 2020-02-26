package estudo.cap03.ex03_16_console;

public class FrequenciaCardiacaTest {

	public static void main(String[] args) {

		FrequenciaCardiaca gei = new FrequenciaCardiaca("Gei", "Batista", 1968, 2018);
		
		System.out.printf("Nome: %s%n", gei.getNome());
	      System.out.printf("Sobrenome: %s%n", gei.getSobrenome());
	      System.out.printf("Idade: %d%n", gei.getIdade());
	      System.out.printf("Frequência cardíaca máxima: %d%n", gei.getFrequenciaCardiacaMaxima());
	      System.out.println("Faixa de frequência cardíaca alvo:");
	      System.out.printf("   Minima: %.0f%n", gei.getFrequenciaCardiacaAlvoMinima());
	      System.out.printf("   Máxima: %.0f%n", gei.getFrequenciaCardiacaAlvoMaxima());
	}

}

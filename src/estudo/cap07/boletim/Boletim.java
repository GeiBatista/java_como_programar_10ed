package estudo.cap07.boletim;

public class Boletim {

	private String curso; // nome do curso que esse Boletim representa
	private int[] notas; // array de notas do aluno

	// construtor
	public Boletim(String curso, int[] notas) {
		this.curso = curso;
		this.notas = notas;
	}

	// m�todo para configurar o nome do curso
	public String getCurso() {
		return curso;
	}

	// m�todo para recuperar o nome do curso
	public void setCurso(String curso) {
		this.curso = curso;
	}

	// realiza v�rias opera��es nos dados
	public void notasDoProcesso() {
		// gera sa�da de array de notas
		saidaDeNotas();

		System.out.printf("%nM�dia da Classe � %.2f%n", getMedia());

		// chama m�todos getMinimum e getMaximum
		System.out.printf("A menor nota � %d%nA maior nota � %d%n%n", getMinimum(), getMaximum());

		saidaGraficoBarras();
	}

	private void saidaGraficoBarras() {
		System.out.println("Distribui��o de Notas:");

		// armazena frequ�ncia de notas em cada intervalo de 10 notas
		int[] frequencia = new int[11];

		// para cada nota, incrementa a frequ�ncia apropriada�
		for (int nota : notas)
			++frequencia[nota / 10];

		// para cada frequ�ncia de nota, imprime barra no gr�fico
		for (int count = 0; count < frequencia.length; count++) {
			// gera sa�da do r�tulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

			// imprime a barra de asteriscos
			for (int stars = 0; stars < frequencia[count]; stars++)
				System.out.print("*");

			System.out.println();
		}
	}

	private Object getMinimum() {
		int menorNota = notas[0]; // sup�e que notas[0] � a menor nota

		// faz um loop pelo array de notas
		for (int nota : notas) {
			if (nota < menorNota)
				menorNota = nota;
		}
		return menorNota;
	}

	private Object getMaximum() {
		int maiorNota = notas[0];

		for (int nota : notas) {
			if (nota > maiorNota)
				maiorNota = nota;
		}
		return maiorNota;
	}

	// gera a sa�da do conte�do do array de notas
	private void saidaDeNotas() {
		System.out.printf("As notas s�o:%n%n");

		// gera a sa�da da nota de cada aluno
		for (int estudante = 0; estudante < notas.length; estudante++)
			System.out.printf("Estudante %2d: %3d%n", estudante + 1, notas[estudante]);
	}

	private double getMedia() {

		int total = 0;

		for (int nota : notas)
			total += nota;

		return (double) total / notas.length;
	}

}

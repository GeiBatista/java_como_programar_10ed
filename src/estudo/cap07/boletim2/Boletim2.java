package estudo.cap07.boletim2;

public class Boletim2 {

	private String curso; // nome do curso que esse boletim representa
	private int[][] notas; // array bidimensional de notas de alunoÿ

	// construtor de dois argumentos inicializa curso e array de notas
	public Boletim2(String curso, int[][] notas) {
		this.curso = curso;
		this.notas = notas;
	}

	// Método para recuperar o nome do curso
	public String getCurso() {
		return curso;
	}

	// método para configurar o nome do curso
	public void setCurso(String curso) {
		this.curso = curso;
	}

	// série de chamadas de método que geram um relatório que resume as notas.
	public void notasDoCurso() {

		// Gera saída de array de notas
		saidaDeNotas();

		// Chama os métodos getMinimo e getMaximo
		System.out.printf("%n%s %d%n%s %d%n%n", "A menor nota no Boletim2 é ", getMinimo(),
				"A maior nota no Boletim2 é ", getMaximo());

		// Chama o método getMédia para calcular a nota média
		System.out.printf("%nA média da classe é %.2f%n", getMedia());

		// chama saidaDeCodigoDeBarras Para imprimir gráfico de distribuição de notas
		saidaDeCodigoDeBarras();
	}


	private void saidaDeCodigoDeBarras() {
		// TODO Auto-generated method stub

	}

	private Object getMedia() {
		// TODO Auto-generated method stub
		return null;
	}

	// localiza nota máxima
	private Object getMaximo() {
		// supõe que o primeiro elemento de array de notas é o maior
		int maiorNota = notas[0][0];
		
		// faz um loop pelas linhas do array de notas
		for (int[] notasDoEstudante : notas) {
			// faz um loop pelas colunas da linha atual
			for (int nota : notasDoEstudante) {
				// se a nota for maior que highGrade, atribui essa nota a highGrade
				if (nota > maiorNota)
					maiorNota = nota;
			}
		}
		
		return maiorNota;
	}
	
	// localiza nota mínima
	private Object getMinimo() {
		
		// supõe que o primeiro elemento de array de notas é o menor
		int menorNota = notas[0][0];
		
		// faz um loop pelas linhas do array de notas 
		for (int[] notadoEstudante : notas) {
		
			// faz um loop pelas colunas da linha atual 
			for (int nota : notadoEstudante) {
				
				// se a nota for menor que lowGrade, atribui a nota a lowGradeÿ
				if (nota < menorNota)
					menorNota = nota;
			}
		}

		return menorNota;
	}

	private void saidaDeNotas() {

		// gera a saída do conteúdo do array de notas
		System.out.printf("As notas são:%n%n");
		System.out.print("            ");// alinha títulos de coluna

		// cria um título de coluna para cada um dos testes
		for (int teste = 0; teste < notas[0].length; teste++)
			System.out.printf("Test %d  ", teste + 1);

		System.out.println("Média"); // título da coluna de média do aluno

		// cria linhas/colunas de texto que representam notas de array
		for (int estudante = 0; estudante < notas.length; estudante++) {
			System.out.printf("Student %2d", estudante + 1);

			for (int teste : notas[estudante]) // gera saída de notas do aluno
				System.out.printf("%8d", teste);

			// chama método getAverage para calcular a média do aluno;
			// passa linha de notas como o argumento para getAverage
			double media = getMedia(notas[estudante]);
			System.out.printf("%9.2f%n", media);
		}

	}

	private double getMedia(int[] conjuntoDeNotas) {
		int total = 0;

		// soma notas de um aluno
		for (int nota : conjuntoDeNotas)
			total += nota;

		// retorna média de notas
		return 0;
	}
}

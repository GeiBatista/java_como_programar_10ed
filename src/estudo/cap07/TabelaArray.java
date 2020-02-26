package estudo.cap07;

public class TabelaArray {
	int[][] notas;

	public TabelaArray(int[][] notas) {
		this.notas = notas;
	}

	public void saidaDeNotas() {
		System.out.printf("As notas são:%n%n ");
		System.out.print("            ");

		for (int teste = 0; teste < notas[0].length; teste++)
			System.out.printf("Teste %d  ", teste + 1);
		
		System.out.println();

		for (int estudantes = 0; estudantes < notas.length; estudantes++) {
			System.out.printf("Estudante %2d", estudantes + 1);
			
			for(int teste : notas[estudantes])
				System.out.printf("%8d", teste);
			
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] notas = {{87, 96, 70},
                		{68, 87, 90},
                		{94, 100, 90},
                		{100, 81, 82},
                		{83, 65, 85},
                		{78, 87, 65},
                		{85, 75, 83}, 
                		{91, 94, 100},
                		{76, 72, 84},
                		{87, 93, 73}};
		
		TabelaArray tabela = new TabelaArray(notas);
		
		tabela.saidaDeNotas();
	}

}

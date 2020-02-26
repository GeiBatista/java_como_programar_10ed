package estudo.cap07.ex07_9;

public class Ex07_09 {

	public static void main(String[] args) {
		
		//int[][] t = new int[2][3];
		int[][] t = {{1,2,3},{4,5,6}};
		
		//i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
		/*for (int i = 0; i < t.length; i++) 
			for(int x = 0; x < t[i].length; x++)
				t[i][x] = 0;*/

		/*n) Escreva uma série de instruções que exibe o conteúdo de t no formato tabular. Liste os índices de coluna como títulos na parte superior
		   e liste os índices de linha à esquerda de cada linha.*/
		System.out.println("\t0\t1\t2\n");
		for (int i = 0; i < t.length; i++) {
			
			System.out.print("t" + i);
			
			for (int j = 0; j < t[i].length; j++) 
				System.out.printf("\t%d",t[i][j]);
			
			System.out.println();
			
			
		}
	}
	

}

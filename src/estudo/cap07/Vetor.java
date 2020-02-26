package estudo.cap07;

public class Vetor {

	public static void main(String[] args) {

		int[][] vetores = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };
		
		for (int[] vetor : vetores)
			for(int vetor1: vetor)
				System.out.println(vetores[1][1]);

//		for (int i = 0; i < vetores.length; i++) {
//			
//			for (int j = 0; j < vetores[i].length; j++) {
//				System.out.print(vetores[i][j]);
//			}
//			System.out.println();
//		}

	}

}

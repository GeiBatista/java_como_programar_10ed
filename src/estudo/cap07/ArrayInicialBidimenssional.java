package estudo.cap07;

public class ArrayInicialBidimenssional {

	public static void main(String[] args) {

		int[][] array1 = {{1,2,3},{4,5,6}};
		int[][] array2 = {{1,2},{3},{4,5,6}};
		
		System.out.printf("Valores em array1 por linha são:%n");
		saidaDeArray(array1);
	}

	public static void saidaDeArray(int [][] array) {
		
		// loop pelas linhas do array
		for(int linha = 0; linha < array.length; linha ++) {
						
			// loop pelas colunas do array
			for(int coluna = 0; coluna < array[linha].length; coluna++)
				System.out.printf("%d  ", array[linha][coluna]);

	         System.out.println();
		}
	}
}

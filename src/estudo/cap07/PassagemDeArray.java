package estudo.cap07;

public class PassagemDeArray {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5};
		
		System.out.printf("Efeitos da passagem de referência para array inteiro:%n"
				+ "O valor do array original é:%n");
		
		for(int valor : array) {
			System.out.printf("   %d", valor);
		}
		
		arrayModificado(array);
		System.out.printf("%n%nO valor do array modificado é:%n");
		
		for(int valor : array) {
			System.out.printf("   %d", valor);
		}
	}

	public static void arrayModificado(int[] array2) {
		for(int c = 0; c < array2.length; c++) {
			array2[c] *= 2;
		}
	}
	
	public static void elementoModificado() {
		
	}
}

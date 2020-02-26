package estudo.cap07;

public class InicializadorDeArray {

	public static void main(String[] args) {

		int[] array = {10, 16 , 13, 72, 15, 23, 89, 34, 99, 65 };
		
		System.out.printf("%s%8s%n", "Indice", "Array");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%6d%7d%n", i, array[i]);
		}
	}

}

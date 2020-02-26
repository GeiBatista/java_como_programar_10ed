package estudo.cap07;

public class ArrayInicial {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		System.out.println("123456789012345678901234567890");
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%6d%8d%n", i,array[i]);
		}
	}

}

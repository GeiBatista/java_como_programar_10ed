package estudo.cap07;

public class ArraySoma {

	public static void main(String[] args) {

		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.printf("Soma dos arrays: %d]", total);
	}

}

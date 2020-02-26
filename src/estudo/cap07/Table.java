package estudo.cap07;

public class Table {

	public static void main(String[] args) {

		final int ARRAY_SIZE = 3;
		
		int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];
		
		int total = 0;
		for (int x = 0; x < table.length; x++) {
			for (int y = 0; y < table[x].length; y++) {
				total =  table[x][y] = x + y;
			}
		}
		System.out.println(total);
		
		
	}

}

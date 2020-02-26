package estudo.cap07;

public class Fraction {

	public static void main(String[] args) {

		final int ARRAY_SIZE = 10;
		
		double[] fractions = new double[ARRAY_SIZE];
		
		fractions[4] = 0;
		fractions[9] = 1.667;
		fractions[6] = 3.333;
		
		double total = 0.0;
		for (int x = 0; x < fractions.length; x++) {
			total += fractions[x];
		}
		System.out.println(total);
		
	}

}

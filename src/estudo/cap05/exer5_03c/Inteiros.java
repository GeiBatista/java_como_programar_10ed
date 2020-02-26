package estudo.cap05.exer5_03c;

public class Inteiros {

	public static void main(String[] args) {

		int i = 1;
		
		while(i <= 20) {
			System.out.print(i);
			if(i % 5 == 0) 
			System.out.println();
			else
				System.out.printf("\t");
			++i;
		}
	}

}

package estudo.cap04.ex04_06;

public class Calcular {

	public static void main(String[] args) {

		int soma = 0;
		int x = 1;
		
		while(x <= 10) {
			
			soma += x;
			++x;
			System.out.printf("A soma parcial é: %d%n", soma);
			
		}
		
		 System.out.printf("A soma é: %d%n", soma);
	}

}

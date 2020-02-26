package estudo.cap05.exer5_11;

import java.util.Scanner;

public class MenorValor {

	public static void main(String[] args) {
		
		int cont;
		int nume;
		int menor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números: ");
		cont = entrada.nextInt();
		
		System.out.print("Número 1:  ");
		nume = entrada.nextInt();
		
		for(int i = 2; i <= cont; i++) {
			System.out.printf("Número %d: ", i);
			menor = entrada.nextInt();
			
			if (menor < nume)
				nume = menor;
		}
		
		System.out.printf("Menor = %d%n", nume);

	}

}

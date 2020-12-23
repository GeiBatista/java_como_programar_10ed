package estudo.cap14;

import java.util.Scanner;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: ");
		String entrada = sc.nextLine();
		
		if(ExpressoesRegulares.validarEntrada(entrada))
			System.out.println("Certinho!");
		else
			System.out.println("Errou!");
	}

}

package estudo.cap07.ex07_12;

import java.util.Scanner;

/*7.12 (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco
números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número
já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse problema.
Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo.*/
public class Unico {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[5]; // lista dos numeros Unicos
		int contador = 0; // numero de Unicos lidos

		while (contador < numeros.length) 
		{

			System.out.println("Digite um número:");
			int numero = entrada.nextInt();

			// validar a entrada
			if (10 <= numero && numero <= 100) 
			{

				// sinaliza se esse número já existe
				boolean contemNumero = false;

				// compara a entrada de número a entrada com números únicos no array
				for (int i = 0; i < contador; i++) 
					// se o novo número for duplicado, defina o sinalizador
					if (numero == numeros[i])
						contemNumero = true;

					// adiciona somente se o número já não estiver
					if (!contemNumero) {
						numeros[contador] = numero;
						contador++;
					} else
						System.out.printf("%d \njá foi inserido\n", numero);
				}
				 else
			            System.out.println("numero deve ser entre 10 e 100");
			         
			         // print the list
			         for (int i = 0; i < contador; i++)
			            System.out.printf("%d ", numeros[i]);
			         System.out.println();
			
		}

	}
}

package estudo.cap02.ex02_33_Console;

import java.util.Scanner;

public class IMCCalculadoraConsole {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int peso; 
		int altura; 
		int imc; 

		System.out.println("Bem-vindo à calculadora do índice de massa corporal (IMC)");
		System.out.print("Digite seu peso em Kg: ");
		peso = input.nextInt();
		System.out.print("Digite sua altura em Cm: ");
		altura = input.nextInt();

		imc = ((altura * altura) / (peso)) / 10;

		System.out.printf("Seu IMC é: %d%n%n", imc);
		System.out.println("IMC Valores");
		System.out.println("Baixo peso: menor do que 18.5");
		System.out.println("Normal:     entre 18.5 e 24.9");
		System.out.println("Sobrepeso:  entre 25 e 29.9");
		System.out.println("Obesidade:  30 ou mais");
	} 
}

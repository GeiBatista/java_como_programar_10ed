package estudo.cap04.ex04_38_console.parte_a;

import java.util.Scanner;

/*(Impondo privacidade com criptografia) O crescimento explosivo de comunica��o e armazenamento de dados na internet e em
computadores conectados por ela aumentou muito a preocupa��o com a privacidade. O campo da criptografia envolve a codifica��o de
dados para torn�-los dif�ceis de acessar (e espera-se � com os esquemas mais avan�ados � imposs�veis de acessar) para usu�rios sem
autoriza��o de leitura. Nesse exerc�cio, voc� investigar� um esquema simples para criptografar e descriptografar dados. Uma empresa que
quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos
com maior seguran�a. Todos os dados s�o transmitidos como inteiros de quatro d�gitos. Seu aplicativo deve ler um inteiro de quatro d�gitos
inserido pelo usu�rio e criptograf�-lo da seguinte maneira: substitua cada d�gito pelo resultado da adi��o de 7 ao d�gito, obtendo o restante
depois da divis�o do novo valor por 10. Troque ent�o o primeiro d�gito pelo terceiro e o segundo d�gito pelo quarto. Ent�o, imprima o
inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro d�gitos criptografado e o descriptografe
(revertendo o esquema de criptografia) para formar o n�mero original. [Projeto de leitura opcional: pesquise a �criptografia de chave
p�blica� em geral e o esquema de chave p�blica espec�fica PGP (Pretty Good Privacy). Voc� tamb�m pode querer investigar o esquema
RSA, que � amplamente usado em aplicativos robustos industriais.]*/
public class Criptografar {

	// criptografar um n�mero de quatro d�gitos
	   public static void main(String[] args)
	   {
	      Scanner input = new Scanner(System.in);
	      
	   // insira um n�mero de quatro d�gitos para ser criptografado
	      System.out.print("Digite um n�mero de quatro d�gitos: ");
	      int numero = input.nextInt();

	   // criptografar
	      int digito1 = (numero / 1000 + 7) % 10;
	      int digito2 = (numero % 1000 / 100 + 7) % 10;
	      int digito3 = (numero % 100 / 10 + 7) % 10;
	      int digito4 = (numero % 10 + 7) % 10;

	      int numeroCriptografado = digito1 * 10 + digito2 + 
	         digito3 * 1000 + digito4 * 100;

	      System.out.printf("Encrypted number is %d%n", numeroCriptografado);
	   } // fim de main
	} // fim da classe Criptografar
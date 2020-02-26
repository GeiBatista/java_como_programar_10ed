package estudo.cap04.ex04_38_console.parte_a;

import java.util.Scanner;

/*(Impondo privacidade com criptografia) O crescimento explosivo de comunicação e armazenamento de dados na internet e em
computadores conectados por ela aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a codificação de
dados para torná-los difíceis de acessar (e espera-se — com os esquemas mais avançados — impossíveis de acessar) para usuários sem
autorização de leitura. Nesse exercício, você investigará um esquema simples para criptografar e descriptografar dados. Uma empresa que
quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos
com maior segurança. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos
inserido pelo usuário e criptografá-lo da seguinte maneira: substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante
depois da divisão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, imprima o
inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado e o descriptografe
(revertendo o esquema de criptografia) para formar o número original. [Projeto de leitura opcional: pesquise a “criptografia de chave
pública” em geral e o esquema de chave pública específica PGP (Pretty Good Privacy). Você também pode querer investigar o esquema
RSA, que é amplamente usado em aplicativos robustos industriais.]*/
public class Criptografar {

	// criptografar um número de quatro dígitos
	   public static void main(String[] args)
	   {
	      Scanner input = new Scanner(System.in);
	      
	   // insira um número de quatro dígitos para ser criptografado
	      System.out.print("Digite um número de quatro dígitos: ");
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
package estudo.cap07.ex07_22.parte_a;

import java.util.Random;



public class Cavalo1
{	
	private static final Random numerosAleatorios = new Random();
	
	private static int[][] quadro; //tabuleiro
	
	//movimentos
	 private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	 private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
	 
	 //executar o passeio
	public static void main(String[] args)
	{
		int linhaAtual; // a posição da linha no tabuleiro de xadrez
		int colunaAtual; // a posição da coluna no tabuleiro de xadrez
		int numeroDoMovimento = 0; // o número do movimento atual
		
		quadro = new int[8][8]; // tabuleiro
		
		int linhaDeTeste; // posição da linha do próximo movimento possível
		int colunaDeTeste; // posição da coluna do próximo movimento possível
		
		// posição aleatória inicial do tabuleiro
		linhaAtual = numerosAleatorios.nextInt(8);
		colunaAtual = numerosAleatorios.nextInt(8);
				
		quadro[linhaAtual][colunaAtual] = ++numeroDoMovimento;
		boolean concluido = false;
		
		
		System.out.println();
		
		// continua até que o cavalo não possa mais se mover
		while (!concluido) 
		{
			boolean boaJogada = false;
			
			// verifica todos os movimentos possíveis até encontrarmos um que seja válido
			for (int tipoDeMovimento = 0; tipoDeMovimento < 8 && !boaJogada;
					tipoDeMovimento++)
			{
				linhaDeTeste = linhaAtual + vertical[tipoDeMovimento];
				colunaDeTeste = colunaAtual + horizontal[tipoDeMovimento];
				boaJogada = movimentoValido(linhaDeTeste, colunaDeTeste);
						
			// testa se o novo Movimento é válido
			if (boaJogada)
			{
				linhaAtual = linhaDeTeste;
				colunaAtual = colunaDeTeste;
				quadro[linhaAtual][colunaAtual] = ++numeroDoMovimento;
			}
			
		}
		

			// se não houver movimentos válidos, o knight não poderá mais se mover
			 if (!boaJogada)
		            concluido = true;
			// se 64 movimentos tiverem sido feitos, será um passeio completo
		         else if (numeroDoMovimento == 64)
		            concluido = true;
		      } 
		
		 System.out.printf("O passeio acabou com %d movimentos.\n", numeroDoMovimento);

	      if (numeroDoMovimento == 64)
	         System.out.println("Este foi um passeio completo!");
	      else
	         System.out.println("Este não foi um passeio completo.");

	      impressãoDoPasseio();
	   }  

	// verifica se há movimento válido
	private static boolean movimentoValido(int linha, int coluna) 
	{
		  // retorna falso se o lance estiver fora do tabuleiro de xadrez, ou se
	      // o cavalo já visitou essa posição
	      // NOTA: Este teste pára assim que se torna falso
		return (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8
		         && quadro[linha][coluna] == 0);
	}

	// exibe o caminho do passeio do cavalo
private static void impressãoDoPasseio() 
{
	// exibe os números da coluna
    for (int k = 0; k < 8; k++)
       System.out.printf("\t%d", k);

    System.out.print("\n\n");

    for (int linha = 0; linha < quadro.length; linha++)
    {
       System.out.print (linha);

       for (int coluna = 0; coluna < quadro[linha].length; coluna++)
          System.out.printf("\t%d", quadro[linha][coluna]);

       System.out.println();
    } 
}
}
package estudo.cap07.jogoDeCartas;

public class BaralhoDeCartasTest {

	public static void main(String[] args) {

		BaralhoDeCartas meuBaralhoDeCartas = new BaralhoDeCartas();
		meuBaralhoDeCartas.embaralhar();
		
		for (int i = 1; i <= 52; i++) {
			
			System.out.printf("%-19s", meuBaralhoDeCartas.distribuirCarta());
			
			if (i % 4 == 0) // gera uma nova linha após cada quarta carta
				 System.out.println();
		}
	}

}

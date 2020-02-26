package estudo.cap07.jogoDeCartas;

import java.security.SecureRandom;

public class BaralhoDeCartas {

	private Cartas[] baralho;
	private int cartaAtual;
	private static final int NUMERO_DE_CARTAS = 52;

	private static final SecureRandom numeroAleatorio = new SecureRandom();

	public BaralhoDeCartas() {
		String[] faces = { "Às", "Duque", "Terno", "Quadra", "Quina", "Sena", "Sete", "Oito", "Nove", "Dez", "Valete",
				"Dama", "Reis" };
		String[] nipe = { "Copas", "Ouro", "Paus", "Espada" };

		baralho = new Cartas[NUMERO_DE_CARTAS];
		cartaAtual = 0;

		for (int cont = 0; cont < baralho.length; cont++)
			baralho[cont] = new Cartas(faces[cont % 13], nipe[cont / 13]);
	}

	public void embaralhar() {
		cartaAtual = 0;

		for (int primeira = 0; primeira < baralho.length; primeira++) {
			int segunda = numeroAleatorio.nextInt(NUMERO_DE_CARTAS);

			Cartas temp = baralho[primeira];
			baralho[primeira] = baralho[segunda];
			baralho[segunda] = temp;
		}
	}
	
	public Cartas distribuirCarta() {
		if(cartaAtual < baralho.length)
			return baralho[cartaAtual++];
			else
				return null;
	}
}

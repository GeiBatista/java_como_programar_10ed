package estudo.cap07.jogoDeCartas;

public class Cartas {
	
	private final String face;
	private final String nipe;
	
	public Cartas(String cartaFace, String cartaNipe) {
		this.face = cartaFace;
		this.nipe = cartaNipe;		
	}
	
	public String toString() {
		
		return face + " de " + nipe;
	}
	
	

}

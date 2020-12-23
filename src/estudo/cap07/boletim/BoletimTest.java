package estudo.cap07.boletim;

public class BoletimTest {

	public static void main(String[] args) {
		
		int[] arrayDeNotas = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		Boletim meuBoletim = new Boletim("Introdução à Programação em JAVA", arrayDeNotas );
		System.out.printf("Bem-Vindo ao Boletim para%n%s%n%n",
				meuBoletim.getCurso());
		meuBoletim.notasDoProcesso();
	}

}

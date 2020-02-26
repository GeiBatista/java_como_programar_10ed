package estudo.cap07.array;

public class CodigoDrBarras {

	public static void main(String[] args) {

		int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.println("Distribuição de Notas");
		
		for(int cont = 0; cont < array.length; cont++) {
			
			System.out.println();
			for(int estrela = 0; estrela < array[cont]; estrela++) 
			System.out.print("*");
			
		}
	}

}

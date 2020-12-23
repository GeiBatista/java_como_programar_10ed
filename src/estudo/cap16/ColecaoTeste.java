package estudo.cap16;

import java.util.ArrayList;
import java.util.List;

public class ColecaoTeste {

	public static void main(String[] args) {

		String[] cores = {"VERMELHO","AMARELO","PRETO","AZUL","VERDE"};
		List <String> lista = new ArrayList<>();
		
		for(String cor : cores) 
			lista.add(cor);
			
			for(int i = 0; i < lista.size(); i++) 
				System.out.printf("%s ", lista.get(i));
			
	}

}

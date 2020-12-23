package estudo.cap16;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class EstudoLambda {

	public static void main(String[] args) {
		
		String[] array = {"Gei Batista", "Binha Sarno"};
		
		List<String> lista = Arrays.asList(array);
		 lista.stream().forEach(System.out::println);
		 
		 System.out.println(BigInteger.TWO);

	}

}

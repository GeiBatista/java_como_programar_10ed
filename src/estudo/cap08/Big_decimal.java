package estudo.cap08;

import java.math.BigDecimal;

public class Big_decimal {

	public static void main(String[] args) {

	BigDecimal principal = BigDecimal.valueOf(1000.0);
	BigDecimal rate = BigDecimal.valueOf(0.05);
	
	BigDecimal amount;
	
	System.out.println( amount = 
          principal.multiply(rate.add(BigDecimal.ONE)));
	//principal.multiply(rate));
	}

}

package estudo.interfaces;

import exemplos.cap10.Fig10_04_09.BasePlusCommissionEmployee;
import exemplos.cap10.Fig10_04_09.Employee;

public class APagarInterfaceTest {
	public static void main(String[] args) {
			      
	      APagar[] ObjetoApagar = new APagar[4];
	      
	      
	      ObjetoApagar[0] = new Fatura("01234", "assento", 2, 375.00);
	      ObjetoApagar[1] = new Fatura("56789", "pneu", 4, 79.95);
	      ObjetoApagar[2] = new EmpregadoAssalariado("Vini", "Batista", "111.111.111-11", 800.00);
	      ObjetoApagar[3] = new EmpregadoAssalariado("Luna", "Sarno", "222.222.222-22", 400.00);
	      
	      System.out.printf("Faturas e Empregados processados ​​polimorficamente:");
	      
	      for (APagar pagamentoAtual : ObjetoApagar) 
	      {
	    	  System.out.printf("%n%s %n%s: $%,.2f%n", 
	    	            pagamentoAtual.toString(), 
	    	            "pagamento devido", pagamentoAtual.valorDoPagamento());   
	      }
	      
	   } 

	}



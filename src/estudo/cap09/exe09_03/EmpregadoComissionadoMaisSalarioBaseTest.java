package estudo.cap09.exe09_03;

import estudo.cap09.fig09_04_05.EmpregadoComissionado;

public class EmpregadoComissionadoMaisSalarioBaseTest {

	public static void main(String[] args) {
		
		//EmpregadoComissionadoMaisSalarioBaseComposicao empregado = 
		//		new EmpregadoComissionadoMaisSalarioBaseComposicao("Luna", "Sarno Batista", "333-33-3333", 5000, .40, 20.00);

		EmpregadoComissionadoComposicao empregado = 
				new EmpregadoComissionadoComposicao("Luna", "Sarno Batista", "333-33-3333", 5000, .04);
		
		System.out.println(
		         "Informações do funcionário obtidas pelos métodos get:");
		      System.out.printf("%n%s %s%n", "Primeiro nome é: ",
		         empregado.getNome());
		      System.out.printf("%s %s%n", "Sobrenome é", 
		         empregado.getSobrenome());
		      System.out.printf("%s %s%n", "O número do seguro social é", 
		         empregado.getSegurosocial());
		      System.out.printf("%s %.2f%n", "Venda Bruta é", 
		         empregado.getVendabruta());
		      System.out.printf("%s %.2f%n", "Comissão é",
		         empregado.getComissao());
		      System.out.printf("%s %.2f%n", "Base salary is",
		    	         empregado.getSalarioBase());

		    	     
		    //  empregado.setSalarioBase(1000);
		      
		    //  empregado.setVendaBruta(500);
		      empregado.setComissao(.1);
		      
		      System.out.printf("%n%s:%n%n%s%n",                                
		    	         "Informações atualizadas sobre os funcionários obtidas pelo toString", empregado.toString());
	}

}

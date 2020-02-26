package estudo.cap09.fig09_04_05;

public class EmpregadoComissionadoTest {

	public static void main(String[] args) {

		EmpregadoComissionado empregado = new EmpregadoComissionado("Luna", "Sarno Batista", "18-11-2222", 10000, .06);
		
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
		      
		      empregado.setVendabruta(500);
		      empregado.setComissao(.1);
		      
		      System.out.printf("%n%s:%n%n%s%n",                                
		    	         "Informações atualizadas sobre os funcionários obtidas pelo toString", empregado);

	}

}

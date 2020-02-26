package estudo.cap10.ex10_12;

public class EmpregadoAssalariadoComissionado extends EmpregadoComissionado{

	private double salarioBase;
	
	public EmpregadoAssalariadoComissionado(String nome, String sobrenome, 
			String cpf, double vendaBruta, int dia, int mes, int ano,
			double comissao, double salarioBase) {
		
		super(nome, sobrenome, cpf, dia, mes, ano, vendaBruta, comissao);

		if (salarioBase < 0.0)                
	         throw new IllegalArgumentException("O salário base deve ser >= 0.0");
	            
	      this.salarioBase = salarioBase;  
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase < 0.0)                
	         throw new IllegalArgumentException("O salário base deve ser >= 0.0");
	            
	      this.salarioBase = salarioBase;  
	}
	
	 @Override                                                            
	   public double salario()                                             
	   {                                                                    
	      return getSalarioBase() + super.salario();                        
	   } 

	 @Override                                                           
	   public String toString()                                            
	   {                                                                   
	      return String.format("%s %s; %s: $%,.2f",                       
	         "assalariado", super.toString(),                            
	         "salario base", getSalarioBase());                             
	   } 
}

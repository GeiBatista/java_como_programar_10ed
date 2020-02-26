package estudo.cap10.ex10_12;

public class EmpregadoHorista extends Empregado{
	
	private double salario;
	private double horas;

	public EmpregadoHorista(String nome, String sobrenome, String cpf, int dia, int mes, int ano, 
			double salario, double horas) {
		
		super(nome, sobrenome, cpf, dia, mes, ano);

		 if (salario < 0.0) 
	         throw new IllegalArgumentException(
	            "O salário por hora deve ser >= 0.0");

	      if ((horas < 0.0) || (horas > 168.0)) // validate hours
	         throw new IllegalArgumentException(
	              "Horas trabalhadas devem ser >= 0.0 e <= 168.0");

	      this.salario = salario;
	      this.horas = horas;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0.0) 
	         throw new IllegalArgumentException(
	            "O salário por hora deve ser >= 0.0");
		
		this.salario = salario;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		if ((horas < 0.0) || (horas > 168.0)) // validate hours
	         throw new IllegalArgumentException(
	              "Horas trabalhadas devem ser >= 0.0 e <= 168.0");
		
		this.horas = horas;
	}

	@Override
	public double salario() {
		if (getHoras() <= 40)                          
	         return getSalario() * getHoras();                                
	      else                                                             
	         return 40 * getHoras() + (getHoras() - 40) * getSalario() * 1.5;
	}

	 @Override                                                             
	   public String toString()                                              
	   {                                                                     
	      return String.format("empregado horista: %s%n%s: $%,.2f; %s: %,.2f",
	         super.toString(), "salario por hora", getSalario(),                     
	         "horas trabalhadas", getHoras());                                   
	   }                                    
}

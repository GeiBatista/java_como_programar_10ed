package estudo.cap10.ex10_12;

public class EmpregadoAssalariado extends Empregado{

	private double salarioSemanal;
	
	public EmpregadoAssalariado(String nome, String sobrenome, String cpf,
			int dia, int mes, int ano, double salarioSemanal) {
		
		super(nome, sobrenome, cpf, dia, mes, ano);
		
		if (salarioSemanal < 0.0)
			throw new IllegalArgumentException(
		            "O salario semanal deve ser >= 0.0");
		
		this.salarioSemanal = salarioSemanal;
	}

	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}


	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal < 0.0)
			throw new IllegalArgumentException(
		            "O salario semanal deve ser >= 0.0");
		
		this.salarioSemanal = salarioSemanal;
	}


	@Override
	public double salario() {
		return getSalarioSemanal();
	}

	 @Override                                                    
	   public String toString()                                     
	   {                                                            
	      return String.format("empregado assalariado: %s%n%s: $%,.2f",
	         super.toString(), "salario semanal", getSalarioSemanal());
	   } 
}

package estudo.cap09.fig10_11;

import estudo.cap09.fig09_09.EmpregadoComissionado;

public class EmpregadoComissionadoMaisSalario extends EmpregadoComissionado{
	
	private double salarioBase;

	public EmpregadoComissionadoMaisSalario(String nome, String sobrenome, String seguroSocial, double vendaBruta,
			double comissao, double salarioBase) {
		super(nome, sobrenome, seguroSocial, vendaBruta, comissao);
		
		if (salarioBase <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O salário base deve ser > 0.0");
		
		this.salarioBase = salarioBase;		
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O salário base deve ser > 0.0");
		this.salarioBase = salarioBase;
	}
	
	public double ganho() {
		return salarioBase + ( comissao * vendaBruta );
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "funcionário comissionado", nome, sobrenome,
				"numero do seguro social", seguroSocial, "venda bruta", vendaBruta, "valor da comissão", comissao, 
				"salário Base ", salarioBase);
	}

}

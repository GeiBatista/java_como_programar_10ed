package estudo.cap09.fig09_06_07;

public class EmpregadoComissionadoMaisSalarioBase {
	private final String nome;
	private final String sobrenome;
	private final String seguroSocial;
	private double vendaBruta;
	private double comissao;
	private double salarioBase;

	public EmpregadoComissionadoMaisSalarioBase(String nome, String sobrenome, String seguroSocial,
			double vendaBruta, double comissao, double salarioBase) {

		if (vendaBruta < 0.0)
			throw new IllegalArgumentException("Valor da venda Bruta deve ser maior ou igual à 0.0");
		
		if (comissao <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O valor da Comissão deve ser > 0.0 and < 1.0");
		
		if (salarioBase <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O salário base deve ser > 0.0");

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.seguroSocial = seguroSocial;
		this.vendaBruta = vendaBruta;
		this.comissao = comissao; 
		this.salarioBase = salarioBase;
	}

	public double getVendaBruta() {
		return vendaBruta;
	}

	public void setVendaBruta(double vendaBruta) {
		if (vendaBruta < 0.0)
			throw new IllegalArgumentException("Valor da venda Bruta deve ser maior ou igual à 0.0");
		this.vendaBruta = vendaBruta;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		if (comissao <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O valor da Comissão deve ser > 0.0 and < 1.0");
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O salário base deve ser > 0.0");
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSeguroSocial() {
		return seguroSocial;
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

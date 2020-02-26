package estudo.cap09.fig09_09;

public class EmpregadoComissionado {

	protected final String nome;
	protected final String sobrenome;
	protected final String seguroSocial;
	protected double vendaBruta;
	protected double comissao;

	public EmpregadoComissionado(String nome, String sobrenome, String seguroSocial, double vendaBruta,
			double comissao) {

		if (vendaBruta < 0.0)
			throw new IllegalArgumentException("Valor da venda Bruta deve ser maior ou igual à 0.0");
		if (comissao <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O valor da Comissão deve ser > 0.0 and < 1.0");

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.seguroSocial = seguroSocial;
		this.vendaBruta = vendaBruta;
		this.comissao = comissao;
	}

	public double getVendabruta() {
		return vendaBruta;
	}

	public void setVendabruta(double vendabruta) {
		if (vendabruta < 0.0)
			throw new IllegalArgumentException("Valor da venda Bruta deve ser maior ou igual à 0.0");
		this.vendaBruta = vendabruta;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		if (comissao <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O valor da Comissão deve ser > 0.0 and < 1.0");
		this.comissao = comissao;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSegurosocial() {
		return seguroSocial;
	}

	public double ganho() {
		return comissao * vendaBruta;
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "funcionário comissionado", nome, sobrenome,
				"numero do seguro social", seguroSocial, "venda bruta", vendaBruta, "valor da comissão", comissao);
	}

}

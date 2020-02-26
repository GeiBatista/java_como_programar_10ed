package estudo.cap09.fig09_04_05;

public class EmpregadoComissionado {
	private final String nome;
	private final String sobrenome;
	private final String segurosocial;
	private double vendabruta;
	private double comissao;

	public EmpregadoComissionado(String nome, String sobrenome, String segurosocial, double vendabruta,
			double comissao) {

		if (vendabruta < 0.0)
			throw new IllegalArgumentException("Valor da venda Bruta deve ser maior ou igual à 0.0");
		if (comissao <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("O valor da Comissão deve ser > 0.0 and < 1.0");

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.segurosocial = segurosocial;
		this.vendabruta = vendabruta;
		this.comissao = comissao;
	}

	public double getVendabruta() {
		return vendabruta;
	}

	public void setVendabruta(double vendabruta) {
		if (vendabruta < 0.0)
			throw new IllegalArgumentException("Valor da venda Bruta deve ser maior ou igual à 0.0");
		this.vendabruta = vendabruta;
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
		return segurosocial;
	}

	public double ganho() {
		return comissao * vendabruta;
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "funcionário comissionado", nome, sobrenome,
				"numero do seguro social", segurosocial, "venda bruta", vendabruta, "valor da comissão", comissao);
	}

}

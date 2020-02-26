package estudo.cap10;

public class EmpregadoComissionado extends Empregado {

	private double vendaBruta;
	private double comissao;

	public EmpregadoComissionado(String nome, String sobrenome, String cpf, double vendaBruta, double comissao) {

		super(nome, sobrenome, cpf);

		if (comissao <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("A comissão deve ser > 0.0 and < 1.0");

		if (vendaBruta < 0.0)
			throw new IllegalArgumentException("A venda bruta deve ser >= 0.0");

		this.vendaBruta = vendaBruta;
		this.comissao = comissao;
	}

	public double getVendaBruta() {
		return vendaBruta;
	}

	public void setVendaBruta(double vendaBruta) {
		if (vendaBruta < 0.0)
			throw new IllegalArgumentException("A venda bruta deve ser >= 0.0");

		this.vendaBruta = vendaBruta;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		if (comissao <= 0.0 || comissao >= 1.0)
			throw new IllegalArgumentException("A comissão deve ser > 0.0 and < 1.0");

		this.comissao = comissao;
	}

	@Override
	public double salario() {
		return getComissao() * getVendaBruta();
	}

	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "empregado comissionado", super.toString(), "venda bruta",
				getVendaBruta(), "commission rate", getComissao());
	}

}

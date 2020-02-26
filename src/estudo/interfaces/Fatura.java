package estudo.interfaces;

public class Fatura implements APagar {

	private final String numeroDaPeca;
	private final String descricaoDaPeca;
	private int quantidade;
	private double precoPorItem;

	public Fatura(String numeroDaPeca, String descricaoDaPeca, int quantidade, double precoPorItem) {

		if (quantidade < 0) // validate quantity
			throw new IllegalArgumentException("Quantidade deve ser >= 0");

		if (precoPorItem < 0.0) // validate pricePerItem
			throw new IllegalArgumentException("O preço por item deve ser >= 0");

		this.numeroDaPeca = numeroDaPeca;
		this.descricaoDaPeca = descricaoDaPeca;
		this.quantidade = quantidade;
		this.precoPorItem = precoPorItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0) // validate quantity
			throw new IllegalArgumentException("Quantidade deve ser >= 0");
		this.quantidade = quantidade;
	}

	public double getPrecoPorItem() {
		return precoPorItem;
	}

	public void setPrecoPorItem(double precoPorItem) {
		if (precoPorItem < 0.0) // validate pricePerItem
			throw new IllegalArgumentException("O preço por item deve ser >= 0");
		this.precoPorItem = precoPorItem;
	}

	public String getNumeroDaPeca() {
		return numeroDaPeca;
	}

	public String getDescricaoDaPeca() {
		return descricaoDaPeca;
	}
	
	 @Override
	   public String toString()
	   {
	      return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
	         "fatura", "número da peça", getNumeroDaPeca(), getDescricaoDaPeca(), 
	         "quantidade", getQuantidade(), "preço por item", getPrecoPorItem());
	   } 

	@Override
	public double valorDoPagamento() {
		return getQuantidade() * getPrecoPorItem();
	}

}

package estudo.cap03.ex03_12;

//Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
//fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
//número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
//classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância.
//Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
//preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço
//por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
//capacidades da classe Invoice.
public class Fatura {

	private String numero;
	private String descriao;
	private int quantidade;
	private double precoPorItem;

	// construtor
	public Fatura(String numero, String descriao, int quantidade, double precoPorItem) {
		this.numero = numero;
		this.descriao = descriao;

		if (quantidade > 0) // determine se a contagem é positiva
			this.quantidade = quantidade;

		if (precoPorItem > 0.0) // contagem válida atribuída à quantidade
			this.precoPorItem = precoPorItem;
	}

	// configura o numero da fatura
	public void setNumero(String numero) {
		this.numero = numero;
	}

	// pega o numero da fatura
	public String getNumero() {
		return numero;
	}

	// pega descricao
	public void setDescriao(String descriao) {
		this.descriao = descriao;
	}

	// configura descricao
	public String getDescriao() {
		return descriao;
	}

	// configura quantidade
	public void setQuantidade(int quantidade) {
		if (quantidade > 0) // determine se a contagem é positiva
			this.quantidade = quantidade;// contagem válida atribuída à quantidade

		if (quantidade <= 0) // determine se a contagem é zero ou negativa
			this.quantidade = 0;// contagem inválida; quantidade configurada para 0

	}

	// pega quantidade
	public int getQuantidade() {
		return quantidade;
	}

	// configura preço
	public void setPrecoPorItem(double precoPorItem) {
		if (precoPorItem > 0.0) // determine se o preço é positivo
			this.precoPorItem = precoPorItem; // preço válido atribuído a precoPorItem;

		if (precoPorItem <= 0.0) // determine se o preço é zero ou negativo
			this.precoPorItem = 0.0; // preço inválido; precoPorItem definido como 0.0
	}

	// obtem o preco
	public double getPrecoPorItem() {
		return precoPorItem;
	}

	// calcula e retorna o valor da fatura
	public double getValorFatura() {
		return getQuantidade() * getPrecoPorItem();// calcula custo total
	}

}

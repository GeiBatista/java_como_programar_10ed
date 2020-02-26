package estudo.cap03.ex03_12;

public class FaturaTest {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("1234", "Martelo", 2, 14.95);
		// exibir fatura1
		System.out.println("Informação original da fatura");
		System.out.printf("Número de peça:%s%n", fatura1.getNumero());
		System.out.printf("Descrição:%s%n", fatura1.getDescriao());
		System.out.printf("Quantidade:%d%n", fatura1.getQuantidade());
		System.out.printf("Preço:%.2f%n", fatura1.getPrecoPorItem());
		System.out.printf("Valor da fatura:%.2f%n", fatura1.getValorFatura());

		// alterar os dados da fatura1
		fatura1.setNumero("001234");
		fatura1.setDescriao("Martelo Amarelo");
		fatura1.setQuantidade(3);
		fatura1.setPrecoPorItem(19.49);

		// exibe invoice1 com novos dados
		System.out.printf("%nInformações de fatura atualizadas%n");
		System.out.printf("Número de peça:%s%n", fatura1.getNumero());
		System.out.printf("Descrição:%s%n", fatura1.getDescriao());
		System.out.printf("Quantidade:%d%n", fatura1.getQuantidade());
		System.out.printf("Preço:%.2f%n", fatura1.getPrecoPorItem());
		System.out.printf("Valor da fatura:%.2f%n", fatura1.getValorFatura());

		Fatura fatura2 = new Fatura("5678", "Paint Brush", -5, -9.99);

		// exibir fatura2
		System.out.println("%nInformação original da fatura%n");
		System.out.printf("Número de peça:%s%n", fatura2.getNumero());
		System.out.printf("Descrição:%s%n", fatura2.getDescriao());
		System.out.printf("Quantidade:%d%n", fatura2.getQuantidade());
		System.out.printf("Preço:%.2f%n", fatura2.getPrecoPorItem());
		System.out.printf("Valor da fatura:%.2f%n", fatura2.getValorFatura());

		// alterar os dados da fatura2
		fatura2.setQuantidade(3);
		fatura2.setPrecoPorItem(9.49);
		// exibe fatura2 com novos dados
		System.out.printf("%nInformações de fatura atualizadas%n");
		System.out.printf("Número de peça:%s%n", fatura2.getNumero());
		System.out.printf("Descrição:%s%n", fatura2.getDescriao());
		System.out.printf("Quantidade:%d%n", fatura2.getQuantidade());
		System.out.printf("Preço:%.2f%n", fatura2.getPrecoPorItem());
		System.out.printf("Valor da fatura:%.2f%n", fatura2.getValorFatura());
	}
}

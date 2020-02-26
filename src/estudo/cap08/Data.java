package estudo.cap08;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Data(int dia, int mes, int ano) {

		// verifica se mês está no intervalo
		if (mes <= 0 || mes > 12)
			throw new IllegalArgumentException("mes (" + mes + ") deve ser 1-12");

		// verifica se day está no intervalo para month
		if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
			throw new IllegalArgumentException("dia (" + dia + ") fora do intervalo para o mês e ano especificados");

		// verifique no ano bissexto se o mês é 2 e o dia é 29
		if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)))
			throw new IllegalArgumentException("dia (" + dia + ") fora do intervalo para o mês e ano especificados");

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

		System.out.printf("Construtor de objeto Data para data %s%n", this);
	}

	// retorna uma String no formato mês/dia/ano
	public String toString() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	public int getMes() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package estudo.cap10.ex10_12;

import estudo.cap08.Data;

public abstract class Empregado {

	private final String nome;
	private final String sobrenome;
	private final String cpf;
	private final Data dataDeNascimento;

	public Empregado(String nome, String sobrenome, String cpf, int dia, int mes, int ano) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		dataDeNascimento = new Data(dia, mes, ano);
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}
	
	

	public Data getDataDeNascimento() {
		return dataDeNascimento;
	}

	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", 
		         getNome(), getSobrenome(), 
		         "número do CPF", getCpf(), 
		         "data de nascimento", getDataDeNascimento());
	}
	
	public abstract double salario();

}

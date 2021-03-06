package estudo.interfaces;

public abstract class Empregado implements APagar{

	private final String nome;
	private final String sobrenome;
	private final String cpf;

	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
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

	 @Override
	   public String toString()
	   {
	      return String.format("%s %s%nsocial security number: %s", 
	         getNome(), getSobrenome(), getCpf());
	   }

}

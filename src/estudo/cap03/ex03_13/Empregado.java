package estudo.cap03.ex03_13;
//Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
//sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
//método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
//teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
//de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
public class Empregado {

	private String nome;
	private String sobrenome;
	private double salariomensal;
	
	// construtor
	public Empregado(String nome, String sobrenome, double salariomensal) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		
		if(salariomensal >= 0.0) // determina se o salário é positivo
		this.salariomensal = salariomensal;
	}

	// obtém o nome
	public String getNome() {
		return nome;
	}

	// configura o nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// obtém o soobrenome
	public String getSobrenome() {
		return sobrenome;
	}

	// configura o sobrenome
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	// obtém o salário mensal
	public double getSalariomensal() {
		return salariomensal;
	}

	// configura o salário mensal
	public void setSalariomensal(double salariomensal) {
		if(salariomensal >= 0.0)  // determinar se o salário é positivo
			this.salariomensal = salariomensal;
	}
	
	
}

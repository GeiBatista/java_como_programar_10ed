package estudo.cap03.ex03_17_console;

/*(Computadorização dos registros de saúde) Uma questão relacionada à assistência médica discutida ultimamente nos veículos de
comunicação é a computadorização dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa de preocupações
quanto à privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em exercícios
posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre
vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas de medicamentos,
reduza custos em ambulatórios e salve vidas. Neste exercício, você projetará uma classe HealthProfile “inicial” para uma
pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
Para cada atributo, forneça métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC do Exercício 2.33.*/
public class PerfilDeSaude {

	private String nome;
	private String sobrenome;
	private String sexo;
	private int aniversario;
	private int anoAtual;
	private double altura;
	private double peso;

	public PerfilDeSaude(String nome, String sobrenome, String sexo, int aniversario, int anoAtual, double altura,
			double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.aniversario = aniversario;
		this.anoAtual = anoAtual;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return getAnoAtual() - getAniversario();
	}

	// returns the maximum heart rate
	public int getFrequenciaCardiacaMaxima() {
		return 220 - getIdade();
	}

	public double getFrequenciaCardiacaAlvoMinima() {
		return .5 * getFrequenciaCardiacaMaxima();
	}

	public double getFrequenciaCardiacaAlvoMaxima() {
		return .85 * getFrequenciaCardiacaMaxima();
	}

	public double getIMC() {
		return getPeso() / (getAltura() * getAltura());
	}

	// displays the person's health profile
	public void exibirPerfilDeSaude() {
		System.out.printf("%nPERFIL DE SAÚDE PARA: %s %s%n", getNome(), getSobrenome());
		System.out.printf("Sexo: %s%n", getSexo());
		System.out.printf("Idade: %d%n", getIdade());
		System.out.printf("Altura (em cm): %.1f%n", getAltura());
		System.out.printf("Peso (em kg): %.1f%n", getPeso());
		System.out.printf("Frequência cardiáca máxima: %d%n", getFrequenciaCardiacaMaxima());
		System.out.println("Faixa de frequência cardíaca alvo:");
		System.out.printf("   Minima: %.0f%n", getFrequenciaCardiacaAlvoMinima());
		System.out.printf("   Máxima: %.0f%n", getFrequenciaCardiacaAlvoMaxima());
		System.out.printf("IMC: %f%n%n", getIMC());
		System.out.println("IMC VALORES");
		System.out.println("Baixo peso: menor do que 18.5");
		System.out.println("Normal:     entre 18.5 e 24.9");
		System.out.println("Sobrepeso:  entre 25 e 29.9");
		System.out.println("Obesidade:  30 ou mais");
	}
}

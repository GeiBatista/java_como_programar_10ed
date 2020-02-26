package estudo.cap03.ex03_15;
//Na classe AccountTest da Figura 3.9, o método main contém seis instruções
//(linhas 13 e 14, 15 e 16, 28 e 29, 30 e 31, 40 e 41 e 42 e 43) e cada uma exibe name e balance do objeto Account. Estude essas instruções
//e você perceberá que elas só diferem no objeto Account sendo manipulado — account1 ou account2. Neste exercício, você
//definirá um novo método displayAccount que contém uma cópia dessa instrução de saída. O parâmetro do método será um objeto
//Account e o método irá gerar name e balance dele. Então você substituirá as seis instruções duplicadas em main por chamadas para
//displayAccount passando como argumento o objeto específico Account para saída.
//Modifique a classe AccountTest da Figura 3.9 para declarar o seguinte método displayAccount após a chave direita de fechamento
//de main e antes da chave direita de fechamento da classe AccountTest:
//public static void displayAccount(Account accountToDisplay)
//{
//// coloque aqui a instrução que exibe
//// o name e o balance de accountToDisplay
//}
//Substitua o comentário no corpo do método por uma instrução que exiba name e balance de accountToDisplay.
//Lembre-se de que main é um método static, assim pode ser chamado sem antes criar um objeto da classe em que é declarado. Também
//declaramos o método displayAccount como um método static. Quando main tem de chamar outro método na mesma classe
//sem antes criar um objeto dela, o outro método também deve ser declarado static.
//Depois de concluir a declaração de displayAccount, modifique main para substituir as instruções que exibem name e balance de
//cada Account pelas chamadas para displayAccount — cada uma recebendo como seu argumento o objeto account1 ou account2,
//como apropriado. Então, teste a classe AccountTest atualizada para garantir que ela produz a mesma saída como mostrado na Figura
//3.9.
public class Conta {

	private String nome;
	private double saldo;
		
	public Conta(String nome, double saldo) {

		this.nome = nome;
		
		if(saldo >0.0)
		this.saldo = saldo;
	}
	
	public void deposito(double vlrDeposito) {
		if (vlrDeposito > 0.0)
			saldo = saldo + vlrDeposito;
	}
				
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
}

package estudo.interfaces;

public class EmpregadoAssalariado extends Empregado {

	private double salarioSemanal;

	public EmpregadoAssalariado(String nome, String sobrenome, String cpf, double salarioSemanal) {

		super(nome, sobrenome, cpf);

		if (salarioSemanal < 0.0)
			throw new IllegalArgumentException("O salario semanal deve ser >= 0.0");

		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal < 0.0)
			throw new IllegalArgumentException("O salario semanal deve ser >= 0.0");

		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return String.format("empregado assalariado: %s%n%s: $%,.2f", super.toString(), "salario semanal",
				getSalarioSemanal());
	}

	@Override
	public double valorDoPagamento() {
		
		return salarioSemanal;
	}
}

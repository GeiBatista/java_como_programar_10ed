package estudo.cap03.interfaceGrafica;

import javax.swing.JOptionPane;

public class Dialogo {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		
		String mensagem = String.format("Meu nome é: %s", nome);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}

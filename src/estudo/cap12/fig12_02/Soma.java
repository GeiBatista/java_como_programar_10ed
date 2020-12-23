package estudo.cap12.fig12_02;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {

		String numero1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		int soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"A soma é : " + soma, "SOMA", JOptionPane.PLAIN_MESSAGE);
	}

}

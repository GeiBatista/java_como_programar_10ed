package estudo.cap12.fig12_02;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {

		String numero1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		int soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"A soma � : " + soma, "SOMA", JOptionPane.PLAIN_MESSAGE);
	}

}

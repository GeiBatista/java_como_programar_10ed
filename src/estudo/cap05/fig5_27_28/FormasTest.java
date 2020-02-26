package estudo.cap05.fig5_27_28;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormasTest {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite 1 para desenhar retangulos\n"
				+ "Digite 2 para desenhar circulos");
		
		int escolha = Integer.parseInt(entrada);
		
		Formas painel = new Formas(escolha);
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(300, 300);
		aplicacao.setVisible(true);
	}

}

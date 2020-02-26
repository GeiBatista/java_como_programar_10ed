package estudo.cap05.exer5_01;

import javax.swing.JFrame;

public class CirculosConcentricosTest {
	
	public static void main(String[] args) {
		
		CirculosConcentricos painel = new CirculosConcentricos();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.setSize(300, 300);
		aplicacao.setVisible(true);
		aplicacao.add(painel);
	}

}

package estudo.cap12.fig12_06;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rotulo1 extends JFrame{

	private final JLabel rotulo1;
	
	public Rotulo1() {
		super("Rotulo do cabecalho");
		setLayout(new FlowLayout());

		rotulo1 = new JLabel("Teste de JLable");
		add(rotulo1);
	}
}

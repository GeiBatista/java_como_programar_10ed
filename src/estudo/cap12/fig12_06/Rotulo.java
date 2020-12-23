package estudo.cap12.fig12_06;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rotulo extends JFrame{

	private final JLabel rotulo;
	
	public Rotulo() {
		super("Testando Rótulo");
		
		rotulo = new JLabel("Rótulo");
		setLayout(new FlowLayout());
		add(rotulo);
	}
}

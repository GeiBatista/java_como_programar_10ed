package estudo.cap12.fig12_06;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rotulo extends JFrame{

	private final JLabel rotulo;
	
	public Rotulo() {
		super("Testando R�tulo");
		
		rotulo = new JLabel("R�tulo");
		setLayout(new FlowLayout());
		add(rotulo);
	}
}

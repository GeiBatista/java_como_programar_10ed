package estudo.cap12.fig12_06;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CampoDeTexto extends JFrame{

	private final JTextField campoDeTexto;
	private final JTextField campoDeTexto2;
	
	public CampoDeTexto() {
		super("Estudando jTextField");
		setLayout(new FlowLayout());
		
		campoDeTexto = new JTextField(10);
		add(campoDeTexto);
		
		campoDeTexto2 = new JTextField("Digite o texo");
		add(campoDeTexto2);
	}
}

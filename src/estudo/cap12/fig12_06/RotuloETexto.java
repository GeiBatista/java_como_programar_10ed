package estudo.cap12.fig12_06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RotuloETexto extends JFrame{

	private final JLabel rotulo;
	private final JLabel rotulo2;
	private final JTextField texto;
	private final JPasswordField senha;
	
	public RotuloETexto() {
		super("JLabel + JTextField");
		setLayout(new FlowLayout());
		
		rotulo = new JLabel("Rótulo");
		add(rotulo);		
		texto = new JTextField(10);
		add(texto);
				
		rotulo2 = new JLabel("Senha");
		add(rotulo2);
		senha = new JPasswordField("SENHA");
		add(senha);		
		
		RotuloETextoHandler handler = new RotuloETextoHandler();
		texto.addActionListener(handler);
		senha.addActionListener(handler);
	}
	
	private class RotuloETextoHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			String string = ""; 
	         // user pressed Enter in JTextField textField1
	         if (event.getSource() == texto)
	            string = String.format("texto: %s",
	               event.getActionCommand());
	         else if
	        	 (event.getSource() == senha)
		            string = String.format("senha: %s",
		               event.getActionCommand());
	         
	         JOptionPane.showMessageDialog(null, string); 
			
		}
		
	}
}

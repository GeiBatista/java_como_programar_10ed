package estudo.cap12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextFieldFrameGUI {

	private JFrame frmTestandoJtextfieldE;
	private JTextField textField;
	private JTextField txtDigiteOTexto;
	private JTextField txtCampoDeTexto;
	private JPasswordField pwdTextoEscondido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFieldFrameGUI window = new TextFieldFrameGUI();
					window.frmTestandoJtextfieldE.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TextFieldFrameGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestandoJtextfieldE = new JFrame();
		frmTestandoJtextfieldE.setTitle("Testando JTextField e JPasswordField");
		frmTestandoJtextfieldE.setBounds(100, 100, 371, 107);
		frmTestandoJtextfieldE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestandoJtextfieldE.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String string = ""; 
		         // user pressed Enter in JTextField textField1
		        // if (arg0.getSource() == textField)
		            string = String.format("textField: %s",
		               arg0.getActionCommand());
		         
		         JOptionPane.showMessageDialog(null, string); 
			}
		});
		frmTestandoJtextfieldE.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtDigiteOTexto = new JTextField();
		txtDigiteOTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String string = "";
				string = String.format("textField: %s", arg0.getActionCommand());
				
				JOptionPane.showMessageDialog(null, string); 
				}
		});
		txtDigiteOTexto.setText("Digite texto aqui");
		frmTestandoJtextfieldE.getContentPane().add(txtDigiteOTexto);
		txtDigiteOTexto.setColumns(10);
		
		txtCampoDeTexto = new JTextField();
		txtCampoDeTexto.setEditable(false);
		txtCampoDeTexto.setText("Campo de texto não editavel");
		frmTestandoJtextfieldE.getContentPane().add(txtCampoDeTexto);
		txtCampoDeTexto.setColumns(21);
		
		pwdTextoEscondido = new JPasswordField();
		pwdTextoEscondido.setText("Texto Escondido");
		frmTestandoJtextfieldE.getContentPane().add(pwdTextoEscondido);
	}

}

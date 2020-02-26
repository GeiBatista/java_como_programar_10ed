package estudo.cap04.ex04_38_grafico.parte_a;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Criptografar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDigitos;
	private JTextField textFieldResultado;
	    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Criptografar frame = new Criptografar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Criptografar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 0, 339, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblExerccioa = new JLabel("Exercício 04.38_a - Java Como Programar 10ª Ed");
		lblExerccioa.setForeground(Color.WHITE);
		lblExerccioa.setBounds(10, 46, 330, 14);
		panel.add(lblExerccioa);
		
		JLabel lblCriptografia = new JLabel("CRIPTOGRAFIA");
		lblCriptografia.setForeground(Color.WHITE);
		lblCriptografia.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblCriptografia.setHorizontalAlignment(SwingConstants.CENTER);
		lblCriptografia.setBounds(10, 11, 319, 24);
		panel.add(lblCriptografia);
		
		JLabel lblNmeroDeQuatro = new JLabel("N\u00FAmero (quatro d\u00EDgitos):");
		lblNmeroDeQuatro.setBounds(10, 94, 147, 14);
		contentPane.add(lblNmeroDeQuatro);
		
		textFieldDigitos = new JTextField();
		textFieldDigitos.setBounds(157, 91, 192, 20);
		contentPane.add(textFieldDigitos);
		textFieldDigitos.setColumns(10);
		
		JLabel lblNmeroCriptografado = new JLabel("N\u00FAmero Criptografado:\r\n");
		lblNmeroCriptografado.setBounds(10, 119, 147, 14);
		contentPane.add(lblNmeroCriptografado);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setBounds(157, 116, 192, 20);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Criptografar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int numero =  Integer.parseInt(textFieldDigitos.getText());
				
				// criptografar
			      int digito1 = (numero / 1000 + 7) % 10;
			      int digito2 = (numero % 1000 / 100 + 7) % 10;
			      int digito3 = (numero % 100 / 10 + 7) % 10;
			      int digito4 = (numero % 10 + 7) % 10;
			      
			      int numeroCriptografado = digito1 * 10 + digito2 + 
			    		  digito3 * 1000 + digito4 * 100;
			      
				textFieldResultado.setText(String.valueOf(numeroCriptografado));
			}
			
		});
		btnNewButton.setBounds(10, 144, 339, 23);
		contentPane.add(btnNewButton);
	}
}

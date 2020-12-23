package estudo.cap04.ex04_38_grafico.parte_b;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Descriptografar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNumero;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Descriptografar frame = new Descriptografar();
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
	public Descriptografar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 0, 339, 71);
		contentPane.add(panel);
		
		JLabel lblExercciob = new JLabel("Exercício 04.38_b - Java Como Programar 10ª Ed");
		lblExercciob.setForeground(Color.WHITE);
		lblExercciob.setBounds(10, 46, 319, 14);
		panel.add(lblExercciob);
		
		JLabel lblDescriptografia = new JLabel("DESCRIPTOGRAFIA");
		lblDescriptografia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescriptografia.setForeground(Color.WHITE);
		lblDescriptografia.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblDescriptografia.setBounds(10, 11, 319, 24);
		panel.add(lblDescriptografia);
		
		JLabel lblNmeroEncriptografado = new JLabel("Número Encriptografado:");
		lblNmeroEncriptografado.setBounds(10, 94, 147, 14);
		contentPane.add(lblNmeroEncriptografado);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		textFieldNumero.setBounds(167, 91, 182, 20);
		contentPane.add(textFieldNumero);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setColumns(10);
		textFieldResultado.setBounds(167, 116, 182, 20);
		contentPane.add(textFieldResultado);
		
		JLabel lblNmeroDescriptografado = new JLabel("Número Descriptografado:\r\n");
		lblNmeroDescriptografado.setBounds(10, 119, 159, 14);
		contentPane.add(lblNmeroDescriptografado);
		
		JButton btnDescriptografar = new JButton("Descriptografar");
		btnDescriptografar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int numero = Integer.parseInt(textFieldNumero.getText());
				
				// descriptografar
			      int digito1 = (numero / 1000 + 3) % 10;
			      int digito2 = (numero % 1000 / 100 + 3) % 10;
			      int digito3 = (numero % 100 / 10 + 3) % 10;
			      int digito4 = (numero % 10 + 3) % 10;
			      
			      int numeroDescriptografado = digito1 * 10 + digito2 +
			    	         digito3 * 1000 + digito4  * 100;
			      
			      textFieldResultado.setText(String.valueOf(numeroDescriptografado));

			}
		});
		btnDescriptografar.setBounds(10, 144, 339, 23);
		contentPane.add(btnDescriptografar);
	}

}

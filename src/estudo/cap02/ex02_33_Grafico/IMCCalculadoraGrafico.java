package estudo.cap02.ex02_33_Grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class IMCCalculadoraGrafico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;
	private JTextField textFieldImc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMCCalculadoraGrafico frame = new IMCCalculadoraGrafico();
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
	public IMCCalculadoraGrafico() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Calculadora de IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Altura:");
		lblNewLabel.setBounds(10, 81, 44, 58);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 119, 44, 51);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblPeso);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(52, 100, 86, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(52, 134, 86, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 434, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Indice de Massa Corporal");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(124, 25, 199, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setForeground(Color.WHITE);
		lblImc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblImc.setBounds(195, 0, 43, 25);
		panel.add(lblImc);
		
		JLabel lblExerccio = new JLabel("Exercício 02.33 - Java Como Programar 10ª Ed");
		lblExerccio.setBounds(10, 45, 414, 14);
		panel.add(lblExerccio);
		
		textFieldImc = new JTextField();
		textFieldImc.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldImc.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldImc.setBounds(326, 100, 98, 54);
		contentPane.add(textFieldImc);
		textFieldImc.setColumns(10);
		
		JLabel lblImc_1 = new JLabel("IMC");
		lblImc_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImc_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblImc_1.setBounds(270, 100, 46, 54);
		contentPane.add(lblImc_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int peso = Integer.parseInt(textFieldPeso.getText());
				int altura = Integer.parseInt(textFieldAltura.getText());
				int imc = ((altura * altura) / (peso)) / 10;
				String resultado = String.valueOf(imc);
				textFieldImc.setText(resultado);
			}
		});
		btnNewButton.setBounds(148, 100, 89, 54);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 176, 414, 130);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("IMC VALORES");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 5, 382, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Baixo peso: menor do que 18.5");
		lblNewLabel_2.setBounds(10, 30, 382, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Normal:        entre 18.5 e 24.9");
		lblNewLabel_4.setBounds(10, 55, 382, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sobrepeso:  entre 25 e 29.9");
		lblNewLabel_5.setBounds(10, 80, 382, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblObesidadeOu = new JLabel("Obesidade:  30 ou mais");
		lblObesidadeOu.setBounds(10, 105, 382, 14);
		panel_1.add(lblObesidadeOu);
	}
	
	public void obterDados() {
		
		
	}
}

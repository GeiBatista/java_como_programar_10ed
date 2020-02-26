package estudo.cap03.ex03_16_grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrequenciaCardiacaTest extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldSobrenome;
	private JTextField textFieldNascimento;
	private JTextField textFieldAnoAtual;
	private JTextField textFieldMaxima;
	private JTextField textFieldMinima;
	
	private JTextField textFieldIdade;
	private JTextField textFieldFCM;
	FrequenciaCardiaca frequencia = new FrequenciaCardiaca();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrequenciaCardiacaTest frame = new FrequenciaCardiacaTest();
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
	public FrequenciaCardiacaTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 434, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCalculadoraDeFrequncia = new JLabel("Calculadora de Frequência Cardíaca");
		lblCalculadoraDeFrequncia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCalculadoraDeFrequncia.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeFrequncia.setBounds(10, 11, 414, 14);
		panel.add(lblCalculadoraDeFrequncia);
		
		JLabel lblExerccio = new JLabel("Exercício 03.16 - Java Como Programar 10ª Ed");
		lblExerccio.setBounds(10, 52, 315, 14);
		panel.add(lblExerccio);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frequencia.setAnoAtual(Integer.parseInt(textFieldAnoAtual.getText()));
				frequencia.setAniversario(Integer.parseInt(textFieldNascimento.getText()));
				textFieldIdade.setText(String.valueOf(frequencia.getIdade()));
				textFieldFCM.setText((String.valueOf(frequencia.getFrequenciaCardiacaMaxima())));
				textFieldMinima.setText((String.valueOf(frequencia.getFrequenciaCardiacaAlvoMinima())));
				textFieldMaxima.setText((String.valueOf(frequencia.getFrequenciaCardiacaAlvoMaxima())));
			}
		});
		btnCalcular.setBounds(335, 48, 89, 23);
		panel.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 88, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sobrenome:");
		lblNewLabel_1.setBounds(10, 116, 149, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 208, 170, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(188, 85, 236, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setBounds(188, 113, 236, 20);
		contentPane.add(textFieldSobrenome);
		textFieldSobrenome.setColumns(10);
		
		textFieldNascimento = new JTextField();
		textFieldNascimento.setText("");
		textFieldNascimento.setBounds(188, 144, 236, 20);
		contentPane.add(textFieldNascimento);
		textFieldNascimento.setColumns(10);
		
		textFieldAnoAtual = new JTextField();
		textFieldAnoAtual.setBounds(188, 174, 236, 20);
		contentPane.add(textFieldAnoAtual);
		textFieldAnoAtual.setColumns(10);
		
		JLabel lblFrequnciaCardiaca = new JLabel("Frequência Cardiaca Máxima:");
		lblFrequnciaCardiaca.setBounds(10, 243, 170, 14);
		contentPane.add(lblFrequnciaCardiaca);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Frequ\u00EAncia Cardiaca Alvo", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		panel_1.setBounds(0, 268, 434, 56);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAnoAtual = new JLabel("Máxima:\r\n");
		lblAnoAtual.setBounds(10, 28, 52, 14);
		panel_1.add(lblAnoAtual);
		
		JLabel lblMinima = new JLabel("Minima:");
		lblMinima.setBounds(229, 28, 46, 14);
		panel_1.add(lblMinima);
		
		textFieldMaxima = new JTextField();
		textFieldMaxima.setEditable(false);
		textFieldMaxima.setBounds(68, 25, 134, 20);
		panel_1.add(textFieldMaxima);
		textFieldMaxima.setColumns(10);
		
		textFieldMinima = new JTextField();
		textFieldMinima.setEditable(false);
		textFieldMinima.setBounds(282, 25, 142, 20);
		panel_1.add(textFieldMinima);
		textFieldMinima.setColumns(10);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setEditable(false);
		textFieldIdade.setBounds(188, 205, 236, 20);
		contentPane.add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		textFieldFCM = new JTextField();
		textFieldFCM.setEditable(false);
		textFieldFCM.setBounds(188, 236, 236, 20);
		contentPane.add(textFieldFCM);
		textFieldFCM.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ano de Nascimento:");
		lblNewLabel_3.setBounds(10, 147, 168, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ano Atual:");
		lblNewLabel_4.setBounds(10, 177, 168, 14);
		contentPane.add(lblNewLabel_4);
	}
}

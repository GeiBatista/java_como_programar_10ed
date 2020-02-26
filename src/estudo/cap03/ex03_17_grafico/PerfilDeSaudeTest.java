package estudo.cap03.ex03_17_grafico;

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

import estudo.cap03.ex03_17_grafico.PerfilDeSaude;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class PerfilDeSaudeTest extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldSobrenome;
	private JTextField textFieldNascimento;
	private JTextField textFieldAnoAtual;
	private JTextField textFieldMaxima;
	private JTextField textFieldMinima;

	private JTextField textFieldIdade;
	private JTextField textFieldFCM;
	private JTextField textFieldSexo;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;
	private JTextField textFieldIMC;

	PerfilDeSaude pessoa = new PerfilDeSaude();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilDeSaudeTest frame = new PerfilDeSaudeTest();
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
	public PerfilDeSaudeTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 648, 77);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblCalculadoraDeFrequncia = new JLabel("Perfil de Saúde\r\n");
		lblCalculadoraDeFrequncia.setForeground(Color.RED);
		lblCalculadoraDeFrequncia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCalculadoraDeFrequncia.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeFrequncia.setBounds(10, 11, 628, 14);
		panel.add(lblCalculadoraDeFrequncia);

		JLabel lblExerccio = new JLabel("Exercício 03.17 - Java Como Programar 10ª Ed");
		lblExerccio.setBounds(10, 52, 315, 14);
		panel.add(lblExerccio);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				pessoa.setPeso(Double.parseDouble(textFieldPeso.getText()));
				pessoa.setAltura(Double.parseDouble(textFieldAltura.getText()));
				pessoa.setAnoAtual(Integer.parseInt(textFieldAnoAtual.getText()));
				pessoa.setAniversario(Integer.parseInt(textFieldNascimento.getText()));
				textFieldIdade.setText(String.valueOf(pessoa.getIdade()));
				textFieldFCM.setText((String.valueOf(pessoa.getFrequenciaCardiacaMaxima())));
				textFieldMinima.setText((String.valueOf(pessoa.getFrequenciaCardiacaAlvoMinima())));
				textFieldMaxima.setText((String.valueOf(pessoa.getFrequenciaCardiacaAlvoMaxima())));
				textFieldIMC.setText((String.valueOf(String.format("%.2f",pessoa.getIMC()))));
				

			}
		});
		btnCalcular.setBounds(549, 11, 89, 55);
		panel.add(btnCalcular);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 88, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Sobrenome:");
		lblNewLabel_1.setBounds(10, 113, 149, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 263, 170, 14);
		contentPane.add(lblNewLabel_2);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(188, 85, 236, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setBounds(188, 110, 236, 20);
		contentPane.add(textFieldSobrenome);
		textFieldSobrenome.setColumns(10);

		textFieldNascimento = new JTextField();
		textFieldNascimento.setText("");
		textFieldNascimento.setBounds(188, 210, 236, 20);
		contentPane.add(textFieldNascimento);
		textFieldNascimento.setColumns(10);

		textFieldAnoAtual = new JTextField();
		textFieldAnoAtual.setBounds(188, 235, 236, 20);
		contentPane.add(textFieldAnoAtual);
		textFieldAnoAtual.setColumns(10);

		JLabel lblFrequnciaCardiaca = new JLabel("Frequência Cardiaca Máxima:");
		lblFrequnciaCardiaca.setBounds(10, 288, 170, 14);
		contentPane.add(lblFrequnciaCardiaca);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Frequ\u00EAncia Cardiaca Alvo",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_1.setBounds(434, 85, 204, 88);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblAnoAtual = new JLabel("M\u00E1xima:\r\n");
		lblAnoAtual.setBounds(10, 28, 52, 14);
		panel_1.add(lblAnoAtual);

		textFieldMaxima = new JTextField();
		textFieldMaxima.setEditable(false);
		textFieldMaxima.setBounds(68, 25, 126, 20);
		panel_1.add(textFieldMaxima);
		textFieldMaxima.setColumns(10);

		textFieldMinima = new JTextField();
		textFieldMinima.setBounds(68, 56, 126, 20);
		panel_1.add(textFieldMinima);
		textFieldMinima.setEditable(false);
		textFieldMinima.setColumns(10);

		JLabel lblMinima = new JLabel("M\u00EDnima:");
		lblMinima.setBounds(10, 56, 46, 14);
		panel_1.add(lblMinima);

		textFieldIdade = new JTextField();
		textFieldIdade.setEditable(false);
		textFieldIdade.setBounds(188, 260, 236, 20);
		contentPane.add(textFieldIdade);
		textFieldIdade.setColumns(10);

		textFieldFCM = new JTextField();
		textFieldFCM.setEditable(false);
		textFieldFCM.setBounds(188, 285, 236, 20);
		contentPane.add(textFieldFCM);
		textFieldFCM.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Ano de Nascimento:");
		lblNewLabel_3.setBounds(10, 213, 168, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Ano Atual:");
		lblNewLabel_4.setBounds(10, 238, 168, 14);
		contentPane.add(lblNewLabel_4);

		textFieldSexo = new JTextField();
		textFieldSexo.setBounds(188, 135, 236, 20);
		contentPane.add(textFieldSexo);
		textFieldSexo.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 141, 46, 14);
		contentPane.add(lblSexo);

		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(188, 160, 236, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);

		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(188, 185, 236, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 166, 46, 14);
		contentPane.add(lblAltura);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 188, 46, 14);
		contentPane.add(lblPeso);

		textFieldIMC = new JTextField();
		textFieldIMC.setEditable(false);
		textFieldIMC.setBounds(188, 310, 236, 20);
		contentPane.add(textFieldIMC);
		textFieldIMC.setColumns(10);

		JLabel lblImc = new JLabel("IMC:");
		lblImc.setBounds(10, 313, 46, 14);
		contentPane.add(lblImc);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Valores de IMC",
				TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		panel_2.setBounds(434, 200, 204, 130);
		contentPane.add(panel_2);

		JLabel label_1 = new JLabel("Baixo peso: menor do que 18.5");
		label_1.setBounds(10, 30, 184, 14);
		panel_2.add(label_1);

		JLabel label_2 = new JLabel("Normal:        entre 18.5 e 24.9");
		label_2.setBounds(10, 55, 184, 14);
		panel_2.add(label_2);

		JLabel label_3 = new JLabel("Sobrepeso:  entre 25 e 29.9");
		label_3.setBounds(10, 80, 184, 14);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("Obesidade:  30 ou mais");
		label_4.setBounds(10, 105, 184, 14);
		panel_2.add(label_4);
	}
}

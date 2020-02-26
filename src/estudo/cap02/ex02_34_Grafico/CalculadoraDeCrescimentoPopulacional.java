package estudo.cap02.ex02_34_Grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraDeCrescimentoPopulacional extends JFrame {

	private JPanel contentPane;
	private JTextField tFTxCrescimento;
	private JTextField tF1Ano;
	private JTextField tF2Ano;
	private JTextField tF3Ano;
	private JTextField tF4Ano;
	private JTextField tF5Ano;
	private JTextField tfPopAtual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraDeCrescimentoPopulacional frame = new CalculadoraDeCrescimentoPopulacional();
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
	public CalculadoraDeCrescimentoPopulacional() {
		setTitle("Calculadora de Crescimento Populacional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(0, 81, 434, 169);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Primeiro Ano:");
		lblNewLabel_3.setBounds(10, 39, 82, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Segundo Ano:");
		lblNewLabel_4.setBounds(10, 64, 92, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Terceiro Ano:");
		lblNewLabel_5.setBounds(10, 89, 82, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Quinto Ano:");
		lblNewLabel_6.setBounds(10, 139, 82, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblQuartoAno = new JLabel("Quarto Ano:");
		lblQuartoAno.setBounds(10, 114, 82, 14);
		panel.add(lblQuartoAno);
		
		tF1Ano = new JTextField();
		tF1Ano.setText("");
		tF1Ano.setBounds(102, 36, 322, 20);
		panel.add(tF1Ano);
		tF1Ano.setColumns(10);
		
		tF2Ano = new JTextField();
		tF2Ano.setText("");
		tF2Ano.setBounds(102, 61, 322, 20);
		panel.add(tF2Ano);
		tF2Ano.setColumns(10);
		
		tF3Ano = new JTextField();
		tF3Ano.setText("");
		tF3Ano.setBounds(102, 86, 322, 20);
		panel.add(tF3Ano);
		tF3Ano.setColumns(10);
		
		tF4Ano = new JTextField();
		tF4Ano.setText("");
		tF4Ano.setBounds(102, 111, 322, 20);
		panel.add(tF4Ano);
		tF4Ano.setColumns(10);
		
		tF5Ano = new JTextField();
		tF5Ano.setBounds(102, 136, 322, 20);
		panel.add(tF5Ano);
		tF5Ano.setColumns(10);
		
		JLabel lblAumentoPopulacionalEstimado = new JLabel("Aumento populacional estimado em cinco anos");
		lblAumentoPopulacionalEstimado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAumentoPopulacionalEstimado.setBounds(102, 11, 301, 14);
		panel.add(lblAumentoPopulacionalEstimado);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(0, 0, 434, 82);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblExerccio = new JLabel("Exercício 02.34 - Java Como Programar 10ª Ed");
		lblExerccio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblExerccio.setBounds(4, 64, 224, 14);
		panel_1.add(lblExerccio);
		
		JLabel lblCrescimentoDemogrfico = new JLabel("Crescimento Demográfico");
		lblCrescimentoDemogrfico.setBounds(10, 0, 414, 17);
		lblCrescimentoDemogrfico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrescimentoDemogrfico.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblCrescimentoDemogrfico);
		
		JLabel lblNewLabel = new JLabel("Taxa de Crescimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(133, 50, 127, 14);
		panel_1.add(lblNewLabel);
		
		tFTxCrescimento = new JTextField();
		tFTxCrescimento.setBounds(289, 50, 135, 21);
		panel_1.add(tFTxCrescimento);
		tFTxCrescimento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("População Atual");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(133, 22, 95, 14);
		panel_1.add(lblNewLabel_2);
		
		tfPopAtual = new JTextField();
		tfPopAtual.setColumns(10);
		tfPopAtual.setBounds(289, 22, 135, 21);
		panel_1.add(tfPopAtual);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double populacaoCorrente;
				double taxaDeCrescimento;
				double populacaoFutura;
				
				populacaoCorrente = Double.parseDouble(tfPopAtual.getText());
				taxaDeCrescimento = Double.parseDouble(tFTxCrescimento.getText());
												
				tF1Ano.setText(String.valueOf(populacaoFutura = populacaoCorrente * (1 + taxaDeCrescimento)));
				tF2Ano.setText(String.valueOf(populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento)));
				tF3Ano.setText(String.valueOf(populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento)));
				tF4Ano.setText(String.valueOf(populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento)));
				tF5Ano.setText(String.valueOf(populacaoFutura = populacaoFutura * (1 + taxaDeCrescimento)));
			}
		});
		btnNewButton.setBounds(20, 11, 89, 41);
		panel_1.add(btnNewButton);
	}
}

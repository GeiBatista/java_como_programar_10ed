package estudo.cap02.ex02_35_Grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CustoDeConducaoDiaria extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustoDeConducaoDiaria frame = new CustoDeConducaoDiaria();
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
	public CustoDeConducaoDiaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 434, 65);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblExerccio = new JLabel("Exercício 02.35 - Java Como Programar 10ª Ed");
		lblExerccio.setBounds(10, 41, 210, 13);
		lblExerccio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(lblExerccio);

		JLabel lblCustoDeConduo = new JLabel("Custo de Condução Diária");
		lblCustoDeConduo.setBounds(134, 11, 178, 17);
		lblCustoDeConduo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblCustoDeConduo);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(338, 11, 86, 43);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValor.setBounds(277, 39, 43, 14);
		panel.add(lblValor);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int quilometrosDirigidos = Integer.parseInt(textField_1.getText());
				int valorPorLitro = Integer.parseInt(textField_2.getText());
				int mediaQuilometrosPorLitro = Integer.parseInt(textField_3.getText());
				int taxaEstacionamento = Integer.parseInt(textField_4.getText());
				int pedagios = Integer.parseInt(textField_5.getText());
				textField.setText((String.valueOf(String.format("%.2f",valorPorLitro / 100.0 * quilometrosDirigidos / mediaQuilometrosPorLitro
						+ taxaEstacionamento / 100.0 + pedagios / 100.0))));
			}
		});
		btnNewButton.setBounds(10, 10, 89, 23);
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 64, 434, 135);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Km Dirigidos por dia:");
		lblNewLabel.setBounds(10, 11, 119, 14);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Valor do lítro de gasolina (em centavos):");
		lblNewLabel_1.setBounds(10, 36, 238, 14);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Média de km rodado por litro de gasolina:");
		lblNewLabel_2.setBounds(10, 61, 238, 14);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Taxa de estacionamento (em centavos):\r\n");
		lblNewLabel_3.setBounds(10, 86, 238, 14);
		panel_1.add(lblNewLabel_3);

		JLabel lblPedgio = new JLabel("Pedágio (em centavos):");
		lblPedgio.setBounds(10, 111, 138, 14);
		panel_1.add(lblPedgio);

		textField_1 = new JTextField();
		textField_1.setBounds(246, 8, 178, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setBounds(246, 33, 178, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setBounds(246, 58, 178, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setBounds(246, 82, 178, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(246, 107, 178, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
	}
}

package estudo.cap24.tabela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DisplayQueryResultsGUI {

	private JFrame frmExibindoResultadoDa;
	private static final String DEFAULT_QUERY = "SELECT * FROM authors";
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayQueryResultsGUI window = new DisplayQueryResultsGUI();
					window.frmExibindoResultadoDa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DisplayQueryResultsGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExibindoResultadoDa = new JFrame();
		frmExibindoResultadoDa.setTitle("Exibindo Resultado da Consulta");
		frmExibindoResultadoDa.setBounds(100, 100, 450, 300);
		frmExibindoResultadoDa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmExibindoResultadoDa.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea(DEFAULT_QUERY,3,100);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Enviar Consulta");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnNewButton, BorderLayout.EAST);
		
		table = new JTable();
		frmExibindoResultadoDa.getContentPane().add(table, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		frmExibindoResultadoDa.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Filtro:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(23);
		
		JButton btnAplicarFiltro = new JButton("Aplicar Filtro");
		panel_1.add(btnAplicarFiltro);
	}

}

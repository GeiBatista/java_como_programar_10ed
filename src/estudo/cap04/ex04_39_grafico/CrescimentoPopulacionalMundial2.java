package estudo.cap04.ex04_39_grafico;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CrescimentoPopulacionalMundial2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPopAtual;
	private JTextField textFieldTxCrescimento;
	private JTextArea textArea;
	private PrintStream standardOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrescimentoPopulacionalMundial2 frame = new CrescimentoPopulacionalMundial2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Esta classe se estende de OutputStream para redirecionar a saída para um JTextArrea
	 * @author www.codejava.net
	 *
	 */
	public class CustomOutputStream extends OutputStream {
	    private JTextArea textArea;
	     
	    public CustomOutputStream(JTextArea textArea) {
	        this.textArea = textArea;
	    }
	     
	    @Override
	    public void write(int b) throws IOException {
	    	// redireciona os dados para a área de texto
	        textArea.append(String.valueOf((char)b));
	     // rola a área de texto até o final dos dados
	        textArea.setCaretPosition(textArea.getDocument().getLength());
	    }
	}

	/**
	 * Create the frame.
	 */
	public CrescimentoPopulacionalMundial2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 498, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblExerccioa = new JLabel("Exercício 04.39 - Java Como Programar 10ª Ed");
		lblExerccioa.setForeground(Color.YELLOW);
		lblExerccioa.setHorizontalAlignment(SwingConstants.CENTER);
		lblExerccioa.setBounds(20, 27, 468, 14);
		panel.add(lblExerccioa);
		
		JLabel lblCalculadoraDeCrescimento = new JLabel("Calculadora de Crescimento Populacional Mundial");
		lblCalculadoraDeCrescimento.setForeground(Color.YELLOW);
		lblCalculadoraDeCrescimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeCrescimento.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCalculadoraDeCrescimento.setBounds(10, 0, 478, 28);
		panel.add(lblCalculadoraDeCrescimento);
		
		JLabel lblNewLabel = new JLabel("Ano");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 85, 31, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPopulaoEstimada = new JLabel("População Estimada");
		lblPopulaoEstimada.setForeground(Color.WHITE);
		lblPopulaoEstimada.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPopulaoEstimada.setBounds(74, 85, 139, 14);
		panel.add(lblPopulaoEstimada);
		
		JLabel lblMudanaDoAno = new JLabel("Mudança do Ano Anterior");
		lblMudanaDoAno.setForeground(Color.WHITE);
		lblMudanaDoAno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMudanaDoAno.setBounds(270, 85, 169, 14);
		panel.add(lblMudanaDoAno);
		
		JLabel lblPopulaoAtual = new JLabel("População Atual:");
		lblPopulaoAtual.setForeground(Color.WHITE);
		lblPopulaoAtual.setBounds(10, 60, 102, 14);
		panel.add(lblPopulaoAtual);
		
		textFieldPopAtual = new JTextField();
		textFieldPopAtual.setBounds(107, 57, 86, 20);
		panel.add(textFieldPopAtual);
		textFieldPopAtual.setColumns(10);
		
		JLabel lblTaxaDeCrescimento = new JLabel("Taxa de Crescimento:");
		lblTaxaDeCrescimento.setForeground(Color.WHITE);
		lblTaxaDeCrescimento.setBounds(195, 60, 126, 14);
		panel.add(lblTaxaDeCrescimento);
		
		textFieldTxCrescimento = new JTextField();
		textFieldTxCrescimento.setBounds(327, 57, 54, 20);
		panel.add(textFieldTxCrescimento);
		textFieldTxCrescimento.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				calcular(); 		
			}
		});
		btnCalcular.setBounds(391, 56, 102, 23);
		panel.add(btnCalcular);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(0, 110, 498, 457);
		contentPane.add(textArea);
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		
		// mantém referência do fluxo de saída padrão
		standardOut = System.out;
		
		// reatribui o fluxo de saida padrão e a saíde de fluxo de erro
        System.setOut(printStream);
        System.setErr(printStream);
        
		
	}
	private void calcular() {
		int Ano = 1; // contador de ano
		long populacaoAtual = Long.parseLong(textFieldPopAtual.getText());
		double TaxaDeCrescimento = Double.parseDouble(textFieldTxCrescimento.getText());
				
		while (Ano <= 25)
		{
			double PopulacaoFutura = populacaoAtual * (1 + TaxaDeCrescimento);
			System.out.printf("%10d%,32d%,54d%n", 
					Ano, (long) PopulacaoFutura, (long) PopulacaoFutura - populacaoAtual);
			populacaoAtual = (long) PopulacaoFutura; // observar
			++Ano;
		} // fim do while
	}
}

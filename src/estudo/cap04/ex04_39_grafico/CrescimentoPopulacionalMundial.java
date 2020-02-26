package estudo.cap04.ex04_39_grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Rectangle;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrescimentoPopulacionalMundial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JLabel label_16;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textFieldPopAtual;
	private JTextField textFieldTxCrescimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrescimentoPopulacionalMundial frame = new CrescimentoPopulacionalMundial();
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
	public CrescimentoPopulacionalMundial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 787);
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
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 85, 31, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPopulaoEstimada = new JLabel("População Estimada");
		lblPopulaoEstimada.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPopulaoEstimada.setBounds(74, 85, 139, 14);
		panel.add(lblPopulaoEstimada);
		
		JLabel lblMudanaDoAno = new JLabel("Mudança do Ano Anterior");
		lblMudanaDoAno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMudanaDoAno.setBounds(270, 85, 169, 14);
		panel.add(lblMudanaDoAno);
		
		JLabel lblPopulaoAtual = new JLabel("População Atual:");
		lblPopulaoAtual.setBounds(20, 60, 87, 14);
		panel.add(lblPopulaoAtual);
		
		textFieldPopAtual = new JTextField();
		textFieldPopAtual.setBounds(107, 57, 86, 20);
		panel.add(textFieldPopAtual);
		textFieldPopAtual.setColumns(10);
		
		JLabel lblTaxaDeCrescimento = new JLabel("Taxa de Crescimento:");
		lblTaxaDeCrescimento.setBounds(195, 60, 116, 14);
		panel.add(lblTaxaDeCrescimento);
		
		textFieldTxCrescimento = new JTextField();
		textFieldTxCrescimento.setBounds(308, 57, 86, 20);
		panel.add(textFieldTxCrescimento);
		textFieldTxCrescimento.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				long populacaoAtual = Long.parseLong(textFieldPopAtual.getText());
				double TaxaDeCrescimento = Double.parseDouble(textFieldTxCrescimento.getText());
				
			}
		});
		btnCalcular.setBounds(404, 56, 89, 23);
		panel.add(btnCalcular);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(38, 110, 22, 638);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel(" 2");
		label_1.setBounds(1, 33, 21, 15);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel(" 3");
		label_2.setBounds(1, 57, 21, 15);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel(" 4");
		label_3.setBounds(1, 81, 11, 15);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel(" 5");
		label_4.setBounds(1, 107, 21, 15);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel(" 6");
		label_5.setBounds(1, 133, 21, 15);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel(" 7");
		label_6.setBounds(1, 159, 21, 15);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel(" 8");
		label_7.setBounds(1, 180, 21, 15);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel(" 9");
		label_8.setBounds(1, 206, 21, 15);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("10");
		label_9.setBounds(1, 232, 22, 15);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("11");
		label_10.setBounds(0, 254, 14, 15);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("12");
		label_11.setBounds(1, 280, 21, 15);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("13");
		label_12.setBounds(1, 304, 14, 15);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("14");
		label_13.setBounds(1, 330, 14, 15);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("15");
		label_14.setBounds(1, 356, 14, 15);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("16");
		label_15.setBounds(1, 382, 14, 15);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_15);
		
		label_16 = new JLabel("17");
		label_16.setBounds(1, 408, 14, 15);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("18");
		label_17.setBounds(1, 428, 14, 15);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("19");
		label_18.setBounds(1, 454, 14, 15);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("20");
		label_19.setBounds(1, 480, 14, 15);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("21");
		label_20.setBounds(1, 506, 14, 15);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_20);
		
		JLabel label_21 = new JLabel("22");
		label_21.setBounds(1, 532, 14, 15);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("23");
		label_22.setBounds(0, 557, 14, 15);
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_22);
		
		JLabel label_23 = new JLabel("24");
		label_23.setBounds(1, 583, 14, 15);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_23);
		
		JLabel label_24 = new JLabel("25");
		label_24.setBounds(1, 605, 14, 15);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(label_24);
		
		JLabel label = new JLabel(" 1");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(1, 8, 21, 14);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(71, 110, 189, 638);
		contentPane.add(panel_2);
		
		textField = new JTextField();
		textField.setColumns(16);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(16);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(16);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setColumns(16);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setColumns(16);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setColumns(16);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("");
		textField_6.setColumns(16);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("");
		textField_7.setColumns(16);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("");
		textField_8.setColumns(16);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("");
		textField_9.setColumns(16);
		panel_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("");
		textField_10.setColumns(16);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("");
		textField_11.setColumns(16);
		panel_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("");
		textField_12.setColumns(16);
		panel_2.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("");
		textField_13.setColumns(16);
		panel_2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("");
		textField_14.setColumns(16);
		panel_2.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("");
		textField_15.setColumns(16);
		panel_2.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(16);
		panel_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("");
		textField_17.setColumns(16);
		panel_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("");
		textField_18.setColumns(16);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("");
		textField_19.setColumns(16);
		panel_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("");
		textField_20.setColumns(16);
		panel_2.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("");
		textField_21.setColumns(16);
		panel_2.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("");
		textField_22.setColumns(16);
		panel_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("");
		textField_23.setColumns(16);
		panel_2.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("");
		textField_24.setColumns(16);
		panel_2.add(textField_24);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(270, 110, 189, 638);
		contentPane.add(panel_3);
		
		textField_25 = new JTextField();
		textField_25.setColumns(16);
		panel_3.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(16);
		panel_3.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setText("");
		textField_27.setColumns(16);
		panel_3.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setText("");
		textField_28.setColumns(16);
		panel_3.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setText("");
		textField_29.setColumns(16);
		panel_3.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setText("");
		textField_30.setColumns(16);
		panel_3.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setText("");
		textField_31.setColumns(16);
		panel_3.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setText("");
		textField_32.setColumns(16);
		panel_3.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setText("");
		textField_33.setColumns(16);
		panel_3.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setText("");
		textField_34.setColumns(16);
		panel_3.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setText("");
		textField_35.setColumns(16);
		panel_3.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText("");
		textField_36.setColumns(16);
		panel_3.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setText("");
		textField_37.setColumns(16);
		panel_3.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setText("");
		textField_38.setColumns(16);
		panel_3.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setText("");
		textField_39.setColumns(16);
		panel_3.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setText("");
		textField_40.setColumns(16);
		panel_3.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(16);
		panel_3.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setText("");
		textField_42.setColumns(16);
		panel_3.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setText("");
		textField_43.setColumns(16);
		panel_3.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setText("");
		textField_44.setColumns(16);
		panel_3.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setText("");
		textField_45.setColumns(16);
		panel_3.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setText("");
		textField_46.setColumns(16);
		panel_3.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setText("");
		textField_47.setColumns(16);
		panel_3.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setText("");
		textField_48.setColumns(16);
		panel_3.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setText("");
		textField_49.setColumns(16);
		panel_3.add(textField_49);
	}
	public JLabel getLabel_16() {
		return label_16;
	}
}

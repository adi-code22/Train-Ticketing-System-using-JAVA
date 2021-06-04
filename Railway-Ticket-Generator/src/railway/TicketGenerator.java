package railway;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;

public class TicketGenerator {
	
	JFrame jf = new JFrame("South Coast Line Ticketing System");
	private JTextField txtHi;
	private JTextField txtDdmmyyyy;
	private JTextField txtSadsasd;
	private JTextField txtMohandas;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	
	
	
	public TicketGenerator() {
		JFrame jf = new JFrame("South Coast Line Ticketing System");
		jf.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		jf.setSize(1531, 822);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);

		ButtonGroup you = new ButtonGroup();
		
		
		
		ButtonGroup type = new ButtonGroup();
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPrint.setBounds(1056, 718, 395, 57);
		jf.getContentPane().add(btnPrint);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Grand Total");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1_2_1_1_1.setBounds(1056, 536, 317, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ticket Cost");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(396, 526, 137, 24);
		jf.getContentPane().add(lblNewLabel_2_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnReset.setBounds(61, 718, 272, 57);
		jf.getContentPane().add(btnReset);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(61, 23, 1390, 71);
		jf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("You are ?");
		lblNewLabel_1_1_1.setBounds(90, 212, 557, 37);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel = new JLabel("South Coast Line Ticketing System");
		lblNewLabel.setBounds(188, 10, 1033, 55);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 50));
		
		JLabel lblNewLabel_1 = new JLabel("Book Your Tickets !");
		lblNewLabel_1.setBounds(61, 116, 272, 20);
		jf.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(61, 146, 557, 53);
		jf.getContentPane().add(panel_1);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBounds(10, 10, 248, 33);
		panel_1.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"From", "Kiama", "Shellharbour", "Dapto", "Wollongong", "North Wollongong", "Thirroul", "Sutheriand", "Hurstville", "Wolli Creek", "Central"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBounds(299, 10, 248, 33);
		panel_1.add(comboBox_1);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"To", "Kiama", "Shellharbour", "Dapto", "Wollongong", "North Wollongong", "Thirroul", "Sutheriand", "Hurstville", "Wolli Creek", "Central"}));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(61, 209, 557, 7);
		jf.getContentPane().add(separator);
		separator.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1 = new JLabel("You are ?");
		lblNewLabel_1_1.setBounds(61, 209, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(61, 256, 557, 64);
		jf.getContentPane().add(panel_1_1);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1.setLayout(null);
		
		JRadioButton seniorB = new JRadioButton("Senior");
		seniorB.setBounds(388, 2, 138, 60);
		seniorB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(seniorB);
		you.add(seniorB);
		
		JRadioButton adultB = new JRadioButton("Adult");
		adultB.setBounds(45, 2, 110, 60);
		adultB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(adultB);
		
		JRadioButton childB = new JRadioButton("Children");
		childB.setHorizontalAlignment(SwingConstants.CENTER);
		childB.setBounds(168, 2, 200, 60);
		childB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(childB);
		
		you.add(adultB);
		you.add(childB);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(149, 330, 384, 7);
		jf.getContentPane().add(separator_1);
		separator_1.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Ticket type");
		lblNewLabel_1_1_2.setBounds(61, 345, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(61, 392, 557, 64);
		jf.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1_1.setLayout(null);
		
		JRadioButton oneway = new JRadioButton("One-way");
		oneway.setBounds(25, 6, 155, 54);
		panel_1_1_1.add(oneway);
		oneway.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		
		JRadioButton returnB = new JRadioButton("Return");
		returnB.setBounds(182, 7, 180, 52);
		panel_1_1_1.add(returnB);
		returnB.setHorizontalAlignment(SwingConstants.CENTER);
		returnB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		
		JRadioButton weeklyB = new JRadioButton("Weekly");
		weeklyB.setBounds(390, 3, 138, 60);
		panel_1_1_1.add(weeklyB);
		weeklyB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		type.add(weeklyB);
		type.add(returnB);
		type.add(oneway);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(149, 466, 384, 20);
		jf.getContentPane().add(separator_1_1);
		separator_1_1.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Passenger Details");
		lblNewLabel_1_1_2_1.setBounds(61, 479, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(61, 527, 93, 24);
		jf.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("Date of Birth");
		lblNewLabel_2_1.setBounds(61, 612, 137, 26);
		jf.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(643, 168, 8, 578);
		jf.getContentPane().add(separator_2);
		separator_2.setForeground(Color.BLUE);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		
		txtHi = new JTextField();
		txtHi.setBounds(61, 557, 307, 45);
		jf.getContentPane().add(txtHi);
		txtHi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtHi.setForeground(Color.BLACK);
		txtHi.setToolTipText("Name");
		txtHi.setColumns(10);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setBounds(61, 648, 196, 45);
		jf.getContentPane().add(txtDdmmyyyy);
		txtDdmmyyyy.setToolTipText("DD/MM/YYYY");
		txtDdmmyyyy.setForeground(Color.BLACK);
		txtDdmmyyyy.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtDdmmyyyy.setColumns(10);
		
		txtSadsasd = new JTextField();
		txtSadsasd.setBounds(382, 554, 222, 136);
		jf.getContentPane().add(txtSadsasd);
		txtSadsasd.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtSadsasd.setHorizontalAlignment(SwingConstants.CENTER);
		txtSadsasd.setEditable(false);
		txtSadsasd.setColumns(10);
		
		txtMohandas = new JTextField();
		txtMohandas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMohandas.setBackground(Color.BLACK);
		txtMohandas.setForeground(Color.WHITE);
		txtMohandas.setBounds(674, 146, 341, 107);
		jf.getContentPane().add(txtMohandas);
		txtMohandas.setEditable(false);
		txtMohandas.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(674, 260, 341, 107);
		jf.getContentPane().add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setForeground(Color.WHITE);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.BLACK);
		
		textField_7 = new JTextField();
		textField_7.setBounds(674, 378, 341, 107);
		jf.getContentPane().add(textField_7);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setForeground(Color.WHITE);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.BLACK);
		
		textField_8 = new JTextField();
		textField_8.setBounds(674, 495, 341, 107);
		jf.getContentPane().add(textField_8);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setForeground(Color.WHITE);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.BLACK);
		
		textField_9 = new JTextField();
		textField_9.setBounds(674, 612, 341, 107);
		jf.getContentPane().add(textField_9);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setForeground(Color.WHITE);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.BLACK);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(1038, 168, 8, 578);
		jf.getContentPane().add(separator_2_1);
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Order Summary");
		lblNewLabel_1_1_2_1_1.setBounds(1056, 146, 317, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1_1);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(346, 718, 272, 57);
		jf.getContentPane().add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		textField_1 = new JTextField();
		textField_1.setBounds(1056, 201, 395, 53);
		jf.getContentPane().add(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1205, 282, 96, 55);
		jf.getContentPane().add(textField_3);
		textField_3.setText("0");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1342, 282, 96, 55);
		jf.getContentPane().add(textField_4);
		textField_4.setText("0");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1070, 282, 96, 55);
		jf.getContentPane().add(textField_2);
		textField_2.setToolTipText("Adults");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0");
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(1056, 392, 395, 64);
		jf.getContentPane().add(textField_5);
		textField_5.setText("0");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Total Tickets");
		lblNewLabel_2_2_1_1_1_1.setBounds(1056, 462, 395, 24);
		jf.getContentPane().add(lblNewLabel_2_2_1_1_1_1);
		lblNewLabel_2_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(1138, 495, 239, 20);
		jf.getContentPane().add(separator_1_1_1);
		separator_1_1_1.setForeground(Color.BLUE);
		
		textField_6 = new JTextField();
		textField_6.setBounds(1122, 593, 341, 64);
		jf.getContentPane().add(textField_6);
		textField_6.setText("0");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("$");
		lblNewLabel_3.setBounds(1056, 592, 56, 64);
		jf.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Adult");
		lblNewLabel_2_2_1_1_1.setBounds(1070, 345, 96, 24);
		jf.getContentPane().add(lblNewLabel_2_2_1_1_1);
		lblNewLabel_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Children");
		lblNewLabel_2_2_1_1.setBounds(1205, 345, 96, 24);
		jf.getContentPane().add(lblNewLabel_2_2_1_1);
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2_2_1_1_2 = new JLabel("Senior");
		lblNewLabel_2_2_1_1_2.setBounds(1342, 345, 96, 24);
		jf.getContentPane().add(lblNewLabel_2_2_1_1_2);
		lblNewLabel_2_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		jf.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicketGenerator();
		
	}
}

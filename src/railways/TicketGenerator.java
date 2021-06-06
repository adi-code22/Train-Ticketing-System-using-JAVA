package railways;

import java.awt.Color;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class TicketGenerator extends FareCalculator implements ActionListener {
	
	JFrame jf = new JFrame("South Coast Line Ticketing System");
	
	private JTextField pName;
	private JTextField dob;
	private JTextField ticketCost;
	private JButton btnPrint = new JButton("PRINT");
	private JTextField adultSumm;
	private JTextField childrenSumm;
	private JTextField seniorSumm;
	private JTextField totalTickets;
	private JTextField grandTotal;
	private JComboBox<String> comboBoxFrom = new JComboBox<String>();
	private JComboBox<String> comboBoxTo = new JComboBox<String>();
	private JRadioButton childB = new JRadioButton("Children");
	private JRadioButton adultB = new JRadioButton("Adult");
	private JRadioButton seniorB = new JRadioButton("Senior");
	private JButton btnReset = new JButton("RESET");
	private JButton btnAdd = new JButton("ADD TICKET");
	private JRadioButton returnB = new JRadioButton("Return");
	private JRadioButton onewayB = new JRadioButton("One-way");
	private JRadioButton weeklyB = new JRadioButton("Weekly");
	private JTextArea input5 = new JTextArea();
	private JTextArea input4 = new JTextArea();
	private JTextArea input3 = new JTextArea();
	private JTextArea input2 = new JTextArea();
	private JTextArea input1 = new JTextArea();
	private JButton input3X = new JButton("X");
	private JButton input4X = new JButton("X");
	private JButton input1X = new JButton("X");
	private JButton input5X = new JButton("X");
	private JButton input2X = new JButton("X");
	private JLabel warning = new JLabel("");
	private JLabel lblNoTicketsTo = new JLabel("");
	private JTextArea journeySummary = new JTextArea();
	
	//flag Variables
	
	int input1a = 0;
	int input1c = 0;
	int input1s = 0;
	String input1n = null;
	String input1p = null;
	
	int input2a = 0;
	int input2c = 0;
	int input2s = 0;
	String input2n = null;
	String input2p = null;
	
	int input3a = 0;
	int input3c = 0;
	int input3s = 0;
	String input3n = null;
	String input3p = null;
	
	int input4a = 0;
	int input4c = 0;
	int input4s = 0;
	String input4n = null;
	String input4p = null;
	
	int input5a = 0;
	int input5c = 0;
	int input5s = 0;
	String input5n = null;
	String input5p = null;

	
	String youAre = null;
	String ticketType = null;
	
	String fileName = null;
	
	
	ButtonGroup you = new ButtonGroup();
	ButtonGroup type = new ButtonGroup();
	
	DecimalFormat df = new DecimalFormat("###.##");
	
	//Start and Finish Variables
	
	int start = 0;
	int stop = 0;
//	double total = 0;
//	int total_adult = 0;
//	int total_children = 0;
//	int total_senior = 0;
//	int total_tickets = 0;
	
	
	
	String ToSelect = null;
	String FromSelect = null;
	
	public TicketGenerator() {
		
		jf.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		jf.setSize(1531, 822);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);

		
		
		
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPrint.setBounds(1300, 718, 207, 57);
		jf.getContentPane().add(btnPrint);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Grand Total");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1_2_1_1_1.setBounds(1056, 536, 317, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ticket Cost (in $)");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(382, 526, 174, 24);
		jf.getContentPane().add(lblNewLabel_2_2);
		
		
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnReset.setBounds(1048, 718, 232, 57);
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
		lblNewLabel.setBounds(177, 10, 1033, 55);
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
		
		
		comboBoxFrom.setBackground(Color.WHITE);
		comboBoxFrom.setForeground(new Color(0, 0, 0));
		comboBoxFrom.setBounds(10, 10, 248, 33);
		panel_1.add(comboBoxFrom);
		comboBoxFrom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBoxFrom.setModel(new DefaultComboBoxModel<String>(new String[] {"From", "Kiama", "Shellharbour", "Dapto", "Wollongong", "NorthWollongong", "Thirroul", "Sutheriand", "Hurstville", "WolliCreek", "Central"}));
		
		
		comboBoxTo.setBackground(Color.WHITE);
		comboBoxTo.setForeground(Color.BLACK);
		comboBoxTo.setBounds(299, 10, 248, 33);
		panel_1.add(comboBoxTo);
		comboBoxTo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBoxTo.setModel(new DefaultComboBoxModel<String>(new String[] {"To", "Kiama", "Shellharbour", "Dapto", "Wollongong", "NorthWollongong", "Thirroul", "Sutheriand", "Hurstville", "WolliCreek", "Central"}));
		
		JLabel lblNewLabel_4 = new JLabel("-->");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(257, 15, 45, 23);
		panel_1.add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(61, 209, 557, 7);
		jf.getContentPane().add(separator);
		separator.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1 = new JLabel("You are*");
		lblNewLabel_1_1.setBounds(61, 209, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(61, 256, 557, 64);
		jf.getContentPane().add(panel_1_1);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1.setLayout(null);
		
		
		seniorB.setBounds(388, 2, 138, 60);
		seniorB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(seniorB);
		you.add(seniorB);
		
		
		adultB.setBounds(45, 2, 110, 60);
		adultB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(adultB);
		
		
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
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Ticket type*");
		lblNewLabel_1_1_2.setBounds(61, 345, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(61, 392, 557, 64);
		jf.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1_1.setLayout(null);
		
		
		onewayB.setBounds(25, 6, 155, 54);
		panel_1_1_1.add(onewayB);
		onewayB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		
		
		returnB.setBounds(182, 7, 180, 52);
		panel_1_1_1.add(returnB);
		returnB.setHorizontalAlignment(SwingConstants.CENTER);
		returnB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		
		
		weeklyB.setBounds(390, 3, 138, 60);
		panel_1_1_1.add(weeklyB);
		weeklyB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		type.add(weeklyB);
		type.add(returnB);
		type.add(onewayB);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(149, 466, 384, 20);
		jf.getContentPane().add(separator_1_1);
		separator_1_1.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Passenger Details");
		lblNewLabel_1_1_2_1.setBounds(61, 479, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Name*");
		lblNewLabel_2.setBounds(61, 527, 93, 24);
		jf.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("Date of Birth*");
		lblNewLabel_2_1.setBounds(61, 612, 137, 26);
		jf.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(628, 168, 8, 578);
		jf.getContentPane().add(separator_2);
		separator_2.setForeground(Color.BLUE);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		
		pName = new JTextField();
		pName.setBounds(61, 557, 307, 45);
		jf.getContentPane().add(pName);
		pName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pName.setForeground(Color.BLACK);
		pName.setToolTipText("Name");
		pName.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(61, 648, 196, 45);
		jf.getContentPane().add(dob);
		dob.setToolTipText("DD/MM/YYYY");
		dob.setForeground(Color.BLACK);
		dob.setFont(new Font("Tahoma", Font.PLAIN, 25));
		dob.setColumns(10);
		
		ticketCost = new JTextField();
		ticketCost.setBounds(382, 581, 222, 83);
		jf.getContentPane().add(ticketCost);
		ticketCost.setFont(new Font("Tahoma", Font.PLAIN, 35));
		ticketCost.setHorizontalAlignment(SwingConstants.CENTER);
		ticketCost.setEditable(false);
		ticketCost.setColumns(10);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(1038, 168, 8, 578);
		jf.getContentPane().add(separator_2_1);
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Order Summary");
		lblNewLabel_1_1_2_1_1.setBounds(1056, 146, 317, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1_1);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
		btnAdd.setBounds(61, 718, 557, 57);
		jf.getContentPane().add(btnAdd);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		childrenSumm = new JTextField();
		childrenSumm.setBounds(1205, 282, 96, 55);
		jf.getContentPane().add(childrenSumm);
		childrenSumm.setText("0");
		childrenSumm.setHorizontalAlignment(SwingConstants.CENTER);
		childrenSumm.setFont(new Font("Tahoma", Font.BOLD, 30));
		childrenSumm.setEditable(false);
		childrenSumm.setColumns(10);
		
		seniorSumm = new JTextField();
		seniorSumm.setBounds(1342, 282, 96, 55);
		jf.getContentPane().add(seniorSumm);
		seniorSumm.setText("0");
		seniorSumm.setHorizontalAlignment(SwingConstants.CENTER);
		seniorSumm.setFont(new Font("Tahoma", Font.BOLD, 30));
		seniorSumm.setEditable(false);
		seniorSumm.setColumns(10);
		
		adultSumm = new JTextField();
		adultSumm.setBounds(1070, 282, 96, 55);
		jf.getContentPane().add(adultSumm);
		adultSumm.setToolTipText("Adults");
		adultSumm.setHorizontalAlignment(SwingConstants.CENTER);
		adultSumm.setText("0");
		adultSumm.setFont(new Font("Tahoma", Font.BOLD, 30));
		adultSumm.setEditable(false);
		adultSumm.setColumns(10);
		
		totalTickets = new JTextField();
		totalTickets.setBounds(1056, 392, 395, 64);
		jf.getContentPane().add(totalTickets);
		totalTickets.setText("0");
		totalTickets.setHorizontalAlignment(SwingConstants.CENTER);
		totalTickets.setFont(new Font("Tahoma", Font.BOLD, 40));
		totalTickets.setEditable(false);
		totalTickets.setColumns(10);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Total Tickets");
		lblNewLabel_2_2_1_1_1_1.setBounds(1056, 462, 395, 24);
		jf.getContentPane().add(lblNewLabel_2_2_1_1_1_1);
		lblNewLabel_2_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(1138, 495, 239, 20);
		jf.getContentPane().add(separator_1_1_1);
		separator_1_1_1.setForeground(Color.BLUE);
		
		grandTotal = new JTextField();
		grandTotal.setBounds(1122, 593, 341, 64);
		jf.getContentPane().add(grandTotal);
		grandTotal.setText("0");
		grandTotal.setHorizontalAlignment(SwingConstants.CENTER);
		grandTotal.setFont(new Font("Tahoma", Font.BOLD, 40));
		grandTotal.setEditable(false);
		grandTotal.setColumns(10);
		
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
		input1.setEditable(false);
		input1.setBounds(635, 146, 341, 109);
		jf.getContentPane().add(input1);
		
		
		input1.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input1.setForeground(Color.WHITE);
		input1.setBackground(Color.BLACK);
		input2.setEditable(false);
		input2.setBounds(635, 260, 341, 109);
		jf.getContentPane().add(input2);
		
		
		input2.setForeground(Color.WHITE);
		input2.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input2.setBackground(Color.BLACK);
		input3.setEditable(false);
		input3.setBounds(635, 377, 341, 109);
		jf.getContentPane().add(input3);
		
		
		input3.setForeground(Color.WHITE);
		input3.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input3.setBackground(Color.BLACK);
		input5.setEditable(false);
		input5.setBounds(635, 610, 341, 109);
		jf.getContentPane().add(input5);
		

		input5.setForeground(Color.WHITE);
		input5.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input5.setBackground(Color.BLACK);
		input4.setEditable(false);
		input4.setBounds(635, 493, 341, 109);
		jf.getContentPane().add(input4);
		
	
		input4.setForeground(Color.WHITE);
		input4.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input4.setBackground(Color.BLACK);
		
		
		input2X.setBounds(979, 275, 56, 78);
		jf.getContentPane().add(input2X);
		input2X.setForeground(Color.RED);
		input2X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input3X.setBounds(979, 392, 56, 78);
		jf.getContentPane().add(input3X);
		input3X.setForeground(Color.RED);
		input3X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input4X.setBounds(979, 510, 56, 78);
		jf.getContentPane().add(input4X);
		input4X.setForeground(Color.RED);
		input4X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input5X.setBounds(979, 626, 56, 78);
		jf.getContentPane().add(input5X);
		input5X.setForeground(Color.RED);
		input5X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input1X.setBounds(979, 163, 56, 78);
		jf.getContentPane().add(input1X);
		input1X.setFont(new Font("Tahoma", Font.BOLD, 25));
		input1X.setForeground(Color.RED);
		
		
		warning.setForeground(Color.RED);
		warning.setFont(new Font("Tahoma", Font.PLAIN, 15));
		warning.setBounds(61, 695, 316, 24);
		jf.getContentPane().add(warning);
		
		
		lblNoTicketsTo.setBounds(1300, 695, 130, 24);
		jf.getContentPane().add(lblNoTicketsTo);
		lblNoTicketsTo.setForeground(Color.RED);
		lblNoTicketsTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		journeySummary.setBackground(SystemColor.menu);
		journeySummary.setEditable(false);
		journeySummary.setBounds(1056, 193, 395, 71);
		jf.getContentPane().add(journeySummary);
		
		
		journeySummary.setFont(new Font("Monospaced", Font.PLAIN, 20));
		journeySummary.setForeground(new Color(0, 128, 0));
		
		
		jf.setVisible(true);
		
		comboBoxFrom.addActionListener((ActionListener) this );
		comboBoxTo.addActionListener((ActionListener) this );
		adultB.addActionListener((ActionListener) this );
		childB.addActionListener((ActionListener) this );
		seniorB.addActionListener((ActionListener) this );
		onewayB.addActionListener((ActionListener) this );
		returnB.addActionListener((ActionListener) this );
		weeklyB.addActionListener((ActionListener) this );
		btnAdd.addActionListener((ActionListener) this );
		btnReset.addActionListener((ActionListener) this );
		btnPrint.addActionListener((ActionListener) this );


		if (start == 0 || stop == 0) {
			seniorB.setEnabled(false);
			adultB.setEnabled(false);
			childB.setEnabled(false);
			onewayB.setEnabled(false);
			returnB.setEnabled(false);
			weeklyB.setEnabled(false);
		}
		
}
public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		//comboBoxFrom
		if ( source == comboBoxFrom ) {
			FromSelect = comboBoxFrom.getItemAt(comboBoxFrom.getSelectedIndex()).toString();
			
			for (int i = 1 ; i<=10; i++) {
				if ( FromSelect == comboBoxFrom.getItemAt(i)) {
					start = i;
					break;
				}
			}
			if (start != 0 && stop != 0) {
				seniorB.setEnabled(true);
				adultB.setEnabled(true);
				childB.setEnabled(true);
				onewayB.setEnabled(true);
				returnB.setEnabled(true);
				weeklyB.setEnabled(true);
			}
		}
		
		//comboBoxTo
		if ( source == comboBoxTo ) {
			ToSelect = comboBoxTo.getItemAt(comboBoxTo.getSelectedIndex()).toString();
			
			for (int i = 1 ; i<=10; i++) {
				if ( ToSelect == comboBoxTo.getItemAt(i)) {
					stop = i;
					break;
				}
			}
			if (start != 0 && stop != 0) {
				seniorB.setEnabled(true);
				adultB.setEnabled(true);
				childB.setEnabled(true);
				onewayB.setEnabled(true);
				returnB.setEnabled(true);
				weeklyB.setEnabled(true);
			}
		}
		
		//adultB
		if ( source == adultB) {
			youAre = "Adult";
			weeklyB.setEnabled(true);
			if (ticketType == "OneWay") {
				double temp = AdultOne(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (ticketType == "Weekly") {
				double temp = AdultWeek(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (ticketType == "Return") {
				double temp = AdultRet(start, stop);
				ticketCost.setText(df.format(temp));
			}
		}
		
		//childB
		if ( source == childB) {
			youAre = "Children";
			weeklyB.setEnabled(true);
			if (ticketType == "OneWay") {
				double temp = ChildrenOne(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (ticketType == "Weekly") {
				double temp = ChildrenWeek(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (ticketType == "Return") {
				double temp = ChildrenRet(start, stop);
				ticketCost.setText(df.format(temp));
			}
		}
		
		//seniorB
		if ( source == seniorB) {
			youAre = "Senior";
			weeklyB.setEnabled(false);
			if (ticketType == "OneWay") {
				double temp = SeniorOne(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (ticketType == "Weekly") {
				ticketCost.setText("N/A");
			}
			if (ticketType == "Return") {
				double temp = SeniorRet(start, stop);
				ticketCost.setText(df.format(temp));
			}
		}
		
		//onewayB
		if ( source == onewayB) {
			
			ticketType = "OneWay";
			seniorB.setEnabled(true);
			if (youAre == "Adult") {
				double temp = AdultOne(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (youAre == "Children") {
				double temp = ChildrenOne(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (youAre == "Senior") {
				double temp = SeniorOne(start, stop);
				ticketCost.setText(df.format(temp));
			}
		
		}
		
		//weeklyB
		if ( source == weeklyB) {
			seniorB.setEnabled(false);
			ticketType = "Weekly";
			if (youAre == "Adult") {
				double temp = AdultWeek(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (youAre == "Children") {
				double temp = ChildrenWeek(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (youAre == "Senior") {
				ticketCost.setText("N/A");
			}
		}
		
		//returnB
		if ( source == returnB) {
			seniorB.setEnabled(true);
			ticketType = "Return";
			if (youAre == "Adult") {
				double temp = AdultRet(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (youAre == "Children") {
				double temp = ChildrenRet(start, stop);
				ticketCost.setText(df.format(temp));
			}
			if (youAre == "Senior") {
				double temp = SeniorRet(start, stop);
				ticketCost.setText(df.format(temp));
			}
		}
		
		//btnReset
		if ( source == btnReset) {
			
			start = 0;
			stop = 0;
			youAre = "";
			ticketType = "";
			
			input1a = 0;
			input1c = 0;
			input1s = 0;
			input1p = null;
			
			input2a = 0;
			input2c = 0;
			input2s = 0;
			input2p = null;
			
			input3a = 0;
			input3c = 0;
			input3s = 0;
			input3p = null;
			
			input4a = 0;
			input4c = 0;
			input4s = 0;
			input4p = null;
			
			input5a = 0;
			input5c = 0;
			input5s = 0;
			input5p = null;
			
			comboBoxFrom.setSelectedIndex(0);
			comboBoxTo.setSelectedIndex(0);
				
			seniorB.setEnabled(false);
			adultB.setEnabled(false);
			childB.setEnabled(false);
			onewayB.setEnabled(false);
			returnB.setEnabled(false);
			weeklyB.setEnabled(false);
			
			ticketCost.setText(null);
			pName.setText(null);
			dob.setText(null);
			journeySummary.setText(null);
			input1.setText(null);
			input2.setText(null);
			input3.setText(null);
			input4.setText(null);
			input5.setText(null);
			
			totalTickets.setText("0");
			adultSumm.setText("0");
			childrenSumm.setText("0");
			seniorSumm.setText("0");
			grandTotal.setText("0");
		}
		
		//btnAdd
		if ( source == btnAdd) {
			if (start != 0 && stop != 0 && youAre != null && ticketType != null && pName.getText().trim().length() != 0 && dob.getText().trim().length() != 0 && (input1.getText().trim().length() == 0 || input2.getText().trim().length() == 0 || input3.getText().trim().length() == 0 || input4.getText().trim().length() == 0 || input5.getText().trim().length() == 0)) {
			warning.setText("");
			String tempName = readTF(pName); 
			String tempDOB = readTF(dob); 
			String tempCost = readTF(ticketCost);
			if( input1.getText().trim().length() == 0) {
				
				input1n = tempName;
				input1.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " + ToSelect + "\n" + "$" +tempCost + "            "+ ticketType) ;
				if (youAre == "Adult") {
					input1a = 1;
				}
				else if (youAre == "Children") {
					input1c = 1;
				}
				else if (youAre == "Senior") {
					input1s = 1;
				}
				input1p = df.format(Double.valueOf(tempCost)); 
				
				
			}
			else if( input2.getText().trim().length() == 0) {
				
				input2n = tempName;
				input2.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " + ToSelect + "\n" + "$" +tempCost + "            "+ ticketType) ;
				if (youAre == "Adult") {
					input2a = 1;
				}
				else if (youAre == "Children") {
					input2c = 1;
				}
				else if (youAre == "Senior") {
					input2s = 1;
				}
				input2p = df.format(Double.valueOf(tempCost)); 
			}
			else if(  input3.getText().trim().length() == 0) {
				
				input3n = tempName;
				input3.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " + ToSelect + "\n" + "$" +tempCost + "            "+ ticketType) ;
				if (youAre == "Adult") {
					input3a = 1;
				}
				else if (youAre == "Children") {
					input3c = 1;
				}
				else if (youAre == "Senior") {
					input3s = 1;
				}
				input3p = df.format(Double.valueOf(tempCost)); 
			}
			else if( input4.getText().trim().length() == 0) {
				
				input4n = tempName;
				input4.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " + ToSelect + "\n" + "$" +tempCost + "            "+ ticketType) ;
				if (youAre == "Adult") {
					input4a = 1;
				}
				else if (youAre == "Children") {
					input4c = 1;
				}
				else if (youAre == "Senior") {
					input4s = 1;
				}
				input4p = df.format(Double.valueOf(tempCost)); 
				
			}
			else if( input5.getText().trim().length() == 0) {
				
				input5n = tempName;
				input5.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " + ToSelect + "\n" + "$" +tempCost + "            "+ ticketType) ;
				if (youAre == "Adult") {
					input5a = 1;
				}
				else if (youAre == "Children") {
					input5c = 1;
				}
				else if (youAre == "Senior") {
					input5s = 1;
				}
				input5p = df.format(Double.valueOf(tempCost)); 
			}

			if (youAre == "Adult") {
				
				
				adultSumm.setText(String.valueOf(Integer.valueOf(readTF(adultSumm)) + 1));
				
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(totalTickets)) + 1));
			}
			else if (youAre == "Children") {
				
				childrenSumm.setText(String.valueOf(Integer.valueOf(readTF(childrenSumm)) + 1));
				
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(totalTickets)) + 1));
			}
			else if (youAre == "Senior") {
				
				seniorSumm.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm)) + 1));
				
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(totalTickets)) + 1));
			}
			pName.setText(null);
			dob.setText(null);
			grandTotal.setText(String.valueOf(df.format(Double.valueOf(readTF(grandTotal)) + Double.valueOf(tempCost))));
			lblNoTicketsTo.setText(null);
			
		} 
			else {
			warning.setText("You are missing some mandatory fields");
		}
			if (input1.getText().trim().length() != 0 && input2.getText().trim().length() != 0 && input3.getText().trim().length() != 0 && input4.getText().trim().length() != 0 && input5.getText().trim().length() != 0){
				warning.setText("Only 5 entries are allowed in a single ticket");
			}
			
		}
	
		//input1X
		if ( source == input1X) {
			if(input1.getText().trim().length() != 0) {
				input1.setText(null);
				input1n = null;
				
				adultSumm.setText( String.valueOf(Integer.valueOf(readTF(adultSumm)) - input1a ));
				childrenSumm.setText(String.valueOf(Integer.valueOf(readTF(childrenSumm)) - input1c ));
				seniorSumm.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm)) - input1s ));	
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm))+ Integer.valueOf(readTF(adultSumm)) + Integer.valueOf(readTF(childrenSumm))));	
				grandTotal.setText(String.valueOf(df.format(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input1p))));	
			}
		}
		
		//input2X
		if ( source == input2X) {
			if(input2.getText().trim().length() != 0) {
				input2.setText(null);
				input2n = null;
				
				adultSumm.setText( String.valueOf(Integer.valueOf(readTF(adultSumm)) - input2a ));
				childrenSumm.setText(String.valueOf(Integer.valueOf(readTF(childrenSumm)) - input2c ));
				seniorSumm.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm)) - input2s ));	
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm))+ Integer.valueOf(readTF(adultSumm)) + Integer.valueOf(readTF(childrenSumm))));	
				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input2p)));	
				}
		}
		
		//input3X
		if ( source == input3X) {
			if(input3.getText().trim().length() != 0) {
				input3.setText(null);
				input3n = null;
				
				adultSumm.setText( String.valueOf(Integer.valueOf(readTF(adultSumm)) - input3a ));
				childrenSumm.setText(String.valueOf(Integer.valueOf(readTF(childrenSumm)) - input3c ));
				seniorSumm.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm)) - input3s ));	
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm))+ Integer.valueOf(readTF(adultSumm)) + Integer.valueOf(readTF(childrenSumm))));	
				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input3p)));		
				}
		}
		
		//input4X
		if ( source == input4X) {
			if(input4.getText().trim().length() != 0) {
				input4.setText(null);
				input4n = null;
				
				adultSumm.setText( String.valueOf(Integer.valueOf(readTF(adultSumm)) - input4a ));
				childrenSumm.setText(String.valueOf(Integer.valueOf(readTF(childrenSumm)) - input4c ));
				seniorSumm.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm)) - input4s ));	
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm))+ Integer.valueOf(readTF(adultSumm)) + Integer.valueOf(readTF(childrenSumm))));	
				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input4p)));	
				}
		}
		
		//input5X
		if ( source == input5X) {
			if(input5.getText().trim().length() != 0) {
				input5.setText(null);
				input5n = null;
				
				adultSumm.setText(String.valueOf(Integer.valueOf(readTF(adultSumm)) - input5a ));
				childrenSumm.setText(String.valueOf(Integer.valueOf(readTF(childrenSumm)) - input5c ));
				seniorSumm.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm)) - input5s ));	
				totalTickets.setText(String.valueOf(Integer.valueOf(readTF(seniorSumm))+ Integer.valueOf(readTF(adultSumm)) + Integer.valueOf(readTF(childrenSumm))));	
				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input5p)));	
				}
		}
		
		//btnPrint
		if(source == btnPrint) {
			String in1 = input1.getText();
			String in2 = input2.getText();
			String in3 = input3.getText();
			String in4 = input4.getText();
			String in5 = input5.getText();
			String ta = adultSumm.getText();
			String tc = childrenSumm.getText();
			String ts = seniorSumm.getText();
			String tt = totalTickets.getText();
			String tp = grandTotal.getText();
			
			if(input1n != null) {
				String temp2 = CreateAndWriteToFile(input1n, in1, in2, in3, in4, in5, ta, tc, ts, tt, tp);
				if(temp2 != "" ) {
					journeySummary.setText("Ticket Printed and Saved to\n"+ temp2);
				}
			}
			else if(input2n != null) {
				String temp2 = CreateAndWriteToFile(input2n, in1, in2, in3, in4, in5, ta, tc, ts, tt, tp);
				if(temp2 != "" ) {
					journeySummary.setText("Ticket Printed and Saved to\n"+ temp2 );
				}
			}
			else if(input3n != null) {
				String temp2 = CreateAndWriteToFile(input3n, in1, in2, in3, in4, in5, ta, tc, ts, tt, tp);
				if(temp2 != "" ) {
					journeySummary.setText("Ticket Printed and Saved to\n"+ temp2  );
				}
			}
			else if(input4n != null) {
				String temp2 = CreateAndWriteToFile(input4n, in1, in2, in3, in4, in5, ta, tc, ts, tt, tp);
				if(temp2 != "" ) {
					journeySummary.setText("Ticket Printed and Saved to\n" + temp2 );
				}
			}
			else if(input5n != null) {
				String temp2 = CreateAndWriteToFile(input5n, in1, in2, in3, in4, in5, ta, tc, ts, tt, tp);
				if(temp2 != "" ) {
					journeySummary.setText("Ticket Printed and Saved to\n"+ temp2  );
				}
			}
			else {
				lblNoTicketsTo.setText("No tickets to print");
			}
		}
	
	}
	
	public int Kiama = 1;
	public int Shellharbour = 2;
	public int Dapto = 3;
	public int Wollongong = 4;
	public int NorthWollongong = 5;
	public int Thirroul = 6;
	public int Sutherland = 7;
	public int Hurstville = 8;
	public int WolliCreek = 9;
	public int Central = 10;
}

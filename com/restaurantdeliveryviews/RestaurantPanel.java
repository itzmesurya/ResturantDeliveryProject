package com.restaurantdeliveryviews;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

public class RestaurantPanel extends JPanel {
	
	private static JComboBox comboBoxName;
	private static JTextField tf_C11;
	private static JTextField tf_C12;
	private static JFormattedTextField formattedTextField_1;
	private static JTextField tf_C23;
	private static JTextArea textDA;
	private static JButton btnRestaurant;
	private static JButton btnC231;
	private static JButton btnC39;
	
	private static JComboBox combo_C321;
	private static JComboBox combo_C322;
	private static JComboBox combo_C323;
	private static JComboBox combo_C324;
	private static JComboBox combo_C331;
	private static JComboBox combo_C332;
	private static JComboBox combo_C333;
	private static JComboBox combo_C334;
	private static JComboBox combo_C341;
	private static JComboBox combo_C342;
	private static JComboBox combo_C343;
	private static JComboBox combo_C344;
	private static JComboBox combo_C351;
	private static JComboBox combo_C352;
	private static JComboBox combo_C353;
	private static JComboBox combo_C354;
	private static JComboBox combo_C361;
	private static JComboBox combo_C362;
	private static JComboBox combo_C363;
	private static JComboBox combo_C364;
	private static JComboBox combo_C371;
	private static JComboBox combo_C372;
	private static JComboBox combo_C373;
	private static JComboBox combo_C374;
	private static JComboBox combo_C381;
	private static JComboBox combo_C382;
	private static JComboBox combo_C383;
	private static JComboBox combo_C384;
	
	private String action;
	JLabel lbl_1, lbl_2;
	
	String[] hours = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
	String[] minutes = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
	

	public RestaurantPanel(String crudAction) {
		action = crudAction;
		
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(0, 80));
		topPanel.setFont(new Font("Arial", Font.BOLD, 40));
		this.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
		lbl_1 = new JLabel("");
		lbl_1.setPreferredSize(new Dimension(300, 50));
		lbl_1.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setFont(new Font("Arial", Font.BOLD, 30));
		topPanel.add(lbl_1);
		
		JPanel Panel_2 = new JPanel();
		Panel_2.setPreferredSize(new Dimension(500, 30));
		Panel_2.setFont(new Font("Arial", Font.BOLD, 16));
		topPanel.add(Panel_2);
		Panel_2.setLayout(null);
		
		lbl_2 = new JLabel("Restaurant Name: ");
		lbl_2.setBounds(55, 12, 296, 58);
		lbl_2.setFont(new Font("Arial", Font.BOLD, 30));
		Panel_2.add(lbl_2);
		
		JComboBox comboBoxName = new JComboBox();
		comboBoxName.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		comboBoxName.setBackground(Color.CYAN);
		comboBoxName.setPreferredSize(new Dimension(500, 36));
		comboBoxName.setFont(new Font("Arial", Font.BOLD, 20));
		comboBoxName.setBounds(329, 22, 500, 36);
		Panel_2.add(comboBoxName);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(0, 80));
		bottomPanel.setFont(new Font("Arial", Font.BOLD, 16));
		this.add(bottomPanel, BorderLayout.SOUTH);
		
		btnRestaurant = new JButton("");
		btnRestaurant.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		btnRestaurant.setBackground(Color.YELLOW);
		btnRestaurant.setPreferredSize(new Dimension(200, 50));
		btnRestaurant.setFont(new Font("Arial", Font.BOLD, 30));
		bottomPanel.add(btnRestaurant);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(500, 0));
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);
		
		JPanel panel_C2 = new JPanel();
		panel_C2.setBounds(59, 259, 600, 300);
		panel_C2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C2.setPreferredSize(new Dimension(600, 300));
		centerPanel.add(panel_C2);
		
		JPanel Panel_C21 = new JPanel();
		Panel_C21.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		Panel_C21.setPreferredSize(new Dimension(596, 50));
		Panel_C21.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C2.add(Panel_C21);
		
		JLabel lbl_C21 = new JLabel("Delivery Area");
		lbl_C21.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C21.add(lbl_C21);
		
		JPanel panel_C22 = new JPanel();
		panel_C22.setPreferredSize(new Dimension(580, 180));
		panel_C2.add(panel_C22);
		
		textDA = new JTextArea();
		textDA.setFont(new Font("Arial", Font.BOLD, 20));
		textDA.setBackground(Color.CYAN);
		textDA.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		textDA.setPreferredSize(new Dimension(560, 170));
		panel_C22.add(textDA);
		
		JPanel Panel_C23 = new JPanel();
		Panel_C23.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		Panel_C23.setPreferredSize(new Dimension(596, 50));
		Panel_C23.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C2.add(Panel_C23);
		
		tf_C23 = new JTextField();
		tf_C23.setBackground(Color.CYAN);
		tf_C23.setPreferredSize(new Dimension(200, 40));
		tf_C23.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C23.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		Panel_C23.add(tf_C23);
		
		JButton btnC231 = new JButton("Add");
		btnC231.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		btnC231.setBackground(Color.YELLOW);
		btnC231.setPreferredSize(new Dimension(100, 40));
		btnC231.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C23.add(btnC231);
		
		JLabel lbl_C23 = new JLabel("                         ");
		lbl_C23.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C23.add(lbl_C23);
		
		JButton btnC232 = new JButton("Delete");
		btnC232.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		btnC232.setPreferredSize(new Dimension(150, 40));
		btnC232.setFont(new Font("Arial", Font.BOLD, 20));
		btnC232.setBackground(Color.YELLOW);
		Panel_C23.add(btnC232);
		
		JPanel panel_C1 = new JPanel();
		panel_C1.setBounds(59, 36, 600, 180);
		panel_C1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C1.setPreferredSize(new Dimension(600, 180));
		centerPanel.add(panel_C1);
		
		JPanel Panel_C11 = new JPanel();
		Panel_C11.setPreferredSize(new Dimension(580, 50));
		Panel_C11.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C11);
		
		JLabel lbl_C11 = new JLabel("Restaurant Name: ");
		lbl_C11.setPreferredSize(new Dimension(200, 40));
		lbl_C11.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C11.add(lbl_C11);
		
		tf_C11 = new JTextField();
		tf_C11.setBackground(Color.CYAN);
		tf_C11.setPreferredSize(new Dimension(350, 40));
		tf_C11.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C11.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		Panel_C11.add(tf_C11);
		
		JPanel Panel_C12 = new JPanel();
		Panel_C12.setPreferredSize(new Dimension(580, 50));
		Panel_C12.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C12);
		
		JLabel lbl_C12 = new JLabel("Restaurant Address: ");
		lbl_C12.setPreferredSize(new Dimension(200, 40));
		lbl_C12.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C12.add(lbl_C12);
		
		tf_C12 = new JTextField();
		tf_C12.setBackground(Color.CYAN);
		tf_C12.setPreferredSize(new Dimension(350, 40));
		tf_C12.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C12.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		Panel_C12.add(tf_C12);
		
		JPanel Panel_C13 = new JPanel();
		Panel_C13.setPreferredSize(new Dimension(580, 50));
		Panel_C13.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C13);
		
		JLabel lbl_C131 = new JLabel("Telephone Number: ");
		lbl_C131.setPreferredSize(new Dimension(200, 40));
		lbl_C131.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C13.add(lbl_C131);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setPreferredSize(new Dimension(350, 40));		
		try{
			MaskFormatter tel1 = new MaskFormatter("### ### - ####");
			formattedTextField_1 = new JFormattedTextField(tel1);
			formattedTextField_1.setBackground(Color.CYAN);
			formattedTextField_1.setFont(new Font("Arial", Font.BOLD, 20));
			formattedTextField_1.setPreferredSize(new Dimension(150, 40));
		}catch(ParseException e){
			//System.err.println("Please enter number.");
		}
		Panel_C13.add(formattedTextField_1);
		
		JLabel lbl_C132 = new JLabel("                                                   ");
		lbl_C132.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C13.add(lbl_C132);
		
		JPanel panel_C3 = new JPanel();
		panel_C3.setBounds(717, 24, 400, 550);
		panel_C3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C3.setPreferredSize(new Dimension(400, 550));
		centerPanel.add(panel_C3);
		
		JPanel Panel_C31 = new JPanel();
		Panel_C31.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		Panel_C31.setPreferredSize(new Dimension(396, 50));
		Panel_C31.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C31);
		
		JLabel lbl_C311 = new JLabel("Day");
		lbl_C311.setPreferredSize(new Dimension(80, 30));
		lbl_C311.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C31.add(lbl_C311);
		
		JLabel lbl_C312 = new JLabel("Opens");
		lbl_C312.setPreferredSize(new Dimension(150, 30));
		lbl_C312.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C31.add(lbl_C312);
		
		JLabel lbl_C313 = new JLabel("Closes");
		lbl_C313.setPreferredSize(new Dimension(100, 30));
		lbl_C313.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C31.add(lbl_C313);
		
		JPanel Panel_C32 = new JPanel();
		Panel_C32.setPreferredSize(new Dimension(380, 50));
		Panel_C32.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C32);
		
		JLabel lbl_C321 = new JLabel("Sun");
		lbl_C321.setPreferredSize(new Dimension(60, 30));
		lbl_C321.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C32.add(lbl_C321);
		
		combo_C321 = new JComboBox(hours);
		combo_C321.setBackground(Color.MAGENTA);
		combo_C321.setToolTipText("");
		combo_C321.setPreferredSize(new Dimension(43, 21));
		combo_C321.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C321);
		
		JLabel lbl_C322 = new JLabel(" h ");
		lbl_C322.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(lbl_C322);
		
		combo_C322 = new JComboBox(minutes);
		combo_C322.setBackground(Color.MAGENTA);
		combo_C322.setToolTipText("");
		combo_C322.setPreferredSize(new Dimension(43, 21));
		combo_C322.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C322);
		
		JLabel lbl_C323 = new JLabel("          ");
		lbl_C323.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(lbl_C323);
		
		combo_C323 = new JComboBox(hours);
		combo_C323.setBackground(Color.MAGENTA);
		combo_C323.setToolTipText("");
		combo_C323.setPreferredSize(new Dimension(43, 21));
		combo_C323.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C323);
		
		JLabel lbl_C324 = new JLabel(" h ");
		lbl_C324.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(lbl_C324);
		
		combo_C324 = new JComboBox(minutes);
		combo_C324.setBackground(Color.MAGENTA);
		combo_C324.setToolTipText("");
		combo_C324.setPreferredSize(new Dimension(43, 21));
		combo_C324.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C324);
		
		JPanel Panel_C33 = new JPanel();
		Panel_C33.setPreferredSize(new Dimension(380, 50));
		Panel_C33.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C33);
		
		JLabel lbl_C331 = new JLabel("Mon");
		lbl_C331.setPreferredSize(new Dimension(60, 30));
		lbl_C331.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C33.add(lbl_C331);
		
		combo_C331 = new JComboBox(hours);
		combo_C331.setBackground(Color.MAGENTA);
		combo_C331.setToolTipText("");
		combo_C331.setPreferredSize(new Dimension(43, 21));
		combo_C331.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C331);
		
		JLabel lbl_C332 = new JLabel(" h ");
		lbl_C332.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(lbl_C332);
		
		combo_C332 = new JComboBox(minutes);
		combo_C332.setBackground(Color.MAGENTA);
		combo_C332.setToolTipText("");
		combo_C332.setPreferredSize(new Dimension(43, 21));
		combo_C332.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C332);
		
		JLabel lbl_C333 = new JLabel("          ");
		lbl_C333.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(lbl_C333);
		
		combo_C333 = new JComboBox(hours);
		combo_C333.setBackground(Color.MAGENTA);
		combo_C333.setToolTipText("");
		combo_C333.setPreferredSize(new Dimension(43, 21));
		combo_C333.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C333);
		
		JLabel lbl_C334 = new JLabel(" h ");
		lbl_C334.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(lbl_C334);
		
		combo_C334 = new JComboBox(minutes);
		combo_C334.setBackground(Color.MAGENTA);
		combo_C334.setToolTipText("");
		combo_C334.setPreferredSize(new Dimension(43, 21));
		combo_C334.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C334);
		
		JPanel Panel_C34 = new JPanel();
		Panel_C34.setPreferredSize(new Dimension(380, 50));
		Panel_C34.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C34);
		
		JLabel lbl_C341 = new JLabel("Tue");
		lbl_C341.setPreferredSize(new Dimension(60, 30));
		lbl_C341.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C34.add(lbl_C341);
		
		combo_C341 = new JComboBox(hours);
		combo_C341.setBackground(Color.MAGENTA);
		combo_C341.setToolTipText("");
		combo_C341.setPreferredSize(new Dimension(43, 21));
		combo_C341.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C341);
		
		JLabel lbl_C342 = new JLabel(" h ");
		lbl_C342.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(lbl_C342);
		
		combo_C342 = new JComboBox(minutes);
		combo_C342.setBackground(Color.MAGENTA);
		combo_C342.setToolTipText("");
		combo_C342.setPreferredSize(new Dimension(43, 21));
		combo_C342.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C342);
		
		JLabel lbl_C343 = new JLabel("          ");
		lbl_C343.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(lbl_C343);
		
		combo_C343 = new JComboBox(hours);
		combo_C343.setBackground(Color.MAGENTA);
		combo_C343.setToolTipText("");
		combo_C343.setPreferredSize(new Dimension(43, 21));
		combo_C343.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C343);
		
		JLabel lbl_C344 = new JLabel(" h ");
		lbl_C344.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(lbl_C344);
		
		combo_C344 = new JComboBox(minutes);
		combo_C344.setBackground(Color.MAGENTA);
		combo_C344.setToolTipText("");
		combo_C344.setPreferredSize(new Dimension(43, 21));
		combo_C344.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C344);
		
		JPanel Panel_C35 = new JPanel();
		Panel_C35.setPreferredSize(new Dimension(380, 50));
		Panel_C35.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C35);
		
		JLabel lbl_C351 = new JLabel("Wed");
		lbl_C351.setPreferredSize(new Dimension(60, 30));
		lbl_C351.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C35.add(lbl_C351);
		
		combo_C351 = new JComboBox(hours);
		combo_C351.setBackground(Color.MAGENTA);
		combo_C351.setToolTipText("");
		combo_C351.setPreferredSize(new Dimension(43, 21));
		combo_C351.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C351);
		
		JLabel lbl_C352 = new JLabel(" h ");
		lbl_C352.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(lbl_C352);
		
		combo_C352 = new JComboBox(minutes);
		combo_C352.setBackground(Color.MAGENTA);
		combo_C352.setToolTipText("");
		combo_C352.setPreferredSize(new Dimension(43, 21));
		combo_C352.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C352);
		
		JLabel lbl_C353 = new JLabel("          ");
		lbl_C353.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(lbl_C353);
		
		combo_C353 = new JComboBox(hours);
		combo_C353.setBackground(Color.MAGENTA);
		combo_C353.setToolTipText("");
		combo_C353.setPreferredSize(new Dimension(43, 21));
		combo_C353.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C353);
		
		JLabel lbl_C354 = new JLabel(" h ");
		lbl_C354.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(lbl_C354);
		
		combo_C354 = new JComboBox(minutes);
		combo_C354.setBackground(Color.MAGENTA);
		combo_C354.setToolTipText("");
		combo_C354.setPreferredSize(new Dimension(43, 21));
		combo_C354.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C354);
		
		JPanel Panel_C36 = new JPanel();
		Panel_C36.setPreferredSize(new Dimension(380, 50));
		Panel_C36.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C36);
		
		JLabel lbl_C361 = new JLabel("Thu");
		lbl_C361.setPreferredSize(new Dimension(60, 30));
		lbl_C361.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C36.add(lbl_C361);
		
		combo_C361 = new JComboBox(hours);
		combo_C361.setBackground(Color.MAGENTA);
		combo_C361.setToolTipText("");
		combo_C361.setPreferredSize(new Dimension(43, 21));
		combo_C361.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C361);
		
		JLabel lbl_C362 = new JLabel(" h ");
		lbl_C362.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(lbl_C362);
		
		combo_C362 = new JComboBox(minutes);
		combo_C362.setBackground(Color.MAGENTA);
		combo_C362.setToolTipText("");
		combo_C362.setPreferredSize(new Dimension(43, 21));
		combo_C362.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C362);
		
		JLabel lbl_C363 = new JLabel("          ");
		lbl_C363.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(lbl_C363);
		
		combo_C363 = new JComboBox(hours);
		combo_C363.setBackground(Color.MAGENTA);
		combo_C363.setToolTipText("");
		combo_C363.setPreferredSize(new Dimension(43, 21));
		combo_C363.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C363);
		
		JLabel lbl_C364 = new JLabel(" h ");
		lbl_C364.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(lbl_C364);
		
		combo_C364 = new JComboBox(minutes);
		combo_C364.setBackground(Color.MAGENTA);
		combo_C364.setToolTipText("");
		combo_C364.setPreferredSize(new Dimension(43, 21));
		combo_C364.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C364);
		
		JPanel Panel_C37 = new JPanel();
		Panel_C37.setPreferredSize(new Dimension(380, 50));
		Panel_C37.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C37);
		
		JLabel lbl_C371 = new JLabel("Fri");
		lbl_C371.setPreferredSize(new Dimension(60, 30));
		lbl_C371.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C37.add(lbl_C371);
		
		combo_C371 = new JComboBox(hours);
		combo_C371.setBackground(Color.MAGENTA);
		combo_C371.setToolTipText("");
		combo_C371.setPreferredSize(new Dimension(43, 21));
		combo_C371.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C371);
		
		JLabel lbl_C372 = new JLabel(" h ");
		lbl_C372.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(lbl_C372);
		
		combo_C372 = new JComboBox(minutes);
		combo_C372.setBackground(Color.MAGENTA);
		combo_C372.setToolTipText("");
		combo_C372.setPreferredSize(new Dimension(43, 21));
		combo_C372.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C372);
		
		JLabel lbl_C373 = new JLabel("          ");
		lbl_C373.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(lbl_C373);
		
		combo_C373 = new JComboBox(hours);
		combo_C373.setBackground(Color.MAGENTA);
		combo_C373.setToolTipText("");
		combo_C373.setPreferredSize(new Dimension(43, 21));
		combo_C373.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C373);
		
		JLabel lbl_C374 = new JLabel(" h ");
		lbl_C374.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(lbl_C374);
		
		combo_C374 = new JComboBox(minutes);
		combo_C374.setBackground(Color.MAGENTA);
		combo_C374.setToolTipText("");
		combo_C374.setPreferredSize(new Dimension(43, 21));
		combo_C374.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C374);
		
		JPanel Panel_C38 = new JPanel();
		Panel_C38.setPreferredSize(new Dimension(380, 50));
		Panel_C38.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C38);
		
		JLabel lbl_C381 = new JLabel("Sat");
		lbl_C381.setPreferredSize(new Dimension(60, 30));
		lbl_C381.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C38.add(lbl_C381);
		
		combo_C381 = new JComboBox(hours);
		combo_C381.setBackground(Color.MAGENTA);
		combo_C381.setToolTipText("");
		combo_C381.setPreferredSize(new Dimension(43, 21));
		combo_C381.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C381);
		
		JLabel lbl_C382 = new JLabel(" h ");
		lbl_C382.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(lbl_C382);
		
		combo_C382 = new JComboBox(minutes);
		combo_C382.setBackground(Color.MAGENTA);
		combo_C382.setToolTipText("");
		combo_C382.setPreferredSize(new Dimension(43, 21));
		combo_C382.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C382);
		
		JLabel lbl_C383 = new JLabel("          ");
		lbl_C383.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(lbl_C383);
		
		combo_C383 = new JComboBox(hours);
		combo_C383.setBackground(Color.MAGENTA);
		combo_C383.setToolTipText("");
		combo_C383.setPreferredSize(new Dimension(43, 21));
		combo_C383.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C383);
		
		JLabel lbl_C384 = new JLabel(" h ");
		lbl_C384.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(lbl_C384);
		
		combo_C384 = new JComboBox(minutes);
		combo_C384.setBackground(Color.MAGENTA);
		combo_C384.setToolTipText("");
		combo_C384.setPreferredSize(new Dimension(43, 21));
		combo_C384.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C384);
		
		JPanel Panel_C39 = new JPanel();
		Panel_C39.setPreferredSize(new Dimension(380, 70));
		Panel_C39.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C39);
		
		btnC39 = new JButton("Modify all at once");
		btnC39.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		btnC39.setBackground(Color.YELLOW);
		btnC39.setPreferredSize(new Dimension(360, 50));
		btnC39.setFont(new Font("Arial", Font.BOLD, 30));
		Panel_C39.add(btnC39);
		AdaptToAction();
	}
	
	 private void AdaptToAction() {
			switch (this.action) {
			case "add":
				lbl_1.setText("Add Restaurant");
				btnRestaurant.setText("Add");
			    lbl_2.setVisible(false);
			    comboBoxName.setVisible(false);
			    break;
			case "edit":
				lbl_1.setText("Edit Restaurant");
				btnRestaurant.setText("Edit");
			    lbl_2.setVisible(true);
			    comboBoxName.setVisible(true);
			    break;
			case "delete":
				lbl_1.setText("Delete Restaurant");
				btnRestaurant.setText("Delete");
			    lbl_2.setVisible(true);
			    comboBoxName.setVisible(true);
			    break;
			default:
			    break;
			}

		    }
		    void setPanelEnabled(JPanel panel, Boolean isEnabled) {
			    panel.setEnabled(isEnabled);

			    Component[] components = panel.getComponents();

			    for (Component component : components) {
			        if (component instanceof JPanel) {
			            setPanelEnabled((JPanel) component, isEnabled);
			        }
			        component.setEnabled(isEnabled);
			    }
			}
	
	public static JComboBox getRestaurantnameCB() {
		return comboBoxName;
	}
	
	public static JTextField getTf_C11() {
		return tf_C11;
	}
	
	public static JTextField getTf_C12() {
		return tf_C12;
	}
	
	public static JFormattedTextField getFormattedTextField_1() {
		return formattedTextField_1;
	}
	
	public static String[] getTextDA() {
		return textDA;
	}
	
	public static JComboBox getCombo_C321() {
		return combo_C321;
	}
	public static JComboBox getCombo_C322() {
		return combo_C322;
	}
	public static JComboBox getCombo_C323() {
		return combo_C323;
	}
	public static JComboBox getCombo_C324() {
		return combo_C324;
	}
	public static JComboBox getCombo_C331() {
		return combo_C331;
	}
	public static JComboBox getCombo_C332() {
		return combo_C332;
	}
	public static JComboBox getCombo_C333() {
		return combo_C333;
	}
	public static JComboBox getCombo_C334() {
		return combo_C334;
	}
	public static JComboBox getCombo_C341() {
		return combo_C341;
	}
	public static JComboBox getCombo_C342() {
		return combo_C342;
	}
	public static JComboBox getCombo_C343() {
		return combo_C343;
	}
	public static JComboBox getCombo_C344() {
		return combo_C344;
	}
	public static JComboBox getCombo_C351() {
		return combo_C351;
	}
	public static JComboBox getCombo_C352() {
		return combo_C352;
	}
	public static JComboBox getCombo_C353() {
		return combo_C353;
	}
	public static JComboBox getCombo_C354() {
		return combo_C354;
	}
	public static JComboBox getCombo_C361() {
		return combo_C361;
	}
	public static JComboBox getCombo_C362() {
		return combo_C362;
	}
	public static JComboBox getCombo_C363() {
		return combo_C363;
	}
	public static JComboBox getCombo_C364() {
		return combo_C364;
	}
	public static JComboBox getCombo_C371() {
		return combo_C371;
	}
	public static JComboBox getCombo_C372() {
		return combo_C372;
	}
	public static JComboBox getCombo_C373() {
		return combo_C373;
	}
	public static JComboBox getCombo_C374() {
		return combo_C374;
	}
	public static JComboBox getCombo_C381() {
		return combo_C381;
	}
	public static JComboBox getCombo_C382() {
		return combo_C382;
	}
	public static JComboBox getCombo_C383() {
		return combo_C383;
	}
	public static JComboBox getCombo_C384() {
		return combo_C384;
	}
	
	public static JButton getBtnRestaurant() {
		return btnRestaurant;
	}
	
	public static JButton getBtnC39() {
		return btnC39;
	}
	
}

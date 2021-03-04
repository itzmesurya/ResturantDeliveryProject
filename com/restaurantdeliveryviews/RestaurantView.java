package com.restaurantdeliveryviews;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RestaurantView {

	private JFrame frame;
	private JTextField textField;
	private JTextField tf_C11;
	private JTextField tf_C12;
	private JFormattedTextField formattedTextField_1;
	private JTextField tf_C23;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantView window = new RestaurantView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RestaurantView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(200, 10, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_Restaurant = new JPanel();
		frame.getContentPane().add(panel_Restaurant, BorderLayout.CENTER);
		panel_Restaurant.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.BLACK);
		topPanel.setPreferredSize(new Dimension(0, 80));
		topPanel.setFont(new Font("Arial", Font.BOLD, 40));
		panel_Restaurant.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
		JLabel lbl_1 = new JLabel("Add Restaurant");
		lbl_1.setForeground(Color.WHITE);
		lbl_1.setBackground(Color.WHITE);
		lbl_1.setPreferredSize(new Dimension(300, 50));
		lbl_1.setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.RED));
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setFont(new Font("Arial", Font.BOLD, 30));
		topPanel.add(lbl_1);
		
		JPanel Panel_2 = new JPanel();
		Panel_2.setBackground(Color.BLACK);
		Panel_2.setPreferredSize(new Dimension(500, 30));
		Panel_2.setFont(new Font("Arial", Font.BOLD, 16));
		topPanel.add(Panel_2);
		Panel_2.setLayout(null);
		
		JLabel lbl_2 = new JLabel("Restaurant Name: ");
		lbl_2.setForeground(Color.RED);
		lbl_2.setBounds(55, 12, 296, 58);
		lbl_2.setFont(new Font("Arial", Font.BOLD, 30));
		Panel_2.add(lbl_2);
		
		JComboBox comboBoxName = new JComboBox();
		comboBoxName.setBorder(new LineBorder(Color.RED, 2, true));
		comboBoxName.setBackground(Color.WHITE);
		comboBoxName.setPreferredSize(new Dimension(500, 36));
		comboBoxName.setFont(new Font("Arial", Font.BOLD, 20));
		comboBoxName.setBounds(329, 22, 500, 36);
		Panel_2.add(comboBoxName);
		
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setPreferredSize(new Dimension(0, 80));
		bottomPanel.setFont(new Font("Arial", Font.BOLD, 16));
		panel_Restaurant.add(bottomPanel, BorderLayout.SOUTH);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.BLACK);
		btnSave.setBorder(new LineBorder(Color.RED, 2, true));
		btnSave.setBackground(Color.WHITE);
		btnSave.setPreferredSize(new Dimension(200, 50));
		btnSave.setFont(new Font("Arial", Font.BOLD, 30));
		bottomPanel.add(btnSave);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setPreferredSize(new Dimension(500, 0));
		panel_Restaurant.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);
		
		JPanel panel_C2 = new JPanel();
		panel_C2.setBackground(Color.BLACK);
		panel_C2.setBounds(59, 259, 600, 300);
		panel_C2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C2.setPreferredSize(new Dimension(600, 300));
		centerPanel.add(panel_C2);
		
		JPanel Panel_C21 = new JPanel();
		Panel_C21.setBackground(Color.BLACK);
		Panel_C21.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		Panel_C21.setPreferredSize(new Dimension(596, 50));
		Panel_C21.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C2.add(Panel_C21);
		
		JLabel lbl_C21 = new JLabel("Delivery Area");
		lbl_C21.setForeground(Color.RED);
		lbl_C21.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C21.add(lbl_C21);
		
		JPanel panel_C22 = new JPanel();
		panel_C22.setBackground(Color.WHITE);
		panel_C22.setPreferredSize(new Dimension(580, 180));
		panel_C2.add(panel_C22);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		table.setFont(MainFrame.labelFont);
		table.setBackground(Color.WHITE);
		panel_C22.add(table);
		
		JPanel Panel_C23 = new JPanel();
		Panel_C23.setBackground(Color.BLACK);
		Panel_C23.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		Panel_C23.setPreferredSize(new Dimension(596, 50));
		Panel_C23.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C2.add(Panel_C23);
		
		tf_C23 = new JTextField();
		tf_C23.setBackground(Color.WHITE);
		tf_C23.setPreferredSize(new Dimension(200, 40));
		tf_C23.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C23.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		Panel_C23.add(tf_C23);
		
		JButton btnC231 = new JButton("Add");
		btnC231.setForeground(Color.BLACK);
		btnC231.setBorder(new LineBorder(Color.RED, 2, true));
		btnC231.setBackground(Color.WHITE);
		btnC231.setPreferredSize(new Dimension(100, 40));
		btnC231.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C23.add(btnC231);
		
		JLabel lbl_C23 = new JLabel("                         ");
		lbl_C23.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C23.add(lbl_C23);
		
		JButton btnC232 = new JButton("Delete");
		btnC232.setForeground(Color.BLACK);
		btnC232.setBorder(new LineBorder(Color.RED, 2, true));
		btnC232.setPreferredSize(new Dimension(150, 40));
		btnC232.setFont(new Font("Arial", Font.BOLD, 20));
		btnC232.setBackground(Color.WHITE);
		Panel_C23.add(btnC232);
		
		JPanel panel_C1 = new JPanel();
		panel_C1.setBackground(Color.BLACK);
		panel_C1.setBounds(59, 36, 600, 180);
		panel_C1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C1.setPreferredSize(new Dimension(600, 180));
		centerPanel.add(panel_C1);
		
		JPanel Panel_C11 = new JPanel();
		Panel_C11.setBackground(Color.BLACK);
		Panel_C11.setPreferredSize(new Dimension(580, 50));
		Panel_C11.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C11);
		
		JLabel lbl_C11 = new JLabel("Restaurant Name: ");
		lbl_C11.setForeground(Color.RED);
		lbl_C11.setBackground(Color.WHITE);
		lbl_C11.setPreferredSize(new Dimension(200, 40));
		lbl_C11.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C11.add(lbl_C11);
		
		tf_C11 = new JTextField();
		tf_C11.setBackground(Color.WHITE);
		tf_C11.setPreferredSize(new Dimension(350, 40));
		tf_C11.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C11.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		Panel_C11.add(tf_C11);
		
		JPanel Panel_C12 = new JPanel();
		Panel_C12.setBackground(Color.BLACK);
		Panel_C12.setPreferredSize(new Dimension(580, 50));
		Panel_C12.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C12);
		
		JLabel lbl_C12 = new JLabel("Restaurant Address: ");
		lbl_C12.setForeground(Color.RED);
		lbl_C12.setBackground(Color.WHITE);
		lbl_C12.setPreferredSize(new Dimension(200, 40));
		lbl_C12.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C12.add(lbl_C12);
		
		tf_C12 = new JTextField();
		tf_C12.setBackground(Color.WHITE);
		tf_C12.setPreferredSize(new Dimension(350, 40));
		tf_C12.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C12.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		Panel_C12.add(tf_C12);
		
		JPanel Panel_C13 = new JPanel();
		Panel_C13.setBackground(Color.BLACK);
		Panel_C13.setPreferredSize(new Dimension(580, 50));
		Panel_C13.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C13);
		
		JLabel lbl_C131 = new JLabel("Telephone Number: ");
		lbl_C131.setForeground(Color.RED);
		lbl_C131.setPreferredSize(new Dimension(200, 40));
		lbl_C131.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C13.add(lbl_C131);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setPreferredSize(new Dimension(350, 40));		
		try{
			MaskFormatter tel1 = new MaskFormatter("### ### - ####");
			formattedTextField_1 = new JFormattedTextField(tel1);
			formattedTextField_1.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
			formattedTextField_1.setBackground(Color.WHITE);
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
		panel_C3.setBackground(Color.BLACK);
		panel_C3.setBounds(717, 24, 400, 550);
		panel_C3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C3.setPreferredSize(new Dimension(400, 550));
		centerPanel.add(panel_C3);
		
		JPanel Panel_C31 = new JPanel();
		Panel_C31.setBackground(Color.BLACK);
		Panel_C31.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		Panel_C31.setPreferredSize(new Dimension(396, 50));
		Panel_C31.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C31);
		
		JLabel lbl_C311 = new JLabel("Day");
		lbl_C311.setForeground(Color.RED);
		lbl_C311.setPreferredSize(new Dimension(80, 30));
		lbl_C311.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C31.add(lbl_C311);
		
		JLabel lbl_C312 = new JLabel("Opens");
		lbl_C312.setForeground(Color.RED);
		lbl_C312.setPreferredSize(new Dimension(150, 30));
		lbl_C312.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C31.add(lbl_C312);
		
		JLabel lbl_C313 = new JLabel("Closes");
		lbl_C313.setForeground(Color.RED);
		lbl_C313.setPreferredSize(new Dimension(100, 30));
		lbl_C313.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C31.add(lbl_C313);
		
		JPanel Panel_C32 = new JPanel();
		Panel_C32.setBackground(Color.BLACK);
		Panel_C32.setPreferredSize(new Dimension(380, 50));
		Panel_C32.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C32);
		
		JLabel lbl_C321 = new JLabel("Sun");
		lbl_C321.setForeground(Color.RED);
		lbl_C321.setPreferredSize(new Dimension(60, 30));
		lbl_C321.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C32.add(lbl_C321);
		
		JComboBox combo_C321 = new JComboBox();
		combo_C321.setBackground(Color.WHITE);
		combo_C321.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C321.setToolTipText("");
		combo_C321.setPreferredSize(new Dimension(43, 21));
		combo_C321.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C321);
		
		JLabel lbl_C322 = new JLabel(" h ");
		lbl_C322.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(lbl_C322);
		
		JComboBox combo_C322 = new JComboBox();
		combo_C322.setBackground(Color.WHITE);
		combo_C322.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C322.setToolTipText("");
		combo_C322.setPreferredSize(new Dimension(43, 21));
		combo_C322.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C322);
		
		JLabel lbl_C323 = new JLabel("          ");
		lbl_C323.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(lbl_C323);
		
		JComboBox combo_C323 = new JComboBox();
		combo_C323.setBackground(Color.WHITE);
		combo_C323.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C323.setToolTipText("");
		combo_C323.setPreferredSize(new Dimension(43, 21));
		combo_C323.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C323);
		
		JLabel lbl_C324 = new JLabel(" h ");
		lbl_C324.setForeground(Color.RED);
		lbl_C324.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(lbl_C324);
		
		JComboBox combo_C324 = new JComboBox();
		combo_C324.setBackground(Color.WHITE);
		combo_C324.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C324.setToolTipText("");
		combo_C324.setPreferredSize(new Dimension(43, 21));
		combo_C324.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C32.add(combo_C324);
		
		JPanel Panel_C33 = new JPanel();
		Panel_C33.setBackground(Color.BLACK);
		Panel_C33.setPreferredSize(new Dimension(380, 50));
		Panel_C33.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C33);
		
		JLabel lbl_C331 = new JLabel("Mon");
		lbl_C331.setForeground(Color.RED);
		lbl_C331.setPreferredSize(new Dimension(60, 30));
		lbl_C331.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C33.add(lbl_C331);
		
		JComboBox combo_C331 = new JComboBox();
		combo_C331.setBackground(Color.WHITE);
		combo_C331.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C331.setToolTipText("");
		combo_C331.setPreferredSize(new Dimension(43, 21));
		combo_C331.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C331);
		
		JLabel lbl_C332 = new JLabel(" h ");
		lbl_C332.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(lbl_C332);
		
		JComboBox combo_C332 = new JComboBox();
		combo_C332.setBackground(Color.WHITE);
		combo_C332.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C332.setToolTipText("");
		combo_C332.setPreferredSize(new Dimension(43, 21));
		combo_C332.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C332);
		
		JLabel lbl_C333 = new JLabel("          ");
		lbl_C333.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(lbl_C333);
		
		JComboBox combo_C333 = new JComboBox();
		combo_C333.setBackground(Color.WHITE);
		combo_C333.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C333.setToolTipText("");
		combo_C333.setPreferredSize(new Dimension(43, 21));
		combo_C333.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C333);
		
		JLabel lbl_C334 = new JLabel(" h ");
		lbl_C334.setForeground(Color.RED);
		lbl_C334.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(lbl_C334);
		
		JComboBox combo_C334 = new JComboBox();
		combo_C334.setBackground(Color.WHITE);
		combo_C334.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C334.setToolTipText("");
		combo_C334.setPreferredSize(new Dimension(43, 21));
		combo_C334.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C33.add(combo_C334);
		
		JPanel Panel_C34 = new JPanel();
		Panel_C34.setBackground(Color.BLACK);
		Panel_C34.setPreferredSize(new Dimension(380, 50));
		Panel_C34.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C34);
		
		JLabel lbl_C341 = new JLabel("Tue");
		lbl_C341.setForeground(Color.RED);
		lbl_C341.setPreferredSize(new Dimension(60, 30));
		lbl_C341.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C34.add(lbl_C341);
		
		JComboBox combo_C341 = new JComboBox();
		combo_C341.setBackground(Color.WHITE);
		combo_C341.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C341.setToolTipText("");
		combo_C341.setPreferredSize(new Dimension(43, 21));
		combo_C341.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C341);
		
		JLabel lbl_C342 = new JLabel(" h ");
		lbl_C342.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(lbl_C342);
		
		JComboBox combo_C342 = new JComboBox();
		combo_C342.setBackground(Color.WHITE);
		combo_C342.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C342.setToolTipText("");
		combo_C342.setPreferredSize(new Dimension(43, 21));
		combo_C342.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C342);
		
		JLabel lbl_C343 = new JLabel("          ");
		lbl_C343.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(lbl_C343);
		
		JComboBox combo_C343 = new JComboBox();
		combo_C343.setBackground(Color.WHITE);
		combo_C343.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C343.setToolTipText("");
		combo_C343.setPreferredSize(new Dimension(43, 21));
		combo_C343.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C343);
		
		JLabel lbl_C344 = new JLabel(" h ");
		lbl_C344.setForeground(Color.RED);
		lbl_C344.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(lbl_C344);
		
		JComboBox combo_C344 = new JComboBox();
		combo_C344.setBackground(Color.WHITE);
		combo_C344.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C344.setToolTipText("");
		combo_C344.setPreferredSize(new Dimension(43, 21));
		combo_C344.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C34.add(combo_C344);
		
		JPanel Panel_C35 = new JPanel();
		Panel_C35.setBackground(Color.BLACK);
		Panel_C35.setPreferredSize(new Dimension(380, 50));
		Panel_C35.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C35);
		
		JLabel lbl_C351 = new JLabel("Wed");
		lbl_C351.setForeground(Color.RED);
		lbl_C351.setPreferredSize(new Dimension(60, 30));
		lbl_C351.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C35.add(lbl_C351);
		
		JComboBox combo_C351 = new JComboBox();
		combo_C351.setBackground(Color.WHITE);
		combo_C351.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C351.setToolTipText("");
		combo_C351.setPreferredSize(new Dimension(43, 21));
		combo_C351.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C351);
		
		JLabel lbl_C352 = new JLabel(" h ");
		lbl_C352.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(lbl_C352);
		
		JComboBox combo_C352 = new JComboBox();
		combo_C352.setBackground(Color.WHITE);
		combo_C352.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C352.setToolTipText("");
		combo_C352.setPreferredSize(new Dimension(43, 21));
		combo_C352.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C352);
		
		JLabel lbl_C353 = new JLabel("          ");
		lbl_C353.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(lbl_C353);
		
		JComboBox combo_C353 = new JComboBox();
		combo_C353.setBackground(Color.WHITE);
		combo_C353.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C353.setToolTipText("");
		combo_C353.setPreferredSize(new Dimension(43, 21));
		combo_C353.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C353);
		
		JLabel lbl_C354 = new JLabel(" h ");
		lbl_C354.setForeground(Color.RED);
		lbl_C354.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(lbl_C354);
		
		JComboBox combo_C354 = new JComboBox();
		combo_C354.setBackground(Color.WHITE);
		combo_C354.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C354.setToolTipText("");
		combo_C354.setPreferredSize(new Dimension(43, 21));
		combo_C354.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C35.add(combo_C354);
		
		JPanel Panel_C36 = new JPanel();
		Panel_C36.setBackground(Color.BLACK);
		Panel_C36.setPreferredSize(new Dimension(380, 50));
		Panel_C36.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C36);
		
		JLabel lbl_C361 = new JLabel("Thu");
		lbl_C361.setForeground(Color.RED);
		lbl_C361.setPreferredSize(new Dimension(60, 30));
		lbl_C361.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C36.add(lbl_C361);
		
		JComboBox combo_C361 = new JComboBox();
		combo_C361.setBackground(Color.WHITE);
		combo_C361.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C361.setToolTipText("");
		combo_C361.setPreferredSize(new Dimension(43, 21));
		combo_C361.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C361);
		
		JLabel lbl_C362 = new JLabel(" h ");
		lbl_C362.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(lbl_C362);
		
		JComboBox combo_C362 = new JComboBox();
		combo_C362.setBackground(Color.WHITE);
		combo_C362.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C362.setToolTipText("");
		combo_C362.setPreferredSize(new Dimension(43, 21));
		combo_C362.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C362);
		
		JLabel lbl_C363 = new JLabel("          ");
		lbl_C363.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(lbl_C363);
		
		JComboBox combo_C363 = new JComboBox();
		combo_C363.setBackground(Color.WHITE);
		combo_C363.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C363.setToolTipText("");
		combo_C363.setPreferredSize(new Dimension(43, 21));
		combo_C363.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C363);
		
		JLabel lbl_C364 = new JLabel(" h ");
		lbl_C364.setForeground(Color.RED);
		lbl_C364.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(lbl_C364);
		
		JComboBox combo_C364 = new JComboBox();
		combo_C364.setBackground(Color.WHITE);
		combo_C364.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C364.setToolTipText("");
		combo_C364.setPreferredSize(new Dimension(43, 21));
		combo_C364.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C36.add(combo_C364);
		
		JPanel Panel_C37 = new JPanel();
		Panel_C37.setBackground(Color.BLACK);
		Panel_C37.setPreferredSize(new Dimension(380, 50));
		Panel_C37.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C37);
		
		JLabel lbl_C371 = new JLabel("Fri");
		lbl_C371.setForeground(Color.RED);
		lbl_C371.setPreferredSize(new Dimension(60, 30));
		lbl_C371.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C37.add(lbl_C371);
		
		JComboBox combo_C371 = new JComboBox();
		combo_C371.setBackground(Color.WHITE);
		combo_C371.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C371.setToolTipText("");
		combo_C371.setPreferredSize(new Dimension(43, 21));
		combo_C371.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C371);
		
		JLabel lbl_C372 = new JLabel(" h ");
		lbl_C372.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(lbl_C372);
		
		JComboBox combo_C372 = new JComboBox();
		combo_C372.setBackground(Color.WHITE);
		combo_C372.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C372.setToolTipText("");
		combo_C372.setPreferredSize(new Dimension(43, 21));
		combo_C372.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C372);
		
		JLabel lbl_C373 = new JLabel("          ");
		lbl_C373.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(lbl_C373);
		
		JComboBox combo_C373 = new JComboBox();
		combo_C373.setBackground(Color.WHITE);
		combo_C373.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C373.setToolTipText("");
		combo_C373.setPreferredSize(new Dimension(43, 21));
		combo_C373.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C373);
		
		JLabel lbl_C374 = new JLabel(" h ");
		lbl_C374.setForeground(Color.RED);
		lbl_C374.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(lbl_C374);
		
		JComboBox combo_C374 = new JComboBox();
		combo_C374.setBackground(Color.WHITE);
		combo_C374.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C374.setToolTipText("");
		combo_C374.setPreferredSize(new Dimension(43, 21));
		combo_C374.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C37.add(combo_C374);
		
		JPanel Panel_C38 = new JPanel();
		Panel_C38.setBackground(Color.BLACK);
		Panel_C38.setPreferredSize(new Dimension(380, 50));
		Panel_C38.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C38);
		
		JLabel lbl_C381 = new JLabel("Sat");
		lbl_C381.setForeground(Color.RED);
		lbl_C381.setPreferredSize(new Dimension(60, 30));
		lbl_C381.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C38.add(lbl_C381);
		
		JComboBox combo_C381 = new JComboBox();
		combo_C381.setBackground(Color.WHITE);
		combo_C381.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C381.setToolTipText("");
		combo_C381.setPreferredSize(new Dimension(43, 21));
		combo_C381.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C381);
		
		JLabel lbl_C382 = new JLabel(" h ");
		lbl_C382.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(lbl_C382);
		
		JComboBox combo_C382 = new JComboBox();
		combo_C382.setBackground(Color.WHITE);
		combo_C382.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C382.setToolTipText("");
		combo_C382.setPreferredSize(new Dimension(43, 21));
		combo_C382.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C382);
		
		JLabel lbl_C383 = new JLabel("          ");
		lbl_C383.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(lbl_C383);
		
		JComboBox combo_C383 = new JComboBox();
		combo_C383.setBackground(Color.WHITE);
		combo_C383.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C383.setToolTipText("");
		combo_C383.setPreferredSize(new Dimension(43, 21));
		combo_C383.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C383);
		
		JLabel lbl_C384 = new JLabel(" h ");
		lbl_C384.setForeground(Color.RED);
		lbl_C384.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(lbl_C384);
		
		JComboBox combo_C384 = new JComboBox();
		combo_C384.setBackground(Color.WHITE);
		combo_C384.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C384.setToolTipText("");
		combo_C384.setPreferredSize(new Dimension(43, 21));
		combo_C384.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C38.add(combo_C384);
		
		JPanel Panel_C39 = new JPanel();
		Panel_C39.setBackground(Color.BLACK);
		Panel_C39.setPreferredSize(new Dimension(380, 70));
		Panel_C39.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C3.add(Panel_C39);
		
		JButton btnC39 = new JButton("Modify all at once");
		btnC39.setForeground(Color.BLACK);
		btnC39.setBorder(new LineBorder(Color.RED, 2, true));
		btnC39.setBackground(Color.WHITE);
		btnC39.setPreferredSize(new Dimension(360, 50));
		btnC39.setFont(new Font("Arial", Font.BOLD, 30));
		Panel_C39.add(btnC39);
	}
}

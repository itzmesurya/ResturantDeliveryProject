package com.restaurantdeliveryviews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class OrderView3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_3;
	private JComboBox selectR_comboBox;
	private JButton Accept_btn;
	private JButton Select_btn;
	private JTable table;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JRadioButton Progress_RadioButton;
	private JRadioButton Incoming_RadioButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderView3 window = new OrderView3();
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
	public OrderView3() {
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
		
		JPanel panel_OrderHistory = new JPanel();
		frame.getContentPane().add(panel_OrderHistory, BorderLayout.CENTER);
		panel_OrderHistory.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(0, 80));
		topPanel.setBackground(MainFrame.offColor);
		panel_OrderHistory.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
		JLabel lbl_1 = new JLabel("Accept Order");
		lbl_1.setBounds(0, 20, 300, 50);
		lbl_1.setPreferredSize(new Dimension(300, 50));
		lbl_1.setBackground(MainFrame.offColor);
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setForeground(Color.white);
		lbl_1.setFont(MainFrame.headerFont);
		topPanel.add(lbl_1);
		
		JPanel Panel_2 = new JPanel();
		Panel_2.setBackground(Color.white);
		topPanel.add(Panel_2);
		Panel_2.setLayout(null);
		
		JLabel lbl_2 = new JLabel("Restaurant Name: ");
		lbl_2.setBackground(Color.white);
		lbl_2.setForeground(MainFrame.mainColor);
		lbl_2.setBounds(55, 12, 296, 58);
		lbl_2.setFont(MainFrame.titleFont);
		Panel_2.add(lbl_2);		
		
		selectR_comboBox = new JComboBox();
		selectR_comboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		selectR_comboBox.setBackground(Color.white);
		selectR_comboBox.setPreferredSize(new Dimension(500, 36));
		selectR_comboBox.setFont(MainFrame.labelFont);
		selectR_comboBox.setBounds(329, 22, 500, 36);
		Panel_2.add(selectR_comboBox);
		
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(0, 80));
		bottomPanel.setBackground(Color.WHITE);
		panel_OrderHistory.add(bottomPanel, BorderLayout.SOUTH);
		
		Accept_btn = new JButton("Accept");
		Accept_btn.setPreferredSize(new Dimension(300, 50));
		Accept_btn.setForeground(Color.WHITE);
		Accept_btn.setFont(null);
		Accept_btn.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		Accept_btn.setBackground((Color) null);
		bottomPanel.add(Accept_btn);
		
		JLabel lbl_C332 = new JLabel("                                                     ");
		bottomPanel.add(lbl_C332);
		
		Select_btn = new JButton("Select");
		Select_btn.setPreferredSize(new Dimension(300, 50));
		Select_btn.setForeground(Color.WHITE);
		Select_btn.setFont(null);
		Select_btn.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		Select_btn.setBackground((Color) null);
		bottomPanel.add(Select_btn);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBackground(Color.white);
		centerPanel.setPreferredSize(new Dimension(500, 0));
		panel_OrderHistory.add(centerPanel, BorderLayout.CENTER);
		
		JPanel panel_C2 = new JPanel();
		panel_C2.setBackground(Color.white);
		panel_C2.setPreferredSize(new Dimension(600, 300));
		panel_C2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C2.setBounds(59, 256, 600, 300);
		centerPanel.add(panel_C2);
		
		JPanel Panel_C21 = new JPanel();
		Panel_C21.setBackground(MainFrame.offColor);
		Panel_C21.setPreferredSize(new Dimension(596, 50));
		Panel_C21.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_C2.add(Panel_C21);
		
		JLabel lbl_C21 = new JLabel("Meal in Order");
		lbl_C21.setForeground(Color.white);
		lbl_C21.setFont(MainFrame.titleFont);
		Panel_C21.add(lbl_C21);
		
		JPanel panel_C22 = new JPanel();
		panel_C22.setBackground(Color.white);

		panel_C22.setPreferredSize(new Dimension(596, 230));

		panel_C2.add(panel_C22);
		panel_C22.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_C2 = new JScrollPane();
		scrollPane_C2.setBackground(Color.white);
		scrollPane_C2.setPreferredSize(new Dimension(596, 220));
		panel_C22.add(scrollPane_C2);
		
		//Menu
		
		table = new JTable();
		table.setForeground(new Color(139, 0, 0));
		table.setBackground(new Color(255, 255, 224));
		scrollPane_C2.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Meal in Order" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		
		JPanel panel_C1 = new JPanel();
		panel_C1.setPreferredSize(new Dimension(600, 180));
		panel_C1.setBackground(Color.white);
		panel_C1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C1.setBounds(59, 36, 600, 180);
		centerPanel.add(panel_C1);
		
		JPanel Panel_C11 = new JPanel();
		Panel_C11.setPreferredSize(new Dimension(580, 50));
		Panel_C11.setBackground(Color.white);
		panel_C1.add(Panel_C11);
		
		JLabel lbl_C11 = new JLabel("Delivery Date: ");
		lbl_C11.setPreferredSize(new Dimension(200, 40));
		lbl_C11.setForeground(Color.black);
		lbl_C11.setFont(MainFrame.labelFont);
		Panel_C11.add(lbl_C11);
		
		textField = new JTextField();
		textField.setBackground(Color.white);
		textField.setPreferredSize(new Dimension(350, 40));
		textField.setFont(MainFrame.labelFont);
		textField.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		textField.setEnabled(false);
		Panel_C11.add(textField);
		
		JPanel Panel_C12 = new JPanel();
		Panel_C12.setPreferredSize(new Dimension(580, 50));
		Panel_C12.setBackground(Color.white);
		panel_C1.add(Panel_C12);
		
		JLabel lbl_C121 = new JLabel("Delivery Time:");
		lbl_C121.setPreferredSize(new Dimension(200, 40));
		lbl_C121.setForeground(Color.black);
		lbl_C121.setFont(MainFrame.labelFont);
		Panel_C12.add(lbl_C121);
		
		JLabel lbl_C122 = new JLabel("                                                     ");
		lbl_C122.setBackground(Color.white);
		Panel_C12.add(lbl_C122);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setPreferredSize(new Dimension(60, 30));
		textField_1.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		textField_1.setFont(MainFrame.labelFont);
		textField_1.setForeground(Color.BLACK);
		textField_1.setEnabled(false);
		Panel_C12.add(textField_1);
		
		JLabel lbl_C123 = new JLabel(" h     ");
		lbl_C123.setForeground(Color.black);
		lbl_C123.setFont(MainFrame.labelFont);
		Panel_C12.add(lbl_C123);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setPreferredSize(new Dimension(60, 30));
		textField_2.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		textField_2.setFont(MainFrame.labelFont);
		textField_2.setForeground(Color.BLACK);
		textField_2.setEnabled(false);
		Panel_C12.add(textField_2);
		
		JPanel Panel_C13 = new JPanel();
		Panel_C13.setPreferredSize(new Dimension(580, 50));
		Panel_C13.setBackground(Color.white);
		panel_C1.add(Panel_C13);
		
		JLabel lbl_C13 = new JLabel("Postal Code:");
		lbl_C13.setPreferredSize(new Dimension(200, 40));
		lbl_C13.setForeground(Color.black);
		lbl_C13.setFont(MainFrame.labelFont);
		Panel_C13.add(lbl_C13);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.white);
		textField_3.setPreferredSize(new Dimension(350, 40));
		textField_3.setFont(MainFrame.labelFont);
		textField_3.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		textField_3.setEnabled(false);
		Panel_C13.add(textField_3);
		
		JPanel panel_C3 = new JPanel();
		panel_C3.setPreferredSize(new Dimension(400, 500));
		panel_C3.setBackground(Color.white);
		panel_C3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C3.setBounds(717, 74, 400, 500);
		centerPanel.add(panel_C3);
		panel_C3.setLayout(new BorderLayout(0, 0));
		
		JPanel Panel_C31 = new JPanel();
		Panel_C31.setPreferredSize(new Dimension(396, 50));
		Panel_C31.setBackground(MainFrame.offColor);
		Panel_C31.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_C3.add(Panel_C31, BorderLayout.NORTH);
		
		JLabel lbl_C311 = new JLabel("Orders");
		lbl_C311.setPreferredSize(new Dimension(90, 30));
		lbl_C311.setForeground(Color.white);
		lbl_C311.setFont(MainFrame.titleFont);
		Panel_C31.add(lbl_C311);
		
		JPanel Panel_C33 = new JPanel();
		Panel_C33.setBackground(Color.white);
		Panel_C33.setPreferredSize(new Dimension(396, 10));
		Panel_C33.setBorder(null);
		panel_C3.add(Panel_C33, BorderLayout.SOUTH);
		

		JPanel panel_C32 = new JPanel();
		panel_C32.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_C32.setBackground(Color.WHITE);
		panel_C3.add(panel_C32, BorderLayout.CENTER);
		
		JScrollPane Order_scrollPane = new JScrollPane();
		Order_scrollPane.setBackground(Color.white);
		Order_scrollPane.setPreferredSize(new Dimension(400, 440));
		panel_C32.add(Order_scrollPane);
		
		//Orders
		table_1 = new JTable();
		table_1.setForeground(new Color(139, 0, 0));
		table_1.setBackground(new Color(255, 255, 224));
		Order_scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "" + "Orders" }));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(79);
		table_1.getColumnModel().getColumn(0).setMinWidth(20);
		
		Progress_RadioButton = new JRadioButton("In Progress");
		Progress_RadioButton.setFont(new Font("Arial", Font.BOLD, 14));
		Progress_RadioButton.setBounds(748, 25, 103, 21);
		centerPanel.add(Progress_RadioButton);
		
		Incoming_RadioButton = new JRadioButton("In Coming");
		Incoming_RadioButton.setFont(new Font("Arial", Font.BOLD, 14));
		Incoming_RadioButton.setBounds(934, 25, 103, 21);
		centerPanel.add(Incoming_RadioButton);
		
		
		
	}
}

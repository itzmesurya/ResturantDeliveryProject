package com.restaurantdeliveryviews;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class OrderHistoryView {

	private JFrame frame;
	private JTextField tf_C11;
	private JTextField tf_C13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderHistoryView window = new OrderHistoryView();
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
	public OrderHistoryView() {
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
		panel_OrderHistory.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
		JLabel lbl_1 = new JLabel("Order History");
		lbl_1.setPreferredSize(new Dimension(300, 50));
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setFont(new Font("Arial", Font.BOLD, 30));
		lbl_1.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
		topPanel.add(lbl_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		topPanel.add(panel);
		panel.setLayout(null);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(0, 80));
		bottomPanel.setFont(new Font("Arial", Font.BOLD, 16));
		panel_OrderHistory.add(bottomPanel, BorderLayout.SOUTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setPreferredSize(new Dimension(500, 0));
		panel_OrderHistory.add(centerPanel, BorderLayout.CENTER);
		
		JPanel panel_C2 = new JPanel();
		panel_C2.setPreferredSize(new Dimension(600, 300));
		panel_C2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C2.setBounds(59, 259, 600, 300);
		centerPanel.add(panel_C2);
		panel_C2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel Panel_C21 = new JPanel();
		Panel_C21.setPreferredSize(new Dimension(596, 50));
		Panel_C21.setFont(new Font("Arial", Font.BOLD, 16));
		Panel_C21.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_C2.add(Panel_C21);
		Panel_C21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lbl_C21 = new JLabel("Meal in Order");
		lbl_C21.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C21.add(lbl_C21);
		
		JPanel panel_C22 = new JPanel();
		panel_C22.setPreferredSize(new Dimension(596, 230));
		panel_C2.add(panel_C22);
		panel_C22.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_C2 = new JScrollPane();
		scrollPane_C2.setPreferredSize(new Dimension(596, 220));
		panel_C22.add(scrollPane_C2);
		
		JPanel panel_C1 = new JPanel();
		panel_C1.setPreferredSize(new Dimension(600, 180));
		panel_C1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C1.setBounds(59, 36, 600, 180);
		centerPanel.add(panel_C1);
		
		JPanel Panel_C11 = new JPanel();
		Panel_C11.setPreferredSize(new Dimension(580, 50));
		Panel_C11.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C11);
		
		JLabel lbl_C11 = new JLabel("Delivery Date: ");
		lbl_C11.setPreferredSize(new Dimension(200, 40));
		lbl_C11.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C11.add(lbl_C11);
		
		tf_C11 = new JTextField();
		tf_C11.setPreferredSize(new Dimension(350, 40));
		tf_C11.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C11.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		tf_C11.setBackground(Color.CYAN);
		Panel_C11.add(tf_C11);
		
		JPanel Panel_C12 = new JPanel();
		Panel_C12.setPreferredSize(new Dimension(580, 50));
		Panel_C12.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C12);
		
		JLabel lbl_C121 = new JLabel("Delivery Time:");
		lbl_C121.setPreferredSize(new Dimension(200, 40));
		lbl_C121.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C12.add(lbl_C121);
		
		JLabel lbl_C122 = new JLabel("                                               ");
		lbl_C122.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C12.add(lbl_C122);
		
		JComboBox combo_C121 = new JComboBox();
		combo_C121.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		combo_C121.setToolTipText("");
		combo_C121.setPreferredSize(new Dimension(60, 30));
		combo_C121.setFont(new Font("Arial", Font.BOLD, 20));
		combo_C121.setBackground(Color.CYAN);
		Panel_C12.add(combo_C121);
		
		JLabel lbl_C123 = new JLabel(" h     ");
		lbl_C123.setFont(new Font("Arial", Font.BOLD, 14));
		Panel_C12.add(lbl_C123);
		
		JComboBox combo_C122 = new JComboBox();
		combo_C122.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		combo_C122.setToolTipText("");
		combo_C122.setPreferredSize(new Dimension(60, 30));
		combo_C122.setFont(new Font("Arial", Font.BOLD, 20));
		combo_C122.setBackground(Color.CYAN);
		Panel_C12.add(combo_C122);
		
		JPanel Panel_C13 = new JPanel();
		Panel_C13.setPreferredSize(new Dimension(580, 50));
		Panel_C13.setFont(new Font("Arial", Font.BOLD, 16));
		panel_C1.add(Panel_C13);
		
		JLabel lbl_C13 = new JLabel("Postal Code:");
		lbl_C13.setPreferredSize(new Dimension(200, 40));
		lbl_C13.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C13.add(lbl_C13);
		
		tf_C13 = new JTextField();
		tf_C13.setPreferredSize(new Dimension(350, 40));
		tf_C13.setFont(new Font("Arial", Font.BOLD, 20));
		tf_C13.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		tf_C13.setBackground(Color.CYAN);
		Panel_C13.add(tf_C13);
		
		JPanel panel_C3 = new JPanel();
		panel_C3.setPreferredSize(new Dimension(400, 550));
		panel_C3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C3.setBounds(717, 24, 400, 550);
		centerPanel.add(panel_C3);
		panel_C3.setLayout(new BorderLayout(0, 0));
		
		JPanel Panel_C31 = new JPanel();
		Panel_C31.setPreferredSize(new Dimension(396, 50));
		Panel_C31.setFont(new Font("Arial", Font.BOLD, 16));
		Panel_C31.setBorder(null);
		panel_C3.add(Panel_C31, BorderLayout.NORTH);
		
		JLabel lbl_C311 = new JLabel("Orders");
		lbl_C311.setPreferredSize(new Dimension(70, 30));
		lbl_C311.setFont(new Font("Arial", Font.BOLD, 20));
		Panel_C31.add(lbl_C311);
		
		JPanel Panel_C33 = new JPanel();
		Panel_C33.setBackground(Color.MAGENTA);
		Panel_C33.setPreferredSize(new Dimension(396, 50));
		Panel_C33.setFont(new Font("Arial", Font.BOLD, 16));
		Panel_C33.setBorder(null);
		panel_C3.add(Panel_C33, BorderLayout.SOUTH);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setPreferredSize(new Dimension(200, 40));
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 30));
		btnSubmit.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		btnSubmit.setBackground(Color.YELLOW);
		Panel_C33.add(btnSubmit);
		
		JPanel panel_C32 = new JPanel();
		panel_C32.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_C3.add(panel_C32, BorderLayout.CENTER);
		
		JScrollPane scrollPane_C3 = new JScrollPane();
		scrollPane_C3.setPreferredSize(new Dimension(400, 440));
		panel_C32.add(scrollPane_C3);
		
		JTextArea textOH = new JTextArea();
		textOH.setFont(new Font("Arial", Font.BOLD, 20));
		textOH.setBackground(Color.CYAN);
		textOH.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		textOH.setPreferredSize(new Dimension(350, 410));
		scrollPane_C3 = new JScrollPane(textOH); 
		textOH.setEditable(false);
		
	}
}

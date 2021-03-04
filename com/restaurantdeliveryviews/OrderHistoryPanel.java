package com.restaurantdeliveryviews;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class OrderHistoryPanel extends JPanel {
	
	private static JTextField tf_C11;
	private static JTextField tf_C13;
	private static JButton btnSelect;
	private static JTextField tf_hours;
	private static JTextField tf_minutes;
	private static JTable orderTable;
	private static JTable menuTable;
	
	public OrderHistoryPanel() {
	
	this.setLayout(new BorderLayout(0, 0));
	
	JPanel topPanel = new JPanel();
	topPanel.setPreferredSize(new Dimension(0, 80));
	topPanel.setBackground(MainFrame.offColor);
	this.add(topPanel, BorderLayout.NORTH);
	topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
	
	JLabel lbl_1 = new JLabel("Order History");
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
	
	JPanel bottomPanel = new JPanel();
	bottomPanel.setPreferredSize(new Dimension(0, 80));
	bottomPanel.setBackground(Color.WHITE);
	this.add(bottomPanel, BorderLayout.SOUTH);
	
	JPanel centerPanel = new JPanel();
	centerPanel.setLayout(null);
	centerPanel.setBackground(Color.white);
	centerPanel.setPreferredSize(new Dimension(500, 0));
	this.add(centerPanel, BorderLayout.CENTER);
	
	JPanel panel_C2 = new JPanel();
	panel_C2.setBackground(Color.white);
	panel_C2.setPreferredSize(new Dimension(600, 300));
	panel_C2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	panel_C2.setBounds(59, 259, 600, 300);
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
	
	menuTable = new JTable();
	menuTable.setForeground(new Color(139, 0, 0));
	menuTable.setBackground(new Color(255, 255, 224));
	scrollPane_C2.setViewportView(menuTable);
	menuTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Item Name", "Price", "Quantity" }));
	menuTable.getColumnModel().getColumn(0).setPreferredWidth(79);
	menuTable.getColumnModel().getColumn(0).setMinWidth(20);
	
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
	
	tf_C11 = new JTextField();
	tf_C11.setBackground(Color.white);
	tf_C11.setPreferredSize(new Dimension(350, 40));
	tf_C11.setFont(MainFrame.labelFont);
	tf_C11.setBorder(new LineBorder(new Color(0,0,0), 2, true));
	tf_C11.setEnabled(false);
	Panel_C11.add(tf_C11);
	
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
	
	tf_hours = new JTextField();
	tf_hours.setBackground(Color.WHITE);
	tf_hours.setPreferredSize(new Dimension(60, 30));
	tf_hours.setBorder(new LineBorder(new Color(0,0,0), 2, true));
	tf_hours.setFont(MainFrame.labelFont);
	tf_hours.setForeground(Color.BLACK);
	tf_hours.setEnabled(false);
	Panel_C12.add(tf_hours);
	
	JLabel lbl_C123 = new JLabel(" h     ");
	lbl_C123.setForeground(Color.black);
	lbl_C123.setFont(MainFrame.labelFont);
	Panel_C12.add(lbl_C123);
	
	tf_minutes = new JTextField();
	tf_minutes.setBackground(Color.WHITE);
	tf_minutes.setPreferredSize(new Dimension(60, 30));
	tf_minutes.setBorder(new LineBorder(new Color(0,0,0), 2, true));
	tf_minutes.setFont(MainFrame.labelFont);
	tf_minutes.setForeground(Color.BLACK);
	tf_minutes.setEnabled(false);
	Panel_C12.add(tf_minutes);
	
	JPanel Panel_C13 = new JPanel();
	Panel_C13.setPreferredSize(new Dimension(580, 50));
	Panel_C13.setBackground(Color.white);
	panel_C1.add(Panel_C13);
	
	JLabel lbl_C13 = new JLabel("Postal Code:");
	lbl_C13.setPreferredSize(new Dimension(200, 40));
	lbl_C13.setForeground(Color.black);
	lbl_C13.setFont(MainFrame.labelFont);
	Panel_C13.add(lbl_C13);
	
	tf_C13 = new JTextField();
	tf_C13.setBackground(Color.white);
	tf_C13.setPreferredSize(new Dimension(350, 40));
	tf_C13.setFont(MainFrame.labelFont);
	tf_C13.setBorder(new LineBorder(new Color(0,0,0), 2, true));
	tf_C13.setEnabled(false);
	Panel_C13.add(tf_C13);
	
	JPanel panel_C3 = new JPanel();
	panel_C3.setPreferredSize(new Dimension(400, 550));
	panel_C3.setBackground(Color.white);
	panel_C3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	panel_C3.setBounds(717, 24, 400, 550);
	centerPanel.add(panel_C3);
	panel_C3.setLayout(new BorderLayout(0, 0));
	
	JPanel Panel_C31 = new JPanel();
	Panel_C31.setPreferredSize(new Dimension(396, 50));
	Panel_C31.setBackground(MainFrame.offColor);
	Panel_C31.setBorder(null);
	panel_C3.add(Panel_C31, BorderLayout.NORTH);
	
	JLabel lbl_C311 = new JLabel("Orders");

	lbl_C311.setPreferredSize(new Dimension(90, 30));

	lbl_C311.setForeground(Color.white);
	lbl_C311.setFont(MainFrame.titleFont);
	Panel_C31.add(lbl_C311);
	
	JPanel Panel_C33 = new JPanel();
	Panel_C33.setBackground(Color.white);
	Panel_C33.setPreferredSize(new Dimension(396, 50));
	Panel_C33.setBorder(null);
	panel_C3.add(Panel_C33, BorderLayout.SOUTH);
	

	btnSelect = new JButton("Select");
	btnSelect.setPreferredSize(new Dimension(396, 40));
	btnSelect.setForeground(Color.white);
	btnSelect.setFont(MainFrame.labelFont);
	btnSelect.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
	btnSelect.setBackground(MainFrame.mainColor);
	Panel_C33.add(btnSelect);

	
	JPanel panel_C32 = new JPanel();
	panel_C32.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
	panel_C32.setBackground(Color.WHITE);
	panel_C3.add(panel_C32, BorderLayout.CENTER);
	
	JScrollPane scrollPane_C3 = new JScrollPane();
	scrollPane_C3.setBackground(Color.white);

	scrollPane_C3.setPreferredSize(new Dimension(400, 440));

	panel_C32.add(scrollPane_C3);
	
	//Orders
	orderTable = new JTable();
	orderTable.setForeground(new Color(139, 0, 0));
	orderTable.setBackground(new Color(255, 255, 224));
	scrollPane_C3.setViewportView(orderTable);
	orderTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Restaurant", "Date" }));
	orderTable.getColumnModel().getColumn(0).setPreferredWidth(79);
	orderTable.getColumnModel().getColumn(0).setMinWidth(20);
	
	
	
	}
	
	public static JButton getBtnSelect() {
		return btnSelect;
	}

	public static JTextField getTf_hours() {
		return tf_hours;
	}

	public static JTextField getTf_minutes() {
		return tf_minutes;
	}

	public static JTable getOrderTable() {
		return orderTable;
	}

	public static JTable getMenuTable() {
		return menuTable;
	}
	
	

}

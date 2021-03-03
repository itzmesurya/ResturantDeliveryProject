package com.restaurantdeliveryviews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.CRUDAction;

public class Accept_Done__Delivery_Panel extends JPanel {
	
	private static JTextField Delivery_Postal_Code;
	private static JTextField Delivery_address;
	private static JTextField Resturant;
	private static JTextField Order_number;
	private	static JButton btnaccept;
	private	static JButton btndone;
	private	static JTable table;
	Font font1 = new Font("SansSerif", Font.BOLD, 20);
	
	public Accept_Done__Delivery_Panel(CRUDAction crudAction) {
	
	this.setLayout(null);
	this.setBackground(Color.WHITE);
	
	//ORDER INFO PANEL
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(Color.WHITE);
	panel_1.setBounds(10, 10, 570, 723);
	this.add(panel_1);
	panel_1.setLayout(null);
	
	//ORDER INFORMATION
	
	JLabel lblOrderInfo = new JLabel("Order Information");
	lblOrderInfo.setForeground(new Color(255, 255, 255));
	lblOrderInfo.setBackground(Color.BLACK);
	lblOrderInfo.setFont(MainFrame.headerFont);
	lblOrderInfo.setBounds(10, 22, 270, 45);
	panel_1.add(lblOrderInfo);
	
	//LABELS 
	
	JLabel lblOrderNumber = new JLabel("Order number");
	lblOrderNumber.setFont(MainFrame.labelFont);
	lblOrderNumber.setBounds(10, 127, 162, 45);
	panel_1.add(lblOrderNumber);
	
	JLabel lblResturant = new JLabel("Resturant");
	lblResturant.setFont(MainFrame.labelFont);
	lblResturant.setBounds(10, 245, 162, 45);
	panel_1.add(lblResturant);
	
	JLabel lblDeliveryAddress = new JLabel("Delivery Address");
	lblDeliveryAddress.setFont(MainFrame.labelFont);
	lblDeliveryAddress.setBounds(10, 354, 179, 45);
	panel_1.add(lblDeliveryAddress);
	
	JLabel lblDeliveryPostalCode = new JLabel("Delivery Postal code");
	lblDeliveryPostalCode.setFont(MainFrame.labelFont);
	lblDeliveryPostalCode.setBounds(10, 480, 214, 45);
	panel_1.add(lblDeliveryPostalCode);
	
	//TEXT FIELDS
	
	Delivery_Postal_Code = new JTextField();
	Delivery_Postal_Code.setFont(font1);
	Delivery_Postal_Code.setEditable(false);
	Delivery_Postal_Code.setBounds(251, 479, 276, 40);
	panel_1.add(Delivery_Postal_Code);
	Delivery_Postal_Code.setColumns(10);
	
	Delivery_address = new JTextField();
	Delivery_address.setFont(font1);
	Delivery_address.setEditable(false);
	Delivery_address.setColumns(10);
	Delivery_address.setBounds(251, 353, 276, 40);
	panel_1.add(Delivery_address);
	
	Resturant = new JTextField();
	Resturant.setFont(font1);
	Resturant.setEditable(false);
	Resturant.setColumns(10);
	Resturant.setBounds(251, 244, 276, 40);
	panel_1.add(Resturant);
	
	Order_number = new JTextField();
	Order_number.setFont(font1);
	Order_number.setEditable(false);
	Order_number.setColumns(10);
	Order_number.setBounds(251, 127, 276, 40);
	panel_1.add(Order_number);
	
	//ORDER ACCPET & END BUTTON
	
	btnaccept = new JButton("Accept");
	//btnaccept.setOpaque(false);
	btnaccept.setForeground(Color.white);
	btnaccept.setFont(MainFrame.labelFont);
	btnaccept.setBackground(Color.red);
	btnaccept.setBounds(160, 630, 139, 40);
	panel_1.add(btnaccept);
	
	btndone = new JButton("Done");
	btndone.setForeground(Color.white);
	btndone.setFont(MainFrame.labelFont);
	btndone.setBackground(Color.red);
	btndone.setBounds(160, 630, 139, 40);
	panel_1.add(btndone);
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(0, 0, 0));
	panel.setBounds(10, 22, 270, 45);
	panel_1.add(panel);
	panel.setLayout(null);
	
	//TABLE PANNEL
	
	JPanel panel_2 = new JPanel();
	panel_2.setBounds(608, 128, 550, 605);
	this.add(panel_2);
	panel_2.setLayout(null);
	
	//Table 
	
	table = new JTable();
	table.setForeground(new Color(139, 0, 0));
	table.setBackground(Color.white);
	table.setModel(new DefaultTableModel(new Object[][] { },
		new String[] { "Order number", "Resturant", "Delivery Address", "Postal code" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
	boolean[] columnEditables = new boolean[] { false, false, false, false };

	public boolean isCellEditable(int row, int column) {
		return columnEditables[column];
	}
});
    table.setBounds(10, 97, 529, 559);
    panel_2.setLayout(new BorderLayout());
    panel_2.add(table.getTableHeader(), BorderLayout.PAGE_START);
    panel_2.add(table, BorderLayout.CENTER);
    panel_2.add(table);
    
    
    //DELIVERY LABLE PANNEL 
    
    JPanel panel_3 = new JPanel();
    panel_3.setBackground(Color.WHITE);
    panel_3.setBounds(608, 27, 550, 101);
    this.add(panel_3);
    panel_3.setLayout(null);
    
    JLabel lblDeliveries = new JLabel("Deliveries");
    lblDeliveries.setBounds(199, 10, 164, 45);
    panel_3.add(lblDeliveries);
    lblDeliveries.setFont(MainFrame.titleFont);
    
    
	switch (crudAction) {
	case Accept:
		lblOrderInfo.setText(" Accept Delivery");
		getBtnDone().setVisible(false);
		break;
	case Ready:
		lblOrderInfo.setText(" Done Delivery");
		getBtnAccept().setVisible(false);
		break;

	default:
		break;
	}
    
}
	
	
	//Get Button Select
	
	public static JButton getBtnAccept() {
		return	btnaccept;
	}
	
	public static JButton getBtnDone() {
		return	btndone;
	}
	
	/*	Getter's & Setter's	For Text Field's*/

	/**
	 * @return	Delivery_Postal_Code
	 */
	public static JTextField getDelivery_Postal_Code() {
		return Delivery_Postal_Code;
	}

	/**
	 * @param delivery_Postal_Code
	 */
	public static void setDelivery_Postal_Code(JTextField delivery_Postal_Code) {
		Delivery_Postal_Code = delivery_Postal_Code;
	}

	/**
	 * @return	Delivery_address
	 */
	public static JTextField getDelivery_address() {
		return Delivery_address;
	}

	/**
	 * @param delivery_address
	 */
	public static void setDelivery_address(JTextField delivery_address) {
		Delivery_address = delivery_address;
	}

	/**
	 * @return	restaurant
	 */
	public static JTextField getResturant() {
		return Resturant;
	}

	/**
	 * @param resturant
	 */
	public static void setResturant(JTextField resturant) {
		Resturant = resturant;
	}

	/**
	 * @return	Order_number
	 */
	public static JTextField getOrder_number() {
		return Order_number;
	}

	/**
	 * @param order_number
	 */
	public static void setOrder_number(JTextField order_number) {
		Order_number = order_number;
	}
	
	public static JTable gettable() {
		return table;
	}
}

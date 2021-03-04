package com.restaurantdeliveryviews;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Accept_Done__Delivery_View {

	private JFrame frame;
	private JTextField Delivery_Postal_Code;
	private JTextField Delivery_address;
	private JTextField Resturant;
	private JTextField Order_number;
	
	/*	Getter's & Setter's	*/

	/**
	 * @return	Delivery_Postal_Code
	 */
	public JTextField getDelivery_Postal_Code() {
		return Delivery_Postal_Code;
	}

	/**
	 * @param delivery_Postal_Code
	 */
	public void setDelivery_Postal_Code(JTextField delivery_Postal_Code) {
		Delivery_Postal_Code = delivery_Postal_Code;
	}

	/**
	 * @return	Delivery_address
	 */
	public JTextField getDelivery_address() {
		return Delivery_address;
	}

	/**
	 * @param delivery_address
	 */
	public void setDelivery_address(JTextField delivery_address) {
		Delivery_address = delivery_address;
	}

	/**
	 * @return	restaurant
	 */
	public JTextField getResturant() {
		return Resturant;
	}

	/**
	 * @param resturant
	 */
	public void setResturant(JTextField resturant) {
		Resturant = resturant;
	}

	/**
	 * @return	Order_number
	 */
	public JTextField getOrder_number() {
		return Order_number;
	}

	/**
	 * @param order_number
	 */
	public void setOrder_number(JTextField order_number) {
		Order_number = order_number;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accept_Done__Delivery_View window = new Accept_Done__Delivery_View();
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
	public Accept_Done__Delivery_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setResizable(false);
		frame.setTitle("DELIVERY");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 150, 122));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//ORDER INFO PANEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 67, 570, 666);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//ORDER INFORMATION
		
		JLabel lblOrderInfo = new JLabel("Order Information");
		lblOrderInfo.setFont(new Font("DialogInput", Font.BOLD, 25));
		lblOrderInfo.setBounds(10, 10, 270, 45);
		panel_1.add(lblOrderInfo);
		
		//LABELS 
		
		JLabel lblOrderNumber = new JLabel("Order number");
		lblOrderNumber.setFont(new Font("Consolas", Font.PLAIN, 18));
		lblOrderNumber.setBounds(10, 127, 162, 45);
		panel_1.add(lblOrderNumber);
		
		JLabel lblResturant = new JLabel("Resturant");
		lblResturant.setFont(new Font("Consolas", Font.PLAIN, 18));
		lblResturant.setBounds(10, 245, 162, 45);
		panel_1.add(lblResturant);
		
		JLabel lblDeliveryAddress = new JLabel("Delivery Address");
		lblDeliveryAddress.setFont(new Font("Consolas", Font.PLAIN, 18));
		lblDeliveryAddress.setBounds(10, 354, 179, 45);
		panel_1.add(lblDeliveryAddress);
		
		JLabel lblDeliveryPostalCode = new JLabel("Delivery Postal code");
		lblDeliveryPostalCode.setFont(new Font("Consolas", Font.PLAIN, 18));
		lblDeliveryPostalCode.setBounds(10, 480, 214, 45);
		panel_1.add(lblDeliveryPostalCode);
		
		//TEXT FIELDS
		
		Delivery_Postal_Code = new JTextField();
		Delivery_Postal_Code.setEditable(false);
		Delivery_Postal_Code.setBounds(251, 479, 276, 45);
		panel_1.add(Delivery_Postal_Code);
		Delivery_Postal_Code.setColumns(10);
		
		Delivery_address = new JTextField();
		Delivery_address.setEditable(false);
		Delivery_address.setColumns(10);
		Delivery_address.setBounds(251, 353, 276, 45);
		panel_1.add(Delivery_address);
		
		Resturant = new JTextField();
		Resturant.setEditable(false);
		Resturant.setColumns(10);
		Resturant.setBounds(251, 244, 276, 45);
		panel_1.add(Resturant);
		
		Order_number = new JTextField();
		Order_number.setEditable(false);
		Order_number.setColumns(10);
		Order_number.setBounds(251, 127, 276, 45);
		panel_1.add(Order_number);
		
		//ORDER ACCPET & END BUTTON
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setForeground(Color.WHITE);
		btnSelect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSelect.setBackground(Color.DARK_GRAY);
		btnSelect.setBounds(375, 592, 139, 45);
		panel_1.add(btnSelect);
		
		//TABLE PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(608, 128, 550, 605);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		//Table 
		
		JTable table = new JTable();
		table.setForeground(new Color(139, 0, 0));
		table.setBackground(new Color(255, 255, 224));
		table.setModel(new DefaultTableModel(new Object[][] { { "1", "Mac D", "Test Street ", "2N1" },		//JUST FOR EXAMPLE
			{ "2", "KFC", "New York", "2N2" }, { "3", "Wendys", "Example Street", "2N3" } },
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
	    panel_3.setBackground(Color.DARK_GRAY);
	    panel_3.setBounds(608, 67, 550, 61);
	    panel.add(panel_3);
	    panel_3.setLayout(null);
	    
	    JLabel lblDeliveries = new JLabel("Deliveries");
	    lblDeliveries.setForeground(Color.WHITE);
	    lblDeliveries.setBackground(Color.WHITE);
	    lblDeliveries.setBounds(199, 10, 164, 45);
	    panel_3.add(lblDeliveries);
	    lblDeliveries.setFont(new Font("DialogInput", Font.BOLD, 25));
	    
	}
}

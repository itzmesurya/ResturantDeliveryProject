package com.restaurantdeliveryviews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

public class Order_Food_Panel extends JPanel{
	
	private static JButton btn_add_order;
	private static JButton btn_delete_order_id;
	private static JButton btn_place_order;
	private static JTextField add_id;
	private static JTextField add_quantity;
	private static JTextField postal_code;
	private static JTextField total;
	private static JTextField address;
	private static JComboBox<String> comboBox;
	public static JTable table;
	private static JTable table2;
	Font font1 = new Font("SansSerif", Font.BOLD, 20);
	
	public Order_Food_Panel() {
		
		this.setBackground(Color.white);
		this.setLayout(null);
		//RESTURANT LABEL 
		
		JLabel lblNewLabel_1 = new JLabel("Select Resturant");
		lblNewLabel_1.setFont(MainFrame.titleFont);
		lblNewLabel_1.setForeground(Color.red);
		lblNewLabel_1.setBounds(374, 17, 210, 38);
		this.add(lblNewLabel_1);
		
		//COMBOBOX FOR RESTURANT
		comboBox = new JComboBox();
		comboBox.setBounds(585, 17, 150, 38);
		this.add(comboBox);
		
		//MENU PANEL
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 147, 581, 355);
		this.add(panel_1);
		
		//MENU TABLE
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setForeground(new Color(139, 0, 0));
		table.setBackground(new Color(255, 255, 224));
		table.setModel(new DefaultTableModel(new Object[][] { 
			 },
			new String[] { "ID", "Item Name", "Price", }) {
		/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] { false, false, false, false };

		public boolean isCellEditable(int row, int column) {
			return columnEditables[column];
		}
	});
		table.getColumnModel().getColumn(0).setPreferredWidth(1);
		table.getColumnModel().getColumn(1).setPreferredWidth(350);
		table.getColumnModel().getColumn(2).setPreferredWidth(3);
	    table.setBounds(10, 97, 529, 559);
	    panel_1.setLayout(new BorderLayout());
	    panel_1.add(table.getTableHeader(), BorderLayout.PAGE_START);
	    panel_1.add(table, BorderLayout.CENTER);
	    panel_1.add(table);
		
 
		//ORDER PANEL
	    
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(615, 142, 563, 360);
		this.add(panel_2);
		panel_2.setLayout(null);
		
		//Order Table
		
		table2 = new JTable();
		table2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table2.setForeground(new Color(139, 0, 0));
		table2.setBackground(new Color(255, 255, 224));
		table2.setModel(new DefaultTableModel(new Object[][] { },
			new String[] { "ID", "Item Name", "Price","Quantity" }) {
		/**
				 * 
				 */
			Class[] columnTypes = new Class[] {
					String.class, String.class, double.class, double.class
				};
				public Class getColumnClass(double columnIndex) {
					return columnTypes[(int) columnIndex];
				}
				private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] { false, false, false, false };

		public boolean isCellEditable(int row, int column) {
			return columnEditables[column];
		}
	});
		table2.getColumnModel().getColumn(0).setPreferredWidth(1);
		table2.getColumnModel().getColumn(1).setPreferredWidth(220);
		table2.getColumnModel().getColumn(2).setPreferredWidth(2);
		table2.getColumnModel().getColumn(3).setPreferredWidth(2);
		table2.setBounds(10, 97, 529, 559);
		panel_2.setLayout(new BorderLayout());
		panel_2.add(table2.getTableHeader(), BorderLayout.PAGE_START);
		panel_2.add(table2, BorderLayout.CENTER);
		panel_2.add(table2);
		
		//LABELS FOR ADDING ORDER
		JLabel lblNewLabel_2 = new JLabel("Enter ID");
		lblNewLabel_2.setFont(MainFrame.labelFont);
		lblNewLabel_2.setBounds(10, 520, 106, 38);
		this.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setFont(MainFrame.labelFont);
		lblNewLabel_2_1.setBounds(10, 616, 106, 38);
		this.add(lblNewLabel_2_1);
		
		//ADD ID TF
		add_id = new JTextField();
		add_id.setFont(font1);
		add_id.setBounds(169, 521, 150, 38);
		this.add(add_id);
		add_id.setColumns(10);
		
		//VALIDATION SO NO TEXT IS ENTERED in ID
		add_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {

             if((Character.isLetter(evt.getKeyChar()))){
                    evt.consume();
                }
            }
        });
		
		//QUANTITY TF
		add_quantity = new JTextField();
		add_quantity.setColumns(10);
		add_quantity.setFont(font1);
		add_quantity.setBounds(169, 617, 150, 38);
		this.add(add_quantity);
		
		//VALIDATION SO NO TEXT IS ENTERED in QUANTITY
		add_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
		           public void keyTyped(java.awt.event.KeyEvent evt) {

		             if((Character.isLetter(evt.getKeyChar()))){
		                    evt.consume();
		                }
		            }
		        });
		
		//ADD IN ORDER
		btn_add_order = new JButton("ADD");
		btn_add_order.setBackground(MainFrame.mainColor);
		btn_add_order.setFont(MainFrame.labelFont);
		btn_add_order.setForeground(Color.WHITE);
		btn_add_order.setBounds(83, 705, 113, 47);
		this.add(btn_add_order);
		
		
		//DELETE button TO DELETE ORDER
		btn_delete_order_id = new JButton("DELETE");
		btn_delete_order_id.setBackground(MainFrame.mainColor);
		btn_delete_order_id.setFont(MainFrame.labelFont);
		btn_delete_order_id.setForeground(Color.WHITE);
		btn_delete_order_id.setBounds(273, 705, 113, 47);
		this.add(btn_delete_order_id);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(431, 507, 765, 275);
		this.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("ADDRESS");
		lblNewLabel_2_3.setFont(MainFrame.labelFont);
		lblNewLabel_2_3.setBounds(27, 10, 119, 38);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("POSTAL CODE");
		lblNewLabel_2_3_1.setFont(MainFrame.labelFont);
		lblNewLabel_2_3_1.setBounds(27, 106, 155, 38);
		panel_3.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("TOTAL");
		lblNewLabel_2_3_2.setFont(MainFrame.labelFont);
		lblNewLabel_2_3_2.setBounds(27, 202, 119, 38);
		panel_3.add(lblNewLabel_2_3_2);
		
		address = new JTextField();
		address.setFont(font1);
		address.setBounds(214, 11, 484, 38);
		panel_3.add(address);
		
		postal_code = new JTextField();
		postal_code.setFont(font1);
		postal_code.setBounds(214, 106, 215, 38);
		panel_3.add(postal_code);
		postal_code.setColumns(10);
		
		total = new JTextField();
		total.setFont(font1);
		total.setEditable(false);
		total.setColumns(10);
		total.setBounds(214, 203, 215, 38);
		panel_3.add(total);
		
		btn_place_order = new JButton("Place Order");
		btn_place_order.setBackground(MainFrame.mainColor);
		btn_place_order.setFont(MainFrame.labelFont);
		btn_place_order.setForeground(Color.WHITE);
		btn_place_order.setBounds(480, 198, 203, 47);
		panel_3.add(btn_place_order);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 87, 581, 55);
		panel_4.setBackground(Color.DARK_GRAY);
		this.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("MENU");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(MainFrame.titleFont);
		lblNewLabel_3.setBounds(243, 10, 83, 35);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(614, 87, 564, 55);
		panel_4_1.setBackground(Color.DARK_GRAY);
		this.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("YOUR ORDER");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(MainFrame.titleFont);
		lblNewLabel_3_1.setBounds(225, 10, 158, 35);
		panel_4_1.add(lblNewLabel_3_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(-30, 10, 230, 45);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Food");
		lblNewLabel.setBounds(32, 0, 198, 45);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(MainFrame.headerFont);
		
	}
	

	/*	Getter's & Setter's	*/

	/**
	 * @return	add_id
	 */
	public static JTextField getAdd_Id() {
		return add_id;
	}
	
	/**
	 * @param Add_id
	 */
	/**
	 * @param total
	 */
	public static void setAdd_id(JTextField Add_id) {
		add_id = Add_id;
	}
	
	/**
	 * @param Add_quantity
	 */
	public static void setAdd_Quantity(JTextField Add_quantity) {
		add_quantity = Add_quantity;
	}	

	/**
	 * @return	add_quantity
	 */
	public static JTextField getAdd_Quantity() {
		return add_quantity;
	}

	/**
	 * @return	postal_code
	 */
	public static JTextField getPostal_Code() {
		return postal_code;
	}

	/**
	 * @return	total
	 */
	public static JTextField getTotal() {
		return total;
	}
	
	/**
	 * @param total
	 */
	public static void setTotal(JTextField Total) {
		total = Total;
	}
	
	
	/**
	 * @return	address
	 */
	public static JTextField getAddress() {
		return address;
	}
	
	/**
	 * @return	btn_add_order
	 */
	public static JButton getBtn_Add_Order() {
		return btn_add_order;
	}
	
	
	
	/**
	 * @return	btn_delete_order
	 */
	public static JButton getBtn_delete_Order() {
		return btn_delete_order_id;
	}
	
	/**
	 * @return	btn_place_order
	 */
	public static JButton getBtn_Place_Order() {
		return btn_place_order;
	}
	
	public static JComboBox<String> getcomboBox() {
		return comboBox;
	}
	
	public static JTable gettable() {
		return table;
	}
	
	public static JTable gettable2() {
		return table2;
	}
}


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

public class Order_Food_Panel extends JPanel{
	
	private JButton btn_add_order;
	private JButton btn_delete_order_id;
	private JButton btn_place_order;
	private JTextField add_id;
	private JTextField add_quantity;
	private JTextField postal_code;
	private JTextField total;
	private JTextField address;
	private JComboBox<?> comboBox;
	private JTable table;
	private JTable table2;
	
	public Order_Food_Panel() {
		
		this.setBackground(new Color(233, 150, 122));
		this.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ORDER FOOD");
		lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(10, 10, 190, 45);
		this.add(lblNewLabel);
		
		//RESTURANT LABEL 
		
		JLabel lblNewLabel_1 = new JLabel("Select Resturant");
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(374, 17, 160, 38);
		this.add(lblNewLabel_1);
		
		//COMBOBOX FOR RESTURANT
		comboBox = new JComboBox();
		comboBox.setBounds(585, 17, 150, 38);
		this.add(comboBox);
		
		//MENU PANEL
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 142, 581, 360);
		this.add(panel_1);
		
		//MENU TABLE
		table = new JTable();
		table.setForeground(new Color(139, 0, 0));
		table.setBackground(new Color(255, 255, 224));
		table.setModel(new DefaultTableModel(new Object[][] { { "1", "Pizza", " 5 $ "},		//JUST FOR EXAMPLE
			{ "2", "Burger", " 3 $" }, { "3", "Coffee", " 2 $"} },
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
	    table.setBounds(10, 97, 529, 559);
	    panel_1.setLayout(new BorderLayout());
	    panel_1.add(table.getTableHeader(), BorderLayout.PAGE_START);
	    panel_1.add(table, BorderLayout.CENTER);
	    panel_1.add(table);
		
	    
	    
		//ORDER PANEL
	    
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(615, 142, 593, 360);
		this.add(panel_2);
		panel_2.setLayout(null);
		
		//Order Table
		
		table2 = new JTable();
		table2.setForeground(new Color(139, 0, 0));
		table2.setBackground(new Color(255, 255, 224));
		table2.setModel(new DefaultTableModel(new Object[][] { { }},
			new String[] { "ID", "Item Name", "Price","Quantity" }) {
		/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] { false, false, false, false };

		public boolean isCellEditable(int row, int column) {
			return columnEditables[column];
		}
	});
		table2.setBounds(10, 97, 529, 559);
		panel_2.setLayout(new BorderLayout());
		panel_2.add(table2.getTableHeader(), BorderLayout.PAGE_START);
		panel_2.add(table2, BorderLayout.CENTER);
		panel_2.add(table2);
		
		//LABELS FOR ADDING ORDER
		JLabel lblNewLabel_2 = new JLabel("Enter ID");
		lblNewLabel_2.setFont(new Font("Sitka Display", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(20, 521, 106, 38);
		this.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setFont(new Font("Sitka Display", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(20, 617, 106, 38);
		this.add(lblNewLabel_2_1);
		
		//ADD ID TF
		add_id = new JTextField();
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
		btn_add_order.setForeground(Color.WHITE);
		btn_add_order.setBackground(Color.DARK_GRAY);
		btn_add_order.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btn_add_order.setBounds(87, 691, 113, 47);
		this.add(btn_add_order);
		
		
		//DELETE button TO DELETE ORDER
		btn_delete_order_id = new JButton("DELETE");
		btn_delete_order_id.setForeground(Color.WHITE);
		btn_delete_order_id.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btn_delete_order_id.setBackground(Color.DARK_GRAY);
		btn_delete_order_id.setBounds(273, 691, 113, 47);
		this.add(btn_delete_order_id);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(216, 191, 216));
		panel_3.setBounds(486, 507, 710, 255);
		this.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("ADDRESS");
		lblNewLabel_2_3.setFont(new Font("Sitka Display", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(27, 32, 119, 38);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("POSTAL CODE");
		lblNewLabel_2_3_1.setFont(new Font("Sitka Display", Font.PLAIN, 25));
		lblNewLabel_2_3_1.setBounds(27, 106, 155, 38);
		panel_3.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("TOTAL");
		lblNewLabel_2_3_2.setFont(new Font("Sitka Display", Font.PLAIN, 25));
		lblNewLabel_2_3_2.setBounds(27, 182, 119, 38);
		panel_3.add(lblNewLabel_2_3_2);
		
		address = new JTextField();
		address.setBounds(214, 32, 484, 38);
		panel_3.add(address);
		
		postal_code = new JTextField();
		postal_code.setBounds(214, 106, 215, 38);
		panel_3.add(postal_code);
		postal_code.setColumns(10);
		
		total = new JTextField();
		total.setEditable(false);
		total.setColumns(10);
		total.setBounds(214, 182, 215, 38);
		panel_3.add(total);
		
		btn_place_order = new JButton("Place Order");
		btn_place_order.setForeground(Color.WHITE);
		btn_place_order.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btn_place_order.setBackground(Color.DARK_GRAY);
		btn_place_order.setBounds(480, 198, 203, 47);
		panel_3.add(btn_place_order);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 87, 581, 55);
		panel_4.setBackground(Color.LIGHT_GRAY);
		this.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("MENU");
		lblNewLabel_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblNewLabel_3.setBounds(243, 10, 83, 35);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(615, 87, 581, 55);
		panel_4_1.setBackground(Color.LIGHT_GRAY);
		this.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("YOUR ORDER");
		lblNewLabel_3_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(225, 10, 158, 35);
		panel_4_1.add(lblNewLabel_3_1);
		
		
		
	}
	

	/*	Getter's & Setter's	*/

	/**
	 * @return	add_id
	 */
	public JTextField getAdd_Id() {
		return add_id;
	}

	/**
	 * @return	add_quantity
	 */
	public JTextField getAdd_Quantity() {
		return add_quantity;
	}

	/**
	 * @return	postal_code
	 */
	public JTextField getPostal_Code() {
		return postal_code;
	}

	/**
	 * @return	total
	 */
	public JTextField getTotal() {
		return total;
	}
	
	/**
	 * @return	address
	 */
	public JTextField getAddress() {
		return address;
	}
	
	/**
	 * @return	btn_add_order
	 */
	public JButton getBtn_Add_Order() {
		return btn_add_order;
	}
	
	/**
	 * @return	btn_delete_order_id
	 */
	public JButton getBtn_delete_Order_Id() {
		return btn_delete_order_id;
	}
	
	/**
	 * @return	btn_place_order
	 */
	public JButton getBtn_Place_Order() {
		return btn_place_order;
	}

	
}

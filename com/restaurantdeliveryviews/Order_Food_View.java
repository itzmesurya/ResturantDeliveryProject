package com.restaurantdeliveryviews;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class Order_Food_View {

	private JFrame frame;
	private JTextField add_id;
	private JTextField add_quantity;
	private JTextField postal_code;
	private JTextField total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order_Food_View window = new Order_Food_View();
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
	public Order_Food_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setResizable(false);
		frame.setTitle("ORDER FOOD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  ORDER FOOD");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 10, 166, 45);
		panel.add(lblNewLabel);
		
		//RESTURANT LABEL 
		
		JLabel lblNewLabel_1 = new JLabel("Select Resturant");
		lblNewLabel_1.setForeground(new Color(255, 127, 80));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(365, 11, 194, 53);
		panel.add(lblNewLabel_1);
		
		//COMBOBOX FOR RESTURANT
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(585, 17, 150, 38);
		panel.add(comboBox);
		
		//MENU PANEL
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(10, 142, 581, 360);
		panel.add(panel_1);
		
		//MENU TABLE
		JTable table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(135, 206, 235));
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
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		//Order Table
		
		JTable table2 = new JTable();
		table2.setForeground(new Color(139, 0, 0));
		table2.setBackground(new Color(135, 206, 235));
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
		lblNewLabel_2.setForeground(new Color(248,86,73));
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(20, 521, 106, 38);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setForeground(new Color(248,86,73));
		lblNewLabel_2_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(20, 617, 106, 38);
		panel.add(lblNewLabel_2_1);
		
		//ADD ID TF
		add_id = new JTextField();
		add_id.setBackground(Color.WHITE);
		add_id.setBounds(169, 521, 150, 38);
		panel.add(add_id);
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
		panel.add(add_quantity);
		
		//VALIDATION SO NO TEXT IS ENTERED in QUANTITY
		add_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
		           public void keyTyped(java.awt.event.KeyEvent evt) {

		             if((Character.isLetter(evt.getKeyChar()))){
		                    evt.consume();
		                }
		            }
		        });
		
		//ADD IN ORDER
		JButton btn_add_order = new JButton("ADD");
		btn_add_order.setForeground(Color.WHITE);
		btn_add_order.setBackground(Color.DARK_GRAY);
		btn_add_order.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btn_add_order.setBounds(87, 691, 113, 47);
		panel.add(btn_add_order);
		
		
		//DELETE button TO DELETE ORDER
		JButton btn_delete_order_id = new JButton("DELETE");
		btn_delete_order_id.setForeground(Color.WHITE);
		btn_delete_order_id.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btn_delete_order_id.setBackground(Color.DARK_GRAY);
		btn_delete_order_id.setBounds(273, 691, 113, 47);
		panel.add(btn_delete_order_id);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(486, 507, 710, 255);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("ADDRESS");
		lblNewLabel_2_3.setForeground(new Color(248,86,73));
		lblNewLabel_2_3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(27, 32, 119, 38);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("POSTAL CODE");
		lblNewLabel_2_3_1.setForeground(new Color(248,86,73));
		lblNewLabel_2_3_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblNewLabel_2_3_1.setBounds(27, 106, 155, 38);
		panel_3.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("TOTAL");
		lblNewLabel_2_3_2.setForeground(new Color(248,86,73));
		lblNewLabel_2_3_2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblNewLabel_2_3_2.setBounds(27, 182, 119, 38);
		panel_3.add(lblNewLabel_2_3_2);
		
		JTextField address = new JTextField();
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
		
		JButton btn_place_order = new JButton("Place Order");
		btn_place_order.setForeground(Color.WHITE);
		btn_place_order.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		btn_place_order.setBackground(Color.DARK_GRAY);
		btn_place_order.setBounds(480, 198, 203, 47);
		panel_3.add(btn_place_order);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(255, 255, 255));
		panel_4.setBounds(10, 87, 581, 55);
		panel_4.setBackground(Color.DARK_GRAY);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("MENU");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setForeground(new Color(255, 140, 0));
		lblNewLabel_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblNewLabel_3.setBounds(243, 10, 83, 35);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(615, 87, 581, 55);
		panel_4_1.setBackground(Color.DARK_GRAY);
		panel.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("YOUR ORDER");
		lblNewLabel_3_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_3_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(225, 10, 158, 35);
		panel_4_1.add(lblNewLabel_3_1);
		
		
		
	}
	
	/*	Getter's & Setter's	*/

	/**
	 * @return
	 */
	public JTextField getAdd_id() {
		return add_id;
	}

	/**
	 * @param add_id
	 */
	public void setAdd_id(JTextField add_id) {
		this.add_id = add_id;
	}

	/**
	 * @return
	 */
	public JTextField getAdd_quantity() {
		return add_quantity;
	}

	/**
	 * @param add_quantity
	 */
	public void setAdd_quantity(JTextField add_quantity) {
		this.add_quantity = add_quantity;
	}



	/**
	 * @return
	 */
	public JTextField getPostal_code() {
		return postal_code;
	}

	/**
	 * @param postal_code
	 */
	public void setPostal_code(JTextField postal_code) {
		this.postal_code = postal_code;
	}

	/**
	 * @return
	 */
	public JTextField getTotal() {
		return total;
	}

	/**
	 * @param total
	 */
	public void setTotal(JTextField total) {
		this.total = total;
	}
}

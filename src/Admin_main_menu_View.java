import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Admin_main_menu_View {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_main_menu_View window = new Admin_main_menu_View();
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
	public Admin_main_menu_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setResizable(false);
		frame.setTitle("ADMIN");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 150, 122));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//BUTTON FOR RESTURANT , MENU , DELIVERY MAN
		
		JButton resto_add_btn = new JButton("ADD");
		resto_add_btn.setBackground(Color.DARK_GRAY);
		resto_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_add_btn.setForeground(Color.WHITE);
		resto_add_btn.setBounds(49, 259, 106, 37);
		panel.add(resto_add_btn);
		
		JButton resto_edit_btn = new JButton("EDIT");
		resto_edit_btn.setForeground(Color.WHITE);
		resto_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_edit_btn.setBackground(Color.DARK_GRAY);
		resto_edit_btn.setBounds(176, 259, 106, 37);
		panel.add(resto_edit_btn);
		
		JButton resto_del_btn = new JButton("DELETE");
		resto_del_btn.setForeground(Color.WHITE);
		resto_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_del_btn.setBackground(Color.DARK_GRAY);
		resto_del_btn.setBounds(310, 259, 106, 37);
		panel.add(resto_del_btn);
		
		JButton menu_add_btn = new JButton("ADD");
		menu_add_btn.setForeground(Color.WHITE);
		menu_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_add_btn.setBackground(Color.DARK_GRAY);
		menu_add_btn.setBounds(762, 259, 106, 37);
		panel.add(menu_add_btn);
		
		JButton menu_edit_btn = new JButton("EDIT");
		menu_edit_btn.setForeground(Color.WHITE);
		menu_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_edit_btn.setBackground(Color.DARK_GRAY);
		menu_edit_btn.setBounds(903, 259, 106, 37);
		panel.add(menu_edit_btn);
		
		JButton menu_del_btn = new JButton("DELETE");
		menu_del_btn.setForeground(Color.WHITE);
		menu_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_del_btn.setBackground(Color.DARK_GRAY);
		menu_del_btn.setBounds(1039, 259, 106, 37);
		panel.add(menu_del_btn);
		
		JButton delivery_add_btn = new JButton("NEW");
		delivery_add_btn.setForeground(Color.WHITE);
		delivery_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_add_btn.setBackground(Color.DARK_GRAY);
		delivery_add_btn.setBounds(375, 600, 106, 37);
		panel.add(delivery_add_btn);
		
		JButton delivery_edit_btn = new JButton("EDIT");
		delivery_edit_btn.setForeground(Color.WHITE);
		delivery_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_edit_btn.setBackground(Color.DARK_GRAY);
		delivery_edit_btn.setBounds(529, 600, 106, 37);
		panel.add(delivery_edit_btn);
		
		JButton delivery_del_btn = new JButton("DELETE");
		delivery_del_btn.setForeground(Color.WHITE);
		delivery_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_del_btn.setBackground(Color.DARK_GRAY);
		delivery_del_btn.setBounds(672, 600, 106, 37);
		panel.add(delivery_del_btn);
		
		JButton delivery_order_btn = new JButton("ORDERS");
		delivery_order_btn.setForeground(Color.WHITE);
		delivery_order_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_order_btn.setBackground(Color.DARK_GRAY);
		delivery_order_btn.setBounds(814, 600, 106, 37);
		panel.add(delivery_order_btn);
		
		
		//RESTURANT
		
		JLabel lblResturant = new JLabel("RESTURANT");
		lblResturant.setFont(new Font("Constantia", Font.PLAIN, 20));
		lblResturant.setBounds(162, 180, 130, 45);
		panel.add(lblResturant);
		
		//DELIVERY MAN
		
		JLabel lblDeliveryMan = new JLabel("DELIVERY MAN");
		lblDeliveryMan.setFont(new Font("Constantia", Font.PLAIN, 20));
		lblDeliveryMan.setBounds(576, 512, 157, 45);
		panel.add(lblDeliveryMan);
		
		//ADMIN
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setFont(new Font("Constantia", Font.BOLD, 30));
		lblAdmin.setBounds(546, 22, 140, 45);
		panel.add(lblAdmin);
		
		
		//RESTURANT PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(10, 67, 568, 399);
		panel.add(panel_1);
		
		//MENU PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(608, 71, 568, 395);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		//MENU 
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(314, 114, 61, 25);
		panel_2.add(lblMenu);
		lblMenu.setFont(new Font("Constantia", Font.PLAIN, 20));
		
		//MENU PANNEL
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 240, 230));
		panel_3.setBounds(10, 489, 1166, 239);
		panel.add(panel_3);
		
		
		//LOG OUT NUTTON
		JButton log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(new Color(255, 255, 224));
		log_out_btn.setBackground(new Color(138, 43, 226));
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		panel.add(log_out_btn);
		
		//MENU BAR
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		//File Menu BAR
		
		JMenu file = new JMenu("File");
		file.setBackground(Color.BLACK);
		menuBar.add(file);
		
		JMenuItem manage_account = new JMenuItem("Manage Account");
		file.add(manage_account);
		
		JMenuItem log_out = new JMenuItem("Log Out");
		file.add(log_out);
		
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		
		//Menu menu Bar
		
		JMenu menu = new JMenu("Menu");
		menu.setBackground(Color.BLACK);
		menuBar.add(menu);
		
		JMenuItem manage_menu = new JMenuItem("Manage Menu");
		menu.add(manage_menu);
		
		//Order Menu Bar
		
		JMenu order = new JMenu("Orders");
		order.setBackground(Color.BLACK);
		menuBar.add(order);
		
		JMenuItem view_order = new JMenuItem("View Orders");
		order.add(view_order);
		
		//Restaurant Menu bar
		JMenu restaurant = new JMenu("Restaurant");
		restaurant.setBackground(Color.BLACK);
		menuBar.add(restaurant);
		
		JMenuItem create_resto = new JMenuItem("Create Restaurant");
		restaurant.add(create_resto);
		
		JMenuItem manage_resto = new JMenuItem("Manage Restaurant");
		restaurant.add(manage_resto);
		
		//Delivery Menu bar
		JMenu delivery = new JMenu("Delivery");
		delivery.setBackground(Color.BLACK);
		menuBar.add(delivery);
				
		JMenuItem create_deliveryman = new JMenuItem("Create Delivery Man");
		delivery.add(create_deliveryman);
				
		JMenuItem manage_deliveryman = new JMenuItem("Manage Delivery Man");
		delivery.add(manage_deliveryman);
		
	
		
		
	}
}

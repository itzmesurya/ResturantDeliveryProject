package com.restaurantdeliveryviews;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;


public class Admin_main_menu_Panel extends JPanel{
	
	private static	JButton resto_add_btn;
	private static	JButton resto_edit_btn;
	private static  JButton resto_del_btn;
	private	static JButton menu_add_btn;
	private	static JButton menu_edit_btn;
	private	static JButton menu_del_btn;
	private	static JButton delivery_add_btn;
	private	static JButton delivery_edit_btn;
	private	static JButton delivery_del_btn;
	private	static JButton delivery_order_btn;
	private	static JButton log_out_btn;

	
	public Admin_main_menu_Panel() {
		
		this.setLayout(null);
		this.setBackground(new Color(233, 150, 122));
		//BUTTON FOR RESTURANT , MENU , DELIVERY MAN
		
		resto_add_btn = new JButton("ADD");
		resto_add_btn.setBackground(Color.DARK_GRAY);
		resto_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_add_btn.setForeground(Color.WHITE);
		resto_add_btn.setBounds(49, 259, 106, 37);
		this.add(resto_add_btn);
		
		resto_edit_btn = new JButton("EDIT");
		resto_edit_btn.setForeground(Color.WHITE);
		resto_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_edit_btn.setBackground(Color.DARK_GRAY);
		resto_edit_btn.setBounds(176, 259, 106, 37);
		this.add(resto_edit_btn);
		
		resto_del_btn = new JButton("DELETE");
		resto_del_btn.setForeground(Color.WHITE);
		resto_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_del_btn.setBackground(Color.DARK_GRAY);
		resto_del_btn.setBounds(310, 259, 106, 37);
		this.add(resto_del_btn);
		
		menu_add_btn = new JButton("ADD");
		menu_add_btn.setForeground(Color.WHITE);
		menu_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_add_btn.setBackground(Color.DARK_GRAY);
		menu_add_btn.setBounds(762, 259, 106, 37);
		this.add(menu_add_btn);
		
		menu_edit_btn = new JButton("EDIT");
		menu_edit_btn.setForeground(Color.WHITE);
		menu_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_edit_btn.setBackground(Color.DARK_GRAY);
		menu_edit_btn.setBounds(903, 259, 106, 37);
		this.add(menu_edit_btn);
		
		menu_del_btn = new JButton("DELETE");
		menu_del_btn.setForeground(Color.WHITE);
		menu_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_del_btn.setBackground(Color.DARK_GRAY);
		menu_del_btn.setBounds(1039, 259, 106, 37);
		this.add(menu_del_btn);
		
		delivery_add_btn = new JButton("NEW");
		delivery_add_btn.setForeground(Color.WHITE);
		delivery_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_add_btn.setBackground(Color.DARK_GRAY);
		delivery_add_btn.setBounds(375, 600, 106, 37);
		this.add(delivery_add_btn);
		
		delivery_edit_btn = new JButton("EDIT");
		delivery_edit_btn.setForeground(Color.WHITE);
		delivery_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_edit_btn.setBackground(Color.DARK_GRAY);
		delivery_edit_btn.setBounds(529, 600, 106, 37);
		this.add(delivery_edit_btn);
		
		delivery_del_btn = new JButton("DELETE");
		delivery_del_btn.setForeground(Color.WHITE);
		delivery_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_del_btn.setBackground(Color.DARK_GRAY);
		delivery_del_btn.setBounds(672, 600, 106, 37);
		this.add(delivery_del_btn);
		
		delivery_order_btn = new JButton("ORDERS");
		delivery_order_btn.setForeground(Color.WHITE);
		delivery_order_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_order_btn.setBackground(Color.DARK_GRAY);
		delivery_order_btn.setBounds(814, 600, 106, 37);
		this.add(delivery_order_btn);
		
		
		//RESTURANT
		
		JLabel lblResturant = new JLabel("RESTURANT");
		lblResturant.setFont(new Font("Constantia", Font.PLAIN, 20));
		lblResturant.setBounds(162, 180, 130, 45);
		this.add(lblResturant);
		
		//DELIVERY MAN
		
		JLabel lblDeliveryMan = new JLabel("DELIVERY MAN");
		lblDeliveryMan.setFont(new Font("Constantia", Font.PLAIN, 20));
		lblDeliveryMan.setBounds(576, 512, 157, 45);
		this.add(lblDeliveryMan);
		
		//ADMIN
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setFont(new Font("Constantia", Font.BOLD, 30));
		lblAdmin.setBounds(546, 22, 140, 45);
		this.add(lblAdmin);
		
		
		//RESTURANT PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(10, 67, 568, 399);
		this.add(panel_1);
		
		//MENU PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(608, 71, 568, 395);
		this.add(panel_2);
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
		this.add(panel_3);
		
		
		//LOG OUT NUTTON
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(new Color(255, 255, 224));
		log_out_btn.setBackground(new Color(138, 43, 226));
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		this.add(log_out_btn);
		
	}
	
		//Get resto_add_btn
	
		public static JButton getResto_Add_Btn() {
			return	resto_add_btn;
		}
		
		//Get resto_edit_btn
		
		public static JButton getResto_Edit_Btn() {
			return	resto_edit_btn;
		}
		
		//Get resto_del_btn
		
		public static JButton getResto_Del_Btn() {
			return	resto_del_btn;
		}
		
		//Get menu_add_btn
		
		public static JButton getMenu_Add_Btn() {
			return	menu_add_btn;
		}
		
		//Get menu_edit_btn
		
		public static JButton getMenu_Edit_Btn() {
			return	menu_edit_btn;
		}
		
		//Get menu_del_btn
		
		public static JButton getMenu_Del_Btn() {
			return	menu_del_btn;
		}
		
		//Get delivery_add_btn
		
		public static JButton getDelivery_Add_Btn() {
			return	delivery_add_btn;
		}
		
		//Get delivery_edit_btn
		
		public static JButton getDelivery_Edit_Btn() {
			return	delivery_edit_btn;
		}
		
		//Get delivery_del_btn
		
		public static JButton getDelivery_Del_Btn() {
			return	delivery_del_btn;
		}
		
		//Get delivery_order_btn
		
		public static JButton getDelivery_Order_Btn() {
			return	delivery_order_btn;
		}
		
		//Get log_out_btn
		
		public static JButton getLog_Out_Btn() {
			return	log_out_btn;
		}
		
		

}

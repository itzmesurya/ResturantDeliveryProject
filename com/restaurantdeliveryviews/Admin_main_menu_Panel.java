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
	private	static JButton log_out_btn;

	
	public Admin_main_menu_Panel() {
		
		this.setLayout(null);
		this.setBackground(Color.white);
		//BUTTON FOR RESTURANT , MENU , DELIVERY MAN
		
		resto_add_btn = new JButton("ADD");
		resto_add_btn.setBackground(MainFrame.mainColor);
		resto_add_btn.setFont(MainFrame.labelFont);
		resto_add_btn.setForeground(Color.WHITE);
		resto_add_btn.setBounds(49, 259, 106, 40);
		this.add(resto_add_btn);
		
		resto_edit_btn = new JButton("EDIT");
		resto_edit_btn.setForeground(Color.WHITE);
		resto_edit_btn.setFont(MainFrame.labelFont);
		resto_edit_btn.setBackground(MainFrame.mainColor);
		resto_edit_btn.setBounds(176, 259, 106, 40);
		this.add(resto_edit_btn);
		
		resto_del_btn = new JButton("DELETE");
		resto_del_btn.setForeground(Color.WHITE);
		resto_del_btn.setFont(MainFrame.labelFont);
		resto_del_btn.setBackground(MainFrame.mainColor);
		resto_del_btn.setBounds(310, 259, 120, 40);
		this.add(resto_del_btn);
		
		menu_add_btn = new JButton("ADD");
		menu_add_btn.setForeground(Color.WHITE);
		menu_add_btn.setFont(MainFrame.labelFont);
		menu_add_btn.setBackground(MainFrame.mainColor);
		menu_add_btn.setBounds(762, 259, 106, 40);
		this.add(menu_add_btn);
		
		menu_edit_btn = new JButton("EDIT");
		menu_edit_btn.setForeground(Color.WHITE);
		menu_edit_btn.setFont(MainFrame.labelFont);
		menu_edit_btn.setBackground(MainFrame.mainColor);
		menu_edit_btn.setBounds(903, 259, 106, 40);
		this.add(menu_edit_btn);
		
		menu_del_btn = new JButton("DELETE");
		menu_del_btn.setForeground(Color.WHITE);
		menu_del_btn.setFont(MainFrame.labelFont);
		menu_del_btn.setBackground(MainFrame.mainColor);
		menu_del_btn.setBounds(1039, 259, 120, 40);
		this.add(menu_del_btn);
		
		delivery_add_btn = new JButton("NEW");
		delivery_add_btn.setForeground(Color.WHITE);
		delivery_add_btn.setFont(MainFrame.labelFont);
		delivery_add_btn.setBackground(MainFrame.mainColor);
		delivery_add_btn.setBounds(375, 600, 106, 40);
		this.add(delivery_add_btn);
		


		//ADMIN
		
		JLabel lblAdmin = new JLabel("Admin");
		
		lblAdmin.setFont(MainFrame.headerFont);
		lblAdmin.setBounds(571, 8, 170, 45);
		this.add(lblAdmin);
		
		
		//RESTURANT PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.white);
		panel_1.setBounds(10, 67, 549, 399);
		this.add(panel_1);
		panel_1.setLayout(null);

		
		
		//RESTURANT
		
		JLabel lblResturant = new JLabel("   RESTAURANT");
		lblResturant.setBounds(145, 101, 185, 45);
		panel_1.add(lblResturant);
		lblResturant.setOpaque(true);
		lblResturant.setBackground(MainFrame.offColor);
		lblResturant.setForeground(Color.white);
		lblResturant.setFont(MainFrame.titleFont);

		
		//MENU PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.white);
		panel_2.setBounds(608, 71, 568, 395);
		this.add(panel_2);
		panel_2.setLayout(null);
		
		//MENU 
		
		JLabel lblMenu = new JLabel("  MENU");
		lblMenu.setOpaque(true);
		lblMenu.setBackground(MainFrame.offColor);
		lblMenu.setForeground(Color.white);
		lblMenu.setBounds(305, 110, 95, 45);
		panel_2.add(lblMenu);
		lblMenu.setFont(MainFrame.titleFont);
		
		//MENU PANNEL
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.white);
		panel_3.setBounds(10, 489, 1166, 239);
		this.add(panel_3);
		panel_3.setLayout(null);
		
		delivery_del_btn = new JButton("DELETE");
		delivery_del_btn.setBounds(723, 111, 120, 40);
		panel_3.add(delivery_del_btn);
		delivery_del_btn.setForeground(Color.WHITE);
		delivery_del_btn.setFont(MainFrame.labelFont);
		delivery_del_btn.setBackground(MainFrame.mainColor);
		
		delivery_edit_btn = new JButton("EDIT");
		delivery_edit_btn.setBounds(545, 111, 106, 40);
		panel_3.add(delivery_edit_btn);
		delivery_edit_btn.setForeground(Color.WHITE);
		delivery_edit_btn.setFont(MainFrame.labelFont);
		delivery_edit_btn.setBackground(MainFrame.mainColor);
		
		//DELIVERY MAN
		
		JLabel lblDeliveryMan = new JLabel("   DELIVERY MAN");

		lblDeliveryMan.setBounds(502, 10, 199, 45);

		panel_3.add(lblDeliveryMan);
		lblDeliveryMan.setOpaque(true);
		lblDeliveryMan.setBackground(MainFrame.offColor);
		lblDeliveryMan.setForeground(Color.white);
		lblDeliveryMan.setFont(MainFrame.titleFont);
		
		
		//LOG OUT NUTTON
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(Color.white);
		log_out_btn.setBackground(MainFrame.offColor);
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

		
		//Get log_out_btn
		
		public static JButton getLog_Out_Btn() {
			return	log_out_btn;
		}
		
		

}

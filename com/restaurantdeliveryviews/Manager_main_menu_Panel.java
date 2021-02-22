package com.restaurantdeliveryviews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Manager_main_menu_Panel extends JPanel{
	
	private	JButton menu_add_btn;
	private	JButton menu_edit_btn;
	private	JButton menu_del_btn;
	private	JButton resto_edit_btn;
	private	JButton log_out_btn;
	private	JMenu file;
	private	JMenu menu;
	private	JMenuItem log_out;
	private	JMenuItem exit;
	private	JMenuItem manage_menu;
	
	public Manager_main_menu_Panel() {
		
		this.setBackground(new Color(233, 150, 122));
		this.setLayout(null);
		
		//Manager
		
		JLabel lblManager = new JLabel("Manager");
		lblManager.setFont(new Font("Constantia", Font.BOLD, 30));
		lblManager.setBounds(546, 22, 140, 45);
		this.add(lblManager);
		
		//MENU PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(35, 96, 1109, 325);
		panel_2.setBackground(new Color(250, 240, 230));
		this.add(panel_2);
		panel_2.setLayout(null);
		
		//MENU 	
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(506, 29, 99, 40);
		panel_2.add(lblMenu);
		lblMenu.setFont(new Font("Constantia", Font.PLAIN, 25));
		
		menu_add_btn = new JButton("ADD");
		menu_add_btn.setForeground(Color.WHITE);
		menu_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_add_btn.setBackground(Color.DARK_GRAY);
		menu_add_btn.setBounds(255, 171, 118, 45);
		panel_2.add(menu_add_btn);
		
		menu_edit_btn = new JButton("EDIT");
		menu_edit_btn.setForeground(Color.WHITE);
		menu_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_edit_btn.setBackground(Color.DARK_GRAY);
		menu_edit_btn.setBounds(492,171, 118, 45);
		panel_2.add(menu_edit_btn);
		
		menu_del_btn = new JButton("DELETE");
		menu_del_btn.setForeground(Color.WHITE);
		menu_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_del_btn.setBackground(Color.DARK_GRAY);
		menu_del_btn.setBounds(757, 171, 118, 45);
		panel_2.add(menu_del_btn);
		
		//LOG OUT BUTTON
		
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(new Color(255, 255, 224));
		log_out_btn.setBackground(new Color(138, 43, 226));
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		this.add(log_out_btn);
		
		//RESTURANT PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 431, 1109, 300);
		this.add(panel_1);
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setLayout(null);
		
		//RESTURANT
		
		JLabel lblResturant = new JLabel("RESTURANT");
		lblResturant.setBounds(478, 30, 173, 45);
		panel_1.add(lblResturant);
		lblResturant.setFont(new Font("Constantia", Font.PLAIN, 25));
		
		resto_edit_btn = new JButton("EDIT");
		resto_edit_btn.setForeground(Color.WHITE);
		resto_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_edit_btn.setBackground(Color.DARK_GRAY);
		resto_edit_btn.setBounds(488, 172, 118, 45);
		panel_1.add(resto_edit_btn);
				
		//MENU BAR
				
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 40, 22);
		this.add(menuBar);
		
		//File Menu 
		
		file = new JMenu("File");
		file.setBackground(Color.BLACK);
		menuBar.add(file);
				
		log_out = new JMenuItem("Log Out");
		file.add(log_out);
				
		exit = new JMenuItem("Exit");
		file.add(exit);
				
		//Menu menu Bar
		
		menu = new JMenu("Menu");
		menu.setBackground(Color.BLACK);
		menuBar.add(menu);
		
		manage_menu = new JMenuItem("Manage Menu");
		menu.add(manage_menu);
		
	}
	
	//Get menu_add_btn
	
	public JButton getMenu_Add_Btn() {
		return	menu_add_btn;
	}
	
	//Get menu_edit_btn
	
	public JButton getMenu_Edit_Btn() {
		return	menu_edit_btn;
	}
	
	//Get menu_del_btn
	
	public JButton getMenu_Del_Btn() {
		return	menu_del_btn;
	}
	
	//Get resto_edit_btn
	
	public JButton getResto_Edit_Btn() {
		return	resto_edit_btn;
	}
	
	//Get log_out_btn
	
	public JButton log_out_btn() {
		return	log_out_btn;
	}
	
	//Get MenuItem Things
	
	public JMenuItem getLog_Out() {
		return log_out;
	}
	
	public JMenuItem getExit() {
		return exit;
	}
	
	public JMenuItem getManage_Menu() {
		return manage_menu;
	}
	
}

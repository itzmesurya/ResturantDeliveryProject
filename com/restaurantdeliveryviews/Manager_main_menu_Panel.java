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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager_main_menu_Panel extends JPanel{
	
	private	static JButton menu_add_btn;
	private	static JButton menu_edit_btn;
	private	static JButton menu_del_btn;
	private	static JButton resto_edit_btn;
	private	static JButton log_out_btn;

	
	public Manager_main_menu_Panel() {
		
		this.setBackground(Color.white);
		this.setLayout(null);
		
		//Manager
		
		JLabel lblManager = new JLabel("Manager");	
		lblManager.setFont(MainFrame.headerFont);
		lblManager.setBounds(546, 22, 140, 45);
		this.add(lblManager);
		
		//MENU PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(35, 96, 1109, 325);
		panel_2.setBackground(Color.white);
		this.add(panel_2);
		panel_2.setLayout(null);
		
		//MENU 	
		
		JLabel lblMenu = new JLabel("  MENU");
		lblMenu.setOpaque(true);
		lblMenu.setBackground(MainFrame.offColor);
		lblMenu.setForeground(Color.white);
		lblMenu.setFont(MainFrame.titleFont);
		lblMenu.setBounds(115, 106, 99, 45);
		panel_2.add(lblMenu);

		
		menu_add_btn = new JButton("ADD");
		menu_add_btn.setForeground(Color.WHITE);
		menu_add_btn.setFont(MainFrame.labelFont);
		menu_add_btn.setBackground(MainFrame.mainColor);
		menu_add_btn.setBounds(477, 106, 118, 45);
		panel_2.add(menu_add_btn);
		
		menu_edit_btn = new JButton("EDIT");
		menu_edit_btn.setForeground(Color.WHITE);
		menu_edit_btn.setFont(MainFrame.labelFont);
		menu_edit_btn.setBackground(MainFrame.mainColor);
		menu_edit_btn.setBounds(678,106, 118, 45);
		panel_2.add(menu_edit_btn);
		
		menu_del_btn = new JButton("DELETE");
		menu_del_btn.setForeground(Color.WHITE);
		menu_del_btn.setFont(MainFrame.labelFont);
		menu_del_btn.setBackground(MainFrame.mainColor);
		menu_del_btn.setBounds(877, 106, 118, 45);
		panel_2.add(menu_del_btn);
		
		//LOG OUT BUTTON
		
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(Color.white);
		log_out_btn.setBackground(MainFrame.offColor);
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		this.add(log_out_btn);
		
		//RESTURANT PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 431, 1109, 300);
		this.add(panel_1);
		panel_1.setBackground(Color.white);
		panel_1.setLayout(null);
		
		//RESTURANT
		
		JLabel lblResturant = new JLabel("  RESTAURANT");
		lblResturant.setOpaque(true);
		lblResturant.setBackground(MainFrame.offColor);
		lblResturant.setForeground(Color.white);
		lblResturant.setFont(MainFrame.titleFont);
		lblResturant.setBounds(115, 172, 173, 45);
		panel_1.add(lblResturant);
	
		
		resto_edit_btn = new JButton("EDIT");
		resto_edit_btn.setForeground(Color.WHITE);
		resto_edit_btn.setFont(MainFrame.labelFont);
		resto_edit_btn.setBackground(MainFrame.mainColor);
		resto_edit_btn.setBounds(477, 172, 118, 45);
		panel_1.add(resto_edit_btn);
				

		
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
	
	//Get resto_edit_btn
	
	public static JButton getResto_Edit_Btn() {
		return	resto_edit_btn;
	}
	
	//Get log_out_btn
	
	public static JButton getlog_out_btn() {
		return	log_out_btn;
	}
	

	
}

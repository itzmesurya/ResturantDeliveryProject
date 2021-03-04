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

public class Client_main_menu_Panel extends JPanel{
	
	private	static JButton place_order_btn;
	private	static JButton view_history_btn;
	private	static JButton account_edit_btn;
	private	static JButton log_out_btn;

	
	public Client_main_menu_Panel() {
		
		this.setBackground(Color.white);
		this.setLayout(null);
		
		
		//Client
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setFont(MainFrame.headerFont);
		lblClient.setBounds(591, 22, 170, 45);
		this.add(lblClient);
		
		//Order PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(35, 96, 1109, 325);
		panel_2.setBackground(Color.white);
		this.add(panel_2);
		panel_2.setLayout(null);
		
		//MENU 	
		
		JLabel lblOrder = new JLabel("  ORDER");
		lblOrder.setOpaque(true);
		lblOrder.setBackground(MainFrame.offColor);
		lblOrder.setForeground(Color.white);
		lblOrder.setFont(MainFrame.titleFont);
		lblOrder.setBounds(35, 154, 110, 50);
		panel_2.add(lblOrder);
	
		
		place_order_btn = new JButton("Place Order");
		place_order_btn.setForeground(Color.WHITE);
		place_order_btn.setFont(MainFrame.labelFont);
		place_order_btn.setBackground(MainFrame.mainColor);
		place_order_btn.setBounds(362, 152, 173, 55);
		panel_2.add(place_order_btn);
		
		
		view_history_btn = new JButton("View History");
		view_history_btn.setForeground(Color.WHITE);
		view_history_btn.setFont(MainFrame.labelFont);
		view_history_btn.setBackground(MainFrame.mainColor);
		view_history_btn.setBounds(702, 152, 173, 55);
		panel_2.add(view_history_btn);
		
		//LOG OUT BUTTON
		
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(Color.white);
		log_out_btn.setBackground(MainFrame.offColor);
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		this.add(log_out_btn);
		
		//Account PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 431, 1109, 300);
		this.add(panel_1);
		panel_1.setBackground(Color.white);
		panel_1.setLayout(null);
		
		//Account
		
		JLabel lblAccount = new JLabel("    ACCOUNT");
		lblAccount.setOpaque(true);
		lblAccount.setBackground(MainFrame.offColor);
		lblAccount.setForeground(Color.white);
		lblAccount.setFont(MainFrame.titleFont);
		lblAccount.setBounds(35, 140, 150, 55);
		panel_1.add(lblAccount);
	
		
		account_edit_btn = new JButton("Edit Account");
		account_edit_btn.setForeground(Color.WHITE);
		account_edit_btn.setFont(MainFrame.labelFont);
		account_edit_btn.setBackground(MainFrame.mainColor);
		account_edit_btn.setBounds(362, 140, 173, 55);
		panel_1.add(account_edit_btn);
		

		
	}
	
	//Get place_order_btn
	
	public static JButton getPlace_Order_Btn() {
		return	place_order_btn;
	}
	
	//Get view_history_btn
	
	public static JButton getView_History_Btn() {
		return	view_history_btn;
	}
	
	//Get account_edit_btn
	
	public static JButton getAccount_Edit_Btn() {
		return	account_edit_btn;
	}
	
	//Get log_out_btn
	
	public static JButton getlog_out_btn() {
		return	log_out_btn;
	}
	


}

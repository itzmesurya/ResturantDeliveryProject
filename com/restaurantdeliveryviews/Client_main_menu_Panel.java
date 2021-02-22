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

public class Client_main_menu_Panel extends JPanel{
	
	private	JButton place_order_btn;
	private	JButton view_history_btn;
	private	JButton account_edit_btn;
	private	JButton log_out_btn;
	private	JMenu file;
	private	JMenuItem log_out;
	private	JMenuItem exit;
	
	public Client_main_menu_Panel() {
		
		this.setBackground(new Color(233, 150, 122));
		this.setLayout(null);
		
		
		//Client
		
		JLabel lblManager = new JLabel("CLIENT");
		lblManager.setFont(new Font("Constantia", Font.BOLD, 30));
		lblManager.setBounds(530, 22, 140, 45);
		this.add(lblManager);
		
		//Order PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(35, 96, 1109, 325);
		panel_2.setBackground(new Color(250, 240, 230));
		this.add(panel_2);
		panel_2.setLayout(null);
		
		//MENU 	
		
		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setBounds(506, 29, 99, 40);
		panel_2.add(lblOrder);
		lblOrder.setFont(new Font("Constantia", Font.PLAIN, 25));
		
		place_order_btn = new JButton("<html>Place<br /> Order<html>");
		place_order_btn.setForeground(Color.WHITE);
		place_order_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		place_order_btn.setBackground(Color.DARK_GRAY);
		place_order_btn.setBounds(255, 171, 118, 45);
		panel_2.add(place_order_btn);
		
		
		view_history_btn = new JButton("<html>View<br /> History<html>");
		view_history_btn.setForeground(Color.WHITE);
		view_history_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		view_history_btn.setBackground(Color.DARK_GRAY);
		view_history_btn.setBounds(757, 171, 118, 45);
		panel_2.add(view_history_btn);
		
		//LOG OUT BUTTON
		
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(new Color(255, 255, 224));
		log_out_btn.setBackground(new Color(138, 43, 226));
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		this.add(log_out_btn);
		
		//Account PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 431, 1109, 300);
		this.add(panel_1);
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setLayout(null);
		
		//Account
		
		JLabel lblAccount = new JLabel("ACCOUNT");
		lblAccount.setBounds(478, 30, 173, 45);
		panel_1.add(lblAccount);
		lblAccount.setFont(new Font("Constantia", Font.PLAIN, 25));
		
		account_edit_btn = new JButton("<html>Edit<br /> Account<html>");
		account_edit_btn.setForeground(Color.WHITE);
		account_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		account_edit_btn.setBackground(Color.DARK_GRAY);
		account_edit_btn.setBounds(488, 172, 118, 45);
		panel_1.add(account_edit_btn);
		
		//MENU BAR
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 40, 22);
		this.add(menuBar);
				
		//File Menu BAR
				
		file = new JMenu("File");
		file.setBackground(Color.BLACK);
		menuBar.add(file);
				
		log_out = new JMenuItem("Log Out");
		file.add(log_out);
				
		exit = new JMenuItem("Exit");
		file.add(exit);
		
	}
	
	//Get place_order_btn
	
	public JButton getPlace_Order_Btn() {
		return	place_order_btn;
	}
	
	//Get view_history_btn
	
	public JButton getView_History_Btn() {
		return	view_history_btn;
	}
	
	//Get account_edit_btn
	
	public JButton getAccount_Edit_Btn() {
		return	account_edit_btn;
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

}

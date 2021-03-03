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

public class DeliveryMan_main_menu_Panel extends JPanel{
	
	private	static JButton delivery_accept_btn;
	private	static JButton delivery_end_btn;
	private	static JButton delivery_editinfo_btn;
	private	static JButton log_out_btn;


	public DeliveryMan_main_menu_Panel() {
		
		this.setBackground(Color.white);
		this.setLayout(null);
		
		//RESTAURATEUR
		
		JLabel lblDeliveryMan = new JLabel("  Delivery Man");
		lblDeliveryMan.setFont(MainFrame.headerFont);
		lblDeliveryMan.setBounds(511, 22, 320, 45);
		this.add(lblDeliveryMan);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(72, 183, 1059, 559);
		panel_1.setBackground(new Color(255, 255, 255));
		this.add(panel_1);
		panel_1.setLayout(null);
		
		//ORDERS
		
		JLabel lblDeliveries = new JLabel("   DELIVERIES");
		lblDeliveries.setOpaque(true);
		lblDeliveries.setBackground(MainFrame.offColor);
		lblDeliveries.setForeground(Color.white);
		lblDeliveries.setFont(MainFrame.titleFont);
		lblDeliveries.setBounds(471, 47, 169, 46);
		panel_1.add(lblDeliveries);
		
		
		delivery_accept_btn = new JButton("<html>ACCPET<br />Delivery</html>");
		delivery_accept_btn.setForeground(Color.WHITE);
		delivery_accept_btn.setFont(MainFrame.labelFont);
		delivery_accept_btn.setBackground(MainFrame.mainColor);
		delivery_accept_btn.setBounds(212, 411, 118, 63);
		panel_1.add(delivery_accept_btn);
		
		delivery_end_btn = new JButton("<html>END<br />Delivery</html>");
		delivery_end_btn.setForeground(Color.WHITE);
		delivery_end_btn.setFont(MainFrame.labelFont);
		delivery_end_btn.setBackground(MainFrame.mainColor);
		delivery_end_btn.setBounds(757, 411, 118, 63);
		panel_1.add(delivery_end_btn);
		
		delivery_editinfo_btn = new JButton("<html>EDIT<br />Information</html>");
		delivery_editinfo_btn.setForeground(Color.WHITE);
		delivery_editinfo_btn.setFont(MainFrame.labelFont);
		delivery_editinfo_btn.setBackground(MainFrame.mainColor);
		delivery_editinfo_btn.setBounds(487, 411, 136, 63);
		panel_1.add(delivery_editinfo_btn);
		
		//LOG OUT BUTTON
		
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(Color.white);
		log_out_btn.setBackground(MainFrame.offColor);
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 40);
		this.add(log_out_btn);
		

	
	}
	
	//Get place_order_btn
	
	public static JButton getDelivery_Accept_Btn() {
		return	delivery_accept_btn;
	}
	
	//Get view_history_btn
	
	public static JButton getDelivery_End_Btn() {
		return	delivery_end_btn;
	}
	
	//Get account_edit_btn
	
	public static JButton getDelivery_Editinfo_Btn() {
		return	delivery_editinfo_btn;
	}
	
	//Get log_out_btn
	
	public static JButton getLog_Out_Btn() {
		return	log_out_btn;
	}
	


}

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

public class Restaurateur_main_menu_Panel extends JPanel{
	
	private static JButton order_accept_btn;
	private static JButton order_ready_btn;
	private static JButton log_out_btn;

	
	public Restaurateur_main_menu_Panel() {
		
		this.setBackground(Color.white);
		this.setLayout(null);
		
		//RESTAURATEUR
		
		JLabel lblRestaurateur = new JLabel("Restaurateur");
		lblRestaurateur.setFont(MainFrame.headerFont);
		lblRestaurateur.setBounds(511, 22, 270, 45);
		this.add(lblRestaurateur);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(72, 183, 1059, 509);
		panel_1.setBackground(Color.white);
		this.add(panel_1);
		panel_1.setLayout(null);
		
		//ORDERS
		
		JLabel lblOrder = new JLabel("   ORDER");
		lblOrder.setOpaque(true);
		lblOrder.setBackground(MainFrame.offColor);
		lblOrder.setForeground(Color.WHITE);
		lblOrder.setFont(MainFrame.titleFont);
		lblOrder.setBounds(430, 47, 135, 46);
		panel_1.add(lblOrder);
		
		
		order_accept_btn = new JButton("<html>ACCPET<br />ORDERS</html>");
		order_accept_btn.setForeground(Color.WHITE);
		order_accept_btn.setFont(MainFrame.labelFont);
		order_accept_btn.setBackground(MainFrame.mainColor);
		order_accept_btn.setBounds(248, 228, 118, 63);
		panel_1.add(order_accept_btn);
		
		order_ready_btn = new JButton("<html>MARK<br />READY</html>");
		order_ready_btn.setForeground(Color.WHITE);
		order_ready_btn.setFont(MainFrame.labelFont);
		order_ready_btn.setBackground(MainFrame.mainColor);
		order_ready_btn.setBounds(620, 228, 118, 63);
		panel_1.add(order_ready_btn);
		
		//LOG OUT BUTTON
		
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(Color.white);
		log_out_btn.setBackground(MainFrame.offColor);
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		this.add(log_out_btn);
		

		
	}
	
	/**
	 * @return	order_accept_btn
	 */
	public static JButton getOrder_Accept_Btn() {
		return order_accept_btn;
	}
	
	/**
	 * @return	order_ready_btn
	 */
	public static JButton getOrder_Ready_Btn() {
		return order_ready_btn;
	}
	
	/**
	 * @return	log_out_btn
	 */
	public static JButton getlog_Out_Btn() {
		return log_out_btn;
	}
	


}

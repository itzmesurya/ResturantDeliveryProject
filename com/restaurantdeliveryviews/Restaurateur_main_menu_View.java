package com.restaurantdeliveryviews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Restaurateur_main_menu_View {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurateur_main_menu_View window = new Restaurateur_main_menu_View();
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
	public Restaurateur_main_menu_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setResizable(false);
		frame.setTitle("RESTAURATEUR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 150, 122));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//RESTAURATEUR
		
		JLabel lblRestaurateur = new JLabel("RESTAURATEUR");
		lblRestaurateur.setFont(new Font("Constantia", Font.BOLD, 30));
		lblRestaurateur.setBounds(511, 22, 250, 45);
		panel.add(lblRestaurateur);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(72, 183, 1059, 509);
		panel_1.setBackground(new Color(250, 240, 230));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//ORDERS
		
		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setBounds(483, 47, 137, 46);
		panel_1.add(lblOrder);
		lblOrder.setFont(new Font("Constantia", Font.PLAIN, 30));
		
		JButton order_accept_btn = new JButton("<html>ACCPET<br />ORDERS</html>");
		order_accept_btn.setForeground(Color.WHITE);
		order_accept_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		order_accept_btn.setBackground(Color.DARK_GRAY);
		order_accept_btn.setBounds(305, 228, 118, 63);
		panel_1.add(order_accept_btn);
		
		JButton order_ready_btn = new JButton("<html>MARK<br />READY</html>");
		order_ready_btn.setForeground(Color.WHITE);
		order_ready_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		order_ready_btn.setBackground(Color.DARK_GRAY);
		order_ready_btn.setBounds(620, 228, 118, 63);
		panel_1.add(order_ready_btn);
		
		//LOG OUT BUTTON
		
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
				
		JMenuItem log_out = new JMenuItem("Log Out");
		file.add(log_out);
				
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		
		//Order Menu Bar
		
		JMenu order = new JMenu("Orders");
		order.setBackground(Color.BLACK);
		menuBar.add(order);
		
		JMenuItem view_order = new JMenuItem("View Orders");
		order.add(view_order);
		
		
		
		
	}

}

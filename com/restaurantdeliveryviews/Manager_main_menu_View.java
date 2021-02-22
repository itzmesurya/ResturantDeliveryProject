package com.restaurantdeliveryviews;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Manager_main_menu_View {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_main_menu_View window = new Manager_main_menu_View();
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
	public Manager_main_menu_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setTitle("MANAGER");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 150, 122));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//Manager
		
		JLabel lblManager = new JLabel("Manager");
		lblManager.setFont(new Font("Constantia", Font.BOLD, 30));
		lblManager.setBounds(546, 22, 140, 45);
		panel.add(lblManager);
		
		//MENU PANNEL
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(35, 96, 1109, 325);
		panel_2.setBackground(new Color(250, 240, 230));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		//MENU 	
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(506, 29, 99, 40);
		panel_2.add(lblMenu);
		lblMenu.setFont(new Font("Constantia", Font.PLAIN, 25));
		
		JButton menu_add_btn = new JButton("ADD");
		menu_add_btn.setForeground(Color.WHITE);
		menu_add_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_add_btn.setBackground(Color.DARK_GRAY);
		menu_add_btn.setBounds(255, 171, 118, 45);
		panel_2.add(menu_add_btn);
		
		JButton menu_edit_btn = new JButton("EDIT");
		menu_edit_btn.setForeground(Color.WHITE);
		menu_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_edit_btn.setBackground(Color.DARK_GRAY);
		menu_edit_btn.setBounds(492,171, 118, 45);
		panel_2.add(menu_edit_btn);
		
		JButton menu_del_btn = new JButton("DELETE");
		menu_del_btn.setForeground(Color.WHITE);
		menu_del_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu_del_btn.setBackground(Color.DARK_GRAY);
		menu_del_btn.setBounds(757, 171, 118, 45);
		panel_2.add(menu_del_btn);
		
		//LOG OUT BUTTON
		
		JButton log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(new Color(255, 255, 224));
		log_out_btn.setBackground(new Color(138, 43, 226));
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		panel.add(log_out_btn);
		
		//RESTURANT PANNEL
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 431, 1109, 300);
		panel.add(panel_1);
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setLayout(null);
		
		//RESTURANT
		
		JLabel lblResturant = new JLabel("RESTURANT");
		lblResturant.setBounds(478, 30, 173, 45);
		panel_1.add(lblResturant);
		lblResturant.setFont(new Font("Constantia", Font.PLAIN, 25));
		
		JButton resto_edit_btn = new JButton("EDIT");
		resto_edit_btn.setForeground(Color.WHITE);
		resto_edit_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resto_edit_btn.setBackground(Color.DARK_GRAY);
		resto_edit_btn.setBounds(488, 172, 118, 45);
		panel_1.add(resto_edit_btn);
				
		//MENU BAR
				
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		//File Menu 
		
		JMenu file = new JMenu("File");
		file.setBackground(Color.BLACK);
		menuBar.add(file);
				
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
				
		
		
		
		
		
	}
}

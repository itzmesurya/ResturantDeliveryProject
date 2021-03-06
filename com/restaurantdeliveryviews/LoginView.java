package com.restaurantdeliveryviews;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.io.InputStream;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class LoginView {

	private JFrame frame;
	private JTextField tf_1;
	private JTextField tf_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
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
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(200, 10, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_Login = new JPanel();
		frame.getContentPane().add(panel_Login, BorderLayout.CENTER);
		panel_Login.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(0, 0, 20, 0));
		topPanel.setBackground(Color.WHITE);
		topPanel.setPreferredSize(new Dimension(0, 540));
		topPanel.setFont(new Font("Arial", Font.BOLD, 40));
		panel_Login.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl_1 = new JLabel("");
		lbl_1.setIcon(new ImageIcon(LoginView.class.getResource("/image/hunger_squad_logo.jpg")));
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setFont(new Font("Arial", Font.BOLD, 80));
		topPanel.add(lbl_1, BorderLayout.SOUTH);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(700, 0));
		eastPanel.setFont(new Font("Arial", Font.BOLD, 40));
		panel_Login.add(eastPanel, BorderLayout.CENTER);
		eastPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(new BorderLayout());
		panel_3.setPreferredSize(new Dimension(0, 150));
		eastPanel.add(panel_3, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel_3.add(panel, BorderLayout.NORTH);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setPreferredSize(new Dimension(100, 40));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 25));
		btnLogin.setBackground(Color.RED);
		panel.add(btnLogin);
		
		JLabel lbl_create_account = new JLabel("Don't have an account yet? Click here to create one");
		lbl_create_account.setBackground(Color.WHITE);
		lbl_create_account.setForeground(Color.BLUE);
		lbl_create_account.setPreferredSize(new Dimension(600, 20));
		lbl_create_account.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_create_account.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_create_account.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_3.add(lbl_create_account);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.setPreferredSize(new Dimension(650, 0));
		eastPanel.add(panel_2, BorderLayout.CENTER);
		
		JPanel midPanel1 = new JPanel();
		midPanel1.setBackground(Color.RED);
		midPanel1.setPreferredSize(new Dimension(580, 60));
		midPanel1.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2.add(midPanel1);
		
		JLabel lbl_Name = new JLabel("Username: ");
		lbl_Name.setForeground(Color.WHITE);
		lbl_Name.setFont(new Font("Arial", Font.BOLD, 25));
		midPanel1.add(lbl_Name);
		
		tf_1 = new JTextField();
		tf_1.setBackground(Color.WHITE);
		tf_1.setPreferredSize(new Dimension(400, 40));
		tf_1.setFont(new Font("Arial", Font.BOLD, 22));
		tf_1.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		midPanel1.add(tf_1);
		
		JPanel midPanel2 = new JPanel();
		midPanel2.setBackground(Color.RED);
		midPanel2.setPreferredSize(new Dimension(580, 60));
		midPanel2.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2.add(midPanel2);
		
		JLabel lbl_Password = new JLabel("Password: ");
		lbl_Password.setForeground(Color.WHITE);
		lbl_Password.setFont(new Font("Arial", Font.BOLD, 25));
		midPanel2.add(lbl_Password);
		
		tf_2 = new JTextField();
		tf_2.setBackground(Color.WHITE);
		tf_2.setPreferredSize(new Dimension(400, 40));
		tf_2.setFont(new Font("Arial", Font.BOLD, 22));
		tf_2.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		midPanel2.add(tf_2);
	}

}

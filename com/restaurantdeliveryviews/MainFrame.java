package com.restaurantdeliveryviews;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static JFrame mainFrame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void changePanel(JPanel panel) {
		mainFrame.getContentPane().add(panel, BorderLayout.CENTER);
		mainFrame.revalidate();
	}

	public static JFrame getMainFrame() {
		return mainFrame;
	}
	
}

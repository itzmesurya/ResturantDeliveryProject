package com.restaurantdeliveryviews;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {

	private static JFrame mainFrame;
	private static JPanel mainPanel;

	/**
	 * Create the frame
	 */
	public MainFrame() {
		mainFrame = new JFrame();
		mainPanel = new JPanel();
		mainFrame.setBounds(100, 100, 1200, 800);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
	public static void setPanel(JPanel panel) {
		mainPanel = panel;
	}
	
	public static void changePanel(JPanel panel) {
		mainFrame.getContentPane().remove(mainPanel);
		mainPanel = panel;
		mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainFrame.revalidate();
	}
	
}

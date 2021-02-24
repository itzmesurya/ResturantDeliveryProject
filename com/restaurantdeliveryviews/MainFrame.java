package com.restaurantdeliveryviews;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {

	private static JFrame mainFrame;

	/**
	 * Create the frame
	 */
	public MainFrame() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 1200, 800);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
	public static void changePanel(JPanel panel) {
		//mainFrame.removeAll();
		mainFrame.getContentPane().add(panel, BorderLayout.CENTER);
		mainFrame.revalidate();
	}
	
}

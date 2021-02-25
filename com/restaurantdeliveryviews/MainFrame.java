package com.restaurantdeliveryviews;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import com.restaurantdeliverymodels.User;

public class MainFrame {

	private static JFrame mainFrame;
	private static JPanel mainPanel;
	private static JMenuBar menuBar;

	/**
	 * Create the frame
	 */
	public MainFrame() {
		mainFrame = new JFrame();
		mainPanel = new JPanel();
		mainFrame.setBounds(100, 100, 1200, 825);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		menuBar = new CustomMenuBar();
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
	
	public static void setBarForUser(User user) {
		mainFrame.setJMenuBar(menuBar);
		switch(user.getLevel()) {
		case 0:
			//TODO
			break;
		case 1:
			//TODO
			break;
		case 2:
			//TODO
			break;
		case 3:
			//TODO
			break;
		case 100:
			//TODO
			break;
		}
		mainFrame.revalidate();
	}
	
}

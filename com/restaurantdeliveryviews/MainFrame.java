package com.restaurantdeliveryviews;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import com.restaurantdeliverymodels.User;

public class MainFrame {

	private static JFrame mainFrame;
	private static JPanel mainPanel;
	private static CustomMenuBar menuBar;

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
		mainFrame.setJMenuBar(menuBar);
		menuBar.setVisible(false);
	}
	
	public static JFrame getMainFrame() {
		return mainFrame;
	}
	
	public static JPanel getMainPanel() {
		return mainPanel;
	}
	
	public static CustomMenuBar getMenuBar() {
		return menuBar;
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

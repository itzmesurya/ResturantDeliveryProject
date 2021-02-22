package com.restaurantdeliverycontrollers;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.RestaurantPanel;

public class Main {

	private static JFrame mainFrame;
	public static User user;
	
	public static void main(String[] args) {
		mainFrame = new MainFrame();
		mainFrame.getContentPane().add(new LoginPanel(), BorderLayout.CENTER);
		mainFrame.revalidate();
	}
	
	public static JFrame getMainFrame() {
		return mainFrame;
	}

}

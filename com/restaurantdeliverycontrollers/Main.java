package com.restaurantdeliverycontrollers;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.RestaurantPanel;

public class Main {

	public static User user;
	public static MainFrame mainframe;
	
	public static void main(String[] args) {
		mainframe = new MainFrame();
		mainframe.changePanel(new LoginPanel());;
	}

}

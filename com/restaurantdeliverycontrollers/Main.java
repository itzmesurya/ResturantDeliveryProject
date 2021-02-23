package com.restaurantdeliverycontrollers;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;

public class Main {

	public static User user;
	
	public static void main(String[] args) {
		new Database();
		new MainFrame();
		MainFrame.changePanel(new LoginPanel());
	}

}

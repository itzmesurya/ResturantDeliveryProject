package com.restaurantdeliverycontrollers;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.RestaurantPanel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;

public class Main {

	public static User user;
	
	public static void main(String[] args) {
		new Database();
		new MainFrame();
		MainFrame.changePanel(new Admin_main_menu_Panel());
		
		
	}

}

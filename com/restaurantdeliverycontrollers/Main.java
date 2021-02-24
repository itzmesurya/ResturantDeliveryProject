package com.restaurantdeliverycontrollers;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.User;

import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryPanel;

import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;

public class Main {

	public static User user;
	
	public static void main(String[] args) {
		new Database();
		new MainFrame();

		MainFrame.changePanel(new LoginPanel());
		MainFrame.changePanel(new Admin_main_menu_Panel());
		new Admin_main_menu_Core();
	}

}

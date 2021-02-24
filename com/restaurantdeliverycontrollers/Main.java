package com.restaurantdeliverycontrollers;

import com.restaurantdeliverymodels.Admin;
import com.restaurantdeliverymodels.Client;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Manager;
import com.restaurantdeliverymodels.Menu;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.Restaurateur;
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
		MainFrame.changePanel(new DeliveryPanel("create"));
		
	}

}

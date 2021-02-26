package com.restaurantdeliverycontrollers;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.User;

import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryMan_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryPanel;

import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.Manager_main_menu_Panel;
import com.restaurantdeliveryviews.MenuPanel;
import com.restaurantdeliveryviews.OrderPanel;
import com.restaurantdeliveryviews.Order_Food_Panel;
import com.restaurantdeliveryviews.RestaurantPanel;
import com.restaurantdeliveryviews.Restaurateur_main_menu_Panel;

public class Main {

	public static User user;

	public static void main(String[] args) {
		new Database();
		new MainFrame();

		user = Database.getClients().get(4);

		MainFrame.changePanel(new AccountPanel(CRUDAction.Delete));
		new AccountCore(CRUDAction.Delete);

	}

}

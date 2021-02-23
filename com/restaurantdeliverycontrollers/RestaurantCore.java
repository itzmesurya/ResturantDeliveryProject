package com.restaurantdeliverycontrollers;

import javax.swing.JPanel;

import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.RestaurantPanel;

public class RestaurantCore {
	
	static Restaurant restaurnt_model;
	static MainFrame restaurant_view;

	public static void main(String[] args) {
		//restaurnt_model = new Restaurant();
		restaurant_view = new MainFrame();
		restaurant_view.changePanel(new RestaurantPanel());

	}


}

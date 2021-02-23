package com.restaurantdeliverycontrollers;

import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.OrderHistoryPanel;

public class OrderHistoryCore {
	
	static MainFrame orderhistory_view;


	public static void main(String[] args) {
		orderhistory_view = new MainFrame();
		orderhistory_view.changePanel(new OrderHistoryPanel());

	}

}

package com.restaurantdeliverycontrollers;

import java.util.ArrayList;

import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliveryviews.DeliveryPanel;
import com.restaurantdeliveryviews.OrderPanel;

public class OrderCore {
	
	OrderPanel OrderPanel;
	private String action;

	 OrderCore(OrderPanel OrdeyPanel, String action) {
		

		this.OrderPanel = OrderPanel;
		this.action = action;
		BindActionEvents(this.OrderPanel);
		AdaptToAction();
	}
	
	
	 
	 public void BindActionEvents(OrderPanel orderPanel) {
		 
//	ArrayList<Order> restaurateur_orders = ((Restaurateur) Main.user).getOrders();
	
	 
	 
	 
	 }
	
	
	
	
	
	
	private void AdaptToAction() {
			// TODO Auto-generated method stub
			
	
	
	
	}


}

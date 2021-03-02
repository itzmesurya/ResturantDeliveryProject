package com.restaurantdeliverycontrollers;

import java.util.ArrayList;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliveryviews.DeliveryPanel;
import com.restaurantdeliveryviews.OrderPanel;

public class OrderCore {

	 OrderCore(CRUDAction action) {
		
		 switch(action) {
		 case Read:
			 break;
		 case Accept:
			 break;
		 case Ready:
			 break;
		 }
		 
		ArrayList<Order> orders = ((Restaurateur) Main.user).getOrders();
	}

}

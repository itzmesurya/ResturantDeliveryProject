package com.restaurantdeliverycontrollers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.OrderHistoryPanel;
import com.restaurantdeliveryviews.Order_Food_Panel;

public class Accept_Done_Delivery_Core {
	
	public Accept_Done_Delivery_Core(CRUDAction action) {
		
		switch(action) {
		case Read:
			break;
		case Accept:
			break;
		case Ready:
			break;
		}
			
		//  Getting Items 
		String str = Accept_Done__Delivery_Panel.getOrder_number().getText();		
		
		
			ArrayList<Order> orders  = Database.getOrders();
			
			//Getting Areas Of All the Orders
			for(int k = 0 ; k < orders.size(); k++ ) {
			String postal_code  = orders.get(k).getDelivery_area();
			
//			for(int g = 0 ; g < orders.size(); g++ ) {
//				//String postal_code  = orders.get(g).getDelivery_area();
//				ArrayList<String> delivery_guy_area = Deliveryman.getDelivery_areas();
//					System.out.println(delivery_guy_area);
//				}
			}
			for(int j = 0 ; j < orders.size() ;j++) {
				
			//Printing items from menu 		
				DefaultTableModel model = (DefaultTableModel) Accept_Done__Delivery_Panel.gettable().getModel();
				model.addRow(new Object[] {orders.get(j).getId(),orders.get(j).getRestaurant_id(),orders.get(j).getDelivery_address(),orders.get(j).getDelivery_area()});
				
				
				Accept_Done__Delivery_Panel.gettable().getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			        public void valueChanged(ListSelectionEvent event) {
			        	if (Accept_Done__Delivery_Panel.gettable().getSelectedRow() >= 0) {
			        		Accept_Done__Delivery_Panel.getOrder_number().setText(Accept_Done__Delivery_Panel.gettable().getValueAt(Accept_Done__Delivery_Panel.gettable().getSelectedRow(), 0).toString());
			        		Accept_Done__Delivery_Panel.getResturant().setText( Accept_Done__Delivery_Panel.gettable().getValueAt( Accept_Done__Delivery_Panel.gettable().getSelectedRow(), 1).toString());
			        		Accept_Done__Delivery_Panel.getDelivery_address().setText( Accept_Done__Delivery_Panel.gettable().getValueAt( Accept_Done__Delivery_Panel.gettable().getSelectedRow(), 2).toString());
			        		Accept_Done__Delivery_Panel.getDelivery_Postal_Code().setText( Accept_Done__Delivery_Panel.gettable().getValueAt( Accept_Done__Delivery_Panel.gettable().getSelectedRow(), 3).toString());
			        	
			        	} else {
			        		
			        		Accept_Done__Delivery_Panel.getOrder_number().setText(" ");
			        		Accept_Done__Delivery_Panel.getResturant().setText(" ");
			        		Accept_Done__Delivery_Panel.getDelivery_address().setText(" ");
			        		Accept_Done__Delivery_Panel.getDelivery_Postal_Code().setText(" ");
			        	}
			        }
			    });
			
				
		}
		
		
		// Delivery Accept Button
		Accept_Done__Delivery_Panel.getBtnAccept().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				//Store Data in DB of Delivery man delivers
				//delete from Order Table
			}
		});
		

		
	}

}

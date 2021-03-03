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
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.OrderHistoryPanel;
import com.restaurantdeliveryviews.Order_Food_Panel;

public class Accept_Done_Delivery_Core {
	
	
	public Accept_Done_Delivery_Core(CRUDAction action) {
		
		ArrayList<Order> orders  = Database.getOrders();
		ArrayList<Order> delivery_order  = new ArrayList<>();
		ArrayList<Restaurant> restaurant_name  = new ArrayList<>();
		
		switch(action) {
	
		case Accept:
			for(int k = 0 ; k < orders.size(); k++) {
				
				if(orders.get(k).getStatus() == 2) {
					
				if(((Deliveryman)Main.user).getDelivery_areas().contains(orders.get(k).getDelivery_area())) {						
					delivery_order.add(orders.get(k));
							
				  for(int j = 0 ; j < delivery_order.size(); j++) {
							
				    //Printing items from delivery_order 		
					DefaultTableModel model = (DefaultTableModel) Accept_Done__Delivery_Panel.gettable().getModel();
					model.addRow(new Object[] {delivery_order.get(j).getId(),delivery_order.get(j).getRestaurant_id(),delivery_order.get(j).getDelivery_address(),delivery_order.get(j).getDelivery_area()});
					//restaurant_name.get(j).getName()
					Accept_Done__Delivery_Panel.gettable().getColumnModel().getColumn(0).setPreferredWidth(1);
					Accept_Done__Delivery_Panel.gettable().getColumnModel().getColumn(1).setPreferredWidth(100);
					Accept_Done__Delivery_Panel.gettable().getColumnModel().getColumn(2).setPreferredWidth(100);
					Accept_Done__Delivery_Panel.gettable().getColumnModel().getColumn(3).setPreferredWidth(1);
								
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
											
			}
					
		}
	}
			
			// Delivery Accept Button
			Accept_Done__Delivery_Panel.getBtnAccept().addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e) {
						int t = Accept_Done__Delivery_Panel.gettable().getSelectedRow();
							orders.get(Accept_Done__Delivery_Panel.gettable().getSelectedRow()).setStatus(3);
							Accept_Done__Delivery_Panel.gettable().remove(t);
					
				}
			});
			
			
			break;
		case Ready:
			
			for(int k = 0 ; k < orders.size(); k++) {
				
				if(orders.get(k).getStatus() == 2) {
					
				if(((Deliveryman)Main.user).getDelivery_areas().contains(orders.get(k).getDelivery_area())) {						
					delivery_order.add(orders.get(k));
							
				  for(int j = 0 ; j < delivery_order.size(); j++) {
							
				    //Printing items from delivery_order 		
					DefaultTableModel model = (DefaultTableModel) Accept_Done__Delivery_Panel.gettable().getModel();
					model.addRow(new Object[] {delivery_order.get(j).getId(),delivery_order.get(j).getRestaurant_id(),delivery_order.get(j).getDelivery_address(),delivery_order.get(j).getDelivery_area()});
								
								
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
											
			}
					
		}
	}
			// Delivery Accept Button
			Accept_Done__Delivery_Panel.getBtnDone().addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e) {
						int t = Accept_Done__Delivery_Panel.gettable().getSelectedRow();
							orders.get(Accept_Done__Delivery_Panel.gettable().getSelectedRow()).setStatus(4);
							Accept_Done__Delivery_Panel.gettable().remove(t);
					
				}
			});
			
			
			
			break;
		default:
			break;
		}

	}

}

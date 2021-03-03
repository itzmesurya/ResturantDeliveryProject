package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Client;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliveryviews.DeliveryPanel;
import com.restaurantdeliveryviews.OrderPanel;

public class OrderCore {
	OrderPanel panel;
	ArrayList<Order> orders = new ArrayList<Order>();
	Order order;

 	OrderCore(OrderPanel orderPanel, CRUDAction action) {
 		this.panel = orderPanel;
		
		 switch(action) {
		 case Read:
			 panel.getAccept_btn().setVisible(false);
			 ArrayList<Restaurant> restaurants = Database.getRestaurants();
			 for(Restaurant restaurant: restaurants) {
				 panel.getSelectR_comboBox().addItem(restaurant.getName());
			 }
			 panel.getSelectR_comboBox().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					changeFilters();
				}
			});
			panel.getProgress_RadioButton().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					changeFilters();
				}
			});
			panel.getIncoming_RadioButton().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					changeFilters();
				}
			});
			 break;
			 
		 case Accept:
			 panel.getIncoming_RadioButton().setVisible(false);
			 panel.getProgress_RadioButton().setVisible(false);
			 panel.getSelectR_comboBox().setVisible(false);
			 
			 orders = ((Restaurateur) Main.user).getOrders();
//			 orders = ((Restaurateur) Main.user).getOrdersToAccept();
			 
			 displayOrders();
			 
			 panel.getAccept_btn().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(order != null)
						order.markDeliveryAccepted();

					 orders = ((Restaurateur) Main.user).getOrdersToAccept();
					 displayOrders();
				}
			});
			 break;
			 
		 case Ready:
			 panel.getIncoming_RadioButton().setVisible(false);
			 panel.getProgress_RadioButton().setVisible(false);
			 panel.getSelectR_comboBox().setVisible(false);

			 orders = ((Restaurateur) Main.user).getOrders();
//			 orders = ((Restaurateur) Main.user).getOrdersToMarkReady();
			 
			 displayOrders();

			 panel.getAccept_btn().setText("Ready");
			 
			 panel.getAccept_btn().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(order != null)
						order.markReadyForDelivery();
					
					 orders = ((Restaurateur) Main.user).getOrdersToMarkReady();
					 displayOrders();
				}
			});
			 break;
		 }
 	}
 	
 	private void changeFilters() {
		String restName = (String) panel.getSelectR_comboBox().getSelectedItem();
		Restaurant restaurant = Database.getRestaurantByName(restName);
		ArrayList<Order> allOrders = restaurant.getOrders();
		int status = 0;
		for (Order order: allOrders) {
//			if (order.getStatus() == status)
				orders.add(order);
		}
		displayOrders();
 	}
 	
 	private void displayOrders() {
 		panel.getTextField().setText(null);
 		panel.getTextField_1().setText(null);
 		panel.getTextField_2().setText(null);
 		panel.getTextField_3().setText(null);
// 		DefaultTableModel oldModel = (DefaultTableModel) panel.getTable().getModel();
// 		oldModel.setRowCount(0);
 		DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Meal in Order",
				"Quantity"
			}
		);
 		panel.getTable().setModel(model);
 	

 		DefaultTableModel oldModel_1 = (DefaultTableModel) panel.getTable_1().getModel();
 		oldModel_1.setRowCount(0);

 		
		DefaultTableModel model_1 = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Order Id",
					"Client Name" 
				}
			);
		for(Order order: orders) {
			Client client = Database.getClientById(order.getClient_id());
			if(client != null) {
		 		Object[] row = { order.getId(), client.getFirst_name() + " " + client.getLast_name() };
				model_1.addRow(row);
			}
		}
 		panel.getTable_1().setModel(model_1);
 		panel.getTable_1().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int selRow = panel.getTable_1().getSelectedRow();
				if(selRow == -1)
					return;
 	            int orderid = (int) panel.getTable_1().getValueAt(selRow, 0);
 	            order = Database.getOrderById(orderid);
 	            Item[] items = order.getItems();
// 	    		DefaultTableModel oldModel = (DefaultTableModel) panel.getTable().getModel();
// 	    		oldModel.setRowCount(0);
 	   		
	 	   		DefaultTableModel model = new DefaultTableModel(
	 	   				new Object[][] {
	 	   				},
	 	   				new String[] {
	 	   					"Meal in Order",
	 	   					"Quantity"
	 	   				}
	 	   			);
	 	   		for(Item item: items) {
	 	   	 		Object[] row = { item.getName(), item.getQuantity() };
	 	   			model.addRow(row);
	 	   		}
	 	    	panel.getTable().setModel(model);
	 	    	
	 	 		panel.getTextField().setText(order.getDate());
	 	 		panel.getTextField_1().setText(order.getHour());
	 	 		panel.getTextField_2().setText(order.getMinute());
	 	 		panel.getTextField_3().setText(order.getDelivery_address());
 	        }
 	    });
 	}

}

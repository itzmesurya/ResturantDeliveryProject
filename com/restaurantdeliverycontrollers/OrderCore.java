package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Client;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Manager;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliveryviews.DeliveryPanel;
import com.restaurantdeliveryviews.OrderPanel;

public class OrderCore {
	
	ArrayList<Order> orders = new ArrayList<Order>();
	Order order;

 	OrderCore( CRUDAction action) {
// 		this.panel = orderPanel;
		
		 switch(action) {
		 case Read:
			 OrderPanel.getAccept_btn().setVisible(false);
			 OrderPanel.getlabel().setText("View Order");
			 JLabel label = new JLabel("Accept Order");
			 ArrayList<Restaurant> restaurants = ((Manager) Main.user).getRestaurants();
//			 ArrayList<Restaurant> restaurants = Database.getRestaurants();
			 for(Restaurant restaurant: restaurants) {
				 OrderPanel.getSelectR_comboBox().addItem(restaurant.getName());
			 }
			 OrderPanel.getSelectR_comboBox().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					changeFilters();
				}
			});
			 OrderPanel.getProgress_RadioButton().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if( OrderPanel.getProgress_RadioButton().isSelected()) {
						 OrderPanel.getIncoming_RadioButton().setSelected(false);
					}
					changeFilters();
				}
			});
			 OrderPanel.getIncoming_RadioButton().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if( OrderPanel.getIncoming_RadioButton().isSelected()) {
						 OrderPanel.getProgress_RadioButton().setSelected(false);
					}
					changeFilters();
				}
			});
			 break;
			 
		 case Accept:
			 OrderPanel.getlabel().setText("Accept Order");
			 OrderPanel.getIncoming_RadioButton().setVisible(false);
			 OrderPanel.getProgress_RadioButton().setVisible(false);
			 OrderPanel.getSelectR_comboBox().setVisible(false);
			 
			 
//			 orders = ((Restaurateur) Main.user).getOrders();
			 orders = ((Restaurateur) Main.user).getOrdersToAccept();
			 
			 displayOrders();

			 
			 OrderPanel.getAccept_btn().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(order != null)
						order.markRestaurateurAccepted();

					 orders = ((Restaurateur) Main.user).getOrdersToAccept();
					 displayOrders();
				}
			 });
			 break;
			 
		 case Ready:
			 OrderPanel.getlabel().setText("Ready Order");
			 OrderPanel.getIncoming_RadioButton().setVisible(false);
			 OrderPanel.getProgress_RadioButton().setVisible(false);
			 OrderPanel.getSelectR_comboBox().setVisible(false);

//			 orders = ((Restaurateur) Main.user).getOrders();
			 orders = ((Restaurateur) Main.user).getOrdersToMarkReady();
			 
			 displayOrders();

			 OrderPanel.getAccept_btn().setText("Ready");
			 
			 OrderPanel.getAccept_btn().addActionListener(new ActionListener() {
				
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

		String restName = (String) OrderPanel.getSelectR_comboBox().getSelectedItem();
		Restaurant restaurant = Database.getRestaurantByName(restName);
		ArrayList<Order> allOrders = restaurant.getOrders();
		int status = -1;
		if(OrderPanel.getIncoming_RadioButton().isSelected()) {
			status = 0;
		} else if(OrderPanel.getProgress_RadioButton().isSelected()){
			status = 1;
		}
		if(status == -1) {
			orders = allOrders;
		} else {
			orders = new ArrayList<Order>();
			for (Order order: allOrders) {
				if  (order.getStatus() == status)
					orders.add(order);
			}
		}
		
		displayOrders();
 	}
 	
 	private void displayOrders() {
 		OrderPanel.getTextField().setText(null);
 		OrderPanel.getTextField_1().setText(null);
 		OrderPanel.getTextField_2().setText(null);
 		OrderPanel.getTextField_3().setText(null);
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
 		OrderPanel.getTable().setModel(model);
 	

// 		DefaultTableModel oldModel_1 = (DefaultTableModel) OrderPanel.getTable_1().getModel();
// 		oldModel_1.setRowCount(0);
// 		OrderPanel.getTable_1().setModel(oldModel_1);

 		
		DefaultTableModel model_1 = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Order Id",
					"Client Name" 
				}
			);
		OrderPanel.getTable_1().setModel(model_1);
		
		for(Order order: orders) {
			Client client = Database.getClientById(order.getClient_id());
			if(client != null) {
		 		Object[] row = { order.getId(), client.getFirst_name() + " " + client.getLast_name() };
				model_1.addRow(row);
			}
		}
		OrderPanel.getTable_1().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int selRow = OrderPanel.getTable_1().getSelectedRow();
				if(selRow == -1)
					return;
			
 	            int orderid = (int) OrderPanel.getTable_1().getValueAt(selRow, 0);
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
	 	   		OrderPanel.getTable().setModel(model);
	 	    	
			 	   OrderPanel.getTextField().setText(order.getDate());
			 	  OrderPanel.getTextField_1().setText(order.getHour());
			 	 OrderPanel.getTextField_2().setText(order.getMinute());
			 	OrderPanel.getTextField_3().setText(order.getDelivery_address());
 	        }
 	    });
 	}

}

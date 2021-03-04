package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.Client;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliveryviews.OrderHistoryPanel;
import com.restaurantdeliveryviews.RestaurantPanel;

public class OrderHistoryCore {
	
	private ArrayList<Order> orders;
	private Order orderDisplayed;
	
	public OrderHistoryCore() {
		
		orders = ((Client)Main.user).getOrdersCompleted();
		
		for (int i = 0; i < orders.size(); i++) {
			((DefaultTableModel)OrderHistoryPanel.getOrderTable().getModel()).addRow(new Object[]{Database.getRestaurantById(orders.get(i).getId()).getName(), orders.get(i).getDate()});
		}
		
		OrderHistoryPanel.getBtnSelect().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OrderHistoryPanel.getOrderTable().getSelectedRow() >= 0) {
					orderDisplayed = Database.getOrderById(orders.get(OrderHistoryPanel.getOrderTable().getSelectedRow()).getId()) ;
					OrderHistoryPanel.getTf_C11().setText(orderDisplayed.getDate());
					OrderHistoryPanel.getTf_hours().setText(orderDisplayed.getHour());
					OrderHistoryPanel.getTf_hours().setText(orderDisplayed.getHour());
					OrderHistoryPanel.getTf_C13().setText(orderDisplayed.getDelivery_address());
					DefaultTableModel menuModel = (DefaultTableModel) OrderHistoryPanel.getMenuTable().getModel();
					int rows = menuModel.getRowCount();
					for(int i = rows - 1; i >=0; i--)
					{
						menuModel.removeRow(i);
					}
					for (Item item : orderDisplayed.getItems()) {
						((DefaultTableModel)OrderHistoryPanel.getMenuTable().getModel()).addRow(new Object[]{item.getName(), item.getPrice(), item.getQuantity()});
					}
				} else {
					Functions.displayError("You must select an order first!");
				}
			}
		});

	}

}

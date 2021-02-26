package com.restaurantdeliverycontrollers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.Order_Food_Panel;

public class Accept_Done_Delivery_Core {
	
	public Accept_Done_Delivery_Core() {
		
		
			
		//  Getting Items 
		String str = Accept_Done__Delivery_Panel.getOrder_number().getText();		
		
		
			ArrayList<Order> orders  = Database.getOrders();
			
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
		
		// Delivery Done Button
		Accept_Done__Delivery_Panel.getBtnDelete().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				//delete Data in DB of Delivery man delivers
				
			}
		});
		
	}

}

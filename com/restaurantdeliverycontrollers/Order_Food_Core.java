package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Menu;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliveryviews.Order_Food_Panel;

public class Order_Food_Core {
	
	public Order_Food_Core() {
		
		//Add Restaurant Names To Combo Box
		
		ArrayList<Restaurant> restaurants = Database.getRestaurants();

		for(int i = 0 ; i < restaurants.size() ;i++) {
			Order_Food_Panel.getcomboBox().addItem(restaurants.get(i).getName());
		}
		
		
		//Get Info Of menu Of selected Restaurant And show in Menu
		int i = Order_Food_Panel.getcomboBox().getSelectedIndex();
		
		DefaultTableModel model = (DefaultTableModel) Order_Food_Panel.gettable().getModel();
		model.addRow(new Object[] {Database.getItems()});
		

		
		// Add Order Button
		Order_Food_Panel.getBtn_Add_Order().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
			//Display Order in Order Menu
				 
			}
		});
		
		
		// Delete Order Button
		Order_Food_Panel.getBtn_delete_Order().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
						
			//Delete Order in Order Menu
						 
			}
		});
		
		
		// Place Order Button
		Order_Food_Panel.getBtn_Place_Order().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
						
			//Get Address, Postal Code, Total Info
			//Store in Order DB
						 
			}
		});
		
	}
	

	
}

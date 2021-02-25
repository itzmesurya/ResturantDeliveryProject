package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.restaurantdeliveryviews.Order_Food_Panel;

public class Order_Food_Core {
	
	public Order_Food_Core() {
		
		//Combo Box 
		//Get Info Of menu Of selected Restaurant And show in Menu
		int i = Order_Food_Panel.getcomboBox().getSelectedIndex();
		
		
		
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

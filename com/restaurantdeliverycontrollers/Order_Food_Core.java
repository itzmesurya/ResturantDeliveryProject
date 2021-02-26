package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Menu;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.Order_Food_Panel;

public class Order_Food_Core {
	
	public Order_Food_Core() {
		
		//Add Restaurant Names To Combo Box
		
		ArrayList<Restaurant> restaurants = Database.getRestaurants();

		for(int i = 0 ; i < restaurants.size() ;i++) {
			Order_Food_Panel.getcomboBox().addItem(restaurants.get(i).getName());
		}
		
		
		//Get Info Of menu Of selected Restaurant And show in Menu
		
		Order_Food_Panel.getcomboBox().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				//Making Default Table 
				
				Order_Food_Panel.gettable().setModel(new DefaultTableModel(new Object[][] { 
				 },
				new String[] { "ID", "Item Name", "Price", }) {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					boolean[] columnEditables = new boolean[] { false, false, false, false };

					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
					
				//  Getting Items 
				
				ArrayList<Item> item  = Database.getItems();
					
				for(int j = 0 ; j < item.size() ;j++) {
		
					if( Order_Food_Panel.getcomboBox().getSelectedIndex() + 1 == item.get(j).getMenu_id()) {
						//Printing items from menu 		
						DefaultTableModel model = (DefaultTableModel) Order_Food_Panel.gettable().getModel();
						model.addRow(new Object[] {item.get(j).getId(),item.get(j).getName(),item.get(j).getPrice()});
						
					}
						
				}
			}
		});
		
		

		
		// Add Order Button
		
		Order_Food_Panel.getBtn_Add_Order().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				//Get Id
				
				JTextField add = Order_Food_Panel.getAdd_Id(); 
				int id = 0;
				id = Integer.parseInt(add.getText());				
				
				//Display Order in Order Menu
				Object[] rowData = new Object[Order_Food_Panel.gettable().getColumnCount()];
				
				for (int i = 0; i < Order_Food_Panel.gettable().getColumnCount(); i++) {
									
					rowData[i] = Order_Food_Panel.gettable().getValueAt(id-1, i);
					
				}
				
				//Get Quantity
				
				JTextField quantity = Order_Food_Panel.getAdd_Quantity(); 
				int q = 0;
				q = Integer.parseInt(quantity.getText());
				
			
				DefaultTableModel model = (DefaultTableModel) Order_Food_Panel.gettable2().getModel();
				model.addRow(new Object[] {rowData[0],rowData[1],rowData[2],q});
				
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

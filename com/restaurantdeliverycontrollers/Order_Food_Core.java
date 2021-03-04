package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;
import com.restaurantdeliverymodels.IdCounter;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Menu;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.Order_Food_Panel;

public class Order_Food_Core {
	private static int currentId = 0;
	private static int currentId2 = 0;
	int dialogButton = JOptionPane.YES_NO_OPTION;
	public Order_Food_Core() {
		
		//Add Restaurant Names To Combo Box
		
		ArrayList<Restaurant> restaurants = Database.getRestaurants();
		Order_Food_Panel.getcomboBox().addItem("");
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
		
					if( Order_Food_Panel.getcomboBox().getSelectedIndex() == item.get(j).getMenu_id()) {
						//Printing items from menu 		
						DefaultTableModel model = (DefaultTableModel) Order_Food_Panel.gettable().getModel();
						model.addRow(new Object[] {++currentId2,item.get(j).getName(),item.get(j).getPrice()});
						Order_Food_Panel.gettable().getColumnModel().getColumn(0).setPreferredWidth(1);
						Order_Food_Panel.gettable().getColumnModel().getColumn(1).setPreferredWidth(350);
						Order_Food_Panel.gettable().getColumnModel().getColumn(2).setPreferredWidth(3);
					}
						
				}
			}
		});
		
		

		
		// Add Order Button
		ArrayList<Double> list = new ArrayList<Double>();
		
		Order_Food_Panel.getBtn_Add_Order().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
			
				//Get Id
				boolean out = false;
				if((Order_Food_Panel.getAdd_Id().getText().isBlank())){
					JOptionPane.showMessageDialog(null, "Please Insert Order ID", "Error",
							JOptionPane.WARNING_MESSAGE);
					 out = true;
				}else if(Order_Food_Panel.getAdd_Quantity().getText().isBlank()){
					JOptionPane.showMessageDialog(null, "Please Insert Quantity", "Error",
							JOptionPane.WARNING_MESSAGE);
					out = true;
				}else if(out == false) {
				JTextField add = Order_Food_Panel.getAdd_Id(); 
				int id = 0;
				id = Integer.parseInt(add.getText());		
				
				if(id < Order_Food_Panel.gettable().getRowCount()) {
				
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
					
					model.addRow(new Object[] { ++currentId,rowData[1],rowData[2],q});
					
				
					//For TotaL

					double d3 = 0;
					for (int i = 0; i <  Order_Food_Panel.gettable2().getRowCount(); i++) {
						
						Object value = model.getValueAt(i,2);
						if (value!=null) {
					
							Double d= Double.parseDouble(String.valueOf( model.getValueAt(i,2)));
							Double d2= Double.parseDouble(String.valueOf( model.getValueAt(i,3)));
							d3=d*d2;
                                        
						}					
					}
					list.add(d3);
					//Calculating TOTAl
					double sum = 0;
					for (double i : list) {
			     	sum += i;
					}
					
					//Displaying Total
					Order_Food_Panel.getTotal().setText(""+sum+ " $");
				}else {
					JOptionPane.showMessageDialog(null, "Please Give Valid Id", "Error",
							JOptionPane.WARNING_MESSAGE);
				}
				}	
				Order_Food_Panel.getAdd_Id().setText("");
				Order_Food_Panel.getAdd_Quantity().setText("");
				
		}
	});
		
		ArrayList<Double> list2 = new ArrayList<Double>();
		// Delete Order Button
		Order_Food_Panel.getBtn_delete_Order().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				 
						
				JTextField add = Order_Food_Panel.getAdd_Id(); 
				int id = 0;
				id = Integer.parseInt(add.getText())-1;
				
				if(id < Order_Food_Panel.gettable2().getRowCount()) {
				//Removing Id	
				((DefaultTableModel) Order_Food_Panel.gettable2().getModel()).removeRow(id);
				
				//For TotaL
	
				list.remove(id);

				//Calculating TOTAl Again
				double sum = 0;
				for (double i : list) {
		     	sum += i;
				}
				
				//Displaying Total
				Order_Food_Panel.getTotal().setText(""+sum+ " $");
							
				}else {
					JOptionPane.showMessageDialog(null, "Please Give Valid Id", "Error",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		
		
		// Place Order Button
		Order_Food_Panel.getBtn_Place_Order().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				boolean exit = false;
				if((Order_Food_Panel.getAddress().getText().isBlank())){
					JOptionPane.showMessageDialog(null, "Please Insert Address", "Error",
							JOptionPane.WARNING_MESSAGE);
					 exit = true;
				}else if(Order_Food_Panel.getPostal_Code().getText().isBlank()){
					JOptionPane.showMessageDialog(null, "Please Insert Postal Code", "Error",
							JOptionPane.WARNING_MESSAGE);
					exit = true;
				}else if(Order_Food_Panel.getTotal().getText().isBlank() ){
					JOptionPane.showMessageDialog(null, "Please Give Order First", "Error",
							JOptionPane.WARNING_MESSAGE);
					exit = true;
				}else if(Order_Food_Panel.gettable2().getRowCount() >= 0 && exit == false){
								
					int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Place This Order", "Information",
							dialogButton);
					if (dialogResult == JOptionPane.YES_OPTION) {
						
						JOptionPane.showMessageDialog(null, "Order Placed");
											
						Database.addOrder(new Order(Order_Food_Panel.getPostal_Code().getText() , 
													Order_Food_Panel.getAddress().getText() , 
													null/*Order_Food_Panel.gettable2().getComponents()*/,
													Order_Food_Panel.getcomboBox().getSelectedIndex()+1 ,
													Main.user.getId()));
						
						MainFrame.changePanel(new Client_main_menu_Panel());
						new Client_main_menu_Core();
					}else {
						
					}			
					
				}
						 
			}
		});
		
	}
	

	
}

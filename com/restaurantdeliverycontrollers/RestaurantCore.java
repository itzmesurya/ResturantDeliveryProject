package com.restaurantdeliverycontrollers;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.Admin;
import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.RestaurantPanel;

public class RestaurantCore {
	
	private Restaurant restaurant;
	
	private class RestaurantSelection {
		int id;
		String name;
		
		public RestaurantSelection(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return name;
		}
		public int getValue() {
			return id;
		}
	}
	
	public RestaurantCore(CRUDAction crudAction) {
		
		JComboBox[][] cb_hours = new JComboBox[7][4];
		
		cb_hours[0][0] = RestaurantPanel.getCombo_C321();
		cb_hours[0][1] = RestaurantPanel.getCombo_C322();
		cb_hours[0][2] = RestaurantPanel.getCombo_C323();
		cb_hours[0][3] = RestaurantPanel.getCombo_C324();
		
		cb_hours[1][0] = RestaurantPanel.getCombo_C331();
		cb_hours[1][1] = RestaurantPanel.getCombo_C332();
		cb_hours[1][2] = RestaurantPanel.getCombo_C333();
		cb_hours[1][3] = RestaurantPanel.getCombo_C334();
		
		cb_hours[2][0] = RestaurantPanel.getCombo_C341();
		cb_hours[2][1] = RestaurantPanel.getCombo_C342();
		cb_hours[2][2] = RestaurantPanel.getCombo_C343();
		cb_hours[2][3] = RestaurantPanel.getCombo_C344();
		
		cb_hours[3][0] = RestaurantPanel.getCombo_C351();
		cb_hours[3][1] = RestaurantPanel.getCombo_C352();
		cb_hours[3][2] = RestaurantPanel.getCombo_C353();
		cb_hours[3][3] = RestaurantPanel.getCombo_C354();
		
		cb_hours[4][0] = RestaurantPanel.getCombo_C361();
		cb_hours[4][1] = RestaurantPanel.getCombo_C362();
		cb_hours[4][2] = RestaurantPanel.getCombo_C363();
		cb_hours[4][3] = RestaurantPanel.getCombo_C364();
		
		cb_hours[5][0] = RestaurantPanel.getCombo_C371();
		cb_hours[5][1] = RestaurantPanel.getCombo_C372();
		cb_hours[5][2] = RestaurantPanel.getCombo_C373();
		cb_hours[5][3] = RestaurantPanel.getCombo_C374();
		
		cb_hours[6][0] = RestaurantPanel.getCombo_C381();
		cb_hours[6][1] = RestaurantPanel.getCombo_C382();
		cb_hours[6][2] = RestaurantPanel.getCombo_C383();
		cb_hours[6][3] = RestaurantPanel.getCombo_C384();
		
		int manager_id;
		if (Main.user.getLevel() == 3) {
			manager_id = Main.user.getId();
		} else {
			manager_id = -1;
		}
		
		ArrayList<Restaurant> restaurants = Database.getRestaurants();

		for (int i = 0; i < restaurants.size(); i++) {
			RestaurantPanel.getRestaurantnameCB().addItem(new RestaurantSelection(restaurants.get(i).getId(), restaurants.get(i).getName()));
		}
		
		
		switch (crudAction) {
		case Create:
			RestaurantPanel.getLbl_1().setText("Add Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Add");
			RestaurantPanel.getLbl_2().setVisible(false);
			RestaurantPanel.getRestaurantnameCB().setVisible(false);
			
			RestaurantPanel.getBtnRestaurant().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String name = RestaurantPanel.getTf_C11().getText();
					String address = RestaurantPanel.getTf_C12().getText();
					String phone = RestaurantPanel.getFormattedTextField_1().getText();
					String[] delivery_areas = new String[RestaurantPanel.getTableDeliveryArea().getModel().getRowCount()];
					for (int i = 0; i < RestaurantPanel.getTableDeliveryArea().getModel().getRowCount(); i++){
						  delivery_areas[i] = RestaurantPanel.getTableDeliveryArea().getModel().getValueAt(i, 0).toString();
						}
					String[][] hours = new String[7][4];
					for (int i = 0; i < 7; i++) {
						for (int j = 0; j < 4; j++) {
							hours[i][j] = (String)cb_hours[i][j].getSelectedItem();
						}
					}
					if (validateRestaurant(name, address, phone, delivery_areas, hours)) {
						Database.addRestaurant(new Restaurant(name, address, phone, delivery_areas, hours, manager_id, -1));
						Database.saveRestaurants();
						//Change to confirm box
						Functions.displayMessage(
								"Restaurant Added!"
								);
					}
				}
			});
			break;
		case Edit:
			RestaurantPanel.getLbl_1().setText("Edit Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Edit");
			
			RestaurantPanel.getBtnRestaurant().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String name = RestaurantPanel.getTf_C11().getText();
					String address = RestaurantPanel.getTf_C12().getText();
					String phone = RestaurantPanel.getFormattedTextField_1().getText();
					String[] delivery_areas = new String[RestaurantPanel.getTableDeliveryArea().getModel().getRowCount()];
					for (int i = 0; i < RestaurantPanel.getTableDeliveryArea().getModel().getRowCount(); i++){
						  delivery_areas[i] = RestaurantPanel.getTableDeliveryArea().getModel().getValueAt(i, 0).toString();
						}
					String[][] hours = new String[7][4];
					for (int i = 0; i < 7; i++) {
						for (int j = 0; j < 4; j++) {
							hours[i][j] = (String)cb_hours[i][j].getSelectedItem();
						}
					}
					if (validateRestaurant(name, address, phone, delivery_areas, hours)) {
						restaurant.setName(name);
						restaurant.setAddress(address);
						restaurant.setPhone(phone);
						restaurant.setDelivery_areas(delivery_areas);
						restaurant.setHours(hours);
						restaurant.edit();
						//Change to confirm box
						Functions.displayMessage(
								"Restaurant Updated!"
								);
					}
				}
			});
			
			break;
		case Delete:
			RestaurantPanel.getLbl_1().setText("Delete Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Delete");
			//Disable editing
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 4; j++) {
					cb_hours[i][j].setEnabled(false);
				}
			}
			
			RestaurantPanel.getBtnRestaurant().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Add confirm box
					Database.deleteRestaurantById(restaurant.getId());
					Database.saveRestaurants();
					Functions.displayMessage("Restaurant deleted!");
				}
			});
			break;
		default:
		    break;
		}
		
		RestaurantPanel.getRestaurantnameCB().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				restaurant = Database.getRestaurantById(((RestaurantSelection)RestaurantPanel.getRestaurantnameCB().getSelectedItem()).getValue());
				
				RestaurantPanel.getTf_C11().setText(restaurant.getName());
				RestaurantPanel.getTf_C12().setText(restaurant.getAddress());
				RestaurantPanel.getFormattedTextField_1().setText(restaurant.getPhone());

				int rows = ((DefaultTableModel)RestaurantPanel.getTableDeliveryArea().getModel()).getRowCount();
				for(int i = rows - 1; i >=0; i--)
				{
					((DefaultTableModel)RestaurantPanel.getTableDeliveryArea().getModel()).removeRow(i);
				}
				
				for (int i = 0; i < restaurant.getDelivery_areas().length; i++) {
					((DefaultTableModel)RestaurantPanel.getTableDeliveryArea().getModel()).addRow(new Object[]{restaurant.getDelivery_areas()[i]});
				}
				for (int i = 0; i < 7; i++) {
					for (int j = 0; j < 4; j++) {
						cb_hours[i][j].setSelectedItem(restaurant.getHours()[i][j]);
					}
				}
			}
		});
		
		RestaurantPanel.getBtnC39().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 7; i++) {
					for (int j = 0; j < 4; j++) {
						cb_hours[i][j].setSelectedItem(cb_hours[0][j].getSelectedItem());
					}
				}
			}			
		});
		
		RestaurantPanel.getBtnC231().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				if (validatePostcode()) {
					((DefaultTableModel)RestaurantPanel.getTableDeliveryArea().getModel()).addRow(new Object[]{RestaurantPanel.getTf_C23().getText()});
					RestaurantPanel.getTf_C23().setText("");
				}				
			}			
		});
		
		RestaurantPanel.getBtnC232().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (RestaurantPanel.getTableDeliveryArea().getSelectedRow() >= 0) {
					DefaultTableModel model = (DefaultTableModel) RestaurantPanel.getTableDeliveryArea().getModel();
					model.removeRow(RestaurantPanel.getTableDeliveryArea().getSelectedRow());
				} else {
					Functions.displayError("You must select a delivery area first!");
				}
			}			
		});
		
	}
	
	public boolean validatePostcode() {
		if (RestaurantPanel.getTf_C23().getText().length() != 3) {
			Functions.displayError("Delivery area must be 3 characters long");
			return false;
		}
		
		if (!String.valueOf(RestaurantPanel.getTf_C23().getText().charAt(0)).matches("[A-Za-z]") || !String.valueOf(RestaurantPanel.getTf_C23().getText().charAt(2)).matches("[A-Za-z]") || !Functions.isNumeric(String.valueOf(RestaurantPanel.getTf_C23().getText().charAt(1)))) {
			Functions.displayError("Delivery area must be a letter followed by a number followed by a letter");
			return false;
		}
		return true;
	}
	
	public boolean validateRestaurant(String name, String address, String phone, String[] delivery_area, String[][] hours) {
		
		if (name.equals("")) {
			Functions.displayError("Please enter a name");
			return false;
		}
		if (address.equals("")) {
			Functions.displayError("Please enter an address");
			return false;
		}
		if (phone.length() < 14) {
			Functions.displayError("Please enter a complete phone number");
			return false;
		}
		if (delivery_area.length < 1) {
			Functions.displayError("Please enter at least one delivery area");
			return false;
		}
		for (int i = 0; i < 7; i++) {
				if (Integer.valueOf(hours[i][2]) < Integer.valueOf(hours[i][0])) {
					Functions.displayError("Please make sure your closing times for " + numberToDay(i) + " are not earlier than your opening times");
					return false;
				} else if (Integer.valueOf(hours[i][2]) == Integer.valueOf(hours[i][0])) {
					if (Integer.valueOf(hours[i][3]) <= Integer.valueOf(hours[i][1])) {
						Functions.displayError("Please make sure your closing times for " + numberToDay(i) + " are not earlier than your opening times");
						return false;
					}
				}
		}
		return true;
	}
	
	public String numberToDay(int num) {
		switch(num) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "";
		}
	}
		
}




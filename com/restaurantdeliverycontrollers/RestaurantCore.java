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
import com.restaurantdeliverymodels.Manager;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.Manager_main_menu_Panel;
import com.restaurantdeliveryviews.RestaurantPanel;

public class RestaurantCore {
	

	private Restaurant restaurant;
	

	private class Selection {
		int id;
		String name;
		
		public Selection(int id, String name) {
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
		
		ArrayList<Restaurant> restaurants = Database.getRestaurants();

		if (Main.user.getLevel() == 3) {
			Restaurant restaurant;
			restaurant = ((Manager)Main.user).getManagerRestaurant();
			if (restaurant != null) {
				RestaurantPanel.getRestaurantnameCB().addItem(new Selection(restaurant.getId(), restaurant.getName()));
			}
		} else {
			for (int i = 0; i < restaurants.size(); i++) {
				RestaurantPanel.getRestaurantnameCB().addItem(new Selection(restaurants.get(i).getId(), restaurants.get(i).getName()));
			}
		}
		
		
		ArrayList<Manager> unassignedManagers = Database.getUnassignedManagers();
		ArrayList<Restaurateur> unassignedRestaurateurs = Database.getUnassignedRestaurateurs();
		
		
		switch (crudAction) {
		case Create:
			RestaurantPanel.getLbl_1().setText("Add Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Add");
			RestaurantPanel.getLbl_2().setVisible(false);
			RestaurantPanel.getRestaurantnameCB().setVisible(false);
			
			if (Main.user.getLevel() == 3) {
				RestaurantPanel.getComboBoxManager().addItem(new Selection(Main.user.getId(), (Main.user.getFirst_name() + " " + Main.user.getLast_name())));
				RestaurantPanel.getComboBoxManager().setEnabled(false);
			} else {
				//Load managers into combobox
				for (int i = 0; i < unassignedManagers.size(); i++) {
					RestaurantPanel.getComboBoxManager().addItem(new Selection(unassignedManagers.get(i).getId(), (unassignedManagers.get(i).getFirst_name() + " " + unassignedManagers.get(i).getLast_name())));

				}
			}
			
			//Load restaurateurs into combobox
			for (int i = 0; i < unassignedRestaurateurs.size(); i++) {
				RestaurantPanel.getComboBoxBoss().addItem(new Selection(unassignedRestaurateurs.get(i).getId(), (unassignedRestaurateurs.get(i).getFirst_name() + " " + unassignedRestaurateurs.get(i).getLast_name())));

			}

			for (int i = 0; i < restaurants.size(); i++) {
				RestaurantPanel.getRestaurantnameCB().addItem(new Selection(restaurants.get(i).getId(), restaurants.get(i).getName()));

			}
			
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
					
					int manager_id = -1;
					if (RestaurantPanel.getComboBoxManager().getItemCount() > 0) {
						manager_id = ((Selection)RestaurantPanel.getComboBoxManager().getSelectedItem()).getValue();
					}
					
					int restaurateur_id = -1;
					if (RestaurantPanel.getComboBoxBoss().getItemCount() > 0) {
						restaurateur_id = ((Selection)RestaurantPanel.getComboBoxBoss().getSelectedItem()).getValue();
					}
					
					if (validateRestaurant(name, address, phone, delivery_areas, hours)) {
						String msg = "";
						msg += "Restaurant name: " + name + "\n";
						msg += "Restaurant address: " + address + "\n";
						msg += "Telephone number: " + phone + "\n";
						msg += "Delivery areas: " + "\n";
						for (String area : delivery_areas) {
							msg += area + "\n";
						}
						msg += "Business Hours:" + "\n";
						for (int i = 0; i < 7; i++) {
							msg += numberToDay(i) + ": " + hours[i][0] + ":" + hours[i][1] + " - " + hours[i][2] + ":" + hours[i][3] + "\n";
						}
						Manager manager = Database.getManagerById(manager_id);
						if (manager != null) {
							msg += "Manager: " + manager.getFirst_name() + " " + manager.getLast_name()+ "\n";
						} else {
							msg += "Manager not yet assigned" + "\n";
						}
						Restaurateur restaurateur = Database.getRestaurateurById(restaurateur_id);
						if (restaurateur != null) {
							msg += "Restaurateur: " + restaurateur.getFirst_name() + " " + restaurateur.getLast_name() + "\n";
						} else {
							msg += "Restaurateur not yet assigned";
						}
						int input = JOptionPane.showConfirmDialog(null, msg,"Are you sure you want to add this restaurant?",JOptionPane.YES_NO_OPTION);
						if (input == JOptionPane.YES_OPTION) {
							Database.addRestaurant(new Restaurant(name, address, phone, delivery_areas, hours, manager_id, restaurateur_id));
							Database.saveRestaurants();
							//Change to confirm box
							Functions.displayMessage("Restaurant Added!");
							switchToMainMenu();
						} 
						
					}
				}
			});
			break;
		case Edit:
			RestaurantPanel.getLbl_1().setText("Edit Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Edit");
			
			if (Main.user.getLevel() == 3) {
				RestaurantPanel.getComboBoxManager().setEnabled(false);
			}
			
			//Load the default restaurant
			restaurant = Database.getRestaurantById(((Selection)RestaurantPanel.getRestaurantnameCB().getSelectedItem()).getValue());
			
			if (restaurant != null) {
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
				Manager manager = Database.getManagerById(restaurant.getManager_id());
				if (manager != null) {
					RestaurantPanel.getComboBoxManager().addItem(new Selection(manager.getId(), (manager.getFirst_name() + " " + manager.getLast_name())));
				} else {
					RestaurantPanel.getComboBoxManager().addItem(new Selection(-1, "Unassigned"));
				}
				//Load managers into combobox
				for (int i = 0; i < unassignedManagers.size(); i++) {
					RestaurantPanel.getComboBoxManager().addItem(new Selection(unassignedManagers.get(i).getId(), (unassignedManagers.get(i).getFirst_name() + " " + unassignedManagers.get(i).getLast_name())));
				}
				Restaurateur restaurateur = Database.getRestaurateurById(restaurant.getRestaurateur_id());
				if (restaurateur != null) {
					RestaurantPanel.getComboBoxBoss().addItem(new Selection(restaurateur.getId(), (restaurateur.getFirst_name() + " " + restaurateur.getLast_name())));
				} else {
					RestaurantPanel.getComboBoxBoss().addItem(new Selection(-1, "Unassigned"));
				}
				//Load restaurateurs into combobox
				for (int i = 0; i < unassignedRestaurateurs.size(); i++) {
					RestaurantPanel.getComboBoxBoss().addItem(new Selection(unassignedRestaurateurs.get(i).getId(), (unassignedRestaurateurs.get(i).getFirst_name() + " " + unassignedRestaurateurs.get(i).getLast_name())));
				}
				
			} else {
				Functions.displayError("You have no restaurant to edit!");
			}

			
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
						
						int manager_id = -1;
						if (RestaurantPanel.getComboBoxManager().getItemCount() > 0) {
							manager_id = ((Selection)RestaurantPanel.getComboBoxManager().getSelectedItem()).getValue();
						}
						
						int restaurateur_id = -1;
						if (RestaurantPanel.getComboBoxBoss().getItemCount() > 0) {
							restaurateur_id = ((Selection)RestaurantPanel.getComboBoxBoss().getSelectedItem()).getValue();
						}
						
						String msg = "";
						msg += "Restaurant name: " + name + "\n";
						msg += "Restaurant address: " + address + "\n";
						msg += "Telephone number: " + phone + "\n";
						msg += "Delivery areas: " + "\n";
						for (String area : delivery_areas) {
							msg += area + "\n";
						}
						msg += "Business Hours:" + "\n";
						for (int i = 0; i < 7; i++) {
							msg += numberToDay(i) + ": " + hours[i][0] + ":" + hours[i][1] + " - " + hours[i][2] + ":" + hours[i][3] + "\n";
						}
						
						Manager manager = Database.getManagerById(manager_id);
						if (manager != null) {
							msg += "Manager: " + manager.getFirst_name() + " " + manager.getLast_name()+ "\n";
						} else {
							msg += "Manager not yet assigned" + "\n";
						}
						Restaurateur restaurateur = Database.getRestaurateurById(restaurateur_id);
						if (restaurateur != null) {
							msg += "Restaurateur: " + restaurateur.getFirst_name() + " " + restaurateur.getLast_name() + "\n";
						} else {
							msg += "Restaurateur not yet assigned";
						}
						int input = JOptionPane.showConfirmDialog(null, msg,"Are you sure you want to edit this restaurant?",JOptionPane.YES_NO_OPTION);
						if (input == JOptionPane.YES_OPTION) {
							restaurant.setName(name);
							restaurant.setAddress(address);
							restaurant.setPhone(phone);
							restaurant.setDelivery_areas(delivery_areas);
							restaurant.setHours(hours);
							restaurant.setManager_id(manager_id);
							restaurant.setRestaurateur_id(restaurateur_id);
							restaurant.edit();
							Database.saveRestaurants();
							//Change to confirm box
							Functions.displayMessage("Restaurant Updated!");
							switchToMainMenu();
						} 
						
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
			RestaurantPanel.getBtnC231().setEnabled(false);
			RestaurantPanel.getBtnC232().setEnabled(false);
			RestaurantPanel.getBtnC39().setEnabled(false);
			RestaurantPanel.getTf_C11().setEnabled(false);
			RestaurantPanel.getTf_C12().setEnabled(false);
			RestaurantPanel.getTf_C23().setEnabled(false);
			RestaurantPanel.getFormattedTextField_1().setEnabled(false);
			RestaurantPanel.getComboBoxManager().setEnabled(false);
			RestaurantPanel.getComboBoxBoss().setEnabled(false);
			
			
			//Load the default restaurant
			restaurant = Database.getRestaurantById(((Selection)RestaurantPanel.getRestaurantnameCB().getSelectedItem()).getValue());
			
			if (restaurant != null) {
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
				Manager manager = Database.getManagerById(restaurant.getManager_id());
				if (manager != null) {
					RestaurantPanel.getComboBoxManager().addItem(new Selection(manager.getId(), (manager.getFirst_name() + " " + manager.getLast_name())));
				} else {
					RestaurantPanel.getComboBoxManager().addItem(new Selection(-1, "Unassigned"));
				}
				//Load managers into combobox
				for (int i = 0; i < unassignedManagers.size(); i++) {
					RestaurantPanel.getComboBoxManager().addItem(new Selection(unassignedManagers.get(i).getId(), (unassignedManagers.get(i).getFirst_name() + " " + unassignedManagers.get(i).getLast_name())));
				}
				Restaurateur restaurateur = Database.getRestaurateurById(restaurant.getRestaurateur_id());
				if (restaurateur != null) {
					RestaurantPanel.getComboBoxBoss().addItem(new Selection(restaurateur.getId(), (restaurateur.getFirst_name() + " " + restaurateur.getLast_name())));
				} else {
					RestaurantPanel.getComboBoxBoss().addItem(new Selection(-1, "Unassigned"));
				}
				//Load restaurateurs into combobox
				for (int i = 0; i < unassignedRestaurateurs.size(); i++) {
					RestaurantPanel.getComboBoxBoss().addItem(new Selection(unassignedRestaurateurs.get(i).getId(), (unassignedRestaurateurs.get(i).getFirst_name() + " " + unassignedRestaurateurs.get(i).getLast_name())));
				}
			} else {
				Functions.displayError("You have no restaurants to delete!");
			}
			
			RestaurantPanel.getBtnRestaurant().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this restaurant?", "Confirm", JOptionPane.YES_NO_OPTION);
					if (input == JOptionPane.YES_OPTION) {
						//Add confirm box
						Database.deleteRestaurantById(restaurant.getId());
						Database.saveRestaurants();
						Functions.displayMessage("Restaurant deleted!");
						switchToMainMenu();
					}					
				}
			});

			break;
		default:
		    break;
		}
		
		RestaurantPanel.getRestaurantnameCB().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				restaurant = Database.getRestaurantById(((Selection)RestaurantPanel.getRestaurantnameCB().getSelectedItem()).getValue());
				
				if (restaurant != null) {
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
					//Remove previous items from combobox
					RestaurantPanel.getComboBoxManager().removeAllItems();
					RestaurantPanel.getComboBoxBoss().removeAllItems();
					
					Manager manager = Database.getManagerById(restaurant.getManager_id());
					if (manager != null) {
						RestaurantPanel.getComboBoxManager().addItem(new Selection(manager.getId(), (manager.getFirst_name() + " " + manager.getLast_name())));
					} else {
						RestaurantPanel.getComboBoxManager().addItem(new Selection(-1, "Unassigned"));
					}
					//Load managers into combobox
					for (int i = 0; i < unassignedManagers.size(); i++) {
						RestaurantPanel.getComboBoxManager().addItem(new Selection(unassignedManagers.get(i).getId(), (unassignedManagers.get(i).getFirst_name() + " " + unassignedManagers.get(i).getLast_name())));
					}
					Restaurateur restaurateur = Database.getRestaurateurById(restaurant.getRestaurateur_id());
					if (restaurateur != null) {
						RestaurantPanel.getComboBoxBoss().addItem(new Selection(restaurateur.getId(), (restaurateur.getFirst_name() + " " + restaurateur.getLast_name())));
					} else {
						RestaurantPanel.getComboBoxBoss().addItem(new Selection(-1, "Unassigned"));
					}
					//Load restaurateurs into combobox
					for (int i = 0; i < unassignedRestaurateurs.size(); i++) {
						RestaurantPanel.getComboBoxBoss().addItem(new Selection(unassignedRestaurateurs.get(i).getId(), (unassignedRestaurateurs.get(i).getFirst_name() + " " + unassignedRestaurateurs.get(i).getLast_name())));
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
					((DefaultTableModel)RestaurantPanel.getTableDeliveryArea().getModel()).addRow(new Object[]{RestaurantPanel.getTf_C23().getText().toUpperCase()});
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
	
	private void switchToMainMenu() {
		if (Main.user.getLevel() == 100) {
			MainFrame.changePanel(new Admin_main_menu_Panel());
			new Admin_main_menu_Core();
		} else {
			MainFrame.changePanel(new Manager_main_menu_Panel());
			new Manager_main_menu_Core();
		}
	}
		
}




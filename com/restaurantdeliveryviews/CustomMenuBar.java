package com.restaurantdeliveryviews;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.restaurantdeliverymodels.User;

public class CustomMenuBar extends JMenuBar {
	
	private static JMenu file;
	private static JMenuItem create_account;
	private static JMenuItem edit_account;
	private static JMenuItem delete_account;
	private static JMenuItem log_out;
	private static JMenuItem exit;
	private static JMenu menu;
	private static JMenuItem create_menu;
	private static JMenuItem edit_menu;
	private static JMenuItem delete_menu;
	private static JMenu order;
	private static JMenuItem view_order;
	private static JMenuItem accept_order;
	private static JMenuItem end_order;
	private static JMenuItem order_food;
	private static JMenuItem order_history;
	private static JMenu restaurant;
	private static JMenuItem create_resto;
	private static JMenuItem edit_resto;
	private static JMenuItem delete_resto;
	private static JMenu delivery;
	private static JMenuItem view_deliveries;
	private static JMenuItem accept_deliveries;
	private static JMenuItem end_deliveries;
	private static JMenuItem create_deliveryman;
	private static JMenuItem edit_deliveryman;
	private static JMenuItem delete_deliveryman;
	
	public CustomMenuBar() {
		
		//File Menu BAR
		file = new JMenu("File");
		this.add(file);
		create_account = new JMenuItem("Create Account");
		file.add(create_account);
		edit_account = new JMenuItem("Edit Account");
		file.add(edit_account);
		delete_account = new JMenuItem("Close Account");
		file.add(delete_account);
		log_out = new JMenuItem("Log Out");
		file.add(log_out);
		exit = new JMenuItem("Exit");
		file.add(exit);
		
		//Menu menu Bar
		menu = new JMenu("Menu");
		this.add(menu);
		create_menu = new JMenuItem("Create Menu");
		menu.add(create_menu);
		edit_menu = new JMenuItem("Edit Menu");
		menu.add(edit_menu);
		delete_menu = new JMenuItem("Delete Menu");
		menu.add(delete_menu);
		
		//Order Menu Bar
		order = new JMenu("Orders");
		this.add(order);
		view_order = new JMenuItem("View Orders");
		order.add(view_order);
		accept_order = new JMenuItem("Accept Orders");
		order.add(accept_order);
		end_order = new JMenuItem("Mark Orders as Ready");
		order.add(end_order);
		order_food = new JMenuItem("Order Food");
		order.add(order_food);
		order_history = new JMenuItem("Order History");
		order.add(order_history);
		
		//Restaurant Menu bar
		restaurant = new JMenu("Restaurant");
		this.add(restaurant);
		create_resto = new JMenuItem("Create Restaurant");
		restaurant.add(create_resto);
		edit_resto = new JMenuItem("Edit Restaurant");
		restaurant.add(edit_resto);
		delete_resto = new JMenuItem("Delete Restaurant");
		restaurant.add(delete_resto);
		
		//Delivery Menu bar
		delivery = new JMenu("Delivery");
		this.add(delivery);
		view_deliveries = new JMenuItem("View Deliveries");
		delivery.add(view_deliveries);
		accept_deliveries = new JMenuItem("Accept Deliveries");
		delivery.add(accept_deliveries);
		end_deliveries = new JMenuItem("End Deliveries");
		delivery.add(end_deliveries);
		create_deliveryman = new JMenuItem("Create Delivery Man");
		delivery.add(create_deliveryman);
		edit_deliveryman = new JMenuItem("Edit Delivery Man");
		delivery.add(edit_deliveryman);
		delete_deliveryman = new JMenuItem("Delete Delivery Man");
		delivery.add(delete_deliveryman);
		
	}

	public static JMenu getFile() {
		return file;
	}

	public static JMenuItem getCreate_account() {
		return create_account;
	}

	public static JMenuItem getEdit_account() {
		return edit_account;
	}

	public static JMenuItem getDelete_account() {
		return delete_account;
	}

	public static JMenuItem getLog_out() {
		return log_out;
	}

	public static JMenuItem getExit() {
		return exit;
	}

	public static JMenu getMenu() {
		return menu;
	}

	public static JMenuItem getCreate_menu() {
		return create_menu;
	}

	public static JMenuItem getEdit_menu() {
		return edit_menu;
	}

	public static JMenuItem getDelete_menu() {
		return delete_menu;
	}

	public static JMenu getOrder() {
		return order;
	}

	public static JMenuItem getView_order() {
		return view_order;
	}

	public static JMenuItem getAccept_order() {
		return accept_order;
	}

	public static JMenuItem getEnd_order() {
		return end_order;
	}

	public static JMenuItem getOrder_food() {
		return order_food;
	}

	public static JMenuItem getOrder_history() {
		return order_history;
	}

	public static JMenu getRestaurant() {
		return restaurant;
	}

	public static JMenuItem getCreate_resto() {
		return create_resto;
	}

	public static JMenuItem getEdit_resto() {
		return edit_resto;
	}

	public static JMenuItem getDelete_resto() {
		return delete_resto;
	}

	public static JMenu getDelivery() {
		return delivery;
	}

	public static JMenuItem getView_deliveries() {
		return view_deliveries;
	}

	public static JMenuItem getAccept_deliveries() {
		return accept_deliveries;
	}

	public static JMenuItem getEnd_deliveries() {
		return end_deliveries;
	}

	public static JMenuItem getCreate_deliveryman() {
		return create_deliveryman;
	}

	public static JMenuItem getEdit_deliveryman() {
		return edit_deliveryman;
	}

	public static JMenuItem getDelete_deliveryman() {
		return delete_deliveryman;
	}
	
}

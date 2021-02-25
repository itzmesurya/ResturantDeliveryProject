package com.restaurantdeliveryviews;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CustomMenuBar extends JMenuBar {
	
	private static JMenu file;
	private static JMenuItem manage_account;
	private static JMenuItem log_out;
	private static JMenuItem exit;
	private static JMenu menu;
	private static JMenuItem manage_menu;
	private static JMenu order;
	private static JMenuItem view_order;
	private static JMenu restaurant;
	private static JMenuItem create_resto;
	private static JMenuItem manage_resto;
	private static JMenu delivery;
	private static JMenuItem create_deliveryman;
	private static JMenuItem manage_deliveryman;
	
	public CustomMenuBar() {
		
		//File Menu BAR
		file = new JMenu("File");
		this.add(file);
		
		manage_account = new JMenuItem("Manage Account");
		file.add(manage_account);
		
		log_out = new JMenuItem("Log Out");
		file.add(log_out);
		
		exit = new JMenuItem("Exit");
		file.add(exit);
		
		//Menu menu Bar
		menu = new JMenu("Menu");
		this.add(menu);
		
		manage_menu = new JMenuItem("Manage Menu");
		menu.add(manage_menu);
		
		//Order Menu Bar
		order = new JMenu("Orders");
		this.add(order);
		
		view_order = new JMenuItem("View Orders");
		order.add(view_order);
		
		//Restaurant Menu bar
		restaurant = new JMenu("Restaurant");
		this.add(restaurant);
		
		create_resto = new JMenuItem("Create Restaurant");
		restaurant.add(create_resto);
		
		manage_resto = new JMenuItem("Manage Restaurant");
		restaurant.add(manage_resto);
		
		//Delivery Menu bar
		delivery = new JMenu("Delivery");
		this.add(delivery);
				
		create_deliveryman = new JMenuItem("Create Delivery Man");
		delivery.add(create_deliveryman);
				
		manage_deliveryman = new JMenuItem("Manage Delivery Man");
		delivery.add(manage_deliveryman);
		
	}

	public static JMenu getFile() {
		return file;
	}

	public static JMenuItem getManage_account() {
		return manage_account;
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

	public static JMenuItem getManage_menu() {
		return manage_menu;
	}

	public static JMenu getOrder() {
		return order;
	}

	public static JMenuItem getView_order() {
		return view_order;
	}

	public static JMenu getRestaurant() {
		return restaurant;
	}

	public static JMenuItem getCreate_resto() {
		return create_resto;
	}

	public static JMenuItem getManage_resto() {
		return manage_resto;
	}

	public static JMenu getDelivery() {
		return delivery;
	}

	public static JMenuItem getCreate_deliveryman() {
		return create_deliveryman;
	}

	public static JMenuItem getManage_deliveryman() {
		return manage_deliveryman;
	}
	
}

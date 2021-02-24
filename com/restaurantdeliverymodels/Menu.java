package com.restaurantdeliverymodels;

import java.util.ArrayList;

/**
 * @author Alex
 * Menu belongs to a restaurant and contains items
 */
public class Menu {
	
	private int id;
	private int restaurant_id;
	
	/**
	 * @param restaurant_id
	 */
	public Menu(int restaurant_id) {
		this.id = Database.getIdCounter().getIdCounterMenu();
		this.restaurant_id = restaurant_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	
	
	public ArrayList<Item> getMenuItems() {
		ArrayList<Item> menuItems = new ArrayList<Item>();
		for (Item item : Database.getItems()) {
			if (item.getMenu_id() == this.id) {
				menuItems.add(item);
			}
		}
		return menuItems;
	}

}

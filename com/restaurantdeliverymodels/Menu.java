package com.restaurantdeliverymodels;

import java.util.ArrayList;

/**
 * @author Alex Menu belongs to a restaurant and contains items
 */
public class Menu {

	private int id;
	private int restaurant_id;
	private ArrayList<Item> items;

	/**
	 * @param restaurant_id
	 */
	public Menu(int restaurant_id) {
		this.id = Database.getIdCounter().getIdCounterMenu();
		this.restaurant_id = restaurant_id;
		this.items = this.getMenuItemsFromDataBase();
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

	public ArrayList<Item> getMenuItemsFromDataBase() {
		ArrayList<Item> menuItems = new ArrayList<Item>();
		for (Item item : Database.getItems()) {
			if (item.getMenu_id() == this.id) {
				menuItems.add(item);
			}
		}
		return menuItems;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public void save() {
		// remove all the items for the resaraunt/menu_id
		// and add all the new Items.

		Database.deleteItemsByMenuId(this.restaurant_id);
		for (Item item : this.getItems()) {
			Database.addItem(item);
		}
		Database.saveItems();

	}

	public void delete() {
		// remove all the items for the restaurant/menu_id
		Database.deleteItemsByMenuId(this.restaurant_id);
		Database.saveItems();

	}

}

package com.restaurantdeliverymodels;

/**
 * @author Alex
 * Menu belongs to a restaurant and contains items
 */
public class Menu {
	
	private static int idCount = 1;
	private int id;
	private int restaurant_id;
	
	/**
	 * @param restaurant_id
	 */
	public Menu(int restaurant_id) {
		this.id = idCount++;
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
	
//	TODO
//	public Item[] getMenuItems() {
//		
//	}

}

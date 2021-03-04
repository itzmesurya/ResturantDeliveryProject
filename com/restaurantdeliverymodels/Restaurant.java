package com.restaurantdeliverymodels;

import java.util.ArrayList;

/**
 * @author Alex
 * Restaurant is assigned a manager and restaurateur, and has a menu and orders
 */
public class Restaurant {
	private int id;
	private String name;
	private String address;
	private String phone;
	private String[] delivery_areas;
	private String[][] hours;
	private int manager_id;
	private int restaurateur_id;
	
	/**
	 * @param name
	 * @param address
	 * @param phone
	 * @param delivery_areas
	 * @param hours
	 * @param manager_id
	 * @param restaurateur_id
	 */
	public Restaurant(String name, String address, String phone, String[] delivery_areas, String[][] hours, int manager_id, int restaurateur_id) {
		this.id = Database.getIdCounter().getIdCounterRestaurant();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.delivery_areas = delivery_areas;
		this.hours = hours;
		this.manager_id = manager_id;
		this.restaurateur_id = restaurateur_id;
	}
	
	public void edit() {
		ArrayList<Restaurant> restaurants = Database.getRestaurants();
		int index = -1;
		for (int i = 0; i < restaurants.size(); i++) {
			if (restaurants.get(i).getId() == this.getId()) {
				index = i;
			}
		}
		if (index != -1) {
			Restaurant restaurant = Database.getRestaurants().get(index);
			restaurant.setName(this.getName());
			restaurant.setAddress(this.getAddress());
			restaurant.setPhone(this.getPhone());
			restaurant.setDelivery_areas(this.getDelivery_areas());
			restaurant.setHours(this.getHours());
			restaurant.setManager_id(this.getManager_id());
			restaurant.setRestaurateur_id(this.getRestaurateur_id());
			Database.saveRestaurants();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String[] getDelivery_areas() {
		return delivery_areas;
	}

	public void setDelivery_areas(String[] delivery_areas) {
		this.delivery_areas = delivery_areas;
	}

	public String[][] getHours() {
		return hours;
	}

	public void setHours(String[][] hours) {
		this.hours = hours;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getRestaurateur_id() {
		return restaurateur_id;
	}

	public void setRestaurateur_id(int restaurateur_id) {
		this.restaurateur_id = restaurateur_id;
	}
	
	public ArrayList<Order> getOrders(){
		ArrayList<Order> orders = new ArrayList<Order>();
		for (Order order : Database.getOrders()) {
			if (order.getRestaurant_id() == this.id) {
				orders.add(order);
			}
		}
		return orders;
	}
	
}

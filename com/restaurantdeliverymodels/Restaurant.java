package com.restaurantdeliverymodels;

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
	
}

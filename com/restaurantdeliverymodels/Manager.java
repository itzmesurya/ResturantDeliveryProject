package com.restaurantdeliverymodels;

import java.util.ArrayList;

/**
 * @author Alex Manager can create, edit and delete restaurants. Can only edit
 *         and delete restaurants they created.
 */
public class Manager extends User {

	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param email
	 * @param phone
	 */
	public Manager(String username, String password, String first_name, String last_name, String address, String email,
			String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 3;
	}

	/**
	 * @param username
	 * @param password
	 */
	public Manager(String username, String password) {
		super(username, password);
		this.level = 3;
	}

	public void delete() {
		Database.deleteManagerById(this.getId());
		Database.saveManagers();
	}

	public void create() {
		Database.addManager(this);
		Database.saveManagers();
	}

	public void edit() {
		ArrayList<Manager> managers = Database.getManagers();
		int index = -1;
		for (int i = 0; i < managers.size(); i++) {
			if (managers.get(i).getId() == this.getId()) {
				index = i;
			}
		}
		if (index != -1) {
			Manager manager = Database.getManagers().get(index);
			manager.setFirst_name(this.getFirst_name());
			manager.setLast_name(this.getLast_name());
			manager.setPassword(this.getPassword());
			manager.setEmail(this.getEmail());
			manager.setPhone(this.getPhone());
			manager.setAddress(this.getAddress());
			Database.saveManagers();
		}
	}
	
	public ArrayList<Restaurant> getRestaurants() {
	    ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
	    for (Restaurant restaurant : Database.getRestaurants()) {
	      if (restaurant.getManager_id() == this.id) {
	    	  restaurants.add(restaurant);
	      }
	    }
	    return restaurants;
	  }
	
	public Restaurant getManagerRestaurant() {
		for (Restaurant restaurant : Database.getRestaurants()) {
			if (restaurant.getManager_id() == this.id) {
				return restaurant;
			}
		}
		return null;
	}
	
}

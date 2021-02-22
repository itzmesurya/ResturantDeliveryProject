package com.restaurantdeliverymodels;

/**
 * @author Alex
 * Admins can create, edit, or delete restaurants, deliverymen, or menus
 */
public class Admin extends User {

	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param email
	 * @param phone
	 */
	public Admin(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 100;
	}
	
	/**
	 * @param username
	 * @param password
	 */
	public Admin(String username, String password) {
		super(username, password);
		this.level = 100;
	}
	
}

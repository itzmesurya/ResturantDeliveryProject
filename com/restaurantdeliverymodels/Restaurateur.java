package com.restaurantdeliverymodels;

/**
 * @author Alex
 * Restaurateur can accept orders and mark them as ready. Belongs to a restaurant
 */
public class Restaurateur extends User {
	
	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param email
	 * @param phone
	 */
	public Restaurateur(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 2;
	}
	
	/**
	 * @param username
	 * @param password
	 */
	public Restaurateur(String username, String password) {
		super(username, password);
		this.level = 2;
	}
	
}
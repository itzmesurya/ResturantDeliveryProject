package com.restaurantdeliverymodels;

/**
 * @author Alex
 * Client can create, edit or delete their account, order food and view their order history
 */
public class Client extends User {
	
	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param email
	 * @param phone
	 */
	public Client(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 0;
	}
	
}
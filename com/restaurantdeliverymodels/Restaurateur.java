package com.restaurantdeliverymodels;

import java.util.ArrayList;

/**
 * @author Alex Restaurateur can accept orders and mark them as ready. Belongs
 *         to a restaurant
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
	public Restaurateur(String username, String password, String first_name, String last_name, String address,
			String email, String phone) {
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

	public void delete() {
		Database.deleteRestaurantById(this.getId());
		Database.saveRestaurateurs();
	}

	public void edit() {
		ArrayList<Restaurateur> restaurateurs = Database.getRestaurateurs();
		int index = -1;
		for (int i = 0; i < restaurateurs.size(); i++) {
			if (restaurateurs.get(i).getId() == this.getId()) {
				index = i;
			}
		}
		Restaurateur restaurateur = Database.getRestaurateurs().get(index);
		restaurateur.setFirst_name(this.getFirst_name());
		restaurateur.setLast_name(this.getLast_name());
		restaurateur.setPassword(this.getPassword());
		restaurateur.setEmail(this.getEmail());
		restaurateur.setPhone(this.getPhone());
		restaurateur.setAddress(this.getAddress());
		Database.saveRestaurateurs();
	}

}
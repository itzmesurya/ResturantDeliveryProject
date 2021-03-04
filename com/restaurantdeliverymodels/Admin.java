package com.restaurantdeliverymodels;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.restaurantdeliveryviews.AccountPanel;

/**
 * @author Alex Admins can create, edit, or delete restaurants, deliverymen, or
 *         menus
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

	public Admin(String username, String password, String first_name, String last_name, String address, String email,
			String phone) {
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

	public void delete() {
		Database.deleteAdminById(this.getId());
		Database.saveAdmins();
	}

	public void create() {
		Database.addAdmin(this);
		Database.saveAdmins();
	}

	public void edit() {
		ArrayList<Admin> admins = Database.getAdmins();
		int index = -1;
		for (int i = 0; i < admins.size(); i++) {
			if (admins.get(i).getId() == this.getId()) {
				index = i;
			}
		}
		if (index != -1) {
			Admin admin = Database.getAdmins().get(index);
			admin.setFirst_name(this.getFirst_name());
			admin.setLast_name(this.getLast_name());
			admin.setPassword(this.getPassword());
			admin.setEmail(this.getEmail());
			admin.setPhone(this.getPhone());
			admin.setAddress(this.getAddress());
			Database.saveAdmins();
		}
	}
}

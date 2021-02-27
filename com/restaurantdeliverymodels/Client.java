package com.restaurantdeliverymodels;

import java.util.ArrayList;

/**
 * @author Alex Client can create, edit or delete their account, order food and
 *         view their order history
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
	public Client(String username, String password, String first_name, String last_name, String address, String email,
			String phone) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 0;
	}

	public void delete() {
		Database.deleteClientById(this.getId());
		Database.saveClients();
	}

	public void edit() {
		ArrayList<Client> clients = Database.getClients();
		int index = -1;
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getId() == this.getId()) {
				index = i;
			}
		}
		if (index != -1) {
			Client client = Database.getClients().get(index);
			client.setFirst_name(this.getFirst_name());
			client.setLast_name(this.getLast_name());
			client.setPassword(this.getPassword());
			client.setEmail(this.getEmail());
			client.setPhone(this.getPhone());
			client.setAddress(this.getAddress());
			Database.saveClients();
		}
	}

	public void create() {
		Database.addClient(this);
		Database.saveClients();
	}

	public ArrayList<Order> getOrders() {
		ArrayList<Order> orders = new ArrayList<Order>();
		for (Order order : Database.getOrders()) {
			if (order.getClient_id() == this.id) {
				orders.add(order);
			}
		}
		return orders;
	}

	public ArrayList<Order> getOrdersCompleted() {
		ArrayList<Order> ordersCompleted = new ArrayList<Order>();
		for (Order order : this.getOrders()) {
			if (order.getStatus() == 4) {
				ordersCompleted.add(order);
			}
		}
		return ordersCompleted;
	}

}
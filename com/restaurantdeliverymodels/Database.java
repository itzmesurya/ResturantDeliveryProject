package com.restaurantdeliverymodels;
import java.util.ArrayList;

/**
 * @author Alex
 * Stores data for every model used in the program
 */
public class Database {

	private static ArrayList<Item> items;
	private static ArrayList<Order> orders;
	private static ArrayList<Menu> menus;
	private static ArrayList<Restaurant> restaurants;
	private static ArrayList<Client> clients;
	private static ArrayList<Deliveryman> deliverymen;
	private static ArrayList<Restaurateur> restaurateurs;
	private static ArrayList<Manager> managers;
	private static ArrayList<Admin> admins;
	
	public Database() {
		//TODO: Load save data from files
	}
	
	public static ArrayList<Item> getItems() {
		return items;
	}
	public Item getItemById(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}
	public static void addItem(Item item) {
		items.add(item);
	}
	public static ArrayList<Order> getOrders() {
		return orders;
	}
	public Order getOrderById(int id) {
		for (Order order : orders) {
			if (order.getId() == id) {
				return order;
			}
		}
		return null;
	}
	public static void addOrder(Order order) {
		orders.add(order);
	}
	public static ArrayList<Menu> getMenus() {
		return menus;
	}
	public Menu getMenuById(int id) {
		for (Menu menu : menus) {
			if (menu.getId() == id) {
				return menu;
			}
		}
		return null;
	}
	public static void addMenu(Menu menu) {
		menus.add(menu);
	}
	public static ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}
	public Restaurant getRestaurantById(int id) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getId() == id) {
				return restaurant;
			}
		}
		return null;
	}
	public static void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}
	public static ArrayList<Client> getClients() {
		return clients;
	}
	public Client getClientById(int id) {
		for (Client client : clients) {
			if (client.getId() == id) {
				return client;
			}
		}
		return null;
	}
	public static void addClient(Client client) {
		clients.add(client);
	}
	public static ArrayList<Deliveryman> getDeliverymen() {
		return deliverymen;
	}
	public Deliveryman getDeliverymanById(int id) {
		for (Deliveryman deliveryman : deliverymen) {
			if (deliveryman.getId() == id) {
				return deliveryman;
			}
		}
		return null;
	}
	public static void addDeliveryman(Deliveryman deliveryman) {
		deliverymen.add(deliveryman);
	}
	public static ArrayList<Restaurateur> getRestaurateurs() {
		return restaurateurs;
	}
	public Restaurateur getRestaurateurById(int id) {
		for (Restaurateur restaurateur : restaurateurs) {
			if (restaurateur.getId() == id) {
				return restaurateur;
			}
		}
		return null;
	}
	public static void addRestaurateur(Restaurateur restaurateur) {
		restaurateurs.add(restaurateur);
	}
	public static ArrayList<Manager> getManagers() {
		return managers;
	}
	public Manager getManagerById(int id) {
		for (Manager manager : managers) {
			if (manager.getId() == id) {
				return manager;
			}
		}
		return null;
	}
	public static void addManager(Manager manager) {
		managers.add(manager);
	}
	public static ArrayList<Admin> getAdmins() {
		return admins;
	}
	public Admin getAdminById(int id) {
		for (Admin admin : admins) {
			if (admin.getId() == id) {
				return admin;
			}
		}
		return null;
	}
	public static void addAdmin(Admin admin) {
		admins.add(admin);
	}
	
}

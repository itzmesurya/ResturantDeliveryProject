package com.restaurantdeliverymodels;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.*;

/**
 * @author Alex Stores data for every model used in the program
 */
public class Database {

	public static ArrayList<IdCounter> idCounter;
	private static ArrayList<Item> items;
	private static ArrayList<Order> orders;
	private static ArrayList<Menu> menus;
	private static ArrayList<Restaurant> restaurants;
	private static ArrayList<Client> clients;
	private static ArrayList<Deliveryman> deliverymen;
	private static ArrayList<Restaurateur> restaurateurs;
	private static ArrayList<Manager> managers;
	private static ArrayList<Admin> admins;

	/**
	 * Loads file contents into arraylists
	 */
	public Database() {
		loadIdCounter();
		loadItems();
		loadOrders();
		loadMenus();
		loadRestaurants();
		loadClients();
		loadDeliverymen();
		loadRestaurateurs();
		loadManagers();
		loadAdmins();
	}

	public static ArrayList<Item> getItems() {
		return items;
	}

	public static Item getItemById(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}

	private static void loadItems() {
		loadData("items");
	}

	public static void saveItems() {
		saveData("items");
	}

	public static void addItem(Item item) {
		items.add(item);
	}

	public static ArrayList<Order> getOrders() {
		return orders;
	}

	public static Order getOrderById(int id) {
		for (Order order : orders) {
			if (order.getId() == id) {
				return order;
			}
		}
		return null;
	}

	private static void loadOrders() {
		loadData("orders");
	}

	public static void saveOrders() {
		saveData("orders");
	}

	public static void addOrder(Order order) {
		orders.add(order);
	}

	public static ArrayList<Menu> getMenus() {
		return menus;
	}

	public static Menu getMenuById(int id) {
		for (Menu menu : menus) {
			if (menu.getId() == id) {
				return menu;
			}
		}
		return null;
	}

	private static void loadMenus() {
		loadData("menus");
	}

	public static void saveMenus() {
		saveData("menus");
	}

	public static void addMenu(Menu menu) {
		menus.add(menu);
	}

	public static ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}

	public static Restaurant getRestaurantById(int id) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getId() == id) {
				return restaurant;
			}
		}
		return null;
	}

	private static void loadRestaurants() {
		loadData("restaurants");
	}

	public static void saveRestaurants() {
		saveData("restaurants");
	}

	public static void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}

	public static ArrayList<Client> getClients() {
		return clients;
	}

	public static Client getClientById(int id) {
		for (Client client : clients) {
			if (client.getId() == id) {
				return client;
			}
		}
		return null;
	}

	public static Client getClientByUserName(String userName) {
		for (Client client : clients) {
			if (client.getUsername().equalsIgnoreCase(userName)) {
				return client;
			}
		}
		return null;
	}

	private static void loadClients() {
		loadData("clients");
	}

	public static void saveClients() {
		saveData("clients");
	}

	public static void addClient(Client client) {
		clients.add(client);
	}

	public static ArrayList<Deliveryman> getDeliverymen() {
		return deliverymen;
	}

	public static Deliveryman getDeliverymanById(int id) {
		for (Deliveryman deliveryman : deliverymen) {
			if (deliveryman.getId() == id) {
				return deliveryman;
			}
		}
		return null;
	}

	public static Deliveryman getDeliverymanByUserName(String userName) {
		for (Deliveryman deliveryman : deliverymen) {
			if (deliveryman.getUsername().equalsIgnoreCase(userName)) {
				return deliveryman;
			}
		}
		return null;
	}

	private static void loadDeliverymen() {
		loadData("deliverymen");
	}

	public static void saveDeliverymen() {
		saveData("deliverymen");
	}

	public static void addDeliveryman(Deliveryman deliveryman) {
		deliverymen.add(deliveryman);
	}

	public static ArrayList<Restaurateur> getRestaurateurs() {
		return restaurateurs;
	}

	public static Restaurateur getRestaurateurById(int id) {
		for (Restaurateur restaurateur : restaurateurs) {
			if (restaurateur.getId() == id) {
				return restaurateur;
			}
		}
		return null;
	}

	public static Restaurateur getRestaurateurByUserName(String username) {
		for (Restaurateur restaurateur : restaurateurs) {
			if (restaurateur.getUsername().equalsIgnoreCase(username)) {
				return restaurateur;
			}
		}
		return null;
	}

	private static void loadRestaurateurs() {
		loadData("restaurateurs");
	}

	public static void saveRestaurateurs() {
		saveData("restaurateurs");
	}

	public static void addRestaurateur(Restaurateur restaurateur) {
		restaurateurs.add(restaurateur);
	}

	public static ArrayList<Manager> getManagers() {
		return managers;
	}

	public static Manager getManagerById(int id) {
		for (Manager manager : managers) {
			if (manager.getId() == id) {
				return manager;
			}
		}
		return null;
	}

	public static Manager getManagerByUserName(String userName) {
		for (Manager manager : managers) {
			if (manager.getUsername().equalsIgnoreCase(userName)) {
				return manager;
			}
		}
		return null;
	}

	private static void loadManagers() {
		loadData("managers");
	}

	public static void saveManagers() {
		saveData("managers");
	}

	public static void addManager(Manager manager) {
		managers.add(manager);
	}

	public static void addUser(User user) {

		if (user instanceof Manager) {
			addManager((Manager) user);
		} else if (user instanceof Admin) {
			addAdmin((Admin) user);
		} else if (user instanceof Client) {
			addClient((Client) user);
		} else if (user instanceof Deliveryman) {
			addDeliveryman((Deliveryman) user);
		} else if (user instanceof Restaurateur) {
			addRestaurateur((Restaurateur) user);
		}

	}

	public static ArrayList<Admin> getAdmins() {
		return admins;
	}

	public static Admin getAdminById(int id) {
		for (Admin admin : admins) {
			if (admin.getId() == id) {
				return admin;
			}
		}
		return null;
	}

	public static Admin getAdminByUserName(String userName) {
		for (Admin admin : admins) {
			if (admin.getUsername().equalsIgnoreCase(userName)) {
				return admin;
			}
		}
		return null;
	}

	private static void loadAdmins() {
		loadData("admins");
	}

	public static void saveAdmins() {
		saveData("admins");
	}

	public static void addAdmin(Admin admin) {
		admins.add(admin);
	}

	public static IdCounter getIdCounter() {
		return idCounter.get(0);
	}

	private static void loadIdCounter() {
		loadData("ids");
	}

	public static void saveIdCounter() {
		saveData("ids");
	}

	public static void saveAll() {
		saveAdmins();
		saveManagers();
		saveRestaurateurs();
		saveDeliverymen();
		saveClients();
		saveRestaurants();
		saveMenus();
		saveOrders();
		saveItems();
		saveIdCounter();
	}

	/**
	 * @param filename Load data from file specified into ArrayList
	 */
	private static void loadData(String filename) {
		String infoString = "";
		// Read the file
		try {

			InputStream inputStream = new FileInputStream("saveData/" + filename + ".txt");

			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

			String readLine;
			StringBuffer buf = new StringBuffer();

			while ((readLine = in.readLine()) != null) {
				buf.append(readLine);
			}

			// Convert the read String into a Json String
			infoString = buf.toString();

			if (null != in) {
				in.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Load data into the array
		if (infoString != null && !infoString.isEmpty()) {
			// Create new Gson object
			Gson gson = (new GsonBuilder()).create();

			// Use Gson library to process string into objects
			switch (filename) {
			case "ids":
				idCounter = new ArrayList<IdCounter>(Arrays.asList(gson.fromJson(infoString, IdCounter[].class)));
				break;
			case "items":
				items = new ArrayList<Item>(Arrays.asList(gson.fromJson(infoString, Item[].class)));
				break;
			case "menus":
				menus = new ArrayList<Menu>(Arrays.asList(gson.fromJson(infoString, Menu[].class)));
				break;
			case "orders":
				orders = new ArrayList<Order>(Arrays.asList(gson.fromJson(infoString, Order[].class)));
				break;
			case "restaurants":
				restaurants = new ArrayList<Restaurant>(Arrays.asList(gson.fromJson(infoString, Restaurant[].class)));
				break;
			case "clients":
				clients = new ArrayList<Client>(Arrays.asList(gson.fromJson(infoString, Client[].class)));
				break;
			case "deliverymen":
				deliverymen = new ArrayList<Deliveryman>(Arrays.asList(gson.fromJson(infoString, Deliveryman[].class)));
				break;
			case "restaurateurs":
				restaurateurs = new ArrayList<Restaurateur>(
						Arrays.asList(gson.fromJson(infoString, Restaurateur[].class)));
				break;
			case "managers":
				managers = new ArrayList<Manager>(Arrays.asList(gson.fromJson(infoString, Manager[].class)));
				break;
			case "admins":
				admins = new ArrayList<Admin>(Arrays.asList(gson.fromJson(infoString, Admin[].class)));
				break;
			}

		} else {
			switch (filename) {
			case "ids":
				idCounter = new ArrayList<IdCounter>();
				idCounter.add(new IdCounter());
				break;
			case "items":
				items = new ArrayList<Item>();
				break;
			case "menus":
				menus = new ArrayList<Menu>();
				break;
			case "orders":
				orders = new ArrayList<Order>();
				break;
			case "restaurants":
				restaurants = new ArrayList<Restaurant>();
				break;
			case "clients":
				clients = new ArrayList<Client>();
				break;
			case "deliverymen":
				deliverymen = new ArrayList<Deliveryman>();
				break;
			case "restaurateurs":
				restaurateurs = new ArrayList<Restaurateur>();
				break;
			case "managers":
				managers = new ArrayList<Manager>();
				break;
			case "admins":
				admins = new ArrayList<Admin>();
				break;
			}
		}
	}

	/**
	 * @param filename Save contents of ArrayList into specified file
	 */
	private static void saveData(String filename) {
		String strJson = "";
		switch (filename) {
		case "ids":
			strJson = (new GsonBuilder().create()).toJson(idCounter);
			break;
		case "items":
			strJson = (new GsonBuilder().create()).toJson(items);
			break;
		case "menus":
			strJson = (new GsonBuilder().create()).toJson(menus);
			break;
		case "orders":
			strJson = (new GsonBuilder().create()).toJson(orders);
			break;
		case "restaurants":
			strJson = (new GsonBuilder().create()).toJson(restaurants);
			break;
		case "clients":
			strJson = (new GsonBuilder().create()).toJson(clients);
			break;
		case "deliverymen":
			strJson = (new GsonBuilder().create()).toJson(deliverymen);
			break;
		case "restaurateurs":
			strJson = (new GsonBuilder().create()).toJson(restaurateurs);
			break;
		case "managers":
			strJson = (new GsonBuilder().create()).toJson(managers);
			break;
		case "admins":
			strJson = (new GsonBuilder().create()).toJson(admins);
			break;
		}

		try {
			FileOutputStream outputStream = new FileOutputStream("saveData/" + filename + ".txt");
			outputStream.write(strJson.getBytes());
			outputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

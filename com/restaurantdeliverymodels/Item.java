package com.restaurantdeliverymodels;

/**
 * @author Alex
 * Items can be assigned to menu or orders, or can be declared as part of a menu being created or edited
 */
public class Item {
	
	private int id;
	private String name;
	private double price;
	private int menu_id;
	private int quantity;
	private int order_id;
	
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param order_id
	 * Create an item that belongs to an order
	 */
	public Item(String name, double price, int quantity, int order_id) {
		this.id = Database.getIdCounter().getIdCounterItem();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.order_id = order_id;
		Database.saveIdCounter();
	}
	
	/**
	 * @param name
	 * @param price
	 * @param menu_id
	 * Create an item that belongs to a menu
	 */
	public Item(String name, double price, int menu_id) {
		this.id = Database.getIdCounter().getIdCounterItem();
		this.name = name;
		this.price = price;
		this.menu_id = menu_id;
		Database.saveIdCounter();
	}
	
	/**
	 * @param name
	 * @param price
	 * Create an item not assigned to a menu
	 */
	public Item(String name, double price) {
		this.id = Database.getIdCounter().getIdCounterItem();
		this.name = name;
		this.price = price;
		Database.saveIdCounter();
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
}

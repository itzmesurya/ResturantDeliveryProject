package com.restaurantdeliverymodels;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Alex
 * An order belongs to a restaurant and client and contains items. Can be assigned to a deliveryman
 */
public class Order {
	
	private int id;
	private String delivery_area;
	private String delivery_address;
	private int restaurant_id;
	private int client_id;
	private int deliveryman_id;
	private Item[] items;
	private String date;
	private String hour;
	private String minute;
	private int status; //0: Order was just placed by client, 1:order is being made by restaurateur, 2:order is ready for delivery, 3: order being delivered, 4: order was delivered
	
	
	/**
	 * @param delivery_area
	 * @param items
	 * @param restaurant_id
	 * @param client_id
	 */
	public Order(String delivery_area, String delivery_address, Item[] items, int restaurant_id, int client_id) {
		this.id = Database.getIdCounter().getIdCounterOrder();
		this.delivery_area = delivery_area;
		this.delivery_address = delivery_address;
		this.items = items;
		this.restaurant_id = restaurant_id;
		this.client_id = client_id;
		this.status = 0;
		this.setTime();
	}

	public void setTime() {
		Date date = new Date();
		this.date = new SimpleDateFormat("dd/MM/yyyy").format(date);
		this.hour = new SimpleDateFormat("HH").format(date);
		this.minute = new SimpleDateFormat("mm").format(date);
	}
	
	public void markRestaurateurAccepted() {
		this.setStatus(1);
		for (int i = 0; i < Database.getOrders().size(); i++) {
			if (Database.getOrders().get(i).getId() == this.id) {
				Database.getOrders().get(i).setStatus(this.status);
				Database.saveOrders();
			}
		}
	}
	
	public void markReadyForDelivery() {
		this.setStatus(2);
		for (int i = 0; i < Database.getOrders().size(); i++) {
			if (Database.getOrders().get(i).getId() == this.id) {
				Database.getOrders().get(i).setStatus(this.status);
				Database.saveOrders();
			}
		}
	}
	
	public void markDeliveryAccepted() {
		this.setStatus(3);
		for (int i = 0; i < Database.getOrders().size(); i++) {
			if (Database.getOrders().get(i).getId() == this.id) {
				Database.getOrders().get(i).setStatus(this.status);
				Database.saveOrders();
			}
		}
	}
	
	public void markDelivered() {
		this.setStatus(4);
		this.setTime();
		for (int i = 0; i < Database.getOrders().size(); i++) {
			if (Database.getOrders().get(i).getId() == this.id) {
				Database.getOrders().get(i).setStatus(this.status);
				Database.getOrders().get(i).setDate(this.date);
				Database.getOrders().get(i).setHour(this.hour);
				Database.getOrders().get(i).setMinute(this.minute);
				Database.saveOrders();
			}
		}
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDelivery_area() {
		return delivery_area;
	}


	public void setDelivery_area(String delivery_area) {
		this.delivery_area = delivery_area;
	}


	public int getRestaurant_id() {
		return restaurant_id;
	}


	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}


	public int getClient_id() {
		return client_id;
	}


	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}


	public int getDeliveryman_id() {
		return deliveryman_id;
	}


	public void setDeliveryman_id(int deliveryman_id) {
		this.deliveryman_id = deliveryman_id;
	}


	public Item[] getItems() {
		return items;
	}


	public void setItems(Item[] items) {
		this.items = items;
	}


	public String getDelivery_address() {
		return delivery_address;
	}


	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getHour() {
		return hour;
	}


	public void setHour(String hour) {
		this.hour = hour;
	}


	public String getMinute() {
		return minute;
	}


	public void setMinute(String minute) {
		this.minute = minute;
	}
	
	
	
}

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alex
 * An order belongs to a restaurant and client and contains items. Can be assigned to a deliveryman
 */
public class Order {
	
	private static int idCount = 1;
	private int id;
	private String delivery_area;
	private String delivery_address;
	private int restaurant_id;
	private int client_id;
	private int deliveryman_id;
	private Item[] items;
	private int status;
	
	
	/**
	 * @param delivery_area
	 * @param items
	 * @param restaurant_id
	 * @param client_id
	 */
	public Order(String delivery_area, String delivery_address, Item[] items, int restaurant_id, int client_id) {
		this.id = idCount++;
		this.delivery_area = delivery_area;
		this.delivery_address = delivery_address;
		this.items = items;
		this.restaurant_id = restaurant_id;
		this.client_id = client_id;
		this.status = 0;
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
	
}

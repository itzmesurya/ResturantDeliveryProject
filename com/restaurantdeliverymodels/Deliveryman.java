package com.restaurantdeliverymodels;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alex Deliveryman can view and accept deliveries and mark them as
 *         complete
 */
public class Deliveryman extends User {
	private ArrayList<String> delivery_areas;

	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param email
	 * @param phone
	 * @param delivery_areas
	 */

	public Deliveryman(String username, String password, String first_name, String last_name, String address,
			String email, String phone, String[] delivery_areas) {
		super(username, password, first_name, last_name, address, email, phone);
		this.level = 1;
		this.delivery_areas = new ArrayList<>(Arrays.asList(delivery_areas));
	}

	public ArrayList<String> getDelivery_areas() {
		return delivery_areas;
	}

	public void setDelivery_areas(ArrayList<String> delivery_areas) {
		this.delivery_areas = delivery_areas;
	}

	/**
	 * @param delivery_area Add delivery area to deliveryman by passing the area
	 *                      name
	 */
	public void addDeliveryArea(String delivery_area) {
		this.delivery_areas.add(delivery_area);
	}

	/**
	 * @param delivery_area Remove delivery area from deliveryman by passing the
	 *                      area name
	 */
	public void removeDeliveryArea(String delivery_area) {
		this.delivery_areas.remove(delivery_area);
	}

	public void delete() {
		Database.deleteDeliverymanById(this.getId());
		Database.saveDeliverymen();
	}

	public void edit() {
		ArrayList<Deliveryman> deliverymen = Database.getDeliverymen();
		int index = -1;
		for (int i = 0; i < deliverymen.size(); i++) {
			if (deliverymen.get(i).getId() == this.getId()) {
				index = i;
			}
		}
		Deliveryman deliveryman = Database.getDeliverymen().get(index);
		deliveryman.setFirst_name(this.getFirst_name());
		deliveryman.setLast_name(this.getLast_name());
		deliveryman.setPassword(this.getPassword());
		deliveryman.setEmail(this.getEmail());
		deliveryman.setPhone(this.getPhone());
		deliveryman.setAddress(this.getAddress());
		Database.saveDeliverymen();
	}
}

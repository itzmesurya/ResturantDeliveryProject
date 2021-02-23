package com.restaurantdeliverymodels;

public class IdCounter {
	
	private int idCounterItem;
	private int idCounterOrder;
	private int idCounterMenu;
	private int idCounterRestaurant;
	private int idCounterUser;
	
	public IdCounter() {
		idCounterItem = 1;
		idCounterOrder = 1;
		idCounterMenu = 1;
		idCounterRestaurant = 1;
		idCounterUser = 1;
	}
	
	public int getIdCounterItem() {
		return idCounterItem++;
	}
	public void setIdCounterItem(int idCounterItem) {
		this.idCounterItem = idCounterItem;
	}
	public int getIdCounterOrder() {
		return idCounterOrder++;
	}
	public void setIdCounterOrder(int idCounterOrder) {
		this.idCounterOrder = idCounterOrder;
	}
	public int getIdCounterMenu() {
		return idCounterMenu++;
	}
	public void setIdCounterMenu(int idCounterMenu) {
		this.idCounterMenu = idCounterMenu;
	}
	public int getIdCounterRestaurant() {
		return idCounterRestaurant++;
	}
	public void setIdCounterRestaurant(int idCounterRestaurant) {
		this.idCounterRestaurant = idCounterRestaurant;
	}

	public int getIdCounterUser() {
		return idCounterUser++;
	}
	public void setIdCounterUser(int idCounterUser) {
		this.idCounterUser = idCounterUser;
	}

}

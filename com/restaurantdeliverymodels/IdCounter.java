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
	public int getCurrentIdCounterItem() {
		return idCounterItem;
	}
	public int getLastIdCounterItem() {
		return idCounterItem - 1;
	}
	public void setIdCounterItem(int idCounterItem) {
		this.idCounterItem = idCounterItem;
	}
	public int getIdCounterOrder() {
		return idCounterOrder++;
	}
	public int getCurrentIdCounterOrder() {
		return idCounterOrder;
	}
	public int getLastIdCounterOrder() {
		return idCounterOrder - 1;
	}
	public void setIdCounterOrder(int idCounterOrder) {
		this.idCounterOrder = idCounterOrder;
	}
	public int getIdCounterMenu() {
		return idCounterMenu++;
	}
	public int getCurrentIdCounterMenu() {
		return idCounterMenu;
	}
	public int getLastIdCounterMenu() {
		return idCounterMenu - 1;
	}
	public void setIdCounterMenu(int idCounterMenu) {
		this.idCounterMenu = idCounterMenu;
	}
	public int getIdCounterRestaurant() {
		return idCounterRestaurant++;
	}
	public int getCurrentIdCounterRestaurant() {
		return idCounterRestaurant;
	}
	public int getLastIdCounterRestaurant() {
		return idCounterRestaurant - 1;
	}
	public void setIdCounterRestaurant(int idCounterRestaurant) {
		this.idCounterRestaurant = idCounterRestaurant;
	}
	public int getIdCounterUser() {
		return idCounterUser++;
	}
	public int getCurrentIdCounterUser() {
		return idCounterUser;
	}
	public int getLastIdCounterUser() {
		return idCounterUser - 1;
	}
	public void setIdCounterUser(int idCounterUser) {
		this.idCounterUser = idCounterUser;
	}

}

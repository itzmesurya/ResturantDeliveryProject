package com.restaurantdeliverymodels;

/**
 * @author Alex
 * This is a template used for keeping track of the current program user
 * To create a user, you must create one of its subclasses (Client, Admin, Manager, etc)
 */
public abstract class User {
	protected int id;
	protected int level;
	protected String username;
	protected String password;
	protected String first_name;
	protected String last_name;
	protected String address;
	protected String email;
	protected String phone;
	
	
	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address
	 * @param email
	 * @param phone
	 */
	public User(String username, String password, String first_name, String last_name, String address, String email, String phone) {
		this.id = Database.getIdCounter().getIdCounterUser();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		Database.saveIdCounter();
	}
	
	/**
	 * @param username
	 * @param password
	 * To enter a user without the need of personal information
	 */
	public User(String username, String password) {
		this.id = Database.getIdCounter().getIdCounterUser();
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

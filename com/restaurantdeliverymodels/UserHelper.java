package com.restaurantdeliverymodels;

public class UserHelper {

	/*
	 * This method will return 'true' if the username is available to be created
	 * */
	public static boolean isUsernameAvailable(User user) {
		//let us assume that the username is available to be added in the DB
		boolean result = true;
		// check in managers
		Manager manager = Database.getManagerByUserName(user.getUsername());
		if (manager != null && !manager.getUsername().isEmpty()) {
			// this means that the manager with the given username exists in the DB
			// hence the availability is negative (false)
			result = false;
		}
		// check in admin
		Admin admin = result? Database.getAdminByUserName(user.getUsername()) : null;
		if (admin != null && !admin.getUsername().isEmpty()) {
			// this means that the admin with the given username exists in the DB
			// hence the availability is negative (false)
			result = false;
		}

		// check in Deliveryman
		Deliveryman deliveryman = result? Database.getDeliverymanByUserName(user.getUsername()) : null;
		if (deliveryman != null && !deliveryman.getUsername().isEmpty()) {
			// this means that the deliveryman with the given username exists in the DB
			// hence the availability is negative (false)
			result = false;
		}
		// check in client
		Client client = result? Database.getClientByUserName(user.getUsername()) : null;
		if (client != null && !client.getUsername().isEmpty()) {
			// this means that the client with the given username exists in the DB
			// hence the availability is negative (false)
			result = false;
		}
		//check in Restaurateur
		Restaurateur restaurateur = result? Database.getRestaurateurByUserName(user.getUsername()) : null;
		if (restaurateur != null && !restaurateur.getUsername().isEmpty()) {
			// this means that the restaurateur with the given username exists in the DB
			// hence the availability is negative (false)
			result = false;
		}
		return result;

	}
	public static User userFactory(int levelTobeAdded, String userName, String password, String firstName, String lastName, String address, String email, String phone) {
		User user ;
		switch (levelTobeAdded) {
		case 0:
			 user = new Manager(userName, password, firstName, lastName, address, email, phone);
			 user.setLevel(levelTobeAdded);
			break;
		case 1:
			 user = new Restaurateur(userName, password, firstName, lastName, address, email, phone);
			 user.setLevel(levelTobeAdded);
			break;
		case 2:
			 user = new Admin(userName, password, firstName, lastName, address, email, phone);
			 user.setLevel(levelTobeAdded);
			break;
		case 3:
			 user = new Client(userName, password, firstName, lastName, address, email, phone);
			 user.setLevel(levelTobeAdded);
			break;
		case 4:
			 user = new Deliveryman(userName, password, firstName, lastName, address, email, phone, null);
			 user.setLevel(levelTobeAdded);
			break;
		default:
			user = new Manager(userName, password, firstName, lastName, address, email, phone);
			break;
		}
		return user;
	}
}

package com.restaurantdeliverymodels;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserHelper {

	/*
	 * This method will return 'true' if the username is available to be created
	 */
	public static boolean isUsernameAvailable(User user) {
		//Search through all users in database if username is a match
		for (User existingUser : Database.getUsers()) {
			if (existingUser.getUsername().equals(user.getUsername()))
				//If it's a match, return false
				return false;
		}
		//If no matches were made, return true
		return true;
	}
	
	/*
	 * This method will return 'true' if the username is available to be created
	 */
	public static boolean isUsernameAvailable(String userName) {
		//Search through all users in database if username is a match
		for (User existingUser : Database.getUsers()) {
			if (existingUser.getUsername().equals(userName))
				//If it's a match, return false
				return false;
		}
		//If no matches were made, return true
		return true;
	}

	public static User userFactory(int levelTobeAdded, String userName, String password, String firstName,
			String lastName, String address, String email, String phone) {
		User user = null;
		switch (levelTobeAdded) {

		case 0:
			user = new Client(userName, password, firstName, lastName, address, email, phone);
			break;
		case 1:
			user = new Deliveryman(userName, password, firstName, lastName, address, email, phone, null);
			break;
		case 2:
			user = new Restaurateur(userName, password, firstName, lastName, address, email, phone);
			break;
		case 3:
			user = new Manager(userName, password, firstName, lastName, address, email, phone);
			break;
		case 100:
			user = new Admin(userName, password, firstName, lastName, address, email, phone);
			break;
		}
		return user;
	}

	public static void DeleteUser(User user) {

		switch (user.getLevel()) {
		case 0:
			// Delete Client
			((Client) user).delete();
			break;
		case 1:
			// Delete DeliveryMan
			((Deliveryman) user).delete();
			break;
		case 2:
			((Restaurateur) user).delete();
			break;
		case 3:
			((Manager) user).delete();
			break;
		case 100:
			// Delete Admin
			((Admin) user).delete();
			break;
		}
	}

	public static void EditUser(User user) {

		switch (user.getLevel()) {
		case 0:
			// Modify Client
			((Client) user).edit();
			break;
		case 1:
			// modify DeliveryMan
			((Deliveryman) user).edit();
			break;
		case 2:
			((Restaurateur) user).edit();
			break;
		case 3:
			((Manager) user).edit();
			break;
		case 100:
			// modify Admin
			((Admin) user).edit();
			break;
		}
	}

	public static void CreateAccount(User user) {
		if (user != null) {
			switch (user.getLevel()) {
			case 0:
				// create Client
				((Client) user).create();
				break;
			case 1:
				// create DeliveryMan
				((Deliveryman) user).create();
				break;
			// create Restaurateur
			case 2:
				((Restaurateur) user).create();
				break;
			// create Manager
			case 3:
				((Manager) user).create();
				break;
			case 100:
				// create Admin
				((Admin) user).create();
				break;
			}
		}
	}

	public static ArrayList<User> getUsersBasedOnLevel(int selectedLevelFromDropDown) {
		switch (selectedLevelFromDropDown) {
		case 0:
			// Return list of Client
			return (ArrayList<User>) Database.getClients().stream().map(x -> (User) x).collect(Collectors.toList());
		case 1:
			// Return list of DeliveryMan
			return (ArrayList<User>) Database.getDeliverymen().stream().map(x -> (User) x).collect(Collectors.toList());
		case 2:
			// Return list of Restaurateur
			return (ArrayList<User>) Database.getRestaurateurs().stream().map(x -> (User) x)
					.collect(Collectors.toList());
		case 3:
			// Return list of Managers
			return (ArrayList<User>) Database.getManagers().stream().map(x -> (User) x).collect(Collectors.toList());
		case 100:
			// modify Admins
			return (ArrayList<User>) Database.getAdmins().stream().map(x -> (User) x).collect(Collectors.toList());
		}
		return null;
	}

	public static User getUserByUserNameAndLevel(int level, String userName) {
		switch (level) {
		case 0:
			// Return list of Client
			return (User) Database.getClients().stream().filter(x -> x.getUsername().equals(userName)).findFirst()
					.get();
		case 1:
			// Return list of DeliveryMan
			return (User) Database.getDeliverymen().stream().filter(x -> x.getUsername().equals(userName)).findFirst()
					.get();
		case 2:
			// Return list of Restaurateur
			return (User) Database.getRestaurateurs().stream().filter(x -> x.getUsername().equals(userName)).findFirst()
					.get();
		case 3:
			// Return list of Managers
			return (User) Database.getManagers().stream().filter(x -> x.getUsername().equals(userName)).findFirst()
					.get();
		case 100:
			// modify Admins
			return (User) Database.getAdmins().stream().filter(x -> x.getUsername().equals(userName)).findFirst().get();
		}
		return null;
	}
	
	public static User getUserByUser(int level, int id) {
		switch (level) {
		case 0:
			// Return list of Client
			return (User) Database.getClientById(id);
		case 1:
			// Return list of DeliveryMan
			return (User) Database.getDeliverymanById(id);
		case 2:
			// Return list of Restaurateur
			return (User) Database.getRestaurateurById(id);
		case 3:
			// Return list of Managers
			return (User) Database.getManagerById(id);
		case 100:
			// modify Admins
			return (User) Database.getAdminById(id);
		}
		return null;
	}
}

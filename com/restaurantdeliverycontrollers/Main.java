package com.restaurantdeliverycontrollers;

import com.restaurantdeliverymodels.Admin;
import com.restaurantdeliverymodels.Client;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;
import com.restaurantdeliverymodels.Item;
import com.restaurantdeliverymodels.Manager;
import com.restaurantdeliverymodels.Menu;
import com.restaurantdeliverymodels.Order;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;

public class Main {

	public static User user;
	
	public static void main(String[] args) {
		new Database();
		new MainFrame();
		MainFrame.changePanel(new LoginPanel());
		
		Database.addAdmin(new Admin("Johndoeadmin", "Admin123", "John", "Doe", "6817 43 Av Montreal QC H1T 2R9(Montreal ,Quebec)", "Johndoe@test.com", "(514) 122-2355"));
		Database.addManager(new Manager("LineJohnson", "Manager123", "Line", "Johnson", "7503 Rue St Denis Montreal QC H2R 2E7(Montreal ,Quebec)", "LineJohnson@test.com", "(514) 122-1234"));
		Database.addRestaurateur(new Restaurateur("PatriciaJohn", "Test@123", "Patricia", "John", "5240 Randall Av Montreal QC H4V 2V3(Montreal ,Quebec)", "PatriciaJohn@test.com", "(514) 123-1234"));
		Database.addDeliveryman(new Deliveryman("JosephChandler", "Test@123", "Joseph", "Chandler", "7299 de l'Elysee Saint-Léonard QC H1S 2W1(Montreal ,Quebec)", "JosephChandler@test.com", "(514) 127-1234", new String[]{"H1T", "H2R", "H4V", "H1S", "H3M"}));
		Database.addClient(new Client("john56", "jwick31", "John", "Wick", "2630 St Germain Street Montreal QC H1W 2V3", "john@gmail.com", "(514) 987-5438"));
		Database.addRestaurant(new Restaurant("Sauté", "251 Av Percival Montreal Ouest QC H4X 1T8", "(514) 765-1089", new String[]{"H1T", "H2R", "G5F"}, new String[][] {{"9:00", "17:00"}, {"9:00", "17:00"}, {"9:00", "17:00"}, {"9:00", "17:00"}, {"9:00", "17:00"}, {"9:00", "21:00"}, {"9:00", "21:00"}}, 1, 1));
		Database.addMenu(new Menu(1));
		Database.addItem(new Item("Hawaain Pizza", 40.0, 1));
		Database.addItem(new Item("Alfredo Pasta", 35.0, 1));
		Database.addItem(new Item("Lasagna", 40.0, 1));
		Database.addItem(new Item("Spaghetti", 30.0, 1));
		Database.addItem(new Item("Hamburger", 10.0, 1));
		Database.addItem(new Item("Fries", 2.99, 1));
		Database.addItem(new Item("Onion Rings", 3.0, 1));
		Database.addItem(new Item("Roast Beef", 6.0, 1));
		Database.addItem(new Item("Caesar Salad", 5.0, 1));
		Database.addItem(new Item("Chicken Avacado Mango", 14.75, 1));
		Database.addOrder(new Order("H1T", "1000 Royal Street", new Item[] {new Item("Hawaain Pizza", 40.0, 2, 1), new Item("Lasagna", 40.0, 1, 1), new Item("Hamburger", 10.0, 2, 1), new Item("Onion Rings", 3.0, 5, 1), new Item("Caesar Salad", 5.0, 4, 1)}, 1, 1));
	}

}

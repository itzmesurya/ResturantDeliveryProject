package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryMan_main_menu_Panel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.Manager_main_menu_Panel;
import com.restaurantdeliveryviews.Restaurateur_main_menu_Panel;

public class LoginCore {
	
	public LoginCore() {
		LoginPanel.getLoginBtn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Verify that username and password are not blank
				if (LoginPanel.getUsernameTF().getText().trim().isEmpty() || LoginPanel.getPasswordTF().getText().trim().isEmpty()) {
					Functions.displayError("Please enter username and password");
					return;
				}
				//Verify username and password match a user in the database
				ArrayList<User> users = Database.getUsers();
				for (User user : users) {
					System.out.println("Verifying username: " + user.getUsername());
					if (user.getUsername().equals(LoginPanel.getUsernameTF().getText()) && user.getPassword().equals(LoginPanel.getPasswordTF().getText())) {
						Main.user = user;
						break;
					} 
				}
				if (Main.user == null) {
					Functions.displayError("Incorrect username and/or password");
				} else {
					MainFrame.getMainFrame().getJMenuBar().setVisible(true);
					//Change to menu appropriate to user level
					switch(Main.user.getLevel()) {
					case 0:
						MainFrame.changePanel(new Client_main_menu_Panel());
						break;
					case 1:
						MainFrame.changePanel(new DeliveryMan_main_menu_Panel());
						break;
					case 2:
						MainFrame.changePanel(new Restaurateur_main_menu_Panel());
						break;
					case 3:
						MainFrame.changePanel(new Manager_main_menu_Panel());
						break;
					case 100:
						MainFrame.changePanel(new Admin_main_menu_Panel());
						new Admin_main_menu_Core();
						break;
					}
				}
			}
		});
		
		LoginPanel.getLbl_create_account().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MainFrame.changePanel(new AccountPanel("create"));
				new AccountCore();
			}
		});
	}

}

package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.CustomMenuBar;
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
					if (user.getUsername().equals(LoginPanel.getUsernameTF().getText()) && user.getPassword().equals(LoginPanel.getPasswordTF().getText())) {
						Main.user = user;
						break;
					} 
				}
				if (Main.user == null) {
					Functions.displayError("Incorrect username and/or password");
				} else {
					MainFrame.getMainFrame().getJMenuBar().setVisible(true);
					
					//By default re-hide every menu option
					//Menu Items
					CustomMenuBar.getDelivery().setVisible(false);
					CustomMenuBar.getMenu().setVisible(false);
					CustomMenuBar.getOrder().setVisible(false);
					CustomMenuBar.getRestaurant().setVisible(false);
					//Sub-Menu Items
					CustomMenuBar.getCreate_account().setVisible(false);
					CustomMenuBar.getCreate_menu().setVisible(false);
					CustomMenuBar.getEdit_menu().setVisible(false);
					CustomMenuBar.getDelete_menu().setVisible(false);
					CustomMenuBar.getView_order().setVisible(false);
					CustomMenuBar.getAccept_order().setVisible(false);
					CustomMenuBar.getEnd_order().setVisible(false);
					CustomMenuBar.getOrder_food().setVisible(false);
					CustomMenuBar.getOrder_history().setVisible(false);
					CustomMenuBar.getCreate_resto().setVisible(false);
					CustomMenuBar.getEdit_resto().setVisible(false);
					CustomMenuBar.getDelete_resto().setVisible(false);
					CustomMenuBar.getView_deliveries().setVisible(false);
					CustomMenuBar.getAccept_deliveries().setVisible(false);
					CustomMenuBar.getEnd_deliveries().setVisible(false);
					CustomMenuBar.getCreate_deliveryman().setVisible(false);
					CustomMenuBar.getEdit_deliveryman().setVisible(false);
					CustomMenuBar.getDelete_deliveryman().setVisible(false);
					
					//Change to menu appropriate to user level
					System.out.println(Main.user.getLevel() + "");
					switch(Main.user.getLevel()) {
					
					case 0: // Client
						MainFrame.changePanel(new Client_main_menu_Panel());
						new Client_main_menu_Core();
						CustomMenuBar.getOrder().setVisible(true);
						CustomMenuBar.getOrder_food().setVisible(true);
						CustomMenuBar.getOrder_history().setVisible(true);
						break;
					case 1: //Deliveryman
						MainFrame.changePanel(new DeliveryMan_main_menu_Panel());
						new DeliveryMan_main_menu_Core();
						CustomMenuBar.getDelivery().setVisible(true);
						CustomMenuBar.getView_deliveries().setVisible(true);
						CustomMenuBar.getAccept_deliveries().setVisible(true);
						CustomMenuBar.getEnd_deliveries().setVisible(true);
						break;
					case 2: //Restaurateur
						MainFrame.changePanel(new Restaurateur_main_menu_Panel());
						new Restaurateur_main_menu_Core();
						CustomMenuBar.getOrder().setVisible(true);
						CustomMenuBar.getAccept_order().setVisible(true);
						CustomMenuBar.getEnd_order().setVisible(true);
						break;
					case 3: //Manager
						System.out.println("manager");
						MainFrame.changePanel(new Manager_main_menu_Panel());
						new Manager_main_menu_Core();
						CustomMenuBar.getRestaurant().setVisible(true);
						CustomMenuBar.getEdit_resto().setVisible(true);
						CustomMenuBar.getMenu().setVisible(true);
						CustomMenuBar.getCreate_menu().setVisible(true);
						CustomMenuBar.getEdit_menu().setVisible(true);
						CustomMenuBar.getDelete_menu().setVisible(true);
						CustomMenuBar.getOrder().setVisible(true);
						CustomMenuBar.getView_order().setVisible(true);
						break;
					case 100: //Admin
						MainFrame.changePanel(new Admin_main_menu_Panel());
						new Admin_main_menu_Core();
						CustomMenuBar.getDelivery().setVisible(true);
						CustomMenuBar.getMenu().setVisible(true);
						CustomMenuBar.getRestaurant().setVisible(true);
						CustomMenuBar.getCreate_account().setVisible(true);
						CustomMenuBar.getCreate_menu().setVisible(true);
						CustomMenuBar.getEdit_menu().setVisible(true);
						CustomMenuBar.getDelete_menu().setVisible(true);
						CustomMenuBar.getCreate_resto().setVisible(true);
						CustomMenuBar.getEdit_resto().setVisible(true);
						CustomMenuBar.getDelete_resto().setVisible(true);
						CustomMenuBar.getCreate_deliveryman().setVisible(true);
						CustomMenuBar.getEdit_deliveryman().setVisible(true);
						CustomMenuBar.getDelete_deliveryman().setVisible(true);
						break;
					}
				}
			}
		});
		
		LoginPanel.getLbl_create_account().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					MainFrame.changePanel(new AccountPanel(CRUDAction.Create));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				new AccountCore(CRUDAction.Create);
			}
		});
	}

}

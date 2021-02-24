package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.restaurantdeliverymodels.Admin;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;

public class LoginCore {
	
	public LoginCore() {
		LoginPanel.getLoginBtn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new Admin_main_menu_Panel());
				ArrayList<Admin> admins = Database.getAdmins();
				for (Admin admin : admins) {
					if (admin.getUsername().equals(LoginPanel.getUsernameTF().getText()) && admin.getPassword().equals(LoginPanel.getPasswordTF().getText())) {
						Main.user = Database.getAdminById(admin.getId());
					}
				}
				
			}
		});
	}

}

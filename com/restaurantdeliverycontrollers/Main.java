package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.User;

import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryMan_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryPanel;

import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.Manager_main_menu_Panel;
import com.restaurantdeliveryviews.OrderPanel;
import com.restaurantdeliveryviews.Order_Food_Panel;
import com.restaurantdeliveryviews.RestaurantPanel;
import com.restaurantdeliveryviews.Restaurateur_main_menu_Panel;

public class Main {

	public static User user;
	
	public static void main(String[] args) {
		//Initialize
		new Database();
		new MainFrame();
		
		//Set Top Bar
		MainFrame.getMenuBar().getCreate_account().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});

		//Change to Login
		MainFrame.changePanel(new LoginPanel());
		new LoginCore();
		
		
	}

}

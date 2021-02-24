package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.RestaurantPanel;


public class Admin_main_menu_Core {

	public Admin_main_menu_Core() {
		
		//ADD RESTAURANT BTN 
		Admin_main_menu_Panel.getResto_Add_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new MainFrame();
				MainFrame.changePanel(new RestaurantPanel());
				
			}
		});
	
		
		//EDIT RESTAURANT BTN
		Admin_main_menu_Panel.getResto_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new RestaurantPanel());
				
			}
		});
		
		//DELETE RESTAURANT BTN
		Admin_main_menu_Panel.getResto_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new RestaurantPanel());
				
			}
		});
		
	}

}

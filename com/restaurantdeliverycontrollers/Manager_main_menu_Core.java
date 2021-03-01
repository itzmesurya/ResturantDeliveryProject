package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.Manager_main_menu_Panel;
import com.restaurantdeliveryviews.MenuPanel;
import com.restaurantdeliveryviews.RestaurantPanel;

public class Manager_main_menu_Core {

	public Manager_main_menu_Core() {
		
		//ADD Menu BTN
		Manager_main_menu_Panel.getMenu_Add_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				MainFrame.changePanel(new MenuPanel(CRUDAction.Create));
				new MenuCore(CRUDAction.Create);
				
			}
		});
		
		//Edit Menu BTN
		Manager_main_menu_Panel.getMenu_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				MainFrame.changePanel(new MenuPanel(CRUDAction.Edit));
				new MenuCore(CRUDAction.Edit);

				
			}
		});
		
		//DELETE Menu BTN
		Manager_main_menu_Panel.getMenu_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				MainFrame.changePanel(new MenuPanel(CRUDAction.Delete));
				new MenuCore(CRUDAction.Delete);

				
			}
		});
		
		//EDIT RESTAURANT BTN
		Manager_main_menu_Panel.getResto_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainFrame.changePanel(new RestaurantPanel());
				new RestaurantCore(CRUDAction.Edit);
			}
		});
		
		//Log Out BTN
		Manager_main_menu_Panel.getlog_out_btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainFrame.changePanel(new LoginPanel());
				
			}
		});
		
	}
	
}

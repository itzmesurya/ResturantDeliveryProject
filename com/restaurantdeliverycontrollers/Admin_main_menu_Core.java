package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryPanel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.MenuPanel;
import com.restaurantdeliveryviews.OrderPanel;
import com.restaurantdeliveryviews.RestaurantPanel;


public class Admin_main_menu_Core {

	public Admin_main_menu_Core() {

		//ADD RESTAURANT BTN 
		Admin_main_menu_Panel.getResto_Add_Btn().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new RestaurantPanel());
				new RestaurantCore(CRUDAction.Create);
			}
		});
		
		//EDIT RESTAURANT BTN
		Admin_main_menu_Panel.getResto_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new RestaurantPanel());
				new RestaurantCore(CRUDAction.Edit);
			}
		});
		
		//DELETE RESTAURANT BTN
		Admin_main_menu_Panel.getResto_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new RestaurantPanel());
				new RestaurantCore(CRUDAction.Delete);
			}
		});
		
		//ADD Menu BTN
		Admin_main_menu_Panel.getMenu_Add_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				MainFrame.changePanel(new MenuPanel(CRUDAction.Create));
				new MenuCore(CRUDAction.Create);
				
			}
		});
		
		//Edit Menu BTN
		Admin_main_menu_Panel.getMenu_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				MainFrame.changePanel(new MenuPanel(CRUDAction.Edit));
				new MenuCore(CRUDAction.Edit);

				
			}
		});
		
		//DELETE Menu BTN
		Admin_main_menu_Panel.getMenu_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				MainFrame.changePanel(new MenuPanel(CRUDAction.Delete));
				new MenuCore(CRUDAction.Delete);

				
			}
		});
		
		//Add Delivery man BTN
		Admin_main_menu_Panel. getDelivery_Add_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new DeliveryPanel());
				new DeliveryCore(CRUDAction.Create);
			}
		});
		
		//Edit Delivery man BTN
		Admin_main_menu_Panel. getDelivery_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new DeliveryPanel());
				new DeliveryCore(CRUDAction.Edit);
				
			}
		});
		
		//Delete Delivery man BTN
		Admin_main_menu_Panel.getDelivery_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new DeliveryPanel());
				new DeliveryCore(CRUDAction.Delete);
			}
		});
		
		
		//Log Out BTN
		Admin_main_menu_Panel.getLog_Out_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new LoginPanel());
				
			}
		});
		
	}

}


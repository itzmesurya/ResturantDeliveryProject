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
				new MainFrame();
				MainFrame.changePanel(new RestaurantPanel("add"));
				
			}
		});
		
		//EDIT RESTAURANT BTN
		Admin_main_menu_Panel.getResto_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new RestaurantPanel("edit"));
				
			}
		});
		
		//DELETE RESTAURANT BTN
		Admin_main_menu_Panel.getResto_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new RestaurantPanel("delete"));
				
			}
		});
		
		//ADD Menu BTN
		Admin_main_menu_Panel.getMenu_Add_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new MenuPanel(CRUDAction.Create));
				
			}
		});
		
		//Edit Menu BTN
		Admin_main_menu_Panel.getMenu_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new MenuPanel(CRUDAction.Edit));
				
			}
		});
		
		//DELETE Menu BTN
		Admin_main_menu_Panel.getMenu_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new MenuPanel(CRUDAction.Delete));
				
			}
		});
		
		//Add Delivery man BTN
		Admin_main_menu_Panel. getDelivery_Add_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new DeliveryPanel("create"));
				
			}
		});
		
		//Edit Delivery man BTN
		Admin_main_menu_Panel. getDelivery_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new DeliveryPanel("edit"));
				
			}
		});
		
		//Delete Delivery man BTN
		Admin_main_menu_Panel.getDelivery_Del_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new DeliveryPanel("delete"));
				
			}
		});
		
		//View Order BTN
		Admin_main_menu_Panel. getDelivery_Order_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new OrderPanel());
				
			}
		});
		
		//Log Out BTN
		Admin_main_menu_Panel.getLog_Out_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new LoginPanel());
				
			}
		});
		
	}

}

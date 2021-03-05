package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.OrderPanel;
import com.restaurantdeliveryviews.RestaurantPanel;
import com.restaurantdeliveryviews.Restaurateur_main_menu_Panel;

public class Restaurateur_main_menu_Core {
	
	public Restaurateur_main_menu_Core(){
		
		//Accept Order BTN 
		Restaurateur_main_menu_Panel.getOrder_Accept_Btn().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				MainFrame.changePanel(new OrderPanel());
				new OrderCore(CRUDAction.Accept);
			}
		});
		
		//Mark Order Ready BTN 
		Restaurateur_main_menu_Panel.getOrder_Ready_Btn().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				MainFrame.changePanel(new OrderPanel());
				new OrderCore(CRUDAction.Ready);
			}
		});
		
		//Log Out BTN
		Restaurateur_main_menu_Panel.getlog_Out_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				MainFrame.changePanel(new LoginPanel());
				
			}
		});
	
		
	}

}

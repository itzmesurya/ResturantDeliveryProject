package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryMan_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryPanel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.OrderPanel;

public class DeliveryMan_main_menu_Core {

	public DeliveryMan_main_menu_Core() {
		
		//Accept Delivery BTN
		DeliveryMan_main_menu_Panel. getDelivery_Accept_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new Accept_Done__Delivery_Panel());
				
			}
		});
		
		//Done delivery BTN
		DeliveryMan_main_menu_Panel. getDelivery_End_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new Accept_Done__Delivery_Panel());
						
			}
		});
		
		//Edit Delivery man BTN
		DeliveryMan_main_menu_Panel.getDelivery_Editinfo_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new DeliveryPanel("edit"));
				
			}
		});
		
		//Log Out BTN
		DeliveryMan_main_menu_Panel.getLog_Out_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				MainFrame.changePanel(new LoginPanel());
				
			}
		});
	}
}
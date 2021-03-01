package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.OrderHistoryPanel;
import com.restaurantdeliveryviews.Order_Food_Panel;

public class Client_main_menu_Core {
	
	public Client_main_menu_Core() {
		
		//Place order BTN
		Client_main_menu_Panel.getPlace_Order_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				MainFrame.changePanel(new Order_Food_Panel());
				new Order_Food_Core();
			}
		});
		
		//Order History BTN
		Client_main_menu_Panel.getView_History_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainFrame.changePanel(new OrderHistoryPanel());
				new OrderHistoryCore();
			}
		});
		
		//Edit Account BTN
		Client_main_menu_Panel.getAccount_Edit_Btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				MainFrame.changePanel(new AccountPanel(CRUDAction.Edit));
				new AccountCore(CRUDAction.Edit);
				
			}
		});
		
		//Log Out BTN
		Client_main_menu_Panel.getlog_out_btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainFrame.changePanel(new LoginPanel());
				
			}
		});
		
	}
	
}

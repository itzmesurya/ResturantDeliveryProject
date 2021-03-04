package com.restaurantdeliverycontrollers;



import com.restaurantdeliverymodels.CRUDAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;



import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.User;

import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.Admin_main_menu_Panel;
import com.restaurantdeliveryviews.Client_main_menu_Panel;
import com.restaurantdeliveryviews.CustomMenuBar;
import com.restaurantdeliveryviews.DeliveryMan_main_menu_Panel;
import com.restaurantdeliveryviews.DeliveryPanel;

import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.Manager_main_menu_Panel;
import com.restaurantdeliveryviews.MenuPanel;
import com.restaurantdeliveryviews.OrderHistoryPanel;
import com.restaurantdeliveryviews.OrderPanel;
import com.restaurantdeliveryviews.Order_Food_Panel;
import com.restaurantdeliveryviews.RestaurantPanel;
import com.restaurantdeliveryviews.Restaurateur_main_menu_Panel;

public class Main {

	public static User user;

	public static void main(String[] args) throws ParseException {
		new Database();
		new MainFrame();

		
		//Set Top Bar
		CustomMenuBar.getCreate_account().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MainFrame.changePanel(new AccountPanel(CRUDAction.Create));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				new AccountCore(CRUDAction.Create);
			}
			
		});
		CustomMenuBar.getEdit_account().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MainFrame.changePanel(new AccountPanel(CRUDAction.Edit));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				new AccountCore(CRUDAction.Edit);
			}
			
		});
		CustomMenuBar.getDelete_account().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MainFrame.changePanel(new AccountPanel(CRUDAction.Delete));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				new AccountCore(CRUDAction.Delete);
			}
			
		});
		CustomMenuBar.getLog_out().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = null;
				MainFrame.getMenuBar().setVisible(false);
				MainFrame.changePanel(new LoginPanel());
				new LoginCore();
			}
			
		});
		CustomMenuBar.getExit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Functions.displayMessage("Thank you for using our delivery app!");
				System.exit(0);
			}
			
		});
		CustomMenuBar.getCreate_menu().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new MenuPanel(CRUDAction.Create));
				new MenuCore(CRUDAction.Create);
			}
			
		});
		CustomMenuBar.getEdit_menu().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new MenuPanel(CRUDAction.Edit));
				new MenuCore(CRUDAction.Edit);
			}
			
		});
		CustomMenuBar.getDelete_menu().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new MenuPanel(CRUDAction.Delete));
				new MenuCore(CRUDAction.Delete);
			}
			
		});
		CustomMenuBar.getView_order().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new OrderPanel());
				new OrderCore(CRUDAction.Read);
			}
			
		});
		CustomMenuBar.getAccept_order().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new OrderPanel());
				new OrderCore(CRUDAction.Accept);
			}
			
		});
		CustomMenuBar.getEnd_order().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new OrderPanel());
				new OrderCore(CRUDAction.Ready);
			}
			
		});
		CustomMenuBar.getOrder_food().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new Order_Food_Panel());
				new Order_Food_Core();
			}
			
		});
		CustomMenuBar.getOrder_history().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new OrderHistoryPanel());
				new OrderHistoryCore();
			}
			
		});
		CustomMenuBar.getCreate_resto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new RestaurantPanel());
				new RestaurantCore(CRUDAction.Create);
			}
			
		});
		CustomMenuBar.getEdit_resto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new RestaurantPanel());
				new RestaurantCore(CRUDAction.Edit);
			}
			
		});
		CustomMenuBar.getDelete_resto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new RestaurantPanel());
				new RestaurantCore(CRUDAction.Delete);
			}
			
		});
		CustomMenuBar.getView_deliveries().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new Accept_Done__Delivery_Panel(CRUDAction.Read));
				new Accept_Done_Delivery_Core(CRUDAction.Read);
				MainFrame.changePanel(new Accept_Done__Delivery_Panel(CRUDAction.Accept));
				new Accept_Done_Delivery_Core(CRUDAction.Accept);
			}
			
		});
		CustomMenuBar.getAccept_deliveries().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new Accept_Done__Delivery_Panel(CRUDAction.Accept));
				new Accept_Done_Delivery_Core(CRUDAction.Accept);
			}
			
		});
		CustomMenuBar.getEnd_deliveries().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new Accept_Done__Delivery_Panel(CRUDAction.Ready));
				new Accept_Done_Delivery_Core(CRUDAction.Ready);
			}
			
		});
		CustomMenuBar.getCreate_deliveryman().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new DeliveryPanel());
				new DeliveryCore(CRUDAction.Create);
			}
			
		});
		CustomMenuBar.getEdit_deliveryman().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new DeliveryPanel());
				new DeliveryCore(CRUDAction.Edit);
			}
			
		});
		CustomMenuBar.getDelete_deliveryman().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.changePanel(new DeliveryPanel());
				new DeliveryCore(CRUDAction.Delete);
			}
			
		});



		
		//Change to Login
		MainFrame.changePanel(new LoginPanel());
		new LoginCore();
		LoginPanel.getUsernameTF().setText("Johndoeadmin");
		LoginPanel.getPasswordTF().setText("Admin123");

		
	}

}
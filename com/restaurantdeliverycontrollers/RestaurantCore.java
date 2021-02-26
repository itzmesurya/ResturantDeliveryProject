package com.restaurantdeliverycontrollers;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.restaurantdeliverymodels.Admin;
import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Restaurant;
import com.restaurantdeliverymodels.Restaurateur;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.RestaurantPanel;

public class RestaurantCore {
	
	public RestaurantCore(CRUDAction crudAction) {
		
		switch (crudAction) {
		case Create:
			RestaurantPanel.getLbl_1().setText("Add Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Add");
			RestaurantPanel.getLbl_2().setVisible(false);
			RestaurantPanel.getRestaurantnameCB().setVisible(false);
			break;
		case Edit:
			RestaurantPanel.getLbl_1().setText("Edit Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Edit");
			RestaurantPanel.getLbl_2().setVisible(true);
			RestaurantPanel.getRestaurantnameCB().setVisible(true);
			break;
		case Delete:
			RestaurantPanel.getLbl_1().setText("Delete Restaurant");
			RestaurantPanel.getBtnRestaurant().setText("Delete");
			RestaurantPanel.getLbl_2().setVisible(true);
			RestaurantPanel.getRestaurantnameCB().setVisible(true);
			break;
		default:
		    break;
		}
	}
		
	void setPanelEnabled(JPanel panel, Boolean isEnabled) {
		   panel.setEnabled(isEnabled);

		   Component[] components = panel.getComponents();

		   for (Component component : components) {
		       if (component instanceof JPanel) {
		           setPanelEnabled((JPanel) component, isEnabled);
		       }
		       component.setEnabled(isEnabled);
		   }		
	   
		
		RestaurantPanel.getRestaurantnameCB().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Restaurant> restaurants = Database.getRestaurants();
				for (Restaurant restaurant : restaurants) {
					if (restaurant.getName().equals(RestaurantPanel.getRestaurantnameCB().getToolTipText())) {
						Restaurant R1 = Database.getRestaurantById(restaurant.getId());
						RestaurantPanel.getTf_C11().setText(R1.getName());
						RestaurantPanel.getTf_C12().setText(R1.getAddress());
						RestaurantPanel.getFormattedTextField_1().setText(R1.getPhone());
						RestaurantPanel.getTextDA().setText(R1.getDelivery_areas().toString());
						String Sr1[][] = R1.getHours();
						RestaurantPanel.getCombo_C321().setToolTipText(Sr1[0][0]);
						RestaurantPanel.getCombo_C322().setToolTipText(Sr1[0][1]);
						RestaurantPanel.getCombo_C323().setToolTipText(Sr1[1][0]);
						RestaurantPanel.getCombo_C324().setToolTipText(Sr1[1][1]);
						RestaurantPanel.getCombo_C331().setToolTipText(Sr1[2][0]);
						RestaurantPanel.getCombo_C332().setToolTipText(Sr1[2][1]);
						RestaurantPanel.getCombo_C333().setToolTipText(Sr1[3][0]);
						RestaurantPanel.getCombo_C334().setToolTipText(Sr1[3][1]);
						RestaurantPanel.getCombo_C341().setToolTipText(Sr1[4][0]);
						RestaurantPanel.getCombo_C342().setToolTipText(Sr1[4][1]);
						RestaurantPanel.getCombo_C343().setToolTipText(Sr1[5][0]);
						RestaurantPanel.getCombo_C344().setToolTipText(Sr1[5][1]);
						RestaurantPanel.getCombo_C351().setToolTipText(Sr1[6][0]);
						RestaurantPanel.getCombo_C352().setToolTipText(Sr1[6][1]);
						RestaurantPanel.getCombo_C353().setToolTipText(Sr1[7][0]);
						RestaurantPanel.getCombo_C354().setToolTipText(Sr1[7][1]);
						RestaurantPanel.getCombo_C361().setToolTipText(Sr1[8][0]);
						RestaurantPanel.getCombo_C362().setToolTipText(Sr1[8][1]);
						RestaurantPanel.getCombo_C363().setToolTipText(Sr1[9][0]);
						RestaurantPanel.getCombo_C364().setToolTipText(Sr1[9][1]);
						RestaurantPanel.getCombo_C371().setToolTipText(Sr1[10][0]);
						RestaurantPanel.getCombo_C372().setToolTipText(Sr1[10][1]);
						RestaurantPanel.getCombo_C373().setToolTipText(Sr1[11][0]);
						RestaurantPanel.getCombo_C374().setToolTipText(Sr1[11][1]);
						RestaurantPanel.getCombo_C381().setToolTipText(Sr1[12][0]);
						RestaurantPanel.getCombo_C382().setToolTipText(Sr1[12][1]);
						RestaurantPanel.getCombo_C383().setToolTipText(Sr1[13][0]);
						RestaurantPanel.getCombo_C384().setToolTipText(Sr1[13][1]);
					}
				}
			}
		});

		
		String[] Sr3;
		Sr3 = RestaurantPanel.getTextDA().toString().split("\\s+");
		
		String[][] Sr2 = null;
		Sr2[0][0] = RestaurantPanel.getCombo_C321().getToolTipText();
		Sr2[0][1] = RestaurantPanel.getCombo_C322().getToolTipText();
		Sr2[1][0] = RestaurantPanel.getCombo_C323().getToolTipText();
		Sr2[1][1] = RestaurantPanel.getCombo_C324().getToolTipText();
		Sr2[2][0] = RestaurantPanel.getCombo_C331().getToolTipText();
		Sr2[2][1] = RestaurantPanel.getCombo_C332().getToolTipText();
		Sr2[3][0] = RestaurantPanel.getCombo_C333().getToolTipText();
		Sr2[3][1] = RestaurantPanel.getCombo_C334().getToolTipText();
		Sr2[4][0] = RestaurantPanel.getCombo_C341().getToolTipText();
		Sr2[4][1] = RestaurantPanel.getCombo_C342().getToolTipText();
		Sr2[5][0] = RestaurantPanel.getCombo_C343().getToolTipText();
		Sr2[5][1] = RestaurantPanel.getCombo_C344().getToolTipText();
		Sr2[6][0] = RestaurantPanel.getCombo_C351().getToolTipText();
		Sr2[6][1] = RestaurantPanel.getCombo_C352().getToolTipText();
		Sr2[7][0] = RestaurantPanel.getCombo_C353().getToolTipText();
		Sr2[7][1] = RestaurantPanel.getCombo_C354().getToolTipText();
		Sr2[8][0] = RestaurantPanel.getCombo_C361().getToolTipText();
		Sr2[8][1] = RestaurantPanel.getCombo_C362().getToolTipText();
		Sr2[9][0] = RestaurantPanel.getCombo_C363().getToolTipText();
		Sr2[9][1] = RestaurantPanel.getCombo_C364().getToolTipText();
		Sr2[10][0] = RestaurantPanel.getCombo_C371().getToolTipText();
		Sr2[10][1] = RestaurantPanel.getCombo_C372().getToolTipText();
		Sr2[11][0] = RestaurantPanel.getCombo_C373().getToolTipText();
		Sr2[11][1] = RestaurantPanel.getCombo_C374().getToolTipText();
		Sr2[12][0] = RestaurantPanel.getCombo_C381().getToolTipText();
		Sr2[12][1] = RestaurantPanel.getCombo_C382().getToolTipText();
		Sr2[13][0] = RestaurantPanel.getCombo_C383().getToolTipText();
		Sr2[13][1] = RestaurantPanel.getCombo_C384().getToolTipText();
		int manager_id;
		if (Main.user.getLevel() == 3) {
			manager_id = Main.user.getId();
		} else 
			manager_id = -1;
		
		Restaurant R2 = new Restaurant(RestaurantPanel.getTf_C11().getText(), RestaurantPanel.getTf_C12().getText(), RestaurantPanel.getFormattedTextField_1().getText(), Sr3, Sr2, manager_id, -1);
		

		RestaurantPanel.getBtnRestaurant().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (RestaurantPanel.getBtnRestaurant().getText() == "Add") {
//					Database.addRestaurant(R2);					
				}
				else if (RestaurantPanel.getBtnRestaurant().getText() == "Edit") {
					Database.saveRestaurants();
				}
				else if (RestaurantPanel.getBtnRestaurant().getText() == "Delete") {
					Database.deleteRestaurantById(R2.getId());
				} 
			}
			
		});
		
		RestaurantPanel.getBtnC39().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < 14; i++) {
					for (int j = 0; j < 2; j++)
						Sr2[i][j] = "00";
				}				
			}			
		});
		
		RestaurantPanel.getBtnC231().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantPanel.getTextDA().append(RestaurantPanel.getTf_C23().getText());
			}			
		});
		
		RestaurantPanel.getBtnC232().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantPanel.getTextDA().setText(RestaurantPanel.getTextDA().getText().replace(RestaurantPanel.getTextDA().getSelectedText(), ""));

			}			
		});
	
	}
}

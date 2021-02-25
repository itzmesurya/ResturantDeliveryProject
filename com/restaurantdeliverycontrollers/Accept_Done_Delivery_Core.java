package com.restaurantdeliverycontrollers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliveryviews.Accept_Done__Delivery_Panel;

public class Accept_Done_Delivery_Core {
	
	public Accept_Done_Delivery_Core() {
		
		// Delivery Accept Button
		Accept_Done__Delivery_Panel.getBtnAccept().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				//Store Data in DB of Delivery man delivers
				//delete from delivery Table
			}
		});
		
		// Delivery Delete Button
		Accept_Done__Delivery_Panel.getBtnDelete().addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				//delete Data in DB of Delivery man delivers
				
			}
		});
		
	}

}

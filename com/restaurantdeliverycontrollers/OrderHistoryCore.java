package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliveryviews.OrderHistoryPanel;

public class OrderHistoryCore {
	
	public OrderHistoryCore() {
		
		OrderHistoryPanel.getBtnSubmit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderHistoryPanel.getTextOH().append(OrderHistoryPanel.getTextOrder().getText());
			}			
		});

	}

}

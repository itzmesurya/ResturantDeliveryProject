package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.restaurantdeliverymodels.Client;
import com.restaurantdeliveryviews.OrderHistoryPanel;

public class OrderHistoryCore {
	
	public OrderHistoryCore() {
		
		final String newline = "\n";
		OrderHistoryPanel.getTextOH().append(((Client)Main.user).getOrdersCompleted() + newline);
		
		OrderHistoryPanel.getBtnSubmit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = OrderHistoryPanel.getTextOH().getSelectedText();
				OrderHistoryPanel.getTextOrder().append(text);
			}			
		});

	}

}

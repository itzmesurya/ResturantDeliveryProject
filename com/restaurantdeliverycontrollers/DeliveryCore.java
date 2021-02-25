package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;
import com.restaurantdeliverymodels.UserHelper;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.DeliveryPanel;

public class DeliveryCore {

	DeliveryPanel deliveryPanel;

	DeliveryCore(DeliveryPanel deliveryPanel) {
		this.deliveryPanel = deliveryPanel;
		BindActionEvents(this.deliveryPanel);

	}

	public void BindActionEvents(DeliveryPanel deliveryPanel2) {
		// TODO Auto-generated method stub

		deliveryPanel.Save_btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ArrayList<String> areas = new ArrayList<String>();
				for (int i = 0; i < deliveryPanel.getDarea_table().getRowCount(); i++) {
					areas.add((String) deliveryPanel.getDarea_table().getValueAt(i, 0));
				}

				Deliveryman deliveryman = new Deliveryman(deliveryPanel.getUser_Field().getText(),
						deliveryPanel.getPass_Field().getText(), deliveryPanel.getName_Field().getText(), "", "", "",
						deliveryPanel.getPhone_Field().getText(), areas.toArray(new String[0]));

				if (deliveryPanel.getUser_Field().getText().equals("") && deliveryPanel.getPass_Field().equals("")
						&& deliveryPanel.getName_Field().equals("") && deliveryPanel.getPhone_Field().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (!UserHelper.isUsernameAvailable(deliveryman)) {
					JOptionPane.showMessageDialog(null, "user name npt available", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					deliveryPanel.getUser_Field().setText("");
					deliveryPanel.getPass_Field().setText("");
					deliveryPanel.getName_Field().setText("");
					deliveryPanel.getPhone_Field().setText("");
					deliveryPanel.getConfirmPass_Field().setText("");
//			deliveryPanel.getDarea_table().setRowCount("","");
					Database.addDeliveryman(deliveryman);
					Database.saveDeliverymen();

				}

			}
		});

	}
//	usernamelist.getSelectedItem()
}

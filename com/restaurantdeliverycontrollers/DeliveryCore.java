package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;
import com.restaurantdeliverymodels.UserHelper;
import com.restaurantdeliveryviews.DeliveryPanel;

public class DeliveryCore {
	Deliveryman deliveryman;

	DeliveryCore(CRUDAction action) {

		switch (action) {

		case Create:
			DeliveryPanel.getLblNewLabel().setText("Create Deliveryman");
			DeliveryPanel.getSave_btn().setText("Create Deliveryman");
			DeliveryPanel.getSelectR_comboBox().setEnabled(false);
			break;
		case Edit:
			DeliveryPanel.getLblNewLabel().setText("Edit Deliveryman");
			DeliveryPanel.getSave_btn().setText("Save");
			DeliveryPanel.getSelectR_comboBox().setEnabled(true);

			DeliveryPanel.getUser_Field().setEnabled(false);
			DeliveryPanel.getVerify_btn().setEnabled(false);
			break;
		case Delete:
			DeliveryPanel.getLblNewLabel().setText("Delete Deliveryman");
			DeliveryPanel.getSave_btn().setText("Delete");
//			 selectR_comboBox.setEnabled(false);

			DeliveryPanel.getName_Field().setEnabled(false);
			DeliveryPanel.getPhone_Field().setEnabled(false);
			DeliveryPanel.getUser_Field().setEnabled(false);
			DeliveryPanel.getPass_Field().setEnabled(false);
			DeliveryPanel.getConfirmPass_Field().setEnabled(false);
			DeliveryPanel.getDarea_Field().setEnabled(false);
			DeliveryPanel.getDarea_table().setEnabled(false);

			DeliveryPanel.getVerify_btn().setEnabled(false);
			break;
		}

		// TODO Auto-generated method stub
		ArrayList<Deliveryman> deliverymans = Database.getDeliverymen();
		ArrayList<String> deliverymenIds = new ArrayList<String>();
		for (Deliveryman deliveryman1 : deliverymans) {
			deliverymenIds.add(deliveryman1.getUsername() + "");
		}
		String[] deliverymenIdArray = deliverymenIds.toArray(new String[deliverymenIds.size() - 1]);

		for (int i = 0; i < deliverymenIdArray.length; i++) {
			DeliveryPanel.getSelectR_comboBox().addItem(deliverymenIdArray[i]);
		}

		DeliveryPanel.getSelectR_comboBox().addActionListener(new ActionListener() {// add actionlistner to listen for
																					// change
			@Override
			public void actionPerformed(ActionEvent e) {

				deliveryman = Database
						.getDeliverymanByUserName((String) DeliveryPanel.getSelectR_comboBox().getSelectedItem());

				DeliveryPanel.getName_Field().setText(deliveryman.getFirst_name() + " " + deliveryman.getLast_name());
				DeliveryPanel.getPhone_Field().setText(deliveryman.getPhone());
				DeliveryPanel.getUser_Field().setText(deliveryman.getUsername());
				DeliveryPanel.getPass_Field().setText(deliveryman.getPassword());
				DeliveryPanel.getConfirmPass_Field().setText(deliveryman.getPassword());
				DeliveryPanel.getDarea_table().getModel();

				DefaultTableModel model1 = (DefaultTableModel) DeliveryPanel.getDarea_table().getModel();
				model1.setRowCount(0);
				for (int i = 0; i <= deliveryman.getDelivery_areas().size() - 1; i++) {
					Object[] row = { deliveryman.getDelivery_areas().get(i) };

					DefaultTableModel model = (DefaultTableModel) DeliveryPanel.getDarea_table().getModel();
					model.addRow(row);
				}

			}
		});

		DeliveryPanel.getVerify_btn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ArrayList<String> areas = new ArrayList<String>();
				for (int i = 0; i < DeliveryPanel.getDarea_table().getRowCount(); i++) {
					areas.add((String) DeliveryPanel.getDarea_table().getValueAt(i, 0));
				}

				Deliveryman deliveryman = new Deliveryman(DeliveryPanel.getUser_Field().getText(),
						DeliveryPanel.getPass_Field().getText(), DeliveryPanel.getName_Field().getText(), "", "", "",
						DeliveryPanel.getPhone_Field().getText(), areas.toArray(new String[0]));

				if (DeliveryPanel.getUser_Field().getText().equals("") && DeliveryPanel.getPass_Field().equals("")
						&& DeliveryPanel.getName_Field().equals("") && DeliveryPanel.getPhone_Field().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (UserHelper.isUsernameAvailable(deliveryman)) {
						JOptionPane.showMessageDialog(null, "Username is available", "Info",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Username not available", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}

			}
		});

		DeliveryPanel.getSave_btn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ArrayList<String> areas = new ArrayList<String>();
				for (int i = 0; i < DeliveryPanel.getDarea_table().getRowCount(); i++) {
					areas.add((String) DeliveryPanel.getDarea_table().getValueAt(i, 0));
				}

				Deliveryman deliveryman = new Deliveryman(DeliveryPanel.getUser_Field().getText(),
						DeliveryPanel.getPass_Field().getText(), DeliveryPanel.getName_Field().getText(), "", "", "",
						DeliveryPanel.getPhone_Field().getText(), areas.toArray(new String[0]));

				if (DeliveryPanel.getUser_Field().getText().equals("") && DeliveryPanel.getPass_Field().equals("")
						&& DeliveryPanel.getName_Field().equals("") && DeliveryPanel.getPhone_Field().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (action == CRUDAction.Create && !UserHelper.isUsernameAvailable(deliveryman)) {
						JOptionPane.showMessageDialog(null, "user name npt available", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						DeliveryPanel.getUser_Field().setText("");
						DeliveryPanel.getPass_Field().setText("");
						DeliveryPanel.getName_Field().setText("");
						DeliveryPanel.getPhone_Field().setText("");
						DeliveryPanel.getConfirmPass_Field().setText("");

						DefaultTableModel model = (DefaultTableModel) DeliveryPanel.getDarea_table().getModel();
						model.setRowCount(0);

						if (action == CRUDAction.Create) {
							Database.addDeliveryman(deliveryman);
						} else if (action == CRUDAction.Edit) {
//									int index = -1;
//									ArrayList<Deliveryman> deliverymen = Database.getDeliverymen();
//									for (int i = 0; i < deliverymen.size(); i++) {
//										if (deliverymen.get(i).getId() == deliveryman.getId()) {
//											index = i;
//										}
//									}
//									if (index != -1) {

//										Deliveryman deliveryman1 = Database.getDeliverymen().get(index);
//									Deliveryman deliveryman1 = Database.getDeliverymanByUserName(userName)
							deliveryman.setFirst_name(deliveryman.getFirst_name());
							deliveryman.setLast_name(deliveryman.getLast_name());
							deliveryman.setPassword(deliveryman.getPassword());
							deliveryman.setEmail(deliveryman.getEmail());
							deliveryman.setPhone(deliveryman.getPhone());
							deliveryman.setAddress(deliveryman.getAddress());
//										Database.saveDeliverymen();
							deliveryman.edit();
//									}

						} else if (action == CRUDAction.Delete) {
							Database.deleteDeliverymanById(deliveryman.getId());
//									Database.deleteDeliverymanById(this.getId(deliveryman));
							// delete
						}
						Database.saveDeliverymen();

					}
				}

			}
		});

		DeliveryPanel.getAdd_btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (DeliveryPanel.getDarea_Field().getText().equals("")) {
					System.out.println("Empty textfield");
					JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					Object[] row = { DeliveryPanel.getDarea_Field().getText() };
					DefaultTableModel model = (DefaultTableModel) DeliveryPanel.getDarea_table().getModel();
					model.addRow(row);
					DeliveryPanel.getDarea_Field().setText("");
				}
			}
		});

	}

}

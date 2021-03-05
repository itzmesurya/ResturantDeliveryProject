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
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.UserHelper;
import com.restaurantdeliveryviews.DeliveryPanel;
import com.restaurantdeliveryviews.MenuPanel;
import com.restaurantdeliveryviews.RestaurantPanel;

public class DeliveryCore {
	int dialogButton = JOptionPane.YES_NO_OPTION;
	Deliveryman deliveryman;

	DeliveryCore(CRUDAction action) {

		switch (action) {

		case Create:
			DeliveryPanel.getLblNewLabel().setText("Create Deliveryman");
			DeliveryPanel.getSave_btn().setText("Create Deliveryman");
			DeliveryPanel.getLblNewLabel_2().setVisible(false);
			DeliveryPanel.getSelectR_comboBox().setVisible(false);
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
//			selectR_comboBox.setEnabled(false);

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

				DeliveryPanel.getName_Field().setText(deliveryman.getFirst_name());
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
				if (DeliveryPanel.getLblNewLabel().getText().contains("Create")) {

					ArrayList<String> areas = new ArrayList<String>();
					for (int i = 0; i < DeliveryPanel.getDarea_table().getRowCount(); i++) {
						areas.add((String) DeliveryPanel.getDarea_table().getValueAt(i, 0));
					}

					Deliveryman deliveryman = new Deliveryman(DeliveryPanel.getUser_Field().getText(),
							DeliveryPanel.getPass_Field().getText(), DeliveryPanel.getName_Field().getText(), "", "",
							"", DeliveryPanel.getPhone_Field().getText(), areas.toArray(new String[0]));

//						
//						deliveryman.setFirst_name( DeliveryPanel.getName_Field().getText());
//						deliveryman.setPhone(DeliveryPanel.getPhone_Field().getText());
//						deliveryman.setPassword(DeliveryPanel.getPass_Field().getText());
//						deliveryman.setDelivery_areas(areas);

					if (DeliveryPanel.getUser_Field().getText().equals("") && DeliveryPanel.getPass_Field().equals("")
							&& DeliveryPanel.getName_Field().equals("") && DeliveryPanel.getPhone_Field().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
								JOptionPane.INFORMATION_MESSAGE);

					} else if (DeliveryPanel.getPhone_Field().getText().length() < 14) {
						JOptionPane.showMessageDialog(null, "Please enter a complete phone number", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (!DeliveryPanel.getConfirmPass_Field().getText()
							.equals(DeliveryPanel.getPass_Field().getText())) {
						JOptionPane.showMessageDialog(null, "Confirm password is not the same as password", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					}

					else {
						if (action == CRUDAction.Create && !UserHelper.isUsernameAvailable(deliveryman)) {
							JOptionPane.showMessageDialog(null, "user name not available", "Error",
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
								int index = -1;
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

				} else if (DeliveryPanel.getLblNewLabel().getText().contains("Edit")
						|| DeliveryPanel.getLblNewLabel().getText().contains("Delete")) {
					ArrayList<String> areas = new ArrayList<String>();
					for (int i = 0; i < DeliveryPanel.getDarea_table().getRowCount(); i++) {
						areas.add(((String) DeliveryPanel.getDarea_table().getValueAt(i, 0)).toUpperCase());
					}

//						
//						Deliveryman deliveryman = new Deliveryman(DeliveryPanel.getUser_Field().getText(),
//								DeliveryPanel.getPass_Field().getText(), DeliveryPanel.getName_Field().getText(), "", "", "",
//								DeliveryPanel.getPhone_Field().getText(), areas.toArray(new String[0]));
//						

					deliveryman.setFirst_name(DeliveryPanel.getName_Field().getText());
					deliveryman.setPhone(DeliveryPanel.getPhone_Field().getText());
					deliveryman.setPassword(DeliveryPanel.getPass_Field().getText());
					deliveryman.setDelivery_areas(areas);

					if (DeliveryPanel.getUser_Field().getText().equals("") && DeliveryPanel.getPass_Field().equals("")
							&& DeliveryPanel.getName_Field().equals("") && DeliveryPanel.getPhone_Field().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
								JOptionPane.INFORMATION_MESSAGE);

					} else if (DeliveryPanel.getPhone_Field().getText().length() < 14) {
						JOptionPane.showMessageDialog(null, "Please enter a complete phone number", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (!DeliveryPanel.getConfirmPass_Field().getText()
							.equals(DeliveryPanel.getPass_Field().getText())) {
						JOptionPane.showMessageDialog(null, "Confirm password is not the same as password", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					}

					else {
						if (action == CRUDAction.Create && !UserHelper.isUsernameAvailable(deliveryman)) {
							JOptionPane.showMessageDialog(null, "user name not available", "Error",
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
								Functions.displayMessage("Deliveryman added!");
								Database.saveDeliverymen();
							} else if (action == CRUDAction.Edit) {
								int index = -1;
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
								int i = DeliveryPanel.getSelectR_comboBox().getSelectedIndex();
								DeliveryPanel.getSelectR_comboBox().removeAll();
								DeliveryPanel.getSelectR_comboBox().setSelectedIndex(0);

								// delete
							}
							Database.saveDeliverymen();

						}
					}
				}
			}
		});

		DeliveryPanel.getAdd_btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (DeliveryPanel.getDarea_Field().getText().equals("")) {
//							System.out.println("Empty textfield");
					JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
							JOptionPane.INFORMATION_MESSAGE);

				} else if (DeliveryPanel.getDarea_Field().getText().length() != 3) {
					Functions.displayMessage("Delivery area must be 3 characters long");

				}

				else if (!String.valueOf(DeliveryPanel.getDarea_Field().getText().charAt(0)).matches("[A-Za-z]")
						|| !String.valueOf(DeliveryPanel.getDarea_Field().getText().charAt(2)).matches("[A-Za-z]")
						|| !Functions.isNumeric(String.valueOf(DeliveryPanel.getDarea_Field().getText().charAt(1)))) {
						Functions.displayMessage("Delivery area must be a letter followed by a number followed by a letter");
					return;
				}

				else {
					Object[] row = { DeliveryPanel.getDarea_Field().getText().toUpperCase() };
					DefaultTableModel model = (DefaultTableModel) DeliveryPanel.getDarea_table().getModel();
					model.addRow(row);
					DeliveryPanel.getDarea_Field().setText("");
				}

			}
		});

		DeliveryPanel.getDelete_btn().addActionListener(e -> {
			int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete this item", "Warning",
					dialogButton);
			if (dialogResult == JOptionPane.YES_OPTION) {
				deleteEntryFromTable();
				Functions.displayMessage("item removed successfully");

			}
		});

	}

	private void deleteEntryFromTable() {
		if (DeliveryPanel.getDarea_table().getSelectedRow() != -1) {
			// remove selected row from the model
			((DefaultTableModel) DeliveryPanel.getDarea_table().getModel())
					.removeRow(DeliveryPanel.getDarea_table().getSelectedRow());
			Functions.displayMessage("Selected row deleted successfully");
		}
	}

}
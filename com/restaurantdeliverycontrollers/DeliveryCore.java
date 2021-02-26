package com.restaurantdeliverycontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;
import com.restaurantdeliverymodels.UserHelper;
import com.restaurantdeliveryviews.DeliveryPanel;

public class DeliveryCore {

	DeliveryPanel deliveryPanel;
	private String action;

	DeliveryCore(DeliveryPanel deliveryPanel, String action) {
		
//		System.out.println("Soccess");
		
		
//		switch(action){
//	
//		case "add":
//			System.out.println("Soccess2");
//			
//			
//			
//			break;
//		}
		this.deliveryPanel = deliveryPanel;
		this.action = action;
		BindActionEvents(this.deliveryPanel);
		AdaptToAction();
	}

	
	@SuppressWarnings("unchecked")
	public void BindActionEvents(DeliveryPanel deliveryPanel2) {
		
		// TODO Auto-generated method stub
		ArrayList<Deliveryman>deliverymans = Database.getDeliverymen();
		ArrayList<String> deliverymenIds = new ArrayList<String>();
		for (Deliveryman deliveryman1 : deliverymans) {
			deliverymenIds.add(deliveryman1.getUsername() + "");
		}
		String[] deliverymenIdArray = deliverymenIds.toArray(new String[deliverymenIds.size()-1]);
		
	
		for (int i = 0; i < deliverymenIdArray.length; i ++) {
			deliveryPanel.getSelectR_comboBox().addItem(deliverymenIdArray[i]);
		}
//		try {
			
		DeliveryPanel.getSelectR_comboBox().addActionListener(new ActionListener() {//add actionlistner to listen for change
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 
	        	Deliveryman deliveryman = Database.getDeliverymanByUserName((String) deliveryPanel.getSelectR_comboBox().getSelectedItem());

				deliveryPanel.getName_Field().setText(deliveryman.getFirst_name()+ " " + deliveryman.getLast_name());
				deliveryPanel.getPhone_Field().setText(deliveryman.getPhone());
	        	deliveryPanel.getUser_Field().setText(deliveryman.getUsername());
				deliveryPanel.getPass_Field().setText(deliveryman.getPassword());
				deliveryPanel.getConfirmPass_Field().setText(deliveryman.getPassword());
	        	
	         }
		 });
//		} catch (NullPointerException e) {
//			System.out.println("Bonchod error");
//		}
		

		deliveryPanel.getVerify_btn().addActionListener(new ActionListener() {

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
		
		deliveryPanel.getSave_btn().addActionListener(new ActionListener() {

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
				} else {
					if (DeliveryCore.this.action == "create" && !UserHelper.isUsernameAvailable(deliveryman)) {
						JOptionPane.showMessageDialog(null, "user name npt available", "Error",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						deliveryPanel.getUser_Field().setText("");
						deliveryPanel.getPass_Field().setText("");
						deliveryPanel.getName_Field().setText("");
						deliveryPanel.getPhone_Field().setText("");
						deliveryPanel.getConfirmPass_Field().setText("");
	//			deliveryPanel.getDarea_table().setRowCount("","");
						
						if (DeliveryCore.this.action == "create") {
							Database.addDeliveryman(deliveryman);
						} else if (DeliveryCore.this.action == "edit") {
							// edit
						} else if (DeliveryCore.this.action == "delete") {
							// delete
						}
						Database.saveDeliverymen();
	
					}
				}

			}
		});
		

		deliveryPanel.getAdd_btn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (deliveryPanel.getDarea_Field().getText().equals("")) {
					System.out.println("Empty textfield");
					JOptionPane.showMessageDialog(null, "Please fill all the information", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					Object[] row = { deliveryPanel.getDarea_Field().getText() };
					DefaultTableModel model = (DefaultTableModel) deliveryPanel.getDarea_table().getModel();
					model.addRow(row);
					deliveryPanel.getDarea_Field().setText("");
				}
			}
		});

	}
//	usernamelist.getSelectedItem()
	
	 private void AdaptToAction() {
		 
		 switch(this.action) {
		 
			 case "create":
				 deliveryPanel.getLblNewLabel().setText("Create Deliveryman");
				 deliveryPanel.getSave_btn().setText("Create Deliveryman");
				 deliveryPanel.getSelectR_comboBox().setEnabled(false);
				 break;
				 
			 case "edit":
				 deliveryPanel.getLblNewLabel().setText("Edit Deliveryman");
				 deliveryPanel.getSave_btn().setText("Save");
				 deliveryPanel.getSelectR_comboBox().setEnabled(true);

				 deliveryPanel.getUser_Field().setEnabled(false);
				 deliveryPanel.getVerify_btn().setEnabled(false);
				 break;
				 
			 case "delete":
				 deliveryPanel.getLblNewLabel().setText("Delete Deliveryman");
				 deliveryPanel.getSave_btn().setText("Delete");
	//			 selectR_comboBox.setEnabled(false);
				 
				 deliveryPanel.getName_Field().setEnabled(false);
				 deliveryPanel.getPhone_Field().setEnabled(false);
				 deliveryPanel.getUser_Field().setEnabled(false);
				 deliveryPanel.getPass_Field().setEnabled(false);
				 deliveryPanel.getConfirmPass_Field().setEnabled(false);
				 deliveryPanel.getDarea_Field().setEnabled(false);
				 deliveryPanel.getDarea_table().setEnabled(false);
				 
				 deliveryPanel.getVerify_btn().setEnabled(false);
				 break;
				
			 default:
				 break;
		 }
		 
	 }
}

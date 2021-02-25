package com.restaurantdeliverycontrollers;

import java.awt.Color;

import javax.swing.JOptionPane;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliverymodels.UserHelper;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.UIHelper;

public class AccountCore {

	AccountCore() {
		BindActionEvents();
	}

	private void BindActionEvents() {
		AccountPanel.getCreateAccountBtn().addActionListener(e -> {
			// Create user object
			User user = CreateUserObject();
			if (isAccountScreenValid()) {
				// call the database call to add the user
				
			}
		});

		AccountPanel.getUserAvailabilityBtn().addActionListener(e ->{
			User user = CreateUserObject();
			if (!UserHelper.isUsernameAvailable(user)) {
				//TODO display the message saying user-name is unavailable
			}
		});
		
	}
	
	private boolean isAccountScreenValid() {
		boolean result = true;
		result = UIHelper.ValidateEmptyFields(MainFrame.getMainPanel());
		//now that we have verified all none of the fields are empty
		//we can proceed with other validations
		if (result) {
			//confirm password matches the original password
			result = ConfirmPasswordsMatch();
		}
		return result;
	}

	private boolean ConfirmPasswordsMatch() {
		boolean result = AccountPanel.getPasswordTextField().getText().equals(AccountPanel.getConfirmPwdTextField().getText());
		if (!result) {
			//highlight the fields
			UIHelper.SetBorderColorToComponent(AccountPanel.getPasswordTextField(), Color.RED);
			UIHelper.SetBorderColorToComponent(AccountPanel.getConfirmPwdTextField(), Color.RED);
			//create a modal pop-up to show the validation message
			JOptionPane.showMessageDialog(null, "Password and confirm password fields must match");
		}
		return result;
	}

	private User CreateUserObject() {
		String userName = AccountPanel.getUserNameTextField().getText();
		String password = AccountPanel.getPasswordTextField().getText();
		String firstName = AccountPanel.getFirstNameTextField().getText();
		String lastName = AccountPanel.getLastNameTextField().getText();
		String address = AccountPanel.getAddressTextField().getText();
		String email = AccountPanel.getEmailTextfield().getText();
		String phone = AccountPanel.getPhoneTextField().getText();
		int levelTobeAdded = AccountPanel.getSelectLevelDropDown().getSelectedIndex();
		return UserHelper.userFactory(levelTobeAdded, userName, password, firstName, lastName, address, email,
				phone);
	}

}

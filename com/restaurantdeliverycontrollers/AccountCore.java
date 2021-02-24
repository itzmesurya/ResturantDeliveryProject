package com.restaurantdeliverycontrollers;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.border.LineBorder;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliverymodels.UserHelper;
import com.restaurantdeliveryviews.AccountPanel;

public class AccountCore {
	AccountPanel accountPanel;

	AccountCore(AccountPanel accountPanel) {
		this.accountPanel = accountPanel;
		BindActionEvents(this.accountPanel);
	}

	private void BindActionEvents(AccountPanel accountPanel) {
		accountPanel.getCreateAccountBtn().addActionListener(e -> {
			// Create user object
			User user = CreateUserObject(accountPanel);
			if (ValidateFieldValuesAreNotEmpty(accountPanel) && UserHelper.isUsernameAvailable(user)) {
				// call the database call to add the user
				Database.addUser(user);
			}
		});
	}

	private boolean ValidateFieldValuesAreNotEmpty(AccountPanel accountPanel) {
		// lets assume fields are not empty
		boolean fieldsCheck = true;
		// go through each component in the panel and
		// highlight the ones that are not filled
		Component[] components = accountPanel.getComponents();
		for (Component field : components) {
			if (field instanceof JComboBox) {
				// do something
			} else if (field instanceof JButton) {
				// do something
			} else if (field instanceof JTextField) {
				// do something
				JTextField textFieldInContext = (JTextField) field;
				if (textFieldInContext.getText().isEmpty()) {
					textFieldInContext.setBorder(new LineBorder(Color.RED, 2));
					fieldsCheck = false;
				}

			}
		}
		return fieldsCheck;
	}

	private User CreateUserObject(AccountPanel accountPanel) {
		String userName = accountPanel.getUserNameTextField().getText();
		String password = accountPanel.getPasswordTextField().getText();
		String confirmPassword = accountPanel.getConfirmPwdTextField().getText();
		String firstName = accountPanel.getFirstNameTextField().getText();
		String lastName = accountPanel.getLastNameTextField().getText();
		String address = accountPanel.getAddressTextField().getText();
		String email = accountPanel.getEmailTextfield().getText();
		String phone = accountPanel.getPhoneTextField().getText();
		int levelTobeAdded = accountPanel.getSelectLevelDropDown().getSelectedIndex();
		return UserHelper.userFactory(levelTobeAdded, userName, confirmPassword, firstName, lastName, address, email,
				phone);
	}

}

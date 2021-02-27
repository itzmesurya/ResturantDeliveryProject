package com.restaurantdeliverycontrollers;

import java.awt.Color;
import java.util.function.Function;

import javax.swing.JOptionPane;

import com.restaurantdeliverymodels.CRUDAction;
import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Functions;
import com.restaurantdeliverymodels.User;
import com.restaurantdeliverymodels.UserHelper;
import com.restaurantdeliveryviews.AccountPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.UIHelper;

public class AccountCore {
	CRUDAction crudAction;
	User user;

	AccountCore(CRUDAction crudAction) {
		this.crudAction = crudAction;
		user = Main.user;
		BindActionEvents(crudAction);
		LoadUser();
	}

	private void BindActionEvents(CRUDAction crudAction) {
		AccountPanel.getCreateAccountBtn().addActionListener(e -> {

			if (crudAction != CRUDAction.Delete) {
				// Create user object
				user = doUserCheckAvailabilityAndCreateUserObject();
			}

			if (user != null) {
				switch (crudAction) {
				case Create:
					UserHelper.CreateAccount(user);
					break;
				case Edit:
					UserHelper.EditUser(user);
					break;
				case Delete:
					UserHelper.DeleteUser(user);
					break;
				case Read:
					break;
				default:
					break;
				}
			}

		});

		AccountPanel.getUserAvailabilityBtn().addActionListener(e -> {
			doUserCheckAvailabilityAndCreateUserObject();
		});

	}

	private User doUserCheckAvailabilityAndCreateUserObject() {
		User user = CreateUserObject();
		if (!UserHelper.isUsernameAvailable(user)) {
			Functions.displayError("User has been taken. Please try with different User");
			return null;
		}
		return user;
	}

	private boolean isAccountScreenValid() {
		boolean result = true;
		result = UIHelper.ValidateEmptyFields(MainFrame.getMainPanel());
		// now that we have verified all none of the fields are empty
		// we can proceed with other validations
		if (result) {
			// confirm password matches the original password
			result = ConfirmPasswordsMatch();
		}
		return result;
	}

	private boolean ConfirmPasswordsMatch() {
		boolean result = AccountPanel.getPasswordTextField().getText()
				.equals(AccountPanel.getConfirmPwdTextField().getText());
		if (!result) {
			// highlight the fields
			UIHelper.SetBorderColorToComponent(AccountPanel.getPasswordTextField(), Color.RED);
			UIHelper.SetBorderColorToComponent(AccountPanel.getConfirmPwdTextField(), Color.RED);
			// create a modal pop-up to show the validation message
			JOptionPane.showMessageDialog(null, "Password and confirm password fields must match");
		}
		return result;
	}

	private User CreateUserObject() {
		// lets make sure no fields are left empty before we create a user object
		if (UIHelper.ValidateEmptyFields(AccountPanel.getLeftPanel()) && 
				UIHelper.ValidateEmptyFields(AccountPanel.getRightPanel())) {
			if (crudAction == CRUDAction.Create) {
				// create the user only if all the fields are present
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
			} else {
				user.setUsername(AccountPanel.getUserNameTextField().getText());
				user.setPassword(AccountPanel.getPasswordTextField().getText());
				user.setFirst_name(AccountPanel.getFirstNameTextField().getText());
				user.setLast_name(AccountPanel.getLastNameTextField().getText());
				user.setAddress(AccountPanel.getAddressTextField().getText());
				user.setEmail(AccountPanel.getEmailTextfield().getText());
				user.setPhone(AccountPanel.getPhoneTextField().getText());
				return user;
			}
		} else {
			Functions.displayError("Please fill all the fields");
			return null;
		}
	}

	private void LoadUser() {
		if (user != null) {
			AccountPanel.getSelectLevelDropDown().setVisible(true);
			// check the level and adapt the screen
			AccountPanel.getUserNameTextField().setText(user.getUsername());
			AccountPanel.getPasswordTextField().setText(user.getPassword());
			AccountPanel.getConfirmPwdTextField().setText(user.getPassword());
			AccountPanel.getFirstNameTextField().setText(user.getFirst_name());
			AccountPanel.getLastNameTextField().setText(user.getLast_name());
			AccountPanel.getAddressTextField().setText(user.getAddress());
			AccountPanel.getEmailTextfield().setText(user.getEmail());
			AccountPanel.getPhoneTextField().setText(user.getPhone());
		} else {
			// there is no user hence it is assumed to be
			// create client screen
			// hide the level drop down
			AccountPanel.getSelectLevelDropDown().setVisible(false);
		}
	}

}

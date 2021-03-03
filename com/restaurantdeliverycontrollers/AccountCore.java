package com.restaurantdeliverycontrollers;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
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
		loadAccountsBasedOnLevelSelected();
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

		AccountPanel.getSelectLevelDropDown().addActionListener(e -> {
			loadAccountsBasedOnLevelSelected();
		});
		AccountPanel.getComboBox().addActionListener(e -> {
			loadUserIntoPanels();
		});
		AccountPanel.getFirstNameTextField().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
					AccountPanel.getFirstNameTextField().setEditable(true);
				} else {
					AccountPanel.getFirstNameTextField().setEditable(false);
				}
			}
		});

		AccountPanel.getLastNameTextField().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
					AccountPanel.getLastNameTextField().setEditable(true);
				} else {
					AccountPanel.getLastNameTextField().setEditable(false);
				}
			}
		});
		AccountPanel.getPhoneTextField().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isLetter(c)) {
					AccountPanel.getPhoneTextField().setEditable(true);
				} else {
					AccountPanel.getPhoneTextField().setEditable(false);
				}
			}
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
		if (UIHelper.ValidateEmptyFields(AccountPanel.getLeftPanel())
				&& UIHelper.ValidateEmptyFields(AccountPanel.getRightPanel())) {
			if (crudAction == CRUDAction.Create) {
				// create the user only if all the fields are present
				String userName = AccountPanel.getUserNameTextField().getText();
				String password = AccountPanel.getPasswordTextField().getText();
				String firstName = AccountPanel.getFirstNameTextField().getText();
				String lastName = AccountPanel.getLastNameTextField().getText();
				String address = AccountPanel.getAddressTextField().getText();
				String email = AccountPanel.getEmailTextfield().getText();
				String phone = AccountPanel.getPhoneTextField().getText();
				int levelTobeAdded = Integer.valueOf((String)AccountPanel.getSelectLevelDropDown().getSelectedItem());
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
		// by default if the user is present, display his/her details
		if (user != null) {
			if (user.getLevel() == 100) {
				AccountPanel.getSelectLevelDropDown().setVisible(true);
				AccountPanel.getSelectLevelLabel().setVisible(true);
			}
			if (crudAction != CRUDAction.Create) {
				fillUserDetails(user);
			}
		} else {
			// there is no user hence it is assumed to be
			// create client screen
			// hide the level drop down
			AccountPanel.getSelectLevelDropDown().setVisible(false);
			AccountPanel.getSelectLevelLabel().setVisible(false);
		}
	}

	@SuppressWarnings("unused")
	private void loadAccountsBasedOnLevelSelected() {
		int selectedLevelFromDropDown = Integer
				.parseInt(AccountPanel.getSelectLevelDropDown().getSelectedItem().toString());
		ArrayList<User> users = UserHelper.getUsersBasedOnLevel(selectedLevelFromDropDown);
		ArrayList<String> userArray = (ArrayList<String>) users.stream().map(x -> x.getUsername())
				.collect(Collectors.toList());
		AccountPanel.getComboBox()
				.setModel(new DefaultComboBoxModel<String>(userArray.toArray(new String[userArray.size()])));
	}

	private void fillUserDetails(User fillUserObject) {
		AccountPanel.getUserNameTextField().setText(fillUserObject.getUsername());
		AccountPanel.getPasswordTextField().setText(fillUserObject.getPassword());
		AccountPanel.getConfirmPwdTextField().setText(fillUserObject.getPassword());
		AccountPanel.getFirstNameTextField().setText(fillUserObject.getFirst_name());
		AccountPanel.getLastNameTextField().setText(fillUserObject.getLast_name());
		AccountPanel.getAddressTextField().setText(fillUserObject.getAddress());
		AccountPanel.getEmailTextfield().setText(fillUserObject.getEmail());
		AccountPanel.getPhoneTextField().setText(fillUserObject.getPhone());
	}

	private int getLevel() {
		return Integer.parseInt(AccountPanel.getSelectLevelDropDown().getSelectedItem().toString());
	}

	private void loadUserIntoPanels() {
		User userToEdit = UserHelper.getUserByUserNameAndLevel(getLevel(),
				AccountPanel.getComboBox().getSelectedItem().toString());
		fillUserDetails(userToEdit);
	}
}

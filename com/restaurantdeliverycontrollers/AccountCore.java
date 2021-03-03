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

	private class LevelSelectOption {
		int level;
		String name;

		public LevelSelectOption(int level, String name) {
			this.level = level;
			this.name = name;

		}

		@Override
		public String toString() {
			return name;

		}

		public int getlevel() {
			return level;

		}
	}

	AccountCore(CRUDAction crudAction) {
		this.crudAction = crudAction;
		user = Main.user;
		BindLevelsComboBox();
		BindActionEvents(crudAction);
		loadAccountsBasedOnLevelSelected();
		LoadUser();

	}

	private void BindLevelsComboBox() {
		AccountPanel.getSelectLevelDropDown().addItem(new LevelSelectOption(0, "Client"));
		AccountPanel.getSelectLevelDropDown().addItem(new LevelSelectOption(1, "Delivery Man"));
		AccountPanel.getSelectLevelDropDown().addItem(new LevelSelectOption(2, "Restaurateur"));
		AccountPanel.getSelectLevelDropDown().addItem(new LevelSelectOption(3, "Manager"));
		AccountPanel.getSelectLevelDropDown().addItem(new LevelSelectOption(100, "Administrator"));
	}

	private void BindActionEvents(CRUDAction crudAction) {
		AccountPanel.getCreateAccountBtn().addActionListener(e -> {

			if (crudAction != CRUDAction.Delete) {
				// Create user object
				if (doUserCheckAvailability()) {
					user = CreateUserObject();
				}
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
			doUserCheckAvailability();
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

	private Boolean doUserCheckAvailability() {
		if (!AccountPanel.getUserNameTextField().getText().isEmpty()) {
			if (!UserHelper.isUsernameAvailable(AccountPanel.getUserNameTextField().getText())) {
				Functions.displayError("User has been taken. Please try with different User");
				return false;
			}
		} else {
			Functions.displayError("Please enter the user name to check!");
			return false;
		}
		Functions.displayMessage(String.format("Username %s is available", AccountPanel.getUserNameTextField().getText()));
		return true;
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
				int levelTobeAdded = Integer.valueOf((String) AccountPanel.getSelectLevelDropDown().getSelectedItem());
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
		int selectedLevelFromDropDown = getLevel();
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
		return ((LevelSelectOption) AccountPanel.getSelectLevelDropDown().getSelectedItem()).getlevel();
	}

	private void loadUserIntoPanels() {
		User userToEdit = UserHelper.getUserByUserNameAndLevel(getLevel(),
				AccountPanel.getComboBox().getSelectedItem().toString());
		fillUserDetails(userToEdit);
	}

}

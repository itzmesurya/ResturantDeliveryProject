package com.restaurantdeliverycontrollers;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import com.restaurantdeliveryviews.LoginPanel;
import com.restaurantdeliveryviews.MainFrame;
import com.restaurantdeliveryviews.UIHelper;

public class AccountCore {
	CRUDAction crudAction;
	User user;

	private class ComboBoxOptionItem {
		int level;
		String name;

		public ComboBoxOptionItem(int level, String name) {
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
		AccountPanel.getSelectLevelDropDown().addItem(new ComboBoxOptionItem(0, "Client"));
		AccountPanel.getSelectLevelDropDown().addItem(new ComboBoxOptionItem(1, "Delivery Man"));
		AccountPanel.getSelectLevelDropDown().addItem(new ComboBoxOptionItem(2, "Restaurateur"));
		AccountPanel.getSelectLevelDropDown().addItem(new ComboBoxOptionItem(3, "Manager"));
		AccountPanel.getSelectLevelDropDown().addItem(new ComboBoxOptionItem(100, "Administrator"));
	}

	private void BindActionEvents(CRUDAction crudAction) {
		AccountPanel.getCreateAccountBtn().addActionListener(e -> {

			User userInContext = null;
			if (crudAction == CRUDAction.Delete) {
				userInContext = CreateUserObject();
			} else {
				// Create user object
				if (doUserCheckAvailability(false)) {
					userInContext = CreateUserObject();
				}
			}

			if (userInContext != null) {
				switch (crudAction) {
				case Create:
					int response = JOptionPane.showConfirmDialog(null,
							"Do you want to Create user : " + AccountPanel.getUserNameTextField().getText(), "Confirm",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (response == JOptionPane.YES_OPTION) {
						UserHelper.CreateAccount(userInContext);
						Functions.displayMessage("Account created Successfully");
					} else {
						clearAccountPanel();
					}
					break;
				case Edit:
					int responseEd = JOptionPane.showConfirmDialog(null,
							"Do you want to Edit user : " + AccountPanel.getUserNameTextField().getText(), "Confirm",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (responseEd == JOptionPane.YES_OPTION) {
						UserHelper.EditUser(userInContext);
						Functions.displayMessage("Account Updated Successfully");
					} else {
						clearAccountPanel();
					}
					break;
				case Delete:
					int responseDe = JOptionPane.showConfirmDialog(null,
							"Do you want to Delete user : " + AccountPanel.getUserNameTextField().getText(), "Confirm",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (responseDe == JOptionPane.YES_OPTION) {
						UserHelper.DeleteUser(userInContext);
						Functions.displayMessage("Account Deleted Successfully");
					} else {
						clearAccountPanel();
					}
					break;
				case Read:
					break;
				default:
					break;
				}
				loadAccountsBasedOnLevelSelected();
			}

		});

		AccountPanel.getUserAvailabilityBtn().addActionListener(e -> {
			doUserCheckAvailability(true);
		});

		AccountPanel.getSelectLevelDropDown().addActionListener(e -> {
			loadAccountsBasedOnLevelSelected();
		});
		AccountPanel.getLblNewLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					MainFrame.changePanel(new LoginPanel());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				new LoginCore();
			}
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

	private Boolean doUserCheckAvailability(Boolean showMessage) {
		if (!AccountPanel.getUserNameTextField().getText().isEmpty()) {
			if (!UserHelper.isUsernameAvailable(AccountPanel.getUserNameTextField().getText())) {
				Functions.displayError("User has been taken. Please try with different User");
				return false;
			}
		} else {
			Functions.displayError("Please enter the user name to check!");
			return false;
		}
		if (showMessage) {
			Functions.displayMessage(
					String.format("Username %s is available", AccountPanel.getUserNameTextField().getText()));
		}
		return true;
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
			// if we are creating the user then we must make sure that the paswords
			// match
			if (crudAction == CRUDAction.Create && !ConfirmPasswordsMatch()) {
				return null;
			}
			// create the user only if all the fields are present
			String userName = AccountPanel.getUserNameTextField().getText();
			String password = AccountPanel.getPasswordTextField().getText();
			String firstName = AccountPanel.getFirstNameTextField().getText();
			String lastName = AccountPanel.getLastNameTextField().getText();
			String address = AccountPanel.getAddressTextField().getText();
			String email = AccountPanel.getEmailTextfield().getText();
			String phone = AccountPanel.getPhoneTextField().getText();
			int levelTobeAdded = getLevel();
			User userObject = null;
			if (crudAction == CRUDAction.Create) {
				// user object will be returned without any ID
				return UserHelper.userFactory(levelTobeAdded, userName, password, firstName, lastName, address, email,
						phone);
			} else {
				// user object will be returned with the right ID
				userObject = UserHelper.userFactory(levelTobeAdded, userName, password, firstName, lastName, address,
						email, phone);
				userObject.setId(((ComboBoxOptionItem) AccountPanel.getComboBox().getSelectedItem()).getlevel());
				return userObject;
			}

		} else {
			Functions.displayError("Please fill all the fields");
			return null;
		}
	}

	private void LoadUser() {
		// by default if the user is present, display his/her details
		if (Main.user != null) {
			if (Main.user.getLevel() == 100) {
				AccountPanel.getLblNewLabel().setVisible(false);
				AccountPanel.getSelectLevelDropDown().setVisible(true);
				AccountPanel.getSelectLevelLabel().setVisible(true);
			}
			if (crudAction != CRUDAction.Create) {
				fillUserDetails(Main.user);
			}
		} else if (Main.user == null) {
			AccountPanel.getSelectLevelDropDown().setVisible(false);
			AccountPanel.getSelectLevelLabel().setVisible(false);

		} else {
			// there is no user hence it is assumed to be
			// create client screen
			// hide the level drop down
			AccountPanel.getLblNewLabel().setVisible(false);
			AccountPanel.getSelectLevelDropDown().setVisible(false);
			AccountPanel.getSelectLevelLabel().setVisible(false);
		}
	}

	private void loadAccountsBasedOnLevelSelected() {
		int selectedLevelFromDropDown = getLevel();
		ArrayList<User> users = UserHelper.getUsersBasedOnLevel(selectedLevelFromDropDown);
		DefaultComboBoxModel<ComboBoxOptionItem> model = new DefaultComboBoxModel<ComboBoxOptionItem>();
		for (User userObj : users) {
			model.addElement(new ComboBoxOptionItem(userObj.getId(), userObj.getUsername()));
		}
		AccountPanel.getComboBox().setModel(model);
		clearAccountPanel();
		if (crudAction == CRUDAction.Edit || crudAction == CRUDAction.Delete) {
			loadUserIntoPanels();
		}
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
		return ((ComboBoxOptionItem) AccountPanel.getSelectLevelDropDown().getSelectedItem()).getlevel();
	}

	private int getUserIdFromComboBox() {

		return ((ComboBoxOptionItem) AccountPanel.getComboBox().getSelectedItem()).getlevel();
	}

	private void loadUserIntoPanels() {
		User userToEdit = UserHelper.getUserByUser(getLevel(), getUserIdFromComboBox());
		fillUserDetails(userToEdit);
	}

	private void clearAccountPanel() {
		AccountPanel.getUserNameTextField().setText("");
		AccountPanel.getPasswordTextField().setText("");
		AccountPanel.getConfirmPwdTextField().setText("");
		AccountPanel.getFirstNameTextField().setText("");
		AccountPanel.getLastNameTextField().setText("");
		AccountPanel.getAddressTextField().setText("");
		AccountPanel.getEmailTextfield().setText("");
		AccountPanel.getPhoneTextField().setText("");
	}

}

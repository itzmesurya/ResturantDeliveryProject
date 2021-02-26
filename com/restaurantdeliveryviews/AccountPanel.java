package com.restaurantdeliveryviews;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import com.restaurantdeliverymodels.CRUDAction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AccountPanel extends JPanel {

	private JFrame frame;
	private static JTextField userNameTextField;
	private static JTextField passwordTextField;
	private static JTextField confirmPwdTextField;
	private static JTextField firstNameTextField;
	private static JTextField lastNameTextField;
	private static JTextField addressTextField;
	private static JTextField emailTextfield;
	private static JTextField phoneTextField;
	private String action;
	private static JComboBox comboBox;
	private JLabel lblSelectAccount;
	private JPanel panel;
	private static JButton createAccountBtn;
	private static JButton userAvailabilityBtn;
	private JPanel btnPanel;
	private JLabel phoneLabel;
	private JLabel emailLabel;
	private JLabel addressLabel;
	private JLabel lastNameLabel;
	private JLabel firstNameLabel;
	private JLabel personalInfoLabel;
	private static JPanel rightPanel;
	private JLabel confirmPasswordLabel;
	private JLabel passwordLabel;
	private JLabel userNameLabel;
	private JLabel loginInfoLabel;
	private static JPanel leftPanel;
	private JPanel centerPanel;
	private static JComboBox selectLevelDropDown;
	private JLabel selectLevelLabel;
	private JPanel toppanel2;
	private JLabel accountLabel;
	private JPanel topPanel;

	public AccountPanel(CRUDAction crudAction) {

		this.setLayout(new BorderLayout(0, 0));

		topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(0, 80));
		topPanel.setFont(new Font("Tahoma", Font.BOLD, 40));
		this.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

		accountLabel = new JLabel();
		accountLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
		accountLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		accountLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));

		topPanel.add(accountLabel);

		toppanel2 = new JPanel();
		topPanel.add(toppanel2);

		selectLevelLabel = new JLabel("Select Level     :");
		selectLevelLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		selectLevelLabel.setBounds(new Rectangle(118, 12, 164, 41));
		toppanel2.add(selectLevelLabel);

		setSelectLevelDropDown(new JComboBox());
		getSelectLevelDropDown().setBorder(new LineBorder(Color.BLACK));
		getSelectLevelDropDown().setBackground(new Color(224, 63, 216));
		getSelectLevelDropDown().setPreferredSize(new Dimension(612, 41));
		getSelectLevelDropDown().addItem("0");
		getSelectLevelDropDown().addItem("1");
		getSelectLevelDropDown().addItem("2");
		getSelectLevelDropDown().addItem("3");
		getSelectLevelDropDown().addItem("4");
		toppanel2.add(getSelectLevelDropDown());

		centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(500, 100));
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);

		leftPanel = new JPanel(null);
		leftPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		leftPanel.setBounds(10, 98, 599, 230);
		centerPanel.add(leftPanel);

		loginInfoLabel = new JLabel("Login Information");
		loginInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginInfoLabel.setBounds(10, 11, 299, 34);
		leftPanel.add(loginInfoLabel);

		userNameLabel = new JLabel("    Username :");
		userNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		userNameLabel.setBounds(56, 56, 110, 26);
		leftPanel.add(userNameLabel);

		passwordLabel = new JLabel("          Password :");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordLabel.setBounds(34, 110, 132, 26);
		leftPanel.add(passwordLabel);

		confirmPasswordLabel = new JLabel("Confirm Password :");
		confirmPasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		confirmPasswordLabel.setBounds(10, 157, 156, 26);
		leftPanel.add(confirmPasswordLabel);

		setUserNameTextField(new JTextField());
		getUserNameTextField().setBorder(new LineBorder(Color.BLACK));
		getUserNameTextField().setBackground(new Color(151, 203, 255));
		getUserNameTextField().setBounds(188, 63, 360, 34);
		leftPanel.add(getUserNameTextField());
		getUserNameTextField().setColumns(10);

		setPasswordTextField(new JTextField());
		getPasswordTextField().setBorder(new LineBorder(Color.BLACK));
		getPasswordTextField().setBackground(new Color(151, 203, 255));
		getPasswordTextField().setColumns(10);
		getPasswordTextField().setBounds(188, 108, 360, 34);
		leftPanel.add(getPasswordTextField());

		setConfirmPwdTextField(new JTextField());
		getConfirmPwdTextField().setBorder(new LineBorder(Color.BLACK));
		getConfirmPwdTextField().setBackground(new Color(151, 203, 255));
		getConfirmPwdTextField().setColumns(10);
		getConfirmPwdTextField().setBounds(188, 155, 360, 34);
		leftPanel.add(getConfirmPwdTextField());

		rightPanel = new JPanel(null);
		rightPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightPanel.setBounds(634, 98, 540, 352);
		centerPanel.add(rightPanel);

		personalInfoLabel = new JLabel("Personal Information");
		personalInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		personalInfoLabel.setBounds(10, 11, 299, 34);
		rightPanel.add(personalInfoLabel);

		firstNameLabel = new JLabel("First Name :");
		firstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		firstNameLabel.setBounds(42, 56, 102, 26);
		rightPanel.add(firstNameLabel);

		lastNameLabel = new JLabel("Last Name :");
		lastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lastNameLabel.setBounds(42, 118, 102, 26);
		rightPanel.add(lastNameLabel);

		addressLabel = new JLabel("   Address :");
		addressLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		addressLabel.setBounds(47, 183, 97, 26);
		rightPanel.add(addressLabel);

		emailLabel = new JLabel("       Email :");
		emailLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		emailLabel.setBounds(53, 252, 91, 26);
		rightPanel.add(emailLabel);

		phoneLabel = new JLabel(" Phone Number : ");
		phoneLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		phoneLabel.setBounds(10, 315, 133, 26);
		rightPanel.add(phoneLabel);

		setFirstNameTextField(new JTextField());
		getFirstNameTextField().setBorder(new LineBorder(Color.BLACK));
		getFirstNameTextField().setColumns(10);
		getFirstNameTextField().setBackground(new Color(151, 203, 255));
		getFirstNameTextField().setBounds(147, 56, 360, 34);
		rightPanel.add(getFirstNameTextField());

		setLastNameTextField(new JTextField());
		getLastNameTextField().setBorder(new LineBorder(Color.BLACK));
		getLastNameTextField().setColumns(10);
		getLastNameTextField().setBackground(new Color(151, 203, 255));
		getLastNameTextField().setBounds(147, 118, 360, 34);
		rightPanel.add(getLastNameTextField());

		setAddressTextField(new JTextField());
		getAddressTextField().setBorder(new LineBorder(Color.BLACK));
		getAddressTextField().setColumns(10);
		getAddressTextField().setBackground(new Color(151, 203, 255));
		getAddressTextField().setBounds(147, 183, 360, 34);
		rightPanel.add(getAddressTextField());

		setEmailTextfield(new JTextField());
		getEmailTextfield().setBorder(new LineBorder(Color.BLACK));
		getEmailTextfield().setColumns(10);
		getEmailTextfield().setBackground(new Color(151, 203, 255));
		getEmailTextfield().setBounds(147, 250, 360, 34);
		rightPanel.add(getEmailTextfield());

		setPhoneTextField(new JTextField());
		getPhoneTextField().setBorder(new LineBorder(Color.BLACK));
		getPhoneTextField().setColumns(10);
		getPhoneTextField().setBackground(new Color(151, 203, 255));
		getPhoneTextField().setBounds(147, 307, 360, 34);
		rightPanel.add(getPhoneTextField());

		btnPanel = new JPanel(null);
		btnPanel.setBounds(10, 352, 614, 98);
		centerPanel.add(btnPanel);

		setUserAvailabilityBtn(new JButton("Verify Username  Availability"));
		getUserAvailabilityBtn().setBorder(new LineBorder(new Color(0, 0, 0)));
		getUserAvailabilityBtn().setBackground(new Color(252, 220, 86));
		getUserAvailabilityBtn().setFont(new Font("Tahoma", Font.BOLD, 15));
		getUserAvailabilityBtn().setBounds(90, 11, 444, 33);
		btnPanel.add(getUserAvailabilityBtn());

		setCreateAccountBtn(new JButton());
		getCreateAccountBtn().setBorder(new LineBorder(new Color(0, 0, 0)));
		getCreateAccountBtn().setBackground(new Color(252, 220, 86));
		getCreateAccountBtn().setFont(new Font("Tahoma", Font.BOLD, 15));
		getCreateAccountBtn().setBounds(90, 54, 444, 33);
		btnPanel.add(getCreateAccountBtn());

		panel = new JPanel(null);
		panel.setBounds(290, 19, 820, 68);
		centerPanel.add(panel);

		lblSelectAccount = new JLabel("Select Account   :");
		lblSelectAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSelectAccount.setBounds(new Rectangle(10, 11, 162, 41));
		panel.add(lblSelectAccount);

		setComboBox(new JComboBox());
		getComboBox().setBorder(new LineBorder(Color.BLACK));
		getComboBox().setBackground(new Color(224, 63, 216));
		getComboBox().setBounds(198, 11, 612, 41);
		panel.add(getComboBox());


		switch (crudAction) {
		case Create:
			accountLabel.setText("Open Account");
			getCreateAccountBtn().setText("Create Account");
			getUserAvailabilityBtn().setEnabled(true);
			panel.setVisible(false);
			break;
		case Edit:
			panel.setVisible(true);
			getCreateAccountBtn().setText("Save");
			getUserAvailabilityBtn().setEnabled(true);
			accountLabel.setText("Edit Account");
			break;
		case Delete:
			panel.setVisible(true);
			getCreateAccountBtn().setText("Delete");
			getUserAvailabilityBtn().setEnabled(false);
			accountLabel.setText("Delete Account");
			UIHelper.setPanelEnabled(leftPanel, false);
			UIHelper.setPanelEnabled(rightPanel, false);
			break;
		}
		
	}

	public static JTextField getUserNameTextField() {
		return userNameTextField;
	}

	public void setUserNameTextField(JTextField userNameTextField) {
		this.userNameTextField = userNameTextField;
	}

	public static JTextField getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(JTextField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public static JTextField getConfirmPwdTextField() {
		return confirmPwdTextField;
	}

	public void setConfirmPwdTextField(JTextField confirmPwdTextField) {
		this.confirmPwdTextField = confirmPwdTextField;
	}

	public static JTextField getFirstNameTextField() {
		return firstNameTextField;
	}

	public void setFirstNameTextField(JTextField firstNameTextField) {
		this.firstNameTextField = firstNameTextField;
	}

	public static JTextField getLastNameTextField() {
		return lastNameTextField;
	}

	public void setLastNameTextField(JTextField lastNameTextField) {
		this.lastNameTextField = lastNameTextField;
	}

	public static JTextField getAddressTextField() {
		return addressTextField;
	}

	public void setAddressTextField(JTextField addressTextField) {
		this.addressTextField = addressTextField;
	}

	public static JTextField getEmailTextfield() {
		return emailTextfield;
	}

	public void setEmailTextfield(JTextField emailTextfield) {
		this.emailTextfield = emailTextfield;
	}

	public static JTextField getPhoneTextField() {
		return phoneTextField;
	}

	public void setPhoneTextField(JTextField phoneTextField) {
		this.phoneTextField = phoneTextField;
	}

	public static JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public static JButton getCreateAccountBtn() {
		return createAccountBtn;
	}

	public void setCreateAccountBtn(JButton createAccountBtn) {
		this.createAccountBtn = createAccountBtn;
	}

	public static JButton getUserAvailabilityBtn() {
		return userAvailabilityBtn;
	}

	public void setUserAvailabilityBtn(JButton userAvailabilityBtn) {
		this.userAvailabilityBtn = userAvailabilityBtn;
	}

	public static JComboBox getSelectLevelDropDown() {
		return selectLevelDropDown;
	}

	public void setSelectLevelDropDown(JComboBox selectLevelDropDown) {
		this.selectLevelDropDown = selectLevelDropDown;
	}
	
	public static JPanel getLeftPanel() {
		return leftPanel;
	}
	
	public static JPanel getRightPanel() {
		return rightPanel;
	}
}

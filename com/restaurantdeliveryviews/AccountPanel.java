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
import javax.swing.text.MaskFormatter;

import com.restaurantdeliverymodels.CRUDAction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
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
	private static JLabel lblSelectAccount;
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
	private static JLabel selectLevelLabel;
	private JPanel toppanel2;
	private JLabel accountLabel;
	private JPanel topPanel;
	private JPanel panel_2;

	private static JLabel lblNewLabel;

	public AccountPanel(CRUDAction crudAction) throws ParseException {

		this.setLayout(new BorderLayout(0, 0));

		topPanel = new JPanel();
		topPanel.setBackground(Color.DARK_GRAY);
		topPanel.setPreferredSize(new Dimension(0, 80));
		topPanel.setFont(new Font("Tahoma", Font.BOLD, 40));
		this.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

		accountLabel = new JLabel();
		accountLabel.setForeground(Color.WHITE);
		accountLabel.setBackground(Color.WHITE);
		accountLabel.setPreferredSize(new Dimension(300, 50));
		accountLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
		accountLabel.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));

		topPanel.add(accountLabel);

		toppanel2 = new JPanel();
		topPanel.add(toppanel2);

		setSelectLevelLabel(new JLabel("Select Level     :"));
		getSelectLevelLabel().setForeground(Color.RED);
		getSelectLevelLabel().setFont(new Font("Impact", Font.PLAIN, 30));
		getSelectLevelLabel().setBounds(new Rectangle(118, 12, 164, 41));
		toppanel2.add(getSelectLevelLabel());

		setSelectLevelDropDown(new JComboBox());
		getSelectLevelDropDown().setFont(MainFrame.labelFont);
		getSelectLevelDropDown().setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		getSelectLevelDropDown().setBackground(Color.WHITE);
		getSelectLevelDropDown().setPreferredSize(new Dimension(612, 41));
		toppanel2.add(getSelectLevelDropDown());

		centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(500, 100));
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);

		leftPanel = new JPanel(null);
		leftPanel.setBackground(Color.WHITE);
		leftPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		leftPanel.setBounds(10, 98, 599, 263);
		centerPanel.add(leftPanel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 13, 599, 45);
		leftPanel.add(panel_1);

		loginInfoLabel = new JLabel("Login Information");
		panel_1.add(loginInfoLabel);
		loginInfoLabel.setForeground(Color.WHITE);
		loginInfoLabel.setBackground(Color.BLACK);
		loginInfoLabel.setFont(new Font("Impact", Font.PLAIN, 30));

		userNameLabel = new JLabel("      Username :");
		userNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
		userNameLabel.setBounds(56, 98, 148, 26);
		leftPanel.add(userNameLabel);

		passwordLabel = new JLabel("          Password :");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 20));
		passwordLabel.setBounds(39, 151, 169, 26);
		leftPanel.add(passwordLabel);

		confirmPasswordLabel = new JLabel("Confirm Password :");
		confirmPasswordLabel.setFont(new Font("Arial", Font.BOLD, 20));
		confirmPasswordLabel.setBounds(14, 204, 194, 26);
		leftPanel.add(confirmPasswordLabel);

		setUserNameTextField(new JTextField());
		getUserNameTextField().setFont(MainFrame.labelFont);
		getUserNameTextField().setForeground(Color.BLACK);
		getUserNameTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getUserNameTextField().setBackground(Color.WHITE);
		getUserNameTextField().setBounds(227, 93, 350, 40);
		leftPanel.add(getUserNameTextField());
		getUserNameTextField().setColumns(10);

		setPasswordTextField(new JTextField());
		getPasswordTextField().setFont(MainFrame.labelFont);
		getPasswordTextField().setForeground(Color.DARK_GRAY);
		getPasswordTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getPasswordTextField().setBackground(Color.WHITE);
		getPasswordTextField().setColumns(10);
		getPasswordTextField().setBounds(227, 146, 350, 40);
		leftPanel.add(getPasswordTextField());

		setConfirmPwdTextField(new JTextField());
		getConfirmPwdTextField().setFont(MainFrame.labelFont);
		getConfirmPwdTextField().setForeground(Color.DARK_GRAY);
		getConfirmPwdTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getConfirmPwdTextField().setBackground(Color.WHITE);
		getConfirmPwdTextField().setColumns(10);
		getConfirmPwdTextField().setBounds(227, 199, 350, 40);
		leftPanel.add(getConfirmPwdTextField());

		rightPanel = new JPanel(null);
		rightPanel.setBackground(Color.WHITE);
		rightPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		rightPanel.setBounds(634, 98, 540, 354);
		centerPanel.add(rightPanel);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 13, 540, 46);
		rightPanel.add(panel_2);
		personalInfoLabel = new JLabel("Personal Information");
		panel_2.add(personalInfoLabel);
		personalInfoLabel.setForeground(Color.WHITE);
		personalInfoLabel.setFont(new Font("Impact", Font.PLAIN, 30));

		firstNameLabel = new JLabel("First Name :");
		firstNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
		firstNameLabel.setBounds(40, 85, 126, 26);
		rightPanel.add(firstNameLabel);

		lastNameLabel = new JLabel("Last Name :");
		lastNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lastNameLabel.setBounds(40, 140, 126, 26);
		rightPanel.add(lastNameLabel);

		addressLabel = new JLabel("    Address :");
		addressLabel.setFont(new Font("Arial", Font.BOLD, 20));
		addressLabel.setBounds(40, 189, 126, 26);
		rightPanel.add(addressLabel);

		emailLabel = new JLabel("    Email :");
		emailLabel.setFont(new Font("Arial", Font.BOLD, 20));
		emailLabel.setBounds(69, 243, 97, 26);
		rightPanel.add(emailLabel);

		phoneLabel = new JLabel(" Phone Number : ");
		phoneLabel.setFont(new Font("Arial", Font.BOLD, 20));
		phoneLabel.setBounds(0, 294, 170, 26);
		rightPanel.add(phoneLabel);

		setFirstNameTextField(new JTextField());
		getFirstNameTextField().setFont(MainFrame.labelFont);
		getFirstNameTextField().setForeground(Color.DARK_GRAY);
		getFirstNameTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getFirstNameTextField().setColumns(10);
		getFirstNameTextField().setBackground(Color.WHITE);
		getFirstNameTextField().setBounds(168, 83, 350, 40);
		rightPanel.add(getFirstNameTextField());

		setLastNameTextField(new JTextField());
		getLastNameTextField().setFont(MainFrame.labelFont);
		getLastNameTextField().setForeground(Color.DARK_GRAY);
		getLastNameTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getLastNameTextField().setColumns(10);
		getLastNameTextField().setBackground(Color.WHITE);
		getLastNameTextField().setBounds(168, 135, 350, 40);
		rightPanel.add(getLastNameTextField());

		setAddressTextField(new JTextField());
		getAddressTextField().setFont(MainFrame.labelFont);
		getAddressTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getAddressTextField().setColumns(10);
		getAddressTextField().setBackground(Color.WHITE);
		getAddressTextField().setBounds(168, 187, 350, 40);
		rightPanel.add(getAddressTextField());

		setEmailTextfield(new JTextField());
		getEmailTextfield().setFont(MainFrame.labelFont);
		getEmailTextfield().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getEmailTextfield().setColumns(10);
		getEmailTextfield().setBackground(Color.WHITE);
		getEmailTextfield().setBounds(168, 241, 350, 40);
		rightPanel.add(getEmailTextfield());
		
		MaskFormatter mf = new MaskFormatter("***-***-****");
		setPhoneTextField(new JFormattedTextField(mf));

		getPhoneTextField().setFont(MainFrame.labelFont);

		getPhoneTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getPhoneTextField().setColumns(10);
		getPhoneTextField().setBackground(Color.WHITE);
		getPhoneTextField().setBounds(168, 292, 350, 40);
		rightPanel.add(getPhoneTextField());

		btnPanel = new JPanel(null);
		btnPanel.setBounds(8, 379, 614, 98);
		centerPanel.add(btnPanel);

		setUserAvailabilityBtn(new JButton("Verify Username  Availability"));
		getUserAvailabilityBtn().setForeground(Color.WHITE);
		getUserAvailabilityBtn().setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		getUserAvailabilityBtn().setBackground(Color.RED);
		getUserAvailabilityBtn().setFont(new Font("Arial", Font.BOLD, 20));
		getUserAvailabilityBtn().setBounds(90, 11, 444, 33);
		btnPanel.add(getUserAvailabilityBtn());

		setCreateAccountBtn(new JButton());
		getCreateAccountBtn().setForeground(Color.WHITE);
		getCreateAccountBtn().setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		getCreateAccountBtn().setBackground(Color.RED);
		getCreateAccountBtn().setFont(new Font("Arial", Font.BOLD, 20));
		getCreateAccountBtn().setBounds(90, 54, 444, 33);
		btnPanel.add(getCreateAccountBtn());

		panel = new JPanel(null);
		panel.setBounds(247, 13, 893, 68);
		centerPanel.add(panel);

		setLblSelectAccount(new JLabel("Select Account      :"));
		getLblSelectAccount().setForeground(Color.RED);
		getLblSelectAccount().setFont(new Font("Impact", Font.PLAIN, 30));
		getLblSelectAccount().setBounds(new Rectangle(41, 11, 222, 41));
		panel.add(getLblSelectAccount());

		setComboBox(new JComboBox());
		getComboBox().setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		getComboBox().setFont(MainFrame.labelFont);
		getComboBox().setBackground(Color.WHITE);
		getComboBox().setBounds(269, 11, 612, 41);
		panel.add(getComboBox());
		
		setLblNewLabel(new JLabel("Click here to go back to login page."));
		getLblNewLabel().setBackground(Color.WHITE);
		getLblNewLabel().setForeground(Color.BLUE);
		getLblNewLabel().setPreferredSize(new Dimension(600, 20));
		getLblNewLabel().setHorizontalTextPosition(SwingConstants.CENTER);
		getLblNewLabel().setHorizontalAlignment(SwingConstants.CENTER);
		getLblNewLabel().setFont(new Font("Arial", Font.PLAIN, 20));
		getLblNewLabel().setBounds(374, 582, 489, 26);
		centerPanel.add(getLblNewLabel());

		switch (crudAction) {
		case Create:
			accountLabel.setText("   Open Account");
			getCreateAccountBtn().setText("Create Account");
			getUserAvailabilityBtn().setEnabled(true);
			panel.setVisible(false);
			break;
		case Edit:
			panel.setVisible(true);
			getCreateAccountBtn().setText("Save");
			getUserAvailabilityBtn().setEnabled(true);
			accountLabel.setText("   Edit Account");
			break;
		case Delete:
			panel.setVisible(true);
			getCreateAccountBtn().setText("Delete");
			getUserAvailabilityBtn().setEnabled(false);
			accountLabel.setText("   Delete Account");
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

	/**
	 * @return the lblSelectAccount
	 */
	public static JLabel getLblSelectAccount() {
		return lblSelectAccount;
	}

	/**
	 * @param lblSelectAccount the lblSelectAccount to set
	 */
	public static void setLblSelectAccount(JLabel lblSelectAccount) {
		AccountPanel.lblSelectAccount = lblSelectAccount;
	}

	/**
	 * @return the selectLevelLabel
	 */
	public static JLabel getSelectLevelLabel() {
		return selectLevelLabel;
	}

	/**
	 * @param selectLevelLabel the selectLevelLabel to set
	 */
	public static void setSelectLevelLabel(JLabel selectLevelLabel) {
		AccountPanel.selectLevelLabel = selectLevelLabel;
	}

	/**
	 * @return the lblNewLabel
	 */
	public static JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	/**
	 * @param lblNewLabel the lblNewLabel to set
	 */
	public static void setLblNewLabel(JLabel lblNewLabel) {
		AccountPanel.lblNewLabel = lblNewLabel;
	}
}

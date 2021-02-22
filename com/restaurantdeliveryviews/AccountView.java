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

public class AccountView {

    private JFrame frame;
    private JTextField userNameTextField;
    private JTextField passwordTextField;
    private JTextField confirmPwdTextField;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField addressTextField;
    private JTextField emailTextfield;
    private JTextField phoneTextField;
    private String action;
    private JComboBox comboBox;
    private JLabel lblSelectAccount;
    private JPanel panel;
    private JButton createAccountBtn;
    private JButton userAvailabilityBtn;
    private JPanel btnPanel;
    private JLabel phoneLabel;
    private JLabel emailLabel;
    private JLabel addressLabel;
    private JLabel lastNameLabel;
    private JLabel firstNameLabel;
    private JLabel personalInfoLabel;
    private JPanel rightPanel;
    private JLabel confirmPasswordLabel;
    private JLabel passwordLabel;
    private JLabel userNameLabel;
    private JLabel loginInfoLabel;
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JComboBox selectLevelDropDown;
    private JLabel selectLevelLabel;
    private JPanel toppanel2;
    private JLabel accountLabel;
    private JPanel topPanel;
    private JPanel mainPanel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    AccountView window = new AccountView("delete");
		    window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public AccountView(String crudAction) {
	action = crudAction;
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

	frame = new JFrame();
	frame.setBounds(100, 100, 1200, 800);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	mainPanel = new JPanel();
	frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
	mainPanel.setLayout(new BorderLayout(0, 0));

	topPanel = new JPanel();
	topPanel.setPreferredSize(new Dimension(0, 80));
	topPanel.setFont(new Font("Tahoma", Font.BOLD, 40));
	mainPanel.add(topPanel, BorderLayout.NORTH);
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

	selectLevelDropDown = new JComboBox();
	selectLevelDropDown.setBorder(new LineBorder(Color.BLACK));
	selectLevelDropDown.setBackground(new Color(224, 63, 216));
	selectLevelDropDown.setPreferredSize(new Dimension(612, 41));
	toppanel2.add(selectLevelDropDown);

	centerPanel = new JPanel();
	centerPanel.setPreferredSize(new Dimension(500, 100));
	mainPanel.add(centerPanel, BorderLayout.CENTER);
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

	userNameTextField = new JTextField();
	userNameTextField.setBorder(new LineBorder(Color.BLACK));
	userNameTextField.setBackground(new Color(151, 203, 255));
	userNameTextField.setBounds(188, 63, 360, 34);
	leftPanel.add(userNameTextField);
	userNameTextField.setColumns(10);

	passwordTextField = new JTextField();
	passwordTextField.setBorder(new LineBorder(Color.BLACK));
	passwordTextField.setBackground(new Color(151, 203, 255));
	passwordTextField.setColumns(10);
	passwordTextField.setBounds(188, 108, 360, 34);
	leftPanel.add(passwordTextField);

	confirmPwdTextField = new JTextField();
	confirmPwdTextField.setBorder(new LineBorder(Color.BLACK));
	confirmPwdTextField.setBackground(new Color(151, 203, 255));
	confirmPwdTextField.setColumns(10);
	confirmPwdTextField.setBounds(188, 155, 360, 34);
	leftPanel.add(confirmPwdTextField);

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

	firstNameTextField = new JTextField();
	firstNameTextField.setBorder(new LineBorder(Color.BLACK));
	firstNameTextField.setColumns(10);
	firstNameTextField.setBackground(new Color(151, 203, 255));
	firstNameTextField.setBounds(147, 56, 360, 34);
	rightPanel.add(firstNameTextField);

	lastNameTextField = new JTextField();
	lastNameTextField.setBorder(new LineBorder(Color.BLACK));
	lastNameTextField.setColumns(10);
	lastNameTextField.setBackground(new Color(151, 203, 255));
	lastNameTextField.setBounds(147, 118, 360, 34);
	rightPanel.add(lastNameTextField);

	addressTextField = new JTextField();
	addressTextField.setBorder(new LineBorder(Color.BLACK));
	addressTextField.setColumns(10);
	addressTextField.setBackground(new Color(151, 203, 255));
	addressTextField.setBounds(147, 183, 360, 34);
	rightPanel.add(addressTextField);

	emailTextfield = new JTextField();
	emailTextfield.setBorder(new LineBorder(Color.BLACK));
	emailTextfield.setColumns(10);
	emailTextfield.setBackground(new Color(151, 203, 255));
	emailTextfield.setBounds(147, 250, 360, 34);
	rightPanel.add(emailTextfield);

	phoneTextField = new JTextField();
	phoneTextField.setBorder(new LineBorder(Color.BLACK));
	phoneTextField.setColumns(10);
	phoneTextField.setBackground(new Color(151, 203, 255));
	phoneTextField.setBounds(147, 307, 360, 34);
	rightPanel.add(phoneTextField);

	btnPanel = new JPanel(null);
	btnPanel.setBounds(10, 352, 614, 98);
	centerPanel.add(btnPanel);

	userAvailabilityBtn = new JButton("Verify Username  Availability");
	userAvailabilityBtn.setBorder(new LineBorder(new Color(0, 0, 0)));
	userAvailabilityBtn.setBackground(new Color(252, 220, 86));
	userAvailabilityBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	userAvailabilityBtn.setBounds(90, 11, 444, 33);
	btnPanel.add(userAvailabilityBtn);

	createAccountBtn = new JButton();
	createAccountBtn.setBorder(new LineBorder(new Color(0, 0, 0)));
	createAccountBtn.setBackground(new Color(252, 220, 86));
	createAccountBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	createAccountBtn.setBounds(90, 54, 444, 33);
	btnPanel.add(createAccountBtn);

	panel = new JPanel(null);
	panel.setBounds(290, 19, 820, 68);
	centerPanel.add(panel);

	lblSelectAccount = new JLabel("Select Account   :");
	lblSelectAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblSelectAccount.setBounds(new Rectangle(10, 11, 162, 41));
	panel.add(lblSelectAccount);

	comboBox = new JComboBox();
	comboBox.setBorder(new LineBorder(Color.BLACK));
	comboBox.setBackground(new Color(224, 63, 216));
	comboBox.setBounds(198, 11, 612, 41);
	panel.add(comboBox);
	AdaptToAction();
    }

    private void AdaptToAction() {
	switch (this.action) {
	case "create":
	    accountLabel.setText("Open Account");
	    createAccountBtn.setText("Create Account");
	    userAvailabilityBtn.setEnabled(true);
	    panel.setVisible(false);

	    break;
	case "edit":
	    panel.setVisible(true);
	    createAccountBtn.setText("Save");
	    userAvailabilityBtn.setEnabled(true);
	    accountLabel.setText("Edit Account");
	    break;
	case "delete":
	    panel.setVisible(true);
	    createAccountBtn.setText("Delete");
	    userAvailabilityBtn.setEnabled(false);
	    accountLabel.setText("Delete Account");
	    setPanelEnabled(leftPanel, false);
	    setPanelEnabled(rightPanel, false);
	    break;
	default:
	    break;
	}

    }
    void setPanelEnabled(JPanel panel, Boolean isEnabled) {
	    panel.setEnabled(isEnabled);

	    Component[] components = panel.getComponents();

	    for (Component component : components) {
	        if (component instanceof JPanel) {
	            setPanelEnabled((JPanel) component, isEnabled);
	        }
	        component.setEnabled(isEnabled);
	    }
	}
}

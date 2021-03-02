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
    private JPanel panel_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    AccountView window = new AccountView("edit");
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
	topPanel.setBackground(Color.DARK_GRAY);
	topPanel.setPreferredSize(new Dimension(0, 80));
	topPanel.setFont(new Font("Tahoma", Font.BOLD, 40));
	mainPanel.add(topPanel, BorderLayout.NORTH);
	topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

	accountLabel = new JLabel();
	accountLabel.setForeground(Color.WHITE);
	accountLabel.setBackground(Color.WHITE);
	accountLabel.setPreferredSize(new Dimension(300, 50));
	accountLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
	accountLabel.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
	accountLabel.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));

	topPanel.add(accountLabel);

	toppanel2 = new JPanel();
	topPanel.add(toppanel2);

	selectLevelLabel = new JLabel("Select Level  :");
	selectLevelLabel.setForeground(Color.RED);
	selectLevelLabel.setFont(new Font("Impact", Font.PLAIN, 30));
	selectLevelLabel.setBounds(new Rectangle(118, 12, 164, 41));
	toppanel2.add(selectLevelLabel);

	selectLevelDropDown = new JComboBox();
	selectLevelDropDown.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	selectLevelDropDown.setBackground(Color.WHITE);
	selectLevelDropDown.setPreferredSize(new Dimension(612, 41));
	selectLevelDropDown.addItem("0");
	selectLevelDropDown.addItem("1");
	selectLevelDropDown.addItem("2");
	selectLevelDropDown.addItem("3");
	selectLevelDropDown.addItem("4");
	toppanel2.add(selectLevelDropDown);

	centerPanel = new JPanel();
	centerPanel.setPreferredSize(new Dimension(500, 100));
	mainPanel.add(centerPanel, BorderLayout.CENTER);
	centerPanel.setLayout(null);

	leftPanel = new JPanel(null);
	leftPanel.setBackground(Color.WHITE);
	leftPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	leftPanel.setBounds(10, 98, 599, 263);
	centerPanel.add(leftPanel);

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

	userNameTextField = new JTextField();
	userNameTextField.setCaretColor(Color.BLACK);
	userNameTextField.setForeground(Color.BLACK);
	userNameTextField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	userNameTextField.setBackground(Color.WHITE);
	userNameTextField.setBounds(227, 93, 350, 40);
	leftPanel.add(userNameTextField);
	userNameTextField.setColumns(10);

	passwordTextField = new JTextField();
	passwordTextField.setForeground(Color.DARK_GRAY);
	passwordTextField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	passwordTextField.setBackground(Color.WHITE);
	passwordTextField.setColumns(10);
	passwordTextField.setBounds(227, 146, 350, 40);
	leftPanel.add(passwordTextField);

	confirmPwdTextField = new JTextField();
	confirmPwdTextField.setForeground(Color.DARK_GRAY);
	confirmPwdTextField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	confirmPwdTextField.setBackground(Color.WHITE);
	confirmPwdTextField.setColumns(10);
	confirmPwdTextField.setBounds(227, 199, 350, 40);
	leftPanel.add(confirmPwdTextField);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(Color.DARK_GRAY);
	panel_1.setBounds(0, 13, 599, 45);
	leftPanel.add(panel_1);
	
		loginInfoLabel = new JLabel("Login Information");
		panel_1.add(loginInfoLabel);
		loginInfoLabel.setForeground(Color.WHITE);
		loginInfoLabel.setBackground(Color.BLACK);
		loginInfoLabel.setFont(new Font("Impact", Font.PLAIN, 30));

	rightPanel = new JPanel(null);
	rightPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	rightPanel.setBounds(634, 98, 540, 354);
	centerPanel.add(rightPanel);

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

	firstNameTextField = new JTextField();
	firstNameTextField.setForeground(Color.DARK_GRAY);
	firstNameTextField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	firstNameTextField.setColumns(10);
	firstNameTextField.setBackground(Color.WHITE);
	firstNameTextField.setBounds(168, 83, 350, 40);
	rightPanel.add(firstNameTextField);

	lastNameTextField = new JTextField();
	lastNameTextField.setForeground(Color.DARK_GRAY);
	lastNameTextField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	lastNameTextField.setColumns(10);
	lastNameTextField.setBackground(Color.WHITE);
	lastNameTextField.setBounds(168, 135, 350, 40);
	rightPanel.add(lastNameTextField);

	addressTextField = new JTextField();
	addressTextField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	addressTextField.setColumns(10);
	addressTextField.setBackground(Color.WHITE);
	addressTextField.setBounds(168, 187, 350, 40);
	rightPanel.add(addressTextField);

	emailTextfield = new JTextField();
	emailTextfield.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	emailTextfield.setColumns(10);
	emailTextfield.setBackground(Color.WHITE);
	emailTextfield.setBounds(168, 241, 350, 40);
	rightPanel.add(emailTextfield);

	phoneTextField = new JTextField();
	phoneTextField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	phoneTextField.setColumns(10);
	phoneTextField.setBackground(Color.WHITE);
	phoneTextField.setBounds(168, 292, 350, 40);
	rightPanel.add(phoneTextField);
	
	panel_2 = new JPanel();
	panel_2.setBackground(Color.DARK_GRAY);
	panel_2.setBounds(0, 13, 540, 46);
	rightPanel.add(panel_2);
	
		personalInfoLabel = new JLabel("Personal Information");
		panel_2.add(personalInfoLabel);
		personalInfoLabel.setForeground(Color.WHITE);
		personalInfoLabel.setFont(new Font("Impact", Font.PLAIN, 30));

	btnPanel = new JPanel(null);
	btnPanel.setBounds(8, 379, 614, 98);
	centerPanel.add(btnPanel);

	userAvailabilityBtn = new JButton("Verify Username  Availability");
	userAvailabilityBtn.setForeground(Color.WHITE);
	userAvailabilityBtn.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
	userAvailabilityBtn.setBackground(Color.RED);
	userAvailabilityBtn.setFont(new Font("Arial", Font.BOLD, 20));
	userAvailabilityBtn.setBounds(90, 11, 444, 33);
	btnPanel.add(userAvailabilityBtn);

	createAccountBtn = new JButton();
	createAccountBtn.setForeground(Color.WHITE);
	createAccountBtn.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
	createAccountBtn.setBackground(Color.RED);
	createAccountBtn.setFont(new Font("Arial", Font.BOLD, 20));
	createAccountBtn.setBounds(90, 54, 444, 33);
	btnPanel.add(createAccountBtn);

	panel = new JPanel(null);
	panel.setBounds(247, 13, 893, 68);
	centerPanel.add(panel);

	lblSelectAccount = new JLabel("Select Account      :");
	lblSelectAccount.setForeground(Color.RED);
	lblSelectAccount.setFont(new Font("Impact", Font.PLAIN, 30));
	lblSelectAccount.setBounds(new Rectangle(41, 11, 222, 41));
	panel.add(lblSelectAccount);

	comboBox = new JComboBox();
	comboBox.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	comboBox.setBackground(Color.WHITE);
	comboBox.setBounds(269, 11, 612, 41);
	panel.add(comboBox);
	AdaptToAction();
    }

    private void AdaptToAction() {
	switch (this.action) {
	case "create":
	    accountLabel.setText("    Open Account");
	    createAccountBtn.setText("Create Account");
	    userAvailabilityBtn.setEnabled(true);
	    panel.setVisible(false);

	    break;
	case "edit":
	    panel.setVisible(true);
	    createAccountBtn.setText("Save");
	    userAvailabilityBtn.setEnabled(true);
	    accountLabel.setText("   Edit Account");
	    break;
	case "delete":
	    panel.setVisible(true);
	    createAccountBtn.setText("Delete");
	    userAvailabilityBtn.setEnabled(false);
	    accountLabel.setText("   Delete Account");
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

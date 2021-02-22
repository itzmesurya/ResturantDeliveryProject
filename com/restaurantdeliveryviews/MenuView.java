package com.restaurantdeliveryviews;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuView {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTable table;
    private JPanel rightPanel;
    private String action;
    private JButton btnEdit;
    private JButton btnDelete;
    private JButton selectBtn;
    private JButton saveBtn;
    private JPanel panel;
    private JButton addBtn;
    private JLabel itemPriceLabel;
    private JLabel itemNameLabel;
    private JLabel addItemLabel;
    private JPanel leftPanel;
    private JScrollPane scrollPane;
    private JLabel lblNewLabel;
    private JSeparator separator;
    private JPanel centerPanel;
    private JComboBox selectRestoDropDown;
    private JLabel selectRestoLabel;
    private JPanel toppanel2;
    private JLabel menuLabel;
    private JPanel topPanel;
    private JPanel mainPanel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    MenuView window = new MenuView("delete");
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
    public MenuView(String crudAction) {
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

	menuLabel = new JLabel(" Create Menu ");
	menuLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
	menuLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
	menuLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
	topPanel.add(menuLabel);

	toppanel2 = new JPanel(null);
	topPanel.add(toppanel2);

	selectRestoLabel = new JLabel("Select Restaurant     :");
	selectRestoLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	selectRestoLabel.setBounds(new Rectangle(118, 12, 228, 41));
	toppanel2.add(selectRestoLabel);

	selectRestoDropDown = new JComboBox();
	selectRestoDropDown.setBorder(new LineBorder(Color.BLACK));
	selectRestoDropDown.setBackground(new Color(224, 63, 216));
	selectRestoDropDown.setBounds(360, 12, 547, 41);
	toppanel2.add(selectRestoDropDown);

	centerPanel = new JPanel();
	centerPanel.setPreferredSize(new Dimension(500, 100));
	mainPanel.add(centerPanel, BorderLayout.CENTER);
	centerPanel.setLayout(null);

	rightPanel = new JPanel(null);
	rightPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
	rightPanel.setBounds(779, 98, 323, 425);
	centerPanel.add(rightPanel);

	separator = new JSeparator();
	separator.setBounds(0, 47, 331, 2);
	rightPanel.add(separator);

	lblNewLabel = new JLabel("Menu");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblNewLabel.setBounds(127, 11, 78, 25);
	rightPanel.add(lblNewLabel);

	scrollPane = new JScrollPane();
	scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
	scrollPane.setBounds(0, 47, 323, 378);
	rightPanel.add(scrollPane);

	table = new JTable();
	scrollPane.setViewportView(table);
	table.setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null },
		{ null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
		{ null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
		{ null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
		{ null, null }, { null, null }, }, new String[] { "Item", "Price" }));

	leftPanel = new JPanel(null);
	leftPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
	leftPanel.setBounds(90, 205, 610, 240);
	centerPanel.add(leftPanel);

	addItemLabel = new JLabel("Add Item");
	addItemLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
	addItemLabel.setBounds(10, 11, 297, 32);
	leftPanel.add(addItemLabel);

	itemNameLabel = new JLabel("Item Name :");
	itemNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
	itemNameLabel.setBounds(10, 69, 108, 32);
	leftPanel.add(itemNameLabel);

	itemPriceLabel = new JLabel("Item Price  :");
	itemPriceLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
	itemPriceLabel.setBounds(10, 138, 108, 32);
	leftPanel.add(itemPriceLabel);

	textField = new JTextField();
	textField.setBorder(new LineBorder(new Color(171, 173, 179)));
	textField.setBackground(new Color(151, 203, 255));
	textField.setBounds(152, 65, 384, 36);
	leftPanel.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setBorder(new LineBorder(new Color(171, 173, 179)));
	textField_1.setBackground(new Color(151, 203, 255));
	textField_1.setColumns(10);
	textField_1.setBounds(152, 138, 384, 36);
	leftPanel.add(textField_1);

	addBtn = new JButton("Add");
	addBtn.setBorder(new LineBorder(new Color(0, 0, 0)));
	addBtn.setBackground(new Color(252, 220, 86));
	addBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	addBtn.setBounds(435, 189, 101, 40);
	leftPanel.add(addBtn);

	btnEdit = new JButton("Edit");
	btnEdit.setBorder(new LineBorder(new Color(0, 0, 0)));
	btnEdit.setBackground(new Color(252, 220, 86));
	btnEdit.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnEdit.setBounds(277, 189, 101, 40);
	leftPanel.add(btnEdit);

	btnDelete = new JButton("Delete");
	btnDelete.setBorder(new LineBorder(new Color(0, 0, 0)));
	btnDelete.setBackground(new Color(252, 220, 86));
	btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnDelete.setBounds(125, 189, 101, 40);
	leftPanel.add(btnDelete);

	panel = new JPanel(null);
	panel.setBounds(779, 523, 323, 63);
	centerPanel.add(panel);

	selectBtn = new JButton("Select");
	selectBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	selectBtn.setBorder(new LineBorder(new Color(0, 0, 0)));
	selectBtn.setBackground(new Color(252, 220, 86));
	selectBtn.setBounds(0, 0, 323, 52);
	panel.add(selectBtn);

	saveBtn = new JButton("Save");
	saveBtn.setBorder(new LineBorder(new Color(0, 0, 0)));
	saveBtn.setBackground(new Color(252, 220, 86));
	saveBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	saveBtn.setBounds(263, 500, 164, 45);
	centerPanel.add(saveBtn);

	AdaptToAction();

    }

    private void AdaptToAction() {
	switch (this.action) {
	case "create":
	    // name the title label as Open Menu
	    menuLabel.setText("Create Menu");
	    // hide the delete, edit and select buttons
	    btnDelete.setVisible(false);
	    btnEdit.setVisible(false);
	    selectBtn.setVisible(false);
	    break;
	case "edit":
	    // name the title label as Edit Menu
	    menuLabel.setText("Edit Menu");
	    addItemLabel.setText("Edit Item");
	    break;
	case "delete":
	    // name the title label as Delete Menu
	    menuLabel.setText("Delete Menu");	   
	    // hide the buttons panel
	    leftPanel.setVisible(false);
	    // rename the "save" button to "delete"
	    saveBtn.setText("Delete");
	    break;
	default:
	    break;
	}

    }
}

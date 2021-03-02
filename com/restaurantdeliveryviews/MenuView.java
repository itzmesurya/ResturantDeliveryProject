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
import javax.swing.border.MatteBorder;

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
    private JPanel panel_1;
    private JPanel panel_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    MenuView window = new MenuView("create");
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
	topPanel.setBackground(Color.DARK_GRAY);
	topPanel.setPreferredSize(new Dimension(0, 80));
	topPanel.setFont(new Font("Tahoma", Font.BOLD, 40));
	mainPanel.add(topPanel, BorderLayout.NORTH);
	topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

	menuLabel = new JLabel(" Create Menu ");
	menuLabel.setForeground(Color.WHITE);
	menuLabel.setBackground(Color.WHITE);
	menuLabel.setPreferredSize(new Dimension(300, 50));
	menuLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
	menuLabel.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
	menuLabel.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
	topPanel.add(menuLabel);

	toppanel2 = new JPanel(null);
	topPanel.add(toppanel2);

	selectRestoLabel = new JLabel("Select Restaurant     :");
	selectRestoLabel.setForeground(Color.RED);
	selectRestoLabel.setFont(new Font("Impact", Font.PLAIN, 30));
	selectRestoLabel.setBounds(new Rectangle(57, 12, 289, 41));
	toppanel2.add(selectRestoLabel);

	selectRestoDropDown = new JComboBox();
	selectRestoDropDown.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	selectRestoDropDown.setBackground(Color.WHITE);
	selectRestoDropDown.setBounds(325, 12, 547, 41);
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

	scrollPane = new JScrollPane();
	scrollPane.setFont(new Font("Arial", Font.PLAIN, 20));
	scrollPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	scrollPane.setBounds(0, 47, 323, 378);
	rightPanel.add(scrollPane);

	table = new JTable();
	table.setForeground(new Color(139, 0, 0));
	table.setBackground(new Color(255, 255, 224));
	table.setFont(new Font("Arial", Font.BOLD, 20));
	scrollPane.setViewportView(table);
	table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"Item", "Price"
		}
	));
	table.getColumnModel().getColumn(0).setPreferredWidth(79);
	table.getColumnModel().getColumn(0).setMinWidth(20);
	
	panel_2 = new JPanel();
	panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	panel_2.setBackground(Color.DARK_GRAY);
	panel_2.setBounds(0, 0, 323, 49);
	rightPanel.add(panel_2);
	
		lblNewLabel = new JLabel("Menu");
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 30));

	leftPanel = new JPanel(null);
	leftPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
	leftPanel.setBounds(90, 205, 610, 257);
	centerPanel.add(leftPanel);

	itemNameLabel = new JLabel("Item Name :");
	itemNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
	itemNameLabel.setBounds(10, 69, 135, 32);
	leftPanel.add(itemNameLabel);

	itemPriceLabel = new JLabel("Item Price  :");
	itemPriceLabel.setFont(new Font("Arial", Font.BOLD, 20));
	itemPriceLabel.setBounds(10, 138, 124, 32);
	leftPanel.add(itemPriceLabel);

	textField = new JTextField();
	textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	textField.setBackground(Color.WHITE);
	textField.setBounds(175, 69, 350, 40);
	leftPanel.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
	textField_1.setBackground(Color.WHITE);
	textField_1.setColumns(10);
	textField_1.setBounds(175, 138, 350, 40);
	leftPanel.add(textField_1);

	addBtn = new JButton("Add");
	addBtn.setForeground(Color.WHITE);
	addBtn.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
	addBtn.setBackground(Color.RED);
	addBtn.setFont(new Font("Arial", Font.BOLD, 20));
	addBtn.setBounds(435, 204, 101, 40);
	leftPanel.add(addBtn);

	btnEdit = new JButton("Edit");
	btnEdit.setForeground(Color.WHITE);
	btnEdit.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
	btnEdit.setBackground(Color.RED);
	btnEdit.setFont(new Font("Arial", Font.BOLD, 20));
	btnEdit.setBounds(277, 204, 101, 40);
	leftPanel.add(btnEdit);

	btnDelete = new JButton("Delete");
	btnDelete.setForeground(Color.WHITE);
	btnDelete.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
	btnDelete.setBackground(Color.RED);
	btnDelete.setFont(new Font("Arial", Font.BOLD, 20));
	btnDelete.setBounds(125, 204, 101, 40);
	leftPanel.add(btnDelete);
	
	panel_1 = new JPanel();
	panel_1.setBackground(Color.DARK_GRAY);
	panel_1.setBounds(0, 13, 610, 43);
	leftPanel.add(panel_1);
	
		addItemLabel = new JLabel("Add Item");
		addItemLabel.setForeground(Color.WHITE);
		panel_1.add(addItemLabel);
		addItemLabel.setFont(new Font("Impact", Font.PLAIN, 30));

	panel = new JPanel(null);
	panel.setBounds(779, 523, 323, 63);
	centerPanel.add(panel);

	selectBtn = new JButton("Select");
	selectBtn.setForeground(Color.WHITE);
	selectBtn.setFont(new Font("Arial", Font.BOLD, 20));
	selectBtn.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
	selectBtn.setBackground(Color.RED);
	selectBtn.setBounds(0, 0, 323, 52);
	panel.add(selectBtn);

	saveBtn = new JButton("Save");
	saveBtn.setForeground(Color.WHITE);
	saveBtn.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
	saveBtn.setBackground(Color.RED);
	saveBtn.setFont(new Font("Arial", Font.BOLD, 20));
	saveBtn.setBounds(263, 500, 164, 45);
	centerPanel.add(saveBtn);

	AdaptToAction();

    }

    private void AdaptToAction() {
	switch (this.action) {
	case "create":
	    // name the title label as Open Menu
	    menuLabel.setText("   Create Menu");
	    // hide the delete, edit and select buttons
	    btnDelete.setVisible(false);
	    btnEdit.setVisible(false);
	    selectBtn.setVisible(false);
	    break;
	case "edit":
	    // name the title label as Edit Menu
	    menuLabel.setText("   Edit Menu");
	    addItemLabel.setText("Edit Item");
	    break;
	case "delete":
	    // name the title label as Delete Menu
	    menuLabel.setText("   Delete Menu");	   
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

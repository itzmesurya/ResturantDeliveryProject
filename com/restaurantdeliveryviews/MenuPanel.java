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

public class MenuPanel extends JPanel  {

    private JFrame frame;
    private JTextField itemNameTextField;
    private JTextField itemPriceTextField;
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



    /**
     * Create the application.
     */
    public MenuPanel(String crudAction) {
	action = crudAction;

	this.setLayout(new BorderLayout(0, 0));

	topPanel = new JPanel();
	topPanel.setPreferredSize(new Dimension(0, 80));
	topPanel.setFont(new Font("Tahoma", Font.BOLD, 40));
	this.add(topPanel, BorderLayout.NORTH);
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

	setSelectRestoDropDown(new JComboBox());
	getSelectRestoDropDown().setBorder(new LineBorder(Color.BLACK));
	getSelectRestoDropDown().setBackground(new Color(224, 63, 216));
	getSelectRestoDropDown().setBounds(360, 12, 547, 41);
	toppanel2.add(getSelectRestoDropDown());

	centerPanel = new JPanel();
	centerPanel.setPreferredSize(new Dimension(500, 100));
	this.add(centerPanel, BorderLayout.CENTER);
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

	setTable(new JTable());
	scrollPane.setViewportView(getTable());
	getTable().setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null },
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

	setItemNameTextField(new JTextField());
	getItemNameTextField().setBorder(new LineBorder(new Color(171, 173, 179)));
	getItemNameTextField().setBackground(new Color(151, 203, 255));
	getItemNameTextField().setBounds(152, 65, 384, 36);
	leftPanel.add(getItemNameTextField());
	getItemNameTextField().setColumns(10);

	setItemPriceTextField(new JTextField());
	getItemPriceTextField().setBorder(new LineBorder(new Color(171, 173, 179)));
	getItemPriceTextField().setBackground(new Color(151, 203, 255));
	getItemPriceTextField().setColumns(10);
	getItemPriceTextField().setBounds(152, 138, 384, 36);
	leftPanel.add(getItemPriceTextField());

	setAddBtn(new JButton("Add"));
	getAddBtn().setBorder(new LineBorder(new Color(0, 0, 0)));
	getAddBtn().setBackground(new Color(252, 220, 86));
	getAddBtn().setFont(new Font("Tahoma", Font.BOLD, 15));
	getAddBtn().setBounds(435, 189, 101, 40);
	leftPanel.add(getAddBtn());

	setBtnEdit(new JButton("Edit"));
	getBtnEdit().setBorder(new LineBorder(new Color(0, 0, 0)));
	getBtnEdit().setBackground(new Color(252, 220, 86));
	getBtnEdit().setFont(new Font("Tahoma", Font.BOLD, 15));
	getBtnEdit().setBounds(277, 189, 101, 40);
	leftPanel.add(getBtnEdit());

	setBtnDelete(new JButton("Delete"));
	getBtnDelete().setBorder(new LineBorder(new Color(0, 0, 0)));
	getBtnDelete().setBackground(new Color(252, 220, 86));
	getBtnDelete().setFont(new Font("Tahoma", Font.BOLD, 15));
	getBtnDelete().setBounds(125, 189, 101, 40);
	leftPanel.add(getBtnDelete());

	panel = new JPanel(null);
	panel.setBounds(779, 523, 323, 63);
	centerPanel.add(panel);

	setSelectBtn(new JButton("Select"));
	getSelectBtn().setFont(new Font("Tahoma", Font.BOLD, 15));
	getSelectBtn().setBorder(new LineBorder(new Color(0, 0, 0)));
	getSelectBtn().setBackground(new Color(252, 220, 86));
	getSelectBtn().setBounds(0, 0, 323, 52);
	panel.add(getSelectBtn());

	setSaveBtn(new JButton("Save"));
	getSaveBtn().setBorder(new LineBorder(new Color(0, 0, 0)));
	getSaveBtn().setBackground(new Color(252, 220, 86));
	getSaveBtn().setFont(new Font("Tahoma", Font.BOLD, 15));
	getSaveBtn().setBounds(263, 500, 164, 45);
	centerPanel.add(getSaveBtn());

	AdaptToAction();

    }

    private void AdaptToAction() {
	switch (this.action) {
	case "create":
	    // name the title label as Open Menu
	    menuLabel.setText("Create Menu");
	    // hide the delete, edit and select buttons
	    getBtnDelete().setVisible(false);
	    getBtnEdit().setVisible(false);
	    getSelectBtn().setVisible(false);
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
	    getSaveBtn().setText("Delete");
	    break;
	default:
	    break;
	}

    }

	public JTextField getItemNameTextField() {
		return itemNameTextField;
	}

	public void setItemNameTextField(JTextField itemNameTextField) {
		this.itemNameTextField = itemNameTextField;
	}

	public JTextField getItemPriceTextField() {
		return itemPriceTextField;
	}

	public void setItemPriceTextField(JTextField itemPriceTextField) {
		this.itemPriceTextField = itemPriceTextField;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	/**
	 * @return the btnDelete
	 */
	public JButton getBtnDelete() {
		return btnDelete;
	}

	/**
	 * @param btnDelete the btnDelete to set
	 */
	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	/**
	 * @return the selectBtn
	 */
	public JButton getSelectBtn() {
		return selectBtn;
	}

	/**
	 * @param selectBtn the selectBtn to set
	 */
	public void setSelectBtn(JButton selectBtn) {
		this.selectBtn = selectBtn;
	}

	/**
	 * @return the saveBtn
	 */
	public JButton getSaveBtn() {
		return saveBtn;
	}

	/**
	 * @param saveBtn the saveBtn to set
	 */
	public void setSaveBtn(JButton saveBtn) {
		this.saveBtn = saveBtn;
	}

	/**
	 * @return the addBtn
	 */
	public JButton getAddBtn() {
		return addBtn;
	}

	/**
	 * @param addBtn the addBtn to set
	 */
	public void setAddBtn(JButton addBtn) {
		this.addBtn = addBtn;
	}

	/**
	 * @return the selectRestoDropDown
	 */
	public JComboBox getSelectRestoDropDown() {
		return selectRestoDropDown;
	}

	/**
	 * @param selectRestoDropDown the selectRestoDropDown to set
	 */
	public void setSelectRestoDropDown(JComboBox selectRestoDropDown) {
		this.selectRestoDropDown = selectRestoDropDown;
	}
}

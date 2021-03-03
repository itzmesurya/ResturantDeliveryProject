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

import com.restaurantdeliverymodels.CRUDAction;

public class MenuPanel extends JPanel {

	private JFrame frame;
	private static JTextField itemNameTextField;
	private static JTextField itemPriceTextField;
	private static JTable table;
	private JPanel rightPanel;
	private String action;
	private static JButton btnEdit;
	private static JButton btnDelete;
	private static JButton selectBtn;
	private static JButton saveBtn;
	private JPanel panel;
	private static JButton addBtn;
	private JLabel itemPriceLabel;
	private JLabel itemNameLabel;
	private JLabel addItemLabel;
	private JPanel leftPanel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JPanel centerPanel;
	private static JComboBox selectRestoDropDown;
	private JLabel selectRestoLabel;
	private JPanel toppanel2;
	private JLabel menuLabel;
	private JPanel topPanel;
	private JPanel panel_2;
	private JPanel panel_1;

	/**
	 * Create the application.
	 */
	public MenuPanel(CRUDAction crudAction) {

		this.setLayout(new BorderLayout(0, 0));

		topPanel = new JPanel();
		topPanel.setBackground(Color.DARK_GRAY);
		topPanel.setPreferredSize(new Dimension(0, 80));
		topPanel.setFont(new Font("Tahoma", Font.BOLD, 40));
		this.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

		menuLabel = new JLabel(" Create Menu ");
		menuLabel.setForeground(Color.WHITE);
		menuLabel.setBackground(Color.WHITE);
		menuLabel.setPreferredSize(new Dimension(300, 50));
		menuLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
		menuLabel.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
		topPanel.add(menuLabel);

		toppanel2 = new JPanel(null);
		topPanel.add(toppanel2);
		selectRestoLabel = new JLabel("Select Restaurant     :");
		selectRestoLabel.setForeground(Color.RED);
		selectRestoLabel.setFont(new Font("Impact", Font.PLAIN, 30));
		selectRestoLabel.setBounds(new Rectangle(57, 12, 289, 41));
		toppanel2.add(selectRestoLabel);

		setSelectRestoDropDown(new JComboBox());
		getSelectRestoDropDown().setFont(MainFrame.labelFont);
		getSelectRestoDropDown().setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		getSelectRestoDropDown().setBackground(Color.WHITE);
		getSelectRestoDropDown().setBounds(325, 12, 547, 41);
		toppanel2.add(getSelectRestoDropDown());

		centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(500, 100));
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);

		rightPanel = new JPanel(null);
		rightPanel.setBackground(Color.WHITE);
		rightPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightPanel.setBounds(779, 98, 323, 425);
		centerPanel.add(rightPanel);

		separator = new JSeparator();
		separator.setBounds(0, 47, 331, 2);
		rightPanel.add(separator);

		panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 0, 323, 49);
		rightPanel.add(panel_2);

		lblNewLabel = new JLabel("Menu");
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 30));

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(0, 47, 323, 378);
		rightPanel.add(scrollPane);

		setTable(new JTable());
		getTable().setForeground(new Color(139, 0, 0));
		getTable().setBackground(new Color(255, 255, 224));
		scrollPane.setViewportView(getTable());
		getTable().setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Item", "Price" }));
		getTable().getColumnModel().getColumn(0).setPreferredWidth(79);
		getTable().getColumnModel().getColumn(0).setMinWidth(20);

		leftPanel = new JPanel(null);
		leftPanel.setBackground(Color.WHITE);
		leftPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		leftPanel.setBounds(90, 205, 610, 257);
		centerPanel.add(leftPanel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 13, 610, 43);
		leftPanel.add(panel_1);

		addItemLabel = new JLabel("Add Item");
		addItemLabel.setForeground(Color.WHITE);
		panel_1.add(addItemLabel);
		addItemLabel.setFont(new Font("Impact", Font.PLAIN, 30));

		itemNameLabel = new JLabel("Item Name :");
		itemNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
		itemNameLabel.setBounds(10, 69, 135, 32);
		leftPanel.add(itemNameLabel);

		itemPriceLabel = new JLabel("Item Price  :");
		itemPriceLabel.setFont(new Font("Arial", Font.BOLD, 20));
		itemPriceLabel.setBounds(10, 138, 124, 32);
		leftPanel.add(itemPriceLabel);

		setItemNameTextField(new JTextField());
		getItemNameTextField().setFont(MainFrame.labelFont);
		getItemNameTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getItemNameTextField().setBackground(Color.WHITE);
		getItemNameTextField().setBounds(175, 69, 350, 40);
		leftPanel.add(getItemNameTextField());
		getItemNameTextField().setColumns(10);

		setItemPriceTextField(new JTextField());
		getItemPriceTextField().setFont(MainFrame.labelFont);
		getItemPriceTextField().setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		getItemPriceTextField().setBackground(Color.WHITE);
		getItemPriceTextField().setColumns(10);
		getItemPriceTextField().setBounds(175, 138, 350, 40);
		leftPanel.add(getItemPriceTextField());

		setAddBtn(new JButton("Add"));
		getAddBtn().setForeground(Color.WHITE);
		getAddBtn().setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		getAddBtn().setBackground(Color.RED);
		getAddBtn().setFont(new Font("Arial", Font.BOLD, 20));
		getAddBtn().setBounds(435, 204, 101, 40);
		leftPanel.add(getAddBtn());

		setBtnEdit(new JButton("Edit"));
		getBtnEdit().setForeground(Color.WHITE);
		getBtnEdit().setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		getBtnEdit().setBackground(Color.RED);
		getBtnEdit().setFont(new Font("Arial", Font.BOLD, 20));
		getBtnEdit().setBounds(277, 204, 101, 40);
		leftPanel.add(getBtnEdit());

		setBtnDelete(new JButton("Delete"));
		getBtnDelete().setForeground(Color.WHITE);
		getBtnDelete().setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		getBtnDelete().setBackground(Color.RED);
		getBtnDelete().setFont(new Font("Arial", Font.BOLD, 20));
		getBtnDelete().setBounds(125, 204, 101, 40);
		leftPanel.add(getBtnDelete());

		panel = new JPanel(null);
		panel.setBounds(779, 523, 323, 63);
		centerPanel.add(panel);

		setSelectBtn(new JButton("Select"));
		getSelectBtn().setForeground(Color.WHITE);
		getSelectBtn().setFont(new Font("Arial", Font.BOLD, 20));
		getSelectBtn().setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		getSelectBtn().setBackground(Color.RED);
		getSelectBtn().setBounds(0, 0, 323, 52);
		panel.add(getSelectBtn());

		setSaveBtn(new JButton("Save"));
		getSaveBtn().setForeground(Color.WHITE);
		getSaveBtn().setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		getSaveBtn().setBackground(Color.RED);
		getSaveBtn().setFont(new Font("Arial", Font.BOLD, 20));
		getSaveBtn().setBounds(263, 500, 164, 45);
		centerPanel.add(getSaveBtn());

		switch (crudAction) {
		case Create:
			// name the title label as Open Menu
			menuLabel.setText("   Create Menu");
			// hide the delete, edit and select buttons
			getBtnDelete().setVisible(false);
			getBtnEdit().setVisible(false);
			getSelectBtn().setVisible(false);
			break;
		case Edit:
			// name the title label as Edit Menu
			menuLabel.setText("   Edit Menu");
			addItemLabel.setText("Edit Item");
			break;
		case Delete:
			// name the title label as Delete Menu
			menuLabel.setText("   Delete Menu");
			// hide the buttons panel
			leftPanel.setVisible(false);
			// rename the "save" button to "delete"
			getSaveBtn().setText("Delete");
			break;
		default:
			break;
		}

	}

	public static JTextField getItemNameTextField() {
		return itemNameTextField;
	}

	public void setItemNameTextField(JTextField itemNameTextField) {
		this.itemNameTextField = itemNameTextField;
	}

	public static JTextField getItemPriceTextField() {
		return itemPriceTextField;
	}

	public void setItemPriceTextField(JTextField itemPriceTextField) {
		this.itemPriceTextField = itemPriceTextField;
	}

	public static JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public static JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	/**
	 * @return the btnDelete
	 */
	public static JButton getBtnDelete() {
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
	public static JButton getSelectBtn() {
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
	public static JButton getSaveBtn() {
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
	public static JButton getAddBtn() {
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
	public static JComboBox getSelectRestoDropDown() {
		return selectRestoDropDown;
	}

	/**
	 * @param selectRestoDropDown the selectRestoDropDown to set
	 */
	public void setSelectRestoDropDown(JComboBox selectRestoDropDown) {
		this.selectRestoDropDown = selectRestoDropDown;
	}
}

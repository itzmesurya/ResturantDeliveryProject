package com.restaurantdeliveryviews;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class OrderPanel extends JPanel {

	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	static JTable table;
	static JTable table_1;
	private static JLabel label;
	static JRadioButton Progress_RadioButton;
	static JRadioButton Incoming_RadioButton;
	static JComboBox selectR_comboBox;
	static JButton Accept_btn;
	private static JLabel lblNewLabel_2;
public OrderPanel() {
	
	
	JPanel Opanel = new JPanel();
	Opanel.setBackground(Color.WHITE);
	
	GroupLayout groupLayout = new GroupLayout(this);
	groupLayout.setHorizontalGroup(
		groupLayout.createParallelGroup(Alignment.TRAILING)
			.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(Opanel, GroupLayout.DEFAULT_SIZE, 1136, Short.MAX_VALUE)
				.addGap(38))
	);
	groupLayout.setVerticalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(Opanel, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
	);
	
//	JLabel lblNewLabel = new JLabel("Accept Order");
//	lblNewLabel.setPreferredSize(new Dimension(300, 50));
//	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//	lblNewLabel.setForeground(Color.WHITE);
//	lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
//	lblNewLabel.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
//	lblNewLabel.setBackground(Color.BLACK);
////	.add();
//	panel_5.add(lblNewLabel);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
	panel_1.setForeground(Color.BLACK);
	panel_1.setBackground(Color.WHITE);
	
	JLabel lblNewLabel_1 = new JLabel("Delivery Date");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	
	textField = new JTextField();
	textField.setBackground(Color.white);
	textField.setColumns(10);
	
	JLabel lblDeliveryTime = new JLabel("Delivery Time");
	lblDeliveryTime.setFont(new Font("Tahoma", Font.BOLD, 14));
	
	textField_1 = new JTextField();
	textField_1.setBackground(Color.white);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setBackground(Color.white);
	textField_2.setColumns(10);
	
	JLabel lblPostalCode = new JLabel("Address");
	lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 14));
	
	textField_3 = new JTextField();
	textField_3.setBackground(Color.white);
	textField_3.setColumns(10);
	GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	gl_panel_1.setHorizontalGroup(
		gl_panel_1.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_1.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblPostalCode, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblDeliveryTime, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addComponent(lblNewLabel_1))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addComponent(textField_3))
				.addContainerGap(41, Short.MAX_VALUE))
	);
	gl_panel_1.setVerticalGroup(
		gl_panel_1.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_1.createSequentialGroup()
				.addGap(31)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel_1))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblDeliveryTime, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblPostalCode, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(57, Short.MAX_VALUE))
	);
	panel_1.setLayout(gl_panel_1);
	
	JScrollPane Meal_scrollPane = new JScrollPane();
	Meal_scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
	Meal_scrollPane.setBackground(Color.white);
	
	Accept_btn = new JButton("Accept");
	Accept_btn.setBackground(Color.RED);
	Accept_btn.setForeground(Color.WHITE);
	Accept_btn.setFont(new Font("Arial", Font.BOLD, 14));
	
	JScrollPane Order_scrollPane = new JScrollPane();
	Order_scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
	Order_scrollPane.setBackground(Color.white);
	table = new JTable();
	table.setBackground(Color.white);
	table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"Meal in Order"
		}
	));
	table.setBackground(Color.white);
	Meal_scrollPane.setViewportView(table);
	
	table_1 = new JTable();
	table_1.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			""
			+ "Orders" 
		}
	));
	Order_scrollPane.setViewportView(table_1);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBorder(null);
	panel_2.setBackground( Color.white);
	
	setLblNewLabel_2(new JLabel("Select Restaurant"));
	getLblNewLabel_2().setForeground(Color.RED);
	getLblNewLabel_2().setFont(new Font("Arial", Font.BOLD, 20));
	
	
	selectR_comboBox = new JComboBox();
	selectR_comboBox.setForeground(Color.WHITE);
	selectR_comboBox.setBackground(Color.WHITE);
	
	Progress_RadioButton = new JRadioButton("In Progress");
	Progress_RadioButton.setFont(new Font("Arial", Font.BOLD, 14));
	Progress_RadioButton.setBackground(Color.white);

//	start from here//
	Incoming_RadioButton = new JRadioButton("In Coming");
	Incoming_RadioButton.setBackground(Color.white);
	Incoming_RadioButton.setFont(new Font("Arial", Font.BOLD, 14));
	JPanel panel_3 = new JPanel();
	panel_3.setBackground(Color.BLACK);
	panel_3.setForeground(Color.WHITE);
	
	JPanel panel_4 = new JPanel();
	panel_4.setBackground(Color.BLACK);
	
	
	JPanel panel_5 = new JPanel();
	panel_5.setBackground(Color.BLACK);
	GroupLayout gl_panel = new GroupLayout(Opanel);
	gl_panel.setHorizontalGroup(
		gl_panel.createParallelGroup(Alignment.TRAILING)
			.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(52)
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(getLblNewLabel_2())
							.addGap(27))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(156)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Meal_scrollPane, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(Accept_btn, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
						.addGap(127)))
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(42)
								.addComponent(Progress_RadioButton)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Incoming_RadioButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addGap(79))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(selectR_comboBox, 0, 342, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGap(96))
					.addGroup(gl_panel.createSequentialGroup()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(56)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(panel_3, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(Order_scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
						.addContainerGap(42, Short.MAX_VALUE))))
	);
	gl_panel.setVerticalGroup(
		gl_panel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel.createSequentialGroup()
				.addGap(33)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(selectR_comboBox, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addComponent(getLblNewLabel_2()))
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(Incoming_RadioButton)
							.addComponent(Progress_RadioButton))
						.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(Order_scrollPane, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(42)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Meal_scrollPane, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addComponent(Accept_btn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
				.addGap(27))
			.addGroup(gl_panel.createSequentialGroup()
				.addGap(23)
				.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(655, Short.MAX_VALUE))
	);
	
	 label = new JLabel("Accept Order");
	label.setPreferredSize(new Dimension(300, 50));
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setForeground(Color.WHITE);
	label.setFont(MainFrame.headerFont);
	label.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
	label.setBackground(Color.BLACK);
	panel_5.add(label);
	
	JLabel lblNewLabel_4 = new JLabel("Meal In Order");
	lblNewLabel_4.setForeground(Color.WHITE);
	lblNewLabel_4.setFont(MainFrame.titleFont);
	GroupLayout gl_panel_4 = new GroupLayout(panel_4);
	gl_panel_4.setHorizontalGroup(
		gl_panel_4.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_4.createSequentialGroup()
				.addGap(218)
				.addComponent(lblNewLabel_4)
				.addContainerGap(218, Short.MAX_VALUE))
	);
	gl_panel_4.setVerticalGroup(
		gl_panel_4.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_4.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblNewLabel_4)
				.addContainerGap(16, Short.MAX_VALUE))
	);
	panel_4.setLayout(gl_panel_4);
	
	JLabel lblNewLabel_3 = new JLabel("Orders");
	lblNewLabel_3.setForeground(Color.WHITE);
	lblNewLabel_3.setFont(MainFrame.titleFont);
	GroupLayout gl_panel_3 = new GroupLayout(panel_3);
	gl_panel_3.setHorizontalGroup(
		gl_panel_3.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_3.createSequentialGroup()
				.addGap(137)
				.addComponent(lblNewLabel_3)
				.addContainerGap(157, Short.MAX_VALUE))
	);
	gl_panel_3.setVerticalGroup(
		gl_panel_3.createParallelGroup(Alignment.LEADING)
			.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
				.addContainerGap(34, Short.MAX_VALUE)
				.addComponent(lblNewLabel_3)
				.addContainerGap())
	);
	panel_3.setLayout(gl_panel_3);
	
//	JButton Select_btn = new JButton("Select");
//	Select_btn.setBackground(Color.RED);
//	Select_btn.setForeground(Color.WHITE);
//	Select_btn.setFont(new Font("Arial", Font.BOLD, 14));
//	GroupLayout gl_panel_2 = new GroupLayout(panel_2);
//	gl_panel_2.setHorizontalGroup(
//		gl_panel_2.createParallelGroup(Alignment.LEADING)
//			.addGroup(gl_panel_2.createSequentialGroup()
//				.addGap(53)
//				.addComponent(Select_btn, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
//				.addContainerGap(14, Short.MAX_VALUE))
//	);
//	gl_panel_2.setVerticalGroup(
//		gl_panel_2.createParallelGroup(Alignment.LEADING)
//			.addGroup(gl_panel_2.createSequentialGroup()
//				.addComponent(Select_btn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
//				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//	);
//
//	panel_2.setLayout(gl_panel_2);
	Opanel.setLayout(gl_panel);
//	frame.getContentPane().setLayout(groupLayout);

}
public static JTextField getTextField() {
	return textField;
}
public static JTextField getTextField_1() {
	return textField_1;
}
public static JTextField getTextField_2() {
	return textField_2;
}
public static JTextField getTextField_3() {
	return textField_3;
}
public static JTable getTable() {
	return table;
}
public static JTable getTable_1() {
	return table_1;
}
public static JRadioButton getProgress_RadioButton() {
	return Progress_RadioButton;
}
public static JComboBox getSelectR_comboBox() {
	return selectR_comboBox;
}
public static JRadioButton getIncoming_RadioButton() {
	return Incoming_RadioButton;
}
public static JButton getAccept_btn() {
		return Accept_btn;
}
public void setAccept_btn(JButton accept_btn) {
	Accept_btn = accept_btn;
}
public void setIncoming_RadioButton(JRadioButton incoming_RadioButton) {
	Incoming_RadioButton = incoming_RadioButton;
}
public void setSelectR_comboBox(JComboBox selectR_comboBox) {
	this.selectR_comboBox = selectR_comboBox;
}
public void setTextField(JTextField textField) {
	this.textField = textField;
}
public void setTextField_1(JTextField textField_1) {
	this.textField_1 = textField_1;
}
public void setTextField_2(JTextField textField_2) {
	this.textField_2 = textField_2;
}
public void setTextField_3(JTextField textField_3) {
	this.textField_3 = textField_3;
}
public void setTable(JTable table) {
	this.table = table;
}
public void setTable_1(JTable table_1) {
	this.table_1 = table_1;
}
public static JLabel getlabel() {
	return label;
}
public void setProgress_RadioButton(JRadioButton progress_RadioButton) {
	Progress_RadioButton = progress_RadioButton;
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
/**
 * @return the lblNewLabel_2
 */
public static JLabel getLblNewLabel_2() {
	return lblNewLabel_2;
}
/**
 * @param lblNewLabel_2 the lblNewLabel_2 to set
 */
static void setLblNewLabel_2(JLabel lblNewLabel_2) {
	OrderPanel.lblNewLabel_2 = lblNewLabel_2;
}

}

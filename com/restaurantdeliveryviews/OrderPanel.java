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

	private JTextField textField,textField_1,textField_2,textField_3;
	  JTable table,table_1;
	  JRadioButton Progress_RadioButton;
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
	
	JLabel lblNewLabel = new JLabel("Accept Order");
	lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
	lblNewLabel.setForeground(Color.BLACK);
	lblNewLabel.setBackground(Color.WHITE);
	lblNewLabel.setPreferredSize(new Dimension(300, 50));
	lblNewLabel.setBorder(new MatteBorder(2, 0, 2, 2, (Color) new Color(0, 0, 0)));
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
	Opanel.add(lblNewLabel);
	
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
	
	JLabel lblPostalCode = new JLabel("Postal Code");
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
	
	JButton Accept_btn = new JButton("Accept");
	Accept_btn.setBackground(Color.BLACK);
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
	
	JLabel lblNewLabel_2 = new JLabel("Select Restaurant");
	lblNewLabel_2.setForeground(Color.RED);
	lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
	
	
	JComboBox selectR_comboBox = new JComboBox();
	selectR_comboBox.setForeground(Color.WHITE);
	selectR_comboBox.setBackground(Color.WHITE);
	
	Progress_RadioButton = new JRadioButton("In Progress");
	Progress_RadioButton.setFont(new Font("Arial", Font.BOLD, 14));
	Progress_RadioButton.setBackground(Color.white);

//	start from here//
	JRadioButton Incoming_RadioButton = new JRadioButton("In Coming");
	Incoming_RadioButton.setBackground(Color.white);
	Incoming_RadioButton.setFont(new Font("Arial", Font.BOLD, 14));
	GroupLayout gl_panel = new GroupLayout(Opanel);
	gl_panel.setHorizontalGroup(
		gl_panel.createParallelGroup(Alignment.TRAILING)
			.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(57)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2)
							.addGap(27))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(156)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(Meal_scrollPane, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(Accept_btn, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
						.addGap(127)))
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(Progress_RadioButton)
								.addGap(18)
								.addComponent(Incoming_RadioButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addGap(157))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(Order_scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
									.addComponent(selectR_comboBox, 0, 396, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGap(96))
					.addGroup(gl_panel.createSequentialGroup()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())))
	);
	gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(selectR_comboBox, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(Progress_RadioButton)
						.addComponent(Incoming_RadioButton))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
							.addComponent(Meal_scrollPane, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(Order_scrollPane, GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
							.addGap(18)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(Accept_btn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(27))
		);

	JButton Select_btn = new JButton("Select");
	Select_btn.setBackground( Color.black);
	Select_btn.setForeground(Color.WHITE);
	Select_btn.setFont(new Font("Arial", Font.BOLD, 14));
	GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	gl_panel_2.setHorizontalGroup(
		gl_panel_2.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_2.createSequentialGroup()
				.addContainerGap()
				.addComponent(Select_btn, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(14, Short.MAX_VALUE))
	);
	gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(Select_btn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
	panel_2.setLayout(gl_panel_2);
	Opanel.setLayout(gl_panel);
//	frame.getContentPane().setLayout(groupLayout);

}
public JTextField getTextField() {
	return textField;
}
public JTextField getTextField_1() {
	return textField_1;
}
public JTextField getTextField_2() {
	return textField_2;
}
public JTextField getTextField_3() {
	return textField_3;
}
public JTable getTable() {
	return table;
}
public JTable getTable_1() {
	return table_1;
}
public JRadioButton getProgress_RadioButton() {
	return Progress_RadioButton;
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

}

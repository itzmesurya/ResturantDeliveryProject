package com.restaurantdeliveryviews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class DeliveryPanel3 extends JPanel {
	
	private JTextField pass_Field;
	private JTextField ConfirmPass_Field;
	private JTextField Phone_Field;
	private JTextField Name_Field;
	private JTextField textField;
	private JTextField textField_1;
	private JTable Darea_table;
	
	public DeliveryPanel3() {
		
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(0, 80));
		topPanel.setBackground(MainFrame.offColor);
		this.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setPreferredSize(new Dimension(300, 50));
		lblNewLabel.setBackground(MainFrame.offColor);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setFont(MainFrame.headerFont);
		topPanel.add(lblNewLabel);
		
		JPanel Panel_2 = new JPanel();
		Panel_2.setPreferredSize(new Dimension(500, 30));
		Panel_2.setBackground(Color.white);
		topPanel.add(Panel_2);
		Panel_2.setLayout(null);
		
		JLabel lbl_2 = new JLabel("Deliveryman Name: ");
		lbl_2.setBackground(Color.white);
		lbl_2.setForeground(MainFrame.mainColor);
		lbl_2.setBounds(55, 12, 296, 58);
		lbl_2.setFont(MainFrame.titleFont);
		Panel_2.add(lbl_2);
		
		
		JComboBox selectR_comboBox = new JComboBox();
		selectR_comboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		selectR_comboBox.setBackground(Color.white);
		selectR_comboBox.setPreferredSize(new Dimension(500, 36));
		selectR_comboBox.setFont(MainFrame.labelFont);
		selectR_comboBox.setBounds(329, 22, 500, 36);
		Panel_2.add(selectR_comboBox);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(0, 80));
		bottomPanel.setBackground(Color.WHITE);
		this.add(bottomPanel, BorderLayout.SOUTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setPreferredSize(new Dimension(500, 0));
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);
		
		JPanel panel_C002 = new JPanel();
		panel_C002.setBackground(Color.white);
		panel_C002.setBounds(59, 250, 600, 350);
		panel_C002.setPreferredSize(new Dimension(600, 350));
		centerPanel.add(panel_C002);
		
		JPanel panel_C2 = new JPanel();
		panel_C2.setBackground(Color.white);
		panel_C2.setBounds(59, 350, 600, 230);
		panel_C2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C2.setPreferredSize(new Dimension(600, 230));
		panel_C002.add(panel_C2);
		
		JPanel Panel_C21 = new JPanel();
		Panel_C21.setBackground(MainFrame.offColor);		
		Panel_C21.setPreferredSize(new Dimension(596, 50));
		panel_C2.add(Panel_C21);
		Panel_C21.setLayout(new BoxLayout(Panel_C21, BoxLayout.X_AXIS));
		
		JLabel lbl_C21 = new JLabel("Login Information");
		lbl_C21.setForeground(Color.white);
		lbl_C21.setFont(MainFrame.titleFont);
		Panel_C21.add(lbl_C21);
		
		JPanel Panel_C22 = new JPanel();
		Panel_C22.setPreferredSize(new Dimension(580, 50));
		Panel_C22.setBackground(Color.white);
		panel_C2.add(Panel_C22);
		
		JLabel lbl_C221 = new JLabel("User Name: ");
		lbl_C221.setPreferredSize(new Dimension(200, 40));
		lbl_C221.setForeground(Color.black);
		lbl_C221.setFont(MainFrame.labelFont);
		Panel_C22.add(lbl_C221);
		
		JTextField User_Field = new JTextField();
		User_Field.setBackground(Color.white);
		User_Field.setPreferredSize(new Dimension(350, 40));
		User_Field.setFont(MainFrame.labelFont);
		User_Field.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		Panel_C22.add(User_Field);
		
		JPanel Panel_C23 = new JPanel();
		Panel_C23.setPreferredSize(new Dimension(580, 50));
		Panel_C23.setBackground(Color.WHITE);
		panel_C2.add(Panel_C23);
		
		JLabel lbl_C231 = new JLabel("Password:");
		lbl_C231.setPreferredSize(new Dimension(200, 40));
		lbl_C231.setForeground(Color.BLACK);
		lbl_C231.setFont(null);
		Panel_C23.add(lbl_C231);
		
		pass_Field = new JTextField();
		pass_Field.setPreferredSize(new Dimension(350, 40));
		pass_Field.setFont(null);
		pass_Field.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		pass_Field.setBackground(Color.WHITE);
		Panel_C23.add(pass_Field);
		
		JPanel Panel_C24 = new JPanel();
		Panel_C24.setPreferredSize(new Dimension(580, 50));
		Panel_C24.setBackground(Color.WHITE);
		panel_C2.add(Panel_C24);
		
		JLabel lbl_C241 = new JLabel("Confirm Password:");
		lbl_C241.setPreferredSize(new Dimension(200, 40));
		lbl_C241.setForeground(Color.BLACK);
		lbl_C241.setFont(null);
		Panel_C24.add(lbl_C241);
		
		ConfirmPass_Field = new JTextField();
		ConfirmPass_Field.setPreferredSize(new Dimension(350, 40));
		ConfirmPass_Field.setFont(null);
		ConfirmPass_Field.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		ConfirmPass_Field.setBackground(Color.WHITE);
		Panel_C24.add(ConfirmPass_Field);
		
		JButton Uavailable_btn = new JButton("Veryfy Username availability");
		Uavailable_btn.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		Uavailable_btn.setBackground(MainFrame.mainColor);
		Uavailable_btn.setPreferredSize(new Dimension(500, 50));
		Uavailable_btn.setForeground(Color.white);
		Uavailable_btn.setFont(MainFrame.titleFont);
		panel_C002.add(Uavailable_btn);
		
		JButton Save_btn = new JButton("Save");
		Save_btn.setPreferredSize(new Dimension(500, 50));
		Save_btn.setForeground(Color.WHITE);
		Save_btn.setFont(null);
		Save_btn.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		Save_btn.setBackground((Color) null);
		panel_C002.add(Save_btn);
		
		JPanel panel_C1 = new JPanel();
		panel_C1.setBounds(59, 35, 600, 180);
		panel_C1.setBackground(Color.white);
		panel_C1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C1.setPreferredSize(new Dimension(600, 180));
		centerPanel.add(panel_C1);
		
		JPanel Panel_C11 = new JPanel();
		Panel_C11.setBackground(MainFrame.offColor);		
		Panel_C11.setPreferredSize(new Dimension(596, 50));
		panel_C1.add(Panel_C11);
		Panel_C11.setLayout(new BoxLayout(Panel_C11, BoxLayout.X_AXIS));
		
		JLabel lbl_C11 = new JLabel("Persnol Information");
		lbl_C11.setForeground(Color.white);
		lbl_C11.setFont(MainFrame.titleFont);
		Panel_C11.add(lbl_C11);
		
		JPanel Panel_C12 = new JPanel();
		Panel_C12.setPreferredSize(new Dimension(580, 50));
		Panel_C12.setBackground(Color.WHITE);
		panel_C1.add(Panel_C12);
		
		JLabel lbl_C12 = new JLabel("Name: ");
		lbl_C12.setPreferredSize(new Dimension(200, 40));
		lbl_C12.setForeground(Color.BLACK);
		lbl_C12.setFont(null);
		Panel_C12.add(lbl_C12);
		
		Name_Field = new JTextField();
		Name_Field.setPreferredSize(new Dimension(350, 40));
		Name_Field.setFont(null);
		Name_Field.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		Name_Field.setBackground(Color.WHITE);
		Panel_C12.add(Name_Field);
		
		JPanel Panel_C13 = new JPanel();
		Panel_C13.setPreferredSize(new Dimension(580, 50));
		Panel_C13.setBackground(Color.WHITE);
		panel_C1.add(Panel_C13);
		
		JLabel lbl_C13 = new JLabel("TelePhone Number:");
		lbl_C13.setPreferredSize(new Dimension(200, 40));
		lbl_C13.setForeground(Color.BLACK);
		lbl_C13.setFont(null);
		Panel_C13.add(lbl_C13);
		
		Phone_Field = new JTextField();
		Phone_Field.setPreferredSize(new Dimension(350, 40));
		Phone_Field.setFont(null);
		Phone_Field.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		Phone_Field.setBackground(Color.WHITE);
		Panel_C13.add(Phone_Field);
		
		JPanel panel_C3 = new JPanel();
		panel_C3.setBounds(717, 35, 400, 550);
		panel_C3.setBackground(Color.white);
		panel_C3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_C3.setPreferredSize(new Dimension(400, 550));
		centerPanel.add(panel_C3);
		panel_C3.setLayout(new BorderLayout(0, 0));
		
		JPanel Panel_C31 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) Panel_C31.getLayout();
		Panel_C31.setPreferredSize(new Dimension(396, 50));
		Panel_C31.setBackground(MainFrame.offColor);
		Panel_C31.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_C3.add(Panel_C31, BorderLayout.NORTH);
		
		JLabel lbl_C311 = new JLabel("Delivery Area");
		lbl_C311.setPreferredSize(new Dimension(150, 30));
		lbl_C311.setForeground(Color.white);
		lbl_C311.setFont(MainFrame.titleFont);
		Panel_C31.add(lbl_C311);
		
		JPanel Panel_C33 = new JPanel();
		Panel_C33.setBackground(Color.white);
		Panel_C33.setPreferredSize(new Dimension(396, 115));
		Panel_C33.setBorder(null);
		panel_C3.add(Panel_C33, BorderLayout.SOUTH);
		
		JPanel Panel_C331 = new JPanel();
		Panel_C331.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		Panel_C331.setPreferredSize(new Dimension(400, 50));
		Panel_C331.setBackground(Color.WHITE);
		Panel_C33.add(Panel_C331);
		
		textField_1 = new JTextField();
		textField_1.setPreferredSize(new Dimension(350, 40));
		textField_1.setFont(null);
		textField_1.setBorder(new LineBorder(new Color(0,0,0), 2, true));
		textField_1.setBackground(Color.WHITE);
		Panel_C331.add(textField_1);
		
		JButton Add_btn = new JButton("Add");
		Add_btn.setPreferredSize(new Dimension(120, 50));
		Add_btn.setForeground(Color.WHITE);
		Add_btn.setFont(null);
		Add_btn.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		Add_btn.setBackground((Color) null);
		Panel_C33.add(Add_btn);
		
		JLabel lbl_C332 = new JLabel("                              ");
		Panel_C33.add(lbl_C332);
		
		JButton Delete_btn = new JButton("Delete");
		Delete_btn.setPreferredSize(new Dimension(120, 50));
		Delete_btn.setForeground(Color.WHITE);
		Delete_btn.setFont(null);
		Delete_btn.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		Delete_btn.setBackground((Color) null);
		Panel_C33.add(Delete_btn);
		
		JPanel panel_C32 = new JPanel();
		panel_C32.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_C32.setBackground(Color.WHITE);
		panel_C3.add(panel_C32, BorderLayout.CENTER);
		
		JScrollPane scrollPane_C3 = new JScrollPane();
		scrollPane_C3.setBackground(Color.white);
		scrollPane_C3.setPreferredSize(new Dimension(400, 440));
		panel_C32.add(scrollPane_C3);
		
		Darea_table = new JTable();
		Darea_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		scrollPane_C3.setViewportView(Darea_table);
		
	}

	public JTextField getPass_Field() {
		return pass_Field;
	}

	public JTextField getConfirmPass_Field() {
		return ConfirmPass_Field;
	}

	public JTextField getPhone_Field() {
		return Phone_Field;
	}

	public JTextField getName_Field() {
		return Name_Field;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTable getDarea_table() {
		return Darea_table;
	}
	
	

}

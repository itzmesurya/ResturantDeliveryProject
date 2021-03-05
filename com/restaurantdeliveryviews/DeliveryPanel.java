package com.restaurantdeliveryviews;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.restaurantdeliverymodels.Database;
import com.restaurantdeliverymodels.Deliveryman;

public class DeliveryPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField Name_Field;
	private static JTextField Phone_Field;
	private static JTextField Darea_Field;
	private static JTextField User_Field;
	private static JTextField pass_Field;
	private static JTextField ConfirmPass_Field;	
	private static JTable Darea_table;
//	private String action;
	private static JLabel lblNewLabel;
	private static JComboBox selectR_comboBox;
	public Object getDarea_table;
	public static JButton Save_btn;
//	ArrayList<String> usernamelist = new ArrayList<String>();
	public static JButton Add_btn;
	public static JButton Delete_btn;
	public static JButton Verify_btn;
	private static JLabel lblNewLabel_2;
	
	public DeliveryPanel() {
		 
//		action = crudAction;
//		JPanel DeliveryPanel = new JPanel();
		JPanel Dpanel = new JPanel();
		Dpanel.setBackground(Color.WHITE);
		
		
		
		
		GroupLayout groupLayout = new GroupLayout( this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(88)
				.addComponent(Dpanel, GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(Dpanel, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
		);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout1 = new GroupLayout(this);
		groupLayout1.setHorizontalGroup(
			groupLayout1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout1.createSequentialGroup()
					.addGap(88)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout1.setVerticalGroup(
			groupLayout1.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
		);
		

			
		
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setForeground(Color.DARK_GRAY);
			panel_1.setBackground(Color.WHITE);
			
			JLabel lblNewLabel_1 = new JLabel("Name");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));;
			
			Name_Field = new JTextField();
			Name_Field.setBackground(Color.white);
			Name_Field.setColumns(10);
			
			JLabel lblPostalCode = new JLabel("TelePhone Number");
			lblPostalCode.setFont(new Font("Arial", Font.PLAIN, 20));
			
			Phone_Field = new JTextField();
			Phone_Field.setBackground(Color.white);
			Phone_Field.setColumns(10);
			
			JLabel lblPersnolInformation = new JLabel("Personal Information");
			lblPersnolInformation.setFont(new Font("Impact", Font.PLAIN, 30));
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(47)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_1)
							.addComponent(lblPostalCode))
						.addGap(114)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(Phone_Field, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
							.addComponent(Name_Field, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
						.addGap(35))
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblPersnolInformation, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(448, Short.MAX_VALUE))
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblPersnolInformation, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGap(21)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(Name_Field, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(Phone_Field, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPostalCode, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(52, Short.MAX_VALUE))
			);
			panel_1.setLayout(gl_panel_1);
			
			Verify_btn = new JButton("Verify Username availability");
			Verify_btn.setBackground(Color.red);
			Verify_btn.setForeground(Color.white);
			Verify_btn.setFont(new Font("Arial", Font.BOLD, 14));
			
			lblNewLabel_2 = new JLabel("Select :");
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
			
			
//			ArrayList<Deliveryman> deliverymanlist = Database.getDeliverymen();
//				usernamelist.add(dm.getUsername());
//				
//			}
//			usernamelist.toArray(new String[usernamelist.size()])
			
			selectR_comboBox = new JComboBox();
			selectR_comboBox.setForeground( Color.red);
			selectR_comboBox.setBackground( Color.white);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_3.setBackground( Color.DARK_GRAY);
			panel_3.setForeground( Color.white);
			
			
			JPanel panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_4.setBackground(Color.WHITE);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_5.setBackground(Color.WHITE);
			
			Save_btn = new JButton("Save");
			Save_btn.setForeground(Color.white);
			Save_btn.setFont(new Font("Arial", Font.BOLD, 14));
			Save_btn.setBackground(Color.RED);
	
			
			GroupLayout gl_panel = new GroupLayout(Dpanel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
									.addComponent(lblNewLabel_2)
									.addGap(27))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(62)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
										.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
									.addGap(60)))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(247)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(Save_btn, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
									.addComponent(Verify_btn, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
								.addGap(260)))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(selectR_comboBox, 0, 278, Short.MAX_VALUE)
								.addGap(45))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(selectR_comboBox, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_2)))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(24)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(58)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addGap(60)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
								.addGap(18)
								.addComponent(Verify_btn, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(Save_btn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGap(63))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(18)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())))
			);
			
				
			JScrollPane Darea_scrollPane = new JScrollPane();
			Darea_scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
			
			Darea_Field = new JTextField();
			Darea_Field.setColumns(10);
			
			Add_btn = new JButton("Add");
			Add_btn.setBackground(Color.RED);
			Add_btn.setForeground(Color.WHITE);
			
			Delete_btn = new JButton("Delete");
			Delete_btn.setBackground(Color.RED);
			Delete_btn.setForeground(Color.WHITE);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.red);
			GroupLayout gl_panel_5 = new GroupLayout(panel_5);
			gl_panel_5.setHorizontalGroup(
				gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_5.createSequentialGroup()
						.addGap(21)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_5.createSequentialGroup()
								.addComponent(Darea_Field, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel_5.createSequentialGroup()
								.addComponent(Add_btn, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
								.addComponent(Delete_btn, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addGap(24))))
					.addComponent(Darea_scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
			);
			gl_panel_5.setVerticalGroup(
				gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_5.createSequentialGroup()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Darea_scrollPane, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(Darea_Field, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(Add_btn, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addComponent(Delete_btn, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			
			JLabel label = new JLabel("Delivery Area");
			label.setFont(new Font("Impact", Font.BOLD, 20));
			label.setForeground(Color.white);
			GroupLayout gl_panel_2 = new GroupLayout(panel_2);
			gl_panel_2.setHorizontalGroup(
				gl_panel_2.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_2.createSequentialGroup()
						.addGap(57)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(71, Short.MAX_VALUE))
			);
			gl_panel_2.setVerticalGroup(
				gl_panel_2.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_2.createSequentialGroup()
						.addGap(35)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(37, Short.MAX_VALUE))
			);
			panel_2.setLayout(gl_panel_2);
			
			Darea_table = new JTable();
			Darea_table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Delivery Area"
				}));
				
				Darea_table.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						JTable selected = (JTable) e.getSource();
						int row = selected.getSelectedRow();
						Darea_Field.setText(Darea_table.getModel().getValueAt(row, 0) + "");
						
					}
				}
			);
			
			Darea_scrollPane.setViewportView(Darea_table);
			panel_5.setLayout(gl_panel_5);
			
			JLabel lblNewLabel_3 = new JLabel("Login Information");
			lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 30));
			
			JLabel lblNewLabel_4 = new JLabel("User Name");
			lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 20));
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial", Font.PLAIN, 20));
			
			JLabel lblConfirmPassword = new JLabel("Confirm Password");
			lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 20));
			
			User_Field = new JTextField();
			User_Field.setColumns(10);
			User_Field.setBackground( Color.white);
			
			pass_Field = new JTextField();
			pass_Field.setColumns(10);
			pass_Field.setBackground(Color.WHITE);
			
			ConfirmPass_Field = new JTextField();
			ConfirmPass_Field.setColumns(10);
			ConfirmPass_Field.setBackground(Color.white);
			GroupLayout gl_panel_4 = new GroupLayout(panel_4);
			gl_panel_4.setHorizontalGroup(
					gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(65)
									.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblConfirmPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addComponent(lblNewLabel_4, Alignment.LEADING)))
									.addGap(33)
									.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
										.addComponent(ConfirmPass_Field)
										.addComponent(pass_Field)
										.addComponent(User_Field, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))
								.addGroup(gl_panel_4.createSequentialGroup()
									.addGap(21)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(135, Short.MAX_VALUE))
				);
//			
			gl_panel_4.setVerticalGroup(
					gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)
							.addGap(18)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(User_Field, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(23)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(pass_Field, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConfirmPassword, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(ConfirmPass_Field, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(29, Short.MAX_VALUE))
				);
			panel_4.setLayout(gl_panel_4);
			
			lblNewLabel = new JLabel("Create Delivery");
			lblNewLabel.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
			lblNewLabel.setForeground(Color.WHITE);
			GroupLayout gl_panel_3 = new GroupLayout(panel_3);
			gl_panel_3.setHorizontalGroup(
				gl_panel_3.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_3.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(50, Short.MAX_VALUE))
			);
			gl_panel_3.setVerticalGroup(
				gl_panel_3.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE)
						.addContainerGap())
			);
			panel_3.setLayout(gl_panel_3);
			Dpanel.setLayout(gl_panel);
//			this.getRootPane().setLayout(groupLayout);
//			this.getContentPane().setLayout(groupLayout);
			
//			AdaptToAction();
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
	 
	// Getters:
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static JTextField getName_Field() {
		return Name_Field;
	}
	public static JTextField getPhone_Field() {
		return Phone_Field;
	}
	public static JTextField getDarea_Field() {
		return Darea_Field;
	}
	public static JTextField getUser_Field() {
		return User_Field;
	}
	public static JTextField getPass_Field() {
		return pass_Field;
	}
	public static JTextField getConfirmPass_Field() {
		return ConfirmPass_Field;
	}
	public static JTable getDarea_table() {
		return Darea_table;
	}

	public static JButton getSave_btn() {
		return Save_btn;
	}
	public static JButton getAdd_btn() {
		return Add_btn;
	}
	public static JButton getDelete_btn() {
		return Delete_btn;
	}
	public static JButton getVerify_btn() {
		return Verify_btn;
	}
	
	// Setters:
	public static JLabel getLblNewLabel() {
		return lblNewLabel;
	}
	public static JComboBox getSelectR_comboBox() {
		return selectR_comboBox;
	}
	public void setName_Field(JTextField name_Field) {
		Name_Field = name_Field;
	}
	public void setPhone_Field(JTextField phone_Field) {
		Phone_Field = phone_Field;
	}
	public void setDarea_Field(JTextField darea_Field) {
		Darea_Field = darea_Field;
	}
	public void setUser_Field(JTextField user_Field) {
		User_Field = user_Field;
	}
	public void setPass_Field(JTextField pass_Field) {
		this.pass_Field = pass_Field;
	}
	public void setConfirmPass_Field(JTextField confirmPass_Field) {
		ConfirmPass_Field = confirmPass_Field;
	}
	public void setDarea_table(JTable darea_table) {
		Darea_table = darea_table;
	}
//	public void setAction(String action) {
//		this.action = action;
//	}
	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}
	public void setSelectR_comboBox(JComboBox selectR_comboBox) {
		this.selectR_comboBox = selectR_comboBox;
	}
	public static JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}
	
	
	

}




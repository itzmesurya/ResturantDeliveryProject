package src;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class DeliveryPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Name_Field , Phone_Field ,Darea_Field , User_Field ,pass_Field , ConfirmPass_Field;	
	private JTable Darea_table;
	
	
	public DeliveryPanel() {
		
//		JPanel DeliveryPanel = new JPanel();
		JPanel Dpanel = new JPanel();
		
		GroupLayout groupLayout = new GroupLayout( this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(88)
				.addComponent(Dpanel, GroupLayout.DEFAULT_SIZE, 1136, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(Dpanel, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
		);
		

			
		
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setForeground(Color.BLACK);
			
			JLabel lblNewLabel_1 = new JLabel("Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			Name_Field = new JTextField();
			Name_Field.setBackground(new Color(127, 255, 212));
			Name_Field.setColumns(10);
			
			JLabel lblPostalCode = new JLabel("TelePhone Number");
			lblPostalCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			Phone_Field = new JTextField();
			Phone_Field.setBackground(new Color(127, 255, 212));
			Phone_Field.setColumns(10);
			
			JLabel lblPersnolInformation = new JLabel("Persnol Information");
			lblPersnolInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(lblPersnolInformation)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_1)
									.addComponent(lblPostalCode))
								.addGap(43)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(Phone_Field, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
									.addComponent(Name_Field, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(60, Short.MAX_VALUE))
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblPersnolInformation, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGap(21)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1)
							.addComponent(Name_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPostalCode, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(Phone_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(30, Short.MAX_VALUE))
			);
			panel_1.setLayout(gl_panel_1);
			
			JButton Uavailable_btn = new JButton("Veryfy Username availability");
			Uavailable_btn.setBackground(Color.YELLOW);
			Uavailable_btn.setForeground(Color.BLACK);
			Uavailable_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblNewLabel_2 = new JLabel("Select :");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JComboBox selectR_comboBox = new JComboBox();
			selectR_comboBox.setForeground(new Color(255, 0, 255));
			selectR_comboBox.setBackground(new Color(255, 0, 255));
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
			
			JPanel panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
			
			JPanel panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
			
			JButton Save_btn = new JButton("Save");
			Save_btn.setForeground(Color.BLACK);
			Save_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
			Save_btn.setBackground(Color.YELLOW);
			GroupLayout gl_panel = new GroupLayout(Dpanel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(50)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
									.addComponent(lblNewLabel_2)
									.addGap(27))
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap(199, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(124)))
							.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(Save_btn, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
									.addComponent(Uavailable_btn, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
								.addGap(178)))
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(panel_5, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 214, Short.MAX_VALUE)
							.addComponent(selectR_comboBox, Alignment.LEADING, 0, 214, Short.MAX_VALUE))
						.addGap(156))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(selectR_comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_2))
								.addGap(41)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(18)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
										.addGap(35)
										.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(Uavailable_btn)
										.addGap(18)
										.addComponent(Save_btn, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(7)
										.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE))))
							.addGroup(gl_panel.createSequentialGroup()
								.addContainerGap()
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(171, Short.MAX_VALUE))
			);
			
			JScrollPane Darea_scrollPane = new JScrollPane();
			Darea_scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
			
			Darea_Field = new JTextField();
			Darea_Field.setColumns(10);
			
			JButton Add_btn = new JButton("Add");
			Add_btn.setBackground(Color.YELLOW);
			
			JButton Delete_btn = new JButton("Delete");
			Delete_btn.setBackground(Color.YELLOW);
			GroupLayout gl_panel_5 = new GroupLayout(panel_5);
			gl_panel_5.setHorizontalGroup(
				gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_5.createSequentialGroup()
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
							.addComponent(Darea_scrollPane, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_5.createSequentialGroup()
								.addGap(10)
								.addComponent(Darea_Field, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
					.addGroup(gl_panel_5.createSequentialGroup()
						.addContainerGap()
						.addComponent(Add_btn, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
						.addComponent(Delete_btn, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addGap(21))
			);
			gl_panel_5.setVerticalGroup(
				gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_5.createSequentialGroup()
						.addComponent(Darea_scrollPane, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(Darea_Field, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
							.addComponent(Add_btn, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(Delete_btn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
			);
			
			Darea_table = new JTable();
			Darea_table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"New column"
				}
			));
			Darea_scrollPane.setViewportView(Darea_table);
			panel_5.setLayout(gl_panel_5);
			
			JLabel lblNewLabel_3 = new JLabel("Login Information");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
			
			JLabel lblNewLabel_4 = new JLabel("User Name");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblConfirmPassword = new JLabel("Confirm Password");
			lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			User_Field = new JTextField();
			User_Field.setColumns(10);
			User_Field.setBackground(new Color(127, 255, 212));
			
			pass_Field = new JTextField();
			pass_Field.setColumns(10);
			pass_Field.setBackground(new Color(127, 255, 212));
			
			ConfirmPass_Field = new JTextField();
			ConfirmPass_Field.setColumns(10);
			ConfirmPass_Field.setBackground(new Color(127, 255, 212));
			GroupLayout gl_panel_4 = new GroupLayout(panel_4);
			gl_panel_4.setHorizontalGroup(
				gl_panel_4.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_4.createSequentialGroup()
						.addGap(21)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_4)
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblConfirmPassword))
						.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
							.addComponent(User_Field, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addComponent(pass_Field, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addComponent(ConfirmPass_Field, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(44, Short.MAX_VALUE))
			);
			gl_panel_4.setVerticalGroup(
				gl_panel_4.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_4.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel_3)
						.addGap(18)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_4)
							.addComponent(User_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(pass_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblConfirmPassword, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(ConfirmPass_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(68, Short.MAX_VALUE))
			);
			panel_4.setLayout(gl_panel_4);
			
			JLabel lblNewLabel = new JLabel("Delivery View");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
			GroupLayout gl_panel_3 = new GroupLayout(panel_3);
			gl_panel_3.setHorizontalGroup(
				gl_panel_3.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_3.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel)
						.addContainerGap(81, Short.MAX_VALUE))
			);
			gl_panel_3.setVerticalGroup(
				gl_panel_3.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
						.addContainerGap(18, Short.MAX_VALUE)
						.addComponent(lblNewLabel)
						.addContainerGap())
			);
			panel_3.setLayout(gl_panel_3);
			Dpanel.setLayout(gl_panel);
//			this.getRootPane().setLayout(groupLayout);
//			this.getContentPane().setLayout(groupLayout);
		}
	

	}



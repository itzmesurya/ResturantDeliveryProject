
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Restaurateur_main_menu_Panel extends JPanel{
	
	private JButton order_accept_btn;
	private JButton order_ready_btn;
	private JButton log_out_btn;
	private	JMenu file;
	private	JMenu order;
	private	JMenuItem log_out;
	private	JMenuItem exit;
	private	JMenuItem view_order;
	
	public Restaurateur_main_menu_Panel() {
		
		this.setBackground(new Color(233, 150, 122));
		this.setLayout(null);
		
		//RESTAURATEUR
		
		JLabel lblRestaurateur = new JLabel("RESTAURATEUR");
		lblRestaurateur.setFont(new Font("Constantia", Font.BOLD, 30));
		lblRestaurateur.setBounds(511, 22, 250, 45);
		this.add(lblRestaurateur);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(72, 183, 1059, 509);
		panel_1.setBackground(new Color(250, 240, 230));
		this.add(panel_1);
		panel_1.setLayout(null);
		
		//ORDERS
		
		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setBounds(483, 47, 137, 46);
		panel_1.add(lblOrder);
		lblOrder.setFont(new Font("Constantia", Font.PLAIN, 30));
		
		order_accept_btn = new JButton("<html>ACCPET<br />ORDERS</html>");
		order_accept_btn.setForeground(Color.WHITE);
		order_accept_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		order_accept_btn.setBackground(Color.DARK_GRAY);
		order_accept_btn.setBounds(305, 228, 118, 63);
		panel_1.add(order_accept_btn);
		
		order_ready_btn = new JButton("<html>MARK<br />READY</html>");
		order_ready_btn.setForeground(Color.WHITE);
		order_ready_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		order_ready_btn.setBackground(Color.DARK_GRAY);
		order_ready_btn.setBounds(620, 228, 118, 63);
		panel_1.add(order_ready_btn);
		
		//LOG OUT BUTTON
		
		log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(new Color(255, 255, 224));
		log_out_btn.setBackground(new Color(138, 43, 226));
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		this.add(log_out_btn);
		
		//MENU BAR
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 40, 22);
		this.add(menuBar);
		
		//File Menu BAR
		
		file = new JMenu("File");
		file.setBackground(Color.BLACK);
		menuBar.add(file);
				
		log_out = new JMenuItem("Log Out");
		file.add(log_out);
				
		exit = new JMenuItem("Exit");
		file.add(exit);
		
		//Order Menu Bar
		
		order = new JMenu("Orders");
		order.setBackground(Color.BLACK);
		menuBar.add(order);
		
		view_order = new JMenuItem("View Orders");
		order.add(view_order);
		
	}
	
	/**
	 * @return	order_accept_btn
	 */
	public JButton getOrder_Accept_Btn() {
		return order_accept_btn;
	}
	
	/**
	 * @return	order_ready_btn
	 */
	public JButton getOrder_Ready_Btn() {
		return order_ready_btn;
	}
	
	/**
	 * @return	log_out_btn
	 */
	public JButton getlog_Out_Btn() {
		return log_out_btn;
	}
	
	//Get MenuItem Things
	
	public JMenuItem getLog_Out() {
		return log_out;
	}
	
	public JMenuItem getExit() {
		return exit;
	}
	
	public JMenuItem getView_Order() {
		return view_order;
	}

}

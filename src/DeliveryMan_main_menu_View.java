import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class DeliveryMan_main_menu_View {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryMan_main_menu_View window = new DeliveryMan_main_menu_View();
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
	public DeliveryMan_main_menu_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setResizable(false);
		frame.setTitle("DELIVERY MAN");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233, 150, 122));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//RESTAURATEUR
		
		JLabel lblDeliveryMan = new JLabel("DELIVERY MAN");
		lblDeliveryMan.setFont(new Font("Constantia", Font.BOLD, 30));
		lblDeliveryMan.setBounds(511, 22, 250, 45);
		panel.add(lblDeliveryMan);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(72, 183, 1059, 509);
		panel_1.setBackground(new Color(250, 240, 230));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//ORDERS
		
		JLabel lblDeliveries = new JLabel("DELIVERIES");
		lblDeliveries.setBounds(471, 47, 169, 46);
		panel_1.add(lblDeliveries);
		lblDeliveries.setFont(new Font("Constantia", Font.PLAIN, 30));
		
		JButton delivery_accept_btn = new JButton("<html>ACCPET<br />Delivery</html>");
		delivery_accept_btn.setForeground(Color.WHITE);
		delivery_accept_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_accept_btn.setBackground(Color.DARK_GRAY);
		delivery_accept_btn.setBounds(305, 228, 118, 63);
		panel_1.add(delivery_accept_btn);
		
		JButton delivery_end_btn = new JButton("<html>END<br />Delivery</html>");
		delivery_end_btn.setForeground(Color.WHITE);
		delivery_end_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_end_btn.setBackground(Color.DARK_GRAY);
		delivery_end_btn.setBounds(681, 228, 118, 63);
		panel_1.add(delivery_end_btn);
		
		JButton delivery_editinfo_btn = new JButton("<html>EDIT<br />Personal<br />Info</html>");
		delivery_editinfo_btn.setForeground(Color.WHITE);
		delivery_editinfo_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delivery_editinfo_btn.setBackground(Color.DARK_GRAY);
		delivery_editinfo_btn.setBounds(491, 389, 118, 75);
		panel_1.add(delivery_editinfo_btn);
		
		//LOG OUT BUTTON
		
		JButton log_out_btn = new JButton("LOG OUT");
		log_out_btn.setForeground(new Color(255, 255, 224));
		log_out_btn.setBackground(new Color(138, 43, 226));
		log_out_btn.setFont(new Font("Dubai Light", Font.PLAIN, 20));
		log_out_btn.setBounds(1039, 10, 137, 37);
		panel.add(log_out_btn);
		
		//MENU BAR
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
				
		//File Menu BAR
				
		JMenu file = new JMenu("File");
		file.setBackground(Color.BLACK);
		menuBar.add(file);
				
		JMenuItem log_out = new JMenuItem("Log Out");
		file.add(log_out);
				
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
	
		
		
	}

}

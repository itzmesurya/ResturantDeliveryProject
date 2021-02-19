import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class LoginView {

	private JFrame frame;
	private JTextField tf_1;
	private JTextField tf_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
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
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(200, 10, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_Login = new JPanel();
		frame.getContentPane().add(panel_Login, BorderLayout.CENTER);
		panel_Login.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(0, 200));
		topPanel.setFont(new Font("Arial", Font.BOLD, 40));
		panel_Login.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl_1 = new JLabel("Delivery Service Name");
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setFont(new Font("Arial", Font.BOLD, 80));
		topPanel.add(lbl_1, BorderLayout.SOUTH);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(700, 0));
		eastPanel.setFont(new Font("Arial", Font.BOLD, 40));
		panel_Login.add(eastPanel, BorderLayout.EAST);
		eastPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(0, 200));
		eastPanel.add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(0, 225));
		eastPanel.add(panel_3, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(650, 20));
		panel_3.add(panel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton.setBackground(Color.YELLOW);
		panel_3.add(btnNewButton);
		
		JLabel lbl_1_1 = new JLabel("Don't have an account yet? Click here to create one");
		lbl_1_1.setForeground(Color.BLUE);
		lbl_1_1.setPreferredSize(new Dimension(600, 20));
		lbl_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_3.add(lbl_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.setPreferredSize(new Dimension(650, 0));
		eastPanel.add(panel_2, BorderLayout.WEST);
		
		JPanel midPanel1 = new JPanel();
		midPanel1.setPreferredSize(new Dimension(580, 60));
		midPanel1.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2.add(midPanel1);
		
		JLabel lbl_Name = new JLabel("Username: ");
		lbl_Name.setFont(new Font("Arial", Font.BOLD, 25));
		midPanel1.add(lbl_Name);
		
		tf_1 = new JTextField();
		tf_1.setBackground(Color.CYAN);
		tf_1.setPreferredSize(new Dimension(400, 40));
		tf_1.setFont(new Font("Arial", Font.BOLD, 22));
		tf_1.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		midPanel1.add(tf_1);
		
		JPanel midPanel2 = new JPanel();
		midPanel2.setPreferredSize(new Dimension(580, 60));
		midPanel2.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2.add(midPanel2);
		
		JLabel lbl_Password = new JLabel("Password: ");
		lbl_Password.setFont(new Font("Arial", Font.BOLD, 25));
		midPanel2.add(lbl_Password);
		
		tf_2 = new JTextField();
		tf_2.setBackground(Color.CYAN);
		tf_2.setPreferredSize(new Dimension(400, 40));
		tf_2.setFont(new Font("Arial", Font.BOLD, 22));
		tf_2.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		midPanel2.add(tf_2);
		
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(450, 0));
		panel_Login.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(null);
		
		JLabel lbl_Logo = new JLabel("New label");
		lbl_Logo.setIcon(new ImageIcon("C:\\Users\\TQC canada\\Pictures\\Saved Pictures\\007.png"));
		lbl_Logo.setBounds(169, 137, 271, 258);
		westPanel.add(lbl_Logo);
	}

}

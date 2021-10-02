package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_admin {

	public JFrame frmAddAdmin;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Add_admin() {
		
		initialize();
		frmAddAdmin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddAdmin = new JFrame();
		frmAddAdmin.setTitle("ADD ADMIN");
		frmAddAdmin.setBounds(100, 100, 450, 300);
		frmAddAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddAdmin.getContentPane().setLayout(null);
		
		JLabel lblAddNewAdmin = new JLabel("ADD NEW ADMIN");
		lblAddNewAdmin.setFont(new Font("URW Bookman", Font.ITALIC, 18));
		lblAddNewAdmin.setForeground(Color.BLUE);
		lblAddNewAdmin.setBounds(61, 25, 201, 40);
		frmAddAdmin.getContentPane().add(lblAddNewAdmin);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(12, 84, 104, 15);
		frmAddAdmin.getContentPane().add(lblUsername);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(12, 131, 70, 15);
		frmAddAdmin.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(12, 182, 104, 15);
		frmAddAdmin.getContentPane().add(lblPassword);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dash ds = new Dash();
			}
		});
		btnAdd.setBackground(Color.ORANGE);
		btnAdd.setBounds(187, 215, 117, 51);
		frmAddAdmin.getContentPane().add(btnAdd);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.ORANGE);
		btnExit.setBounds(316, 215, 117, 51);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dash ds = new Dash();
			}
		});
		frmAddAdmin.getContentPane().add(btnExit);
		
		textField = new JTextField();
		textField.setBounds(97, 77, 159, 30);
		frmAddAdmin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 124, 159, 30);
		frmAddAdmin.getContentPane().add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 176, 159, 27);
		frmAddAdmin.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/Annotation 2021-09-30 095924.png"));
		lblNewLabel.setBounds(266, 0, 172, 214);
		frmAddAdmin.getContentPane().add(lblNewLabel);
	}
}

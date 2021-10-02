package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin{

	protected static JFrame frameAdmin;
	private JTextField adminName;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAdmin = new JFrame("ADMIN PANEL");
		frameAdmin.getContentPane().setBackground(Color.WHITE);
		frameAdmin.setForeground(Color.GREEN);
		frameAdmin.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 22));
		frameAdmin.setBounds(100, 100, 450, 300);
		frameAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAdmin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "LOGIN AS ADMIN:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 120, 438, 158);
		frameAdmin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME: ");
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setBounds(60, 25, 103, 27);
		panel.add(lblUsername);
		
		adminName = new JTextField();
		adminName.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		adminName.setBounds(165, 12, 231, 36);
		panel.add(adminName);
		adminName.setColumns(10);
		
		JLabel lblEmail = new JLabel("EMAIL: ");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBounds(70, 73, 70, 15);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(165, 63, 231, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(object->{
			Thread thread=new Thread();
			try {
				thread.sleep(1000);
				frameAdmin.setVisible(false);
				Dash window = new Dash();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		btnLogin.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		btnLogin.setBackground(Color.GREEN);
		btnLogin.setBounds(205, 102, 97, 44);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("EXIT");
		btnCancel.addActionListener(object->{
			System.exit(0);
			
		});
		btnCancel.setFont(new Font("Liberation Mono", Font.BOLD | Font.ITALIC, 20));
		btnCancel.setBackground(Color.RED);
		btnCancel.setFocusPainted(false);
		btnCancel.setBounds(329, 102, 97, 44);
		panel.add(btnCancel);
		
		JLabel labelAdmin = new JLabel(" ADMIN:");
		labelAdmin.setForeground(Color.BLUE);
		labelAdmin.setFont(new Font("FreeSans", Font.BOLD | Font.ITALIC, 25));
		labelAdmin.setBounds(12, 0, 227, 108);
		frameAdmin.getContentPane().add(labelAdmin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/login.png"));
		lblNewLabel.setBounds(236, 0, 202, 130);
		frameAdmin.getContentPane().add(lblNewLabel);
	}
	private static void show() {
		try {
			try {
				frameAdmin.setVisible(true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void hide() {
		frameAdmin.setVisible(false);
	}
}

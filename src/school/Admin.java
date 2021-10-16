package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Admin{
   
	protected static JFrame frameAdmin;
	public JTextField adminName;
	private JPasswordField passwordField;
	Connection conn;
	PreparedStatement ps;
	 public String name;
	 private String adminname;

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	
	protected void Get_Connection() throws SQLException {
		String driver="com.mysql.cj.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/SchoolSystem";
		//register my driver
		try {
			Class.forName(driver);
			
			//create connection
			
			conn = DriverManager.getConnection(url, "root", "");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//query the database
	private void Check() throws SQLException {
		String sql = "select username,password from Admins where username=? and password=?";
		name = adminName.getText();
		String pass = passwordField.getText();
		ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
      if(name.isEmpty()||pass.isEmpty()) {
    	 JOptionPane.showMessageDialog(null, "please fill in the fields!!","Error",JOptionPane.ERROR_MESSAGE); 
    	 frameAdmin.setVisible(true);
    	 adminName.requestFocus();
      }
      else {
			if(rs.next()) {
			      String welcome = adminName.getText();
		             Dash dash= new Dash();
		             dash.lblNewLabel.setText("WELCOME "+welcome.toUpperCase());
		             dash.dashboard.setVisible(true);
			conn.close();
		}
			else {
				JOptionPane.showMessageDialog(null, "username and password mismatch!!");
				adminName.setText("");
				passwordField.setText("");
				show();
				
			}
      }
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAdmin = new JFrame("ADMIN PANEL");
		frameAdmin.setResizable(false);
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
		
		JLabel lblEmail = new JLabel("PASSWORD");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBounds(70, 70, 97, 15);
		panel.add(lblEmail);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(object->{
			Thread thread=new Thread();
			try {
				thread.sleep(1000);
				frameAdmin.setVisible(false);
				Get_Connection();
				Check();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 60, 231, 36);
		passwordField.addActionListener(object->{
			frameAdmin.setVisible(false);
			try {
				Get_Connection();
				Check();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		panel.add(passwordField);
		
		JLabel labelAdmin = new JLabel(" ADMIN:");
		labelAdmin.setForeground(Color.BLUE);
		labelAdmin.setFont(new Font("FreeSans", Font.BOLD | Font.ITALIC, 25));
		labelAdmin.setBounds(12, 0, 227, 108);
		frameAdmin.getContentPane().add(labelAdmin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/login.png"));
		lblNewLabel.setBounds(236, 0, 202, 130);
		frameAdmin.getContentPane().add(lblNewLabel);
	}
	public String SayName(String givenname) {
		return givenname;
		
	}


	public static void show() {
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

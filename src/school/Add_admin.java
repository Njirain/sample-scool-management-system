package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Add_admin extends Admin {

	public JFrame frmAddAdmin;
	private JTextField admin;
	private JTextField mail;
	private JPasswordField pass;


	public Add_admin() {
		
		initialize();
		frmAddAdmin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddAdmin = new JFrame();
		frmAddAdmin.setResizable(false);
		frmAddAdmin.setTitle("ADD ADMIN");
		frmAddAdmin.setBounds(100, 100, 570, 374);
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
				try {
					Get_Connection();
				    insert();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Dash ds = new Dash();
			}
		});
		btnAdd.setBackground(Color.ORANGE);
		btnAdd.setBounds(199, 269, 117, 51);
		frmAddAdmin.getContentPane().add(btnAdd);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.ORANGE);
		btnExit.setBounds(374, 269, 117, 51);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dash ds = new Dash();
			}
		});
		frmAddAdmin.getContentPane().add(btnExit);
		
		admin = new JTextField();
		admin.setBounds(97, 67, 225, 45);
		frmAddAdmin.getContentPane().add(admin);
		admin.setColumns(10);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(97, 124, 225, 46);
		frmAddAdmin.getContentPane().add(mail);
		
		pass = new JPasswordField();
		pass.setBounds(97, 176, 219, 51);
		frmAddAdmin.getContentPane().add(pass);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/addadmin.png"));
		lblNewLabel.setBounds(353, 31, 172, 214);
		frmAddAdmin.getContentPane().add(lblNewLabel);
	}
	
	
	private void insert() throws SQLException {
     ps = conn.prepareStatement("insert into Admins values(?,?,?)");
     ps.setString(1, admin.getText());
     ps.setString(2, mail.getText());
     ps.setString(3, pass.getText());
     ps.execute();
			JOptionPane.showMessageDialog(null, "Admin added successfully..");
		
	}
}

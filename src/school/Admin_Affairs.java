package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Admin_Affairs extends Admin{

	public JFrame frmAdminAffairs;

	/**
	 * Create the application.
	 */
	public Admin_Affairs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminAffairs = new JFrame();
		frmAdminAffairs.setResizable(false);
		frmAdminAffairs.getContentPane().setBackground(Color.CYAN);
		frmAdminAffairs.setTitle("ADMIN AFFAIRS");
		frmAdminAffairs.setBounds(100, 100, 741, 421);
		frmAdminAffairs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminAffairs.getContentPane().setLayout(null);
		
		JButton btnShowAdmins = new JButton("SHOW ADMINS");
		btnShowAdmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Show_Admins show = new Show_Admins();
				frmAdminAffairs.setVisible(false);
			}
		});
		btnShowAdmins.setForeground(Color.BLACK);
		btnShowAdmins.setBackground(Color.MAGENTA);
		btnShowAdmins.setBounds(35, 12, 179, 75);
		frmAdminAffairs.getContentPane().add(btnShowAdmins);
		
		JButton btnAddAdmins = new JButton("ADD ADMIN");
		btnAddAdmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_admin add = new Add_admin();
				frmAdminAffairs.setVisible(false);
				
			}
		});
		btnAddAdmins.setForeground(Color.BLACK);
		btnAddAdmins.setBackground(Color.MAGENTA);
		btnAddAdmins.setBounds(35, 116, 179, 75);
		frmAdminAffairs.getContentPane().add(btnAddAdmins);
		
		JButton btnRemoveAdmin = new JButton("REMOVE ADMIN");
		btnRemoveAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String admin = JOptionPane.showInputDialog(null,"Enter Admin's name ");
			try {
				Get_Connection();
				ps = conn.prepareStatement("delete from Admins where username = ?");
				ps.setString(1, admin);
				ps.execute();
				Thread thread = new Thread();
				JOptionPane.showConfirmDialog(null,"You sure you want to perform the action?");
				thread.sleep(1000);
				JOptionPane.showMessageDialog(null, "Admin removed successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		btnRemoveAdmin.setForeground(Color.BLACK);
		btnRemoveAdmin.setBackground(Color.MAGENTA);
		btnRemoveAdmin.setBounds(35, 233, 179, 75);
		frmAdminAffairs.getContentPane().add(btnRemoveAdmin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAdminAffairs.setVisible(false);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(419, 293, 155, 61);
		frmAdminAffairs.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("ADMIN PAGE");
		lblNewLabel.setFont(new Font("FreeMono", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/staff1.png"));
		lblNewLabel.setBounds(321, 12, 295, 250);
		frmAdminAffairs.getContentPane().add(lblNewLabel);
		frmAdminAffairs.setVisible(true);
	}
}

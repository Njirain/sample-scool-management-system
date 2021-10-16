package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Admins {

	private JFrame frmAdmins;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admins window = new Admins();
					window.frmAdmins.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdmins = new JFrame();
		frmAdmins.setResizable(false);
		frmAdmins.getContentPane().setBackground(Color.CYAN);
		frmAdmins.setTitle("ADMINS");
		frmAdmins.setBounds(100, 100, 594, 452);
		frmAdmins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdmins.getContentPane().setLayout(null);
		
		JButton btnShowAdmis = new JButton("SHOW ADMIS");
		btnShowAdmis.setBackground(Color.ORANGE);
		btnShowAdmis.setBounds(32, 48, 165, 54);
		frmAdmins.getContentPane().add(btnShowAdmis);
		
		JButton btnAddAdmin = new JButton("ADD ADMIN");
		btnAddAdmin.setBackground(Color.ORANGE);
		btnAddAdmin.setBounds(32, 144, 165, 54);
		frmAdmins.getContentPane().add(btnAddAdmin);
		
		JButton btnRemoveAdmin = new JButton("REMOVE ADMIN");
		btnRemoveAdmin.setBackground(Color.ORANGE);
		btnRemoveAdmin.setBounds(32, 239, 165, 54);
		frmAdmins.getContentPane().add(btnRemoveAdmin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(313, 347, 121, 54);
		frmAdmins.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/images3.png"));
		lblNewLabel.setBounds(341, 61, 228, 184);
		frmAdmins.getContentPane().add(lblNewLabel);
	}

}

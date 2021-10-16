package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	private JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.setResizable(false);
		frmHome.setTitle("HOME");
		frmHome.setBounds(100, 100, 752, 471);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToGatwe = new JLabel("WELCOME TO GATWE ACADEMY SCHOOL SYSTEM");
		lblWelcomeToGatwe.setForeground(Color.BLACK);
		lblWelcomeToGatwe.setFont(new Font("URW Gothic L", Font.BOLD | Font.ITALIC, 25));
		lblWelcomeToGatwe.setBackground(Color.BLACK);
		lblWelcomeToGatwe.setBounds(78, 30, 625, 88);
		frmHome.getContentPane().add(lblWelcomeToGatwe);
		
		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Admin window = new Admin();
				
				window.show();
				frmHome.setVisible(false);
			}
		});
		btnContinue.setBackground(Color.BLACK);
		btnContinue.setForeground(Color.GREEN);
		btnContinue.setBounds(545, 354, 117, 62);
		frmHome.getContentPane().add(btnContinue);
		
		JTextArea txtrleadingInTech = new JTextArea();
		txtrleadingInTech.setForeground(Color.GREEN);
		txtrleadingInTech.setBackground(Color.BLACK);
		txtrleadingInTech.setFont(new Font("URW Gothic L", Font.BOLD | Font.ITALIC, 15));
		txtrleadingInTech.setText("*LEADING IN TECH STUDIES*\n*CYBER SECURITY*\n*SOFTWARE DEVELOPMENT*\n*COMPUTER PROGRAMMING*\n*NETWORKING*\n*AND-------------->---------------->------>*");
		txtrleadingInTech.setBounds(83, 252, 233, 157);
		frmHome.getContentPane().add(txtrleadingInTech);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/scool3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 752, 449);
		frmHome.getContentPane().add(lblNewLabel_1);
	}
}

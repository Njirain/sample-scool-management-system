package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dash extends Admin {

	public JFrame dashboard;
	public JLabel lblNewLabel;

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Dash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		dashboard = new JFrame("DASHBOARD");
		dashboard.getContentPane().setBackground(Color.MAGENTA);
		dashboard.getContentPane().setForeground(Color.WHITE);
		dashboard.setFont(new Font("MathJax_Caligraphic", Font.BOLD | Font.ITALIC, 24));
		dashboard.setTitle("DASHBOARD");
		dashboard.setBounds(100, 100, 668, 412);
		dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dashboard.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("DejaVu Sans Mono", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(222, 7, 216, 44);
		dashboard.getContentPane().add(lblNewLabel);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(object->{
			dashboard.setVisible(false);
			frameAdmin.setVisible(true);
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setBackground(Color.RED);
		btnLogout.setBounds(460, 7, 190, 62);
		dashboard.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/home/franc/icons/images.png"));
		lblNewLabel_1.setBounds(421, 87, 229, 287);
		dashboard.getContentPane().add(lblNewLabel_1);
		
		JButton btnStudentssOption = new JButton("STUDENTS'S OPTION");
		btnStudentssOption.setBackground(Color.GREEN);
		btnStudentssOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Students_Affairs sa = new Students_Affairs();
				sa.frmStudentsAffairs.setVisible(true);
				dashboard.setVisible(false);
			}
		});
		btnStudentssOption.setBounds(12, 7, 229, 74);
		dashboard.getContentPane().add(btnStudentssOption);
		
		JButton btnAdminsOption = new JButton("ADMINS OPTION");
		btnAdminsOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Admin_Affairs adaf= new Admin_Affairs();
				dashboard.setVisible(false);
			}
		});
		btnAdminsOption.setBackground(Color.GREEN);
		btnAdminsOption.setBounds(12, 94, 229, 74);
		dashboard.getContentPane().add(btnAdminsOption);
		
		JButton btnStaffsOption = new JButton("STAFFS OPTION");
		btnStaffsOption.setBackground(Color.GREEN);
		btnStaffsOption.setBounds(12, 180, 229, 74);
		dashboard.getContentPane().add(btnStaffsOption);
		
		JButton btnfee = new JButton("FEE OPTION");
		btnfee.setBackground(Color.GREEN);
		btnfee.setBounds(12, 286, 229, 74);
		dashboard.getContentPane().add(btnfee);
	}
}

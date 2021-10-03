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

	private JFrame dashboard;

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
		
		JLabel lblNewLabel = new JLabel("WELCOME \n");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("DejaVu Sans Mono", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(222, 7, 216, 44);
		dashboard.getContentPane().add(lblNewLabel);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setBackground(Color.GREEN);
		btnAddStudent.setBounds(6, 7, 208, 44);
	btnAddStudent.addActionListener(object->{
		dashboard.setVisible(false);
		add_student add = new add_student();
		add.frmAddStudent.setVisible(true);
		
		});
		dashboard.getContentPane().add(btnAddStudent);
		
		JButton btnClearStudent = new JButton("Clear Student");
		btnClearStudent.setBackground(Color.GREEN);
		btnClearStudent.setBounds(6, 63, 208, 41);
	btnClearStudent.addActionListener(object->{
		dashboard.setVisible(false);
		JOptionPane.showInputDialog(null, "Feed in Student ID");
		Dash window = new Dash();
			
		});
		dashboard.getContentPane().add(btnClearStudent);
		
		JButton btnUpdateRecord = new JButton("Update record");
		btnUpdateRecord.setBackground(Color.GREEN);
		btnUpdateRecord.setBounds(6, 112, 208, 41);
	btnUpdateRecord.addActionListener(object->{
		dashboard.setVisible(false);
		
			
		Dash window = new Dash();
		});
		dashboard.getContentPane().add(btnUpdateRecord);
		
		JButton btnAddAdmin = new JButton("Add Admin");
		btnAddAdmin.setBackground(Color.GREEN);
		btnAddAdmin.setBounds(6, 270, 208, 44);
	btnAddAdmin.addActionListener(object->{
		dashboard.setVisible(false);
		Add_admin admin = new Add_admin();
			
		});
		dashboard.getContentPane().add(btnAddAdmin);
		
		JButton btnRemoveAdmin = new JButton("Remove Admin");
		btnRemoveAdmin.setBackground(Color.GREEN);
		btnRemoveAdmin.setBounds(6, 326, 208, 48);
	btnRemoveAdmin.addActionListener(object->{
		dashboard.setVisible(false);
		JOptionPane.showInputDialog(null,"ADMIN's Name:");
		Dash window = new Dash();
		});
		dashboard.getContentPane().add(btnRemoveAdmin);
		
		JButton btnShowStudents = new JButton("Show Students");
		btnShowStudents.addActionListener(object->{
			dashboard.setVisible(false);
			show_student sht = new show_student();
			
		});
		btnShowStudents.setBackground(Color.GREEN);
		btnShowStudents.setBounds(6, 158, 208, 44);
		dashboard.getContentPane().add(btnShowStudents);
		
		JButton btnShowAdmins = new JButton("Show Admins");
		btnShowAdmins.setBackground(Color.GREEN);
		btnShowAdmins.setBounds(6, 214, 208, 44);
	btnShowAdmins.addActionListener(object->{
		dashboard.setVisible(false);
		Show_Admins showAdmin = new Show_Admins();
		
		});
		dashboard.getContentPane().add(btnShowAdmins);
		
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
		dashboard.setVisible(true);
	}
}

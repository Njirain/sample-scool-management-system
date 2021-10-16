package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Students_Affairs {

	public JFrame frmStudentsAffairs;

	/**
	 * Create the application.
	 */
	public Students_Affairs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentsAffairs = new JFrame();
		frmStudentsAffairs.setResizable(false);
		frmStudentsAffairs.getContentPane().setBackground(Color.DARK_GRAY);
		frmStudentsAffairs.setTitle("Students' Affairs");
		frmStudentsAffairs.setBounds(100, 100, 624, 455);
		frmStudentsAffairs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentsAffairs.getContentPane().setLayout(null);
		
		JButton btnAddNewStudent = new JButton("ADD NEW STUDENT");
		btnAddNewStudent.setForeground(Color.BLUE);
		btnAddNewStudent.setBackground(Color.GREEN);
		btnAddNewStudent.setBounds(23, 59, 189, 46);
		btnAddNewStudent.addActionListener(object->{
			frmStudentsAffairs.setVisible(false);
			add_student add = new add_student();
			add.frmAddStudent.setVisible(true);
			
			});
		frmStudentsAffairs.getContentPane().add(btnAddNewStudent);
		
		JButton btnStudentRecord = new JButton("STUDENT RECORD");
		btnStudentRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				
			}
		});
		btnStudentRecord.setForeground(Color.BLUE);
		btnStudentRecord.setBackground(new Color(0, 255, 0));
		btnStudentRecord.setBounds(23, 141, 189, 46);
		frmStudentsAffairs.getContentPane().add(btnStudentRecord);
		
		JButton btnUpdateRecord = new JButton("UPDATE RECORD");
		btnUpdateRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStudentsAffairs.setVisible(false);
				Update_student update = new Update_student();
				update.frmUpdateData.setVisible(true);
			}
		});
		btnUpdateRecord.setForeground(Color.BLUE);
		btnUpdateRecord.setBackground(Color.GREEN);
		btnUpdateRecord.setBounds(23, 224, 189, 46);
		
		
		frmStudentsAffairs.getContentPane().add(btnUpdateRecord);
		
		JButton btnClearStudent = new JButton("CLEAR STUDENT");
		btnClearStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStudentsAffairs.setVisible(false);
				clear cl = new clear();
				cl.frmClearStudent.setVisible(true);
			}
		});
		btnClearStudent.setForeground(Color.BLUE);
		btnClearStudent.setBackground(Color.GREEN);
		btnClearStudent.setBounds(23, 328, 189, 46);
		frmStudentsAffairs.getContentPane().add(btnClearStudent);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStudentsAffairs.setVisible(false);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(404, 362, 103, 46);
		frmStudentsAffairs.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/index2.png"));
		lblNewLabel.setBounds(289, 90, 303, 233);
		frmStudentsAffairs.getContentPane().add(lblNewLabel);
	}
}

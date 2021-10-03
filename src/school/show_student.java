package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class show_student {

	private JFrame frmStudents;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public show_student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudents = new JFrame();
		frmStudents.setTitle("STUDENTS");
		frmStudents.setBounds(100, 100, 729, 422);
		frmStudents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudents.getContentPane().setLayout(null);
		
		JLabel lblEnterStudentsReg = new JLabel("ENTER STUDENT'S REG NUMBER");
		lblEnterStudentsReg.setFont(new Font("Liberation Sans", Font.BOLD | Font.ITALIC, 21));
		lblEnterStudentsReg.setBounds(12, 25, 372, 50);
		frmStudents.getContentPane().add(lblEnterStudentsReg);
		
		textField = new JTextField();
		textField.setBounds(12, 89, 348, 63);
		frmStudents.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStudents.setVisible(false);
				Dash dash=new Dash();
			}
		});
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBounds(92, 174, 184, 50);
		frmStudents.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(688, 69, -205, 319);
		frmStudents.getContentPane().add(textArea);
		frmStudents.setVisible(true);
	}
}

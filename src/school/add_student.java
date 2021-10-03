package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class add_student{

	protected JFrame frmAddStudent;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public add_student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudent = new JFrame();
		frmAddStudent.getContentPane().setBackground(Color.ORANGE);
		frmAddStudent.setTitle("ADD STUDENT");
		frmAddStudent.setBounds(100, 100, 802, 466);
		frmAddStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudent.getContentPane().setLayout(null);
		
		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setBounds(425, 19, 94, 15);
		frmAddStudent.getContentPane().add(lblFirstname);
		
		JLabel lblMiddlename = new JLabel("MiddleName");
		lblMiddlename.setBounds(425, 67, 94, 15);
		frmAddStudent.getContentPane().add(lblMiddlename);
		
		JLabel lblSurname = new JLabel("SurName");
		lblSurname.setBounds(455, 100, 94, 21);
		frmAddStudent.getContentPane().add(lblSurname);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(478, 139, 70, 14);
		frmAddStudent.getContentPane().add(lblPhone);
		
		JLabel lblNationalId = new JLabel(" ID");
		lblNationalId.setBounds(481, 177, 94, 15);
		frmAddStudent.getContentPane().add(lblNationalId);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(479, 218, 70, 15);
		frmAddStudent.getContentPane().add(lblCity);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(455, 273, 70, 15);
		frmAddStudent.getContentPane().add(lblCourse);
		
		textField = new JTextField();
		textField.setBounds(526, 12, 237, 29);
		frmAddStudent.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(526, 52, 237, 30);
		frmAddStudent.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(526, 94, 237, 33);
		frmAddStudent.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(526, 133, 237, 32);
		frmAddStudent.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(526, 177, 237, 29);
		frmAddStudent.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(526, 218, 237, 31);
		frmAddStudent.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(526, 267, 237, 28);
		frmAddStudent.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton addstudent = new JButton("Add");
		addstudent.setForeground(Color.WHITE);
		addstudent.setBackground(Color.MAGENTA);
		addstudent.setBounds(280, 357, 160, 66);
		frmAddStudent.getContentPane().add(addstudent);
		
		JLabel lblPgurdian = new JLabel("P/Gurdian");
		lblPgurdian.setBounds(455, 300, 70, 34);
		frmAddStudent.getContentPane().add(lblPgurdian);
		
		textField_7 = new JTextField();
		textField_7.setBounds(526, 307, 237, 29);
		frmAddStudent.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPmobile = new JLabel("P.mobile");
		lblPmobile.setBounds(455, 357, 70, 15);
		frmAddStudent.getContentPane().add(lblPmobile);
		
		textField_8 = new JTextField();
		textField_8.setBounds(526, 348, 237, 34);
		frmAddStudent.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAddStudent.setVisible(false);
				Dash window = new Dash();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(59, 357, 165, 65);
		frmAddStudent.getContentPane().add(btnNewButton);
		
		JLabel lblAdmission = new JLabel("ADMISSION OF NEW STUDENT");
		lblAdmission.setForeground(Color.BLUE);
		lblAdmission.setFont(new Font("MathJax_Typewriter", Font.BOLD | Font.ITALIC, 24));
		lblAdmission.setBounds(12, 19, 349, 36);
		frmAddStudent.getContentPane().add(lblAdmission);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/index.png"));
		lblNewLabel.setBounds(129, 67, 203, 250);
		frmAddStudent.getContentPane().add(lblNewLabel);
	}
}

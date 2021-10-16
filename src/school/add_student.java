package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class add_student extends Admin{

	protected JFrame frmAddStudent;
	private JTextField fname;
	private JTextField mname;
	private JTextField sname;
	private JTextField phone;
	private JTextField getid;
	public JTextField city,getfee;
	private JTextField getparent;
	private JTextField getnumber;
	private JButton btnNewButton;
	JComboBox comboBox;
	String gender;
	private JTextField textField;
	private JTextField regno;
	float amount;
	String[]courses = new String[] {"Computer Science","Informatics","Information Science","ICT","Computer forensics"};

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
	private void Add_Data() throws SQLException {
		int id = comboBox.getSelectedIndex();
		Get_Connection();
		String query = "insert into Student values(?,?,?,?,?,?,?,?,?,?,?,?)";
		ps=conn.prepareStatement(query);
		ps.setString(1, null);
		ps.setString(2, fname.getText());
		ps.setString(3, mname.getText());
		ps.setString(4, sname.getText());
		ps.setString(5, phone.getText());
		ps.setString(6, getid.getText());
		ps.setString(7, gender);
		ps.setString(8, city.getText());
		ps.setString(9, comboBox.getItemAt(id)+"");
		ps.setInt(10, Integer.parseInt(getfee.getText()));
		ps.setString(11, getparent.getText());
		ps.setString(12, getnumber.getText());
		ps.execute();
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudent = new JFrame();
		frmAddStudent.setResizable(false);
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
		lblCity.setBounds(455, 407, 70, 15);
		frmAddStudent.getContentPane().add(lblCity);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(455, 251, 70, 15);
		frmAddStudent.getContentPane().add(lblCourse);
		
		fname = new JTextField();
		fname.setBounds(526, 12, 237, 29);
		frmAddStudent.getContentPane().add(fname);
		fname.setColumns(10);
		
		mname = new JTextField();
		mname.setBounds(526, 52, 237, 30);
		frmAddStudent.getContentPane().add(mname);
		mname.setColumns(10);
		
		sname = new JTextField();
		sname.setBounds(526, 94, 237, 33);
		frmAddStudent.getContentPane().add(sname);
		sname.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(526, 133, 237, 32);
		frmAddStudent.getContentPane().add(phone);
		phone.setColumns(10);
		
		getid = new JTextField();
		getid.setBounds(526, 177, 237, 29);
		frmAddStudent.getContentPane().add(getid);
		getid.setColumns(10);
		
		city = new JTextField();
		city.setBounds(526, 398, 247, 34);
		frmAddStudent.getContentPane().add(city);
		city.setColumns(10);
		
		JButton addstudent = new JButton("Add");
		addstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Add_Data();
					
					JOptionPane.showMessageDialog(null, "record Added Successfully!!!");
					Get_Connection();
					Statement stm = conn.createStatement();
					ResultSet rs = stm.executeQuery("select * from Student");
					while(rs.next()) {
						regno.setText(rs.getInt(1)+"");
					}
					conn.close();					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		addstudent.setForeground(Color.WHITE);
		addstudent.setBackground(Color.MAGENTA);
		addstudent.setBounds(280, 357, 160, 66);
		frmAddStudent.getContentPane().add(addstudent);
		
		JLabel lblPgurdian = new JLabel("P/Gurdian");
		lblPgurdian.setBounds(449, 316, 70, 34);
		frmAddStudent.getContentPane().add(lblPgurdian);
		
		getparent = new JTextField();
		getparent.setBounds(526, 319, 237, 29);
		frmAddStudent.getContentPane().add(getparent);
		getparent.setColumns(10);
		
		JLabel lblPmobile = new JLabel("P.mobile");
		lblPmobile.setBounds(455, 371, 70, 15);
		frmAddStudent.getContentPane().add(lblPmobile);
		
		getnumber = new JTextField();
		getnumber.setBounds(526, 357, 237, 34);
		frmAddStudent.getContentPane().add(getnumber);
		getnumber.setColumns(10);
		
		btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAddStudent.setVisible(false);
				Students_Affairs sa= new Students_Affairs();
				sa.frmStudentsAffairs.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(59, 357, 165, 65);
		frmAddStudent.getContentPane().add(btnNewButton);
		
		JLabel lblAdmission = new JLabel("ADMISSION OF NEW STUDENT");
		lblAdmission.setForeground(Color.BLUE);
		lblAdmission.setFont(new Font("MathJax_Typewriter", Font.BOLD | Font.ITALIC, 24));
		lblAdmission.setBounds(12, 7, 349, 21);
		frmAddStudent.getContentPane().add(lblAdmission);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/graduate4.png"));
		lblNewLabel.setBounds(150, 29, 263, 316);
		frmAddStudent.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(551, 214, 84, 23);
		rdbtnMale.addActionListener(object->{
			gender="male";
		});
		frmAddStudent.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(656, 214, 94, 23);
		rdbtnFemale.addActionListener(object->{
			gender="female";
		});
		frmAddStudent.getContentPane().add(rdbtnFemale);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(465, 218, 70, 15);
		frmAddStudent.getContentPane().add(lblGender);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setBounds(425, 292, 94, 15);
		frmAddStudent.getContentPane().add(lblAmountPaid);
		
		getfee = new JTextField();
		getfee.setBounds(526, 285, 237, 29);
		frmAddStudent.getContentPane().add(getfee);
		getfee.setColumns(10);
		
		JLabel lblRegNo = new JLabel("REG NO:");
		lblRegNo.setBounds(37, 67, 70, 15);
		frmAddStudent.getContentPane().add(lblRegNo);
		
		regno = new JTextField();
		regno.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 14));
		regno.setForeground(Color.GREEN);
		regno.setBackground(Color.BLACK);
		regno.setEnabled(false);
		regno.setBounds(12, 87, 114, 34);
		frmAddStudent.getContentPane().add(regno);
		regno.setColumns(10);
		
	  comboBox = new JComboBox(courses);
		comboBox.setBounds(526, 246, 177, 33);
		frmAddStudent.getContentPane().add(comboBox);
	}
}

package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fee extends Admin{

	public JFrame frmFeeOption;
	String[] courses;
	JComboBox comboBox;
	JTextArea textArea;
	int []fee;
	private JButton btnExit;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Fee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFeeOption = new JFrame();
		frmFeeOption.setResizable(false);
		frmFeeOption.getContentPane().setBackground(new Color(47, 79, 79));
		frmFeeOption.setTitle("FEE OPTION");
		frmFeeOption.setBounds(100, 100, 670, 424);
		frmFeeOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFeeOption.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(0, 255, 0));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setFont(new Font("Cantarell Extra Bold", Font.BOLD | Font.ITALIC, 15));
		textArea.setEditable(false);
		textArea.setBounds(340, 96, 318, 294);
		frmFeeOption.getContentPane().add(textArea);
		
		JLabel lblAvailableCourses = new JLabel("AVAILABLE COURSES");
		lblAvailableCourses.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 20));
		lblAvailableCourses.setForeground(new Color(0, 255, 0));
		lblAvailableCourses.setBounds(48, 12, 234, 31);
		frmFeeOption.getContentPane().add(lblAvailableCourses);
		
		
		courses = new String[] {"Computer Science","Informatics","Information Science","ICT","Computer forensics"};
		
		 comboBox = new JComboBox(courses);
			comboBox.setBounds(23, 55, 299, 24);
			comboBox.addActionListener((args)->{
				try {
					Get_Connection();
					int id = comboBox.getSelectedIndex();
					Statement stm = conn.createStatement();
					 ResultSet rs;
					switch(id) {
					case 0:
						  rs = stm.executeQuery("select * from Fee where course ='Computer Science' ");
						    while(rs.next()) {
						    textArea.setText("FEE PER SEM \t "+rs.getInt(2)+"");
						    }
						    break;
						    
					case 1:
						 rs = stm.executeQuery("select * from Fee where course ='Informatics' ");
						    while(rs.next()) {
						    textArea.setText("FEE PER SEM \t "+rs.getInt(2)+"");
						    }
						    break;
					case 2:
						 rs = stm.executeQuery("select * from Fee where course ='Information Science' ");
						    while(rs.next()) {
						    textArea.setText("FEE PER SEM \t "+rs.getInt(2)+"");
						    }
						    break;
					case 3:
						 rs = stm.executeQuery("select * from Fee where course ='ICT'");
						    while(rs.next()) {
						    textArea.setText("FEE PER SEM \t "+rs.getInt(2)+"");
						    }
						    break;
					case 4:
						 rs = stm.executeQuery("select * from Fee where course ='Computer forensics'");
						    while(rs.next()) {
						    textArea.setText("FEE PER SEM \t "+rs.getInt(2)+"");
						    }
						    break;
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			frmFeeOption.getContentPane().add(comboBox);
			
			btnExit = new JButton("EXIT");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frmFeeOption.setVisible(false);
				}
			});
			btnExit.setForeground(new Color(255, 255, 255));
			btnExit.setBackground(new Color(255, 0, 0));
			btnExit.setBounds(473, 15, 161, 64);
			frmFeeOption.getContentPane().add(btnExit);
	}
	
}


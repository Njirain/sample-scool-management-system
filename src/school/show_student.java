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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class show_student extends Admin{

	private JFrame frmStudents;
	private JTextField getreg;
	 protected JTextArea result;
	 private JLabel lblNewLabel;

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
		lblEnterStudentsReg.setBounds(12, 27, 350, 50);
		frmStudents.getContentPane().add(lblEnterStudentsReg);
		
		getreg = new JTextField();
		getreg.setBounds(31, 264, 189, 50);
		frmStudents.getContentPane().add(getreg);
		getreg.addActionListener(object->{
			try {
				ShowResults();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		getreg.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				
				ShowResults();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBounds(31, 326, 184, 50);
		frmStudents.getContentPane().add(btnNewButton);
		
		 result = new JTextArea();
		 result.setFont(new Font("DejaVu Sans Mono", Font.BOLD | Font.ITALIC, 12));
		 result.setForeground(Color.GREEN);
		 result.setBackground(Color.BLACK);
		 result.setEditable(false);
		result.setBounds(367, 12, 350, 376);
		frmStudents.getContentPane().add(result);
		
		lblNewLabel = new JLabel("student records");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/Annotation 2021-09-30 100047.png"));
		lblNewLabel.setBounds(99, 89, 250, 137);
		frmStudents.getContentPane().add(lblNewLabel);
		frmStudents.setVisible(true);
	}
	public void ShowResults() throws SQLException, InterruptedException {
		Get_Connection();
		Statement stm = conn.createStatement();
		 ResultSet rs =  stm.executeQuery("select * from Student where id = "+Integer.parseInt(getreg.getText()));
	     while(rs.next()) {
	    	 result.setText("NAME: "+rs.getString(4)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
	    			 "\n"+"PHONE: "+rs.getString(5)+"\n"+"NATIONAL ID: "+rs.getString(6)+
	    			 "\n"+"GENDER "+rs.getString(7)+"\n"+"CITY: "+rs.getString(8)+"\n"+
	    			 "PROGRAMME: "+rs.getString(9)+"\n"+"FEE PAID: "+rs.getInt(10)+" "+"\n"+
	    			 "PARENT/GUARDIAN: "+rs.getString(11)+" \n"+" PARENT/GURDIAN NUMBER: "+rs.getString(12));
	    	 getreg.setEditable(false);
	    	 Thread tr = new Thread();
	    	 tr.sleep(1000);
	    	 getreg.setEditable(true);
	     }
	}
}

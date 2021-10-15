package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class clear extends Admin{

	public JFrame frmClearStudent;
	JTextArea textArea ;
	private JTextField getreg;

	
	
	public clear() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClearStudent = new JFrame();
		frmClearStudent.getContentPane().setBackground(Color.YELLOW);
		frmClearStudent.setTitle("CLEAR STUDENT");
		frmClearStudent.setBounds(100, 100, 745, 451);
		frmClearStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClearStudent.getContentPane().setLayout(null);
		
		JLabel lblClearancePage = new JLabel("CLEARANCE PAGE");
		lblClearancePage.setFont(new Font("Lato Black", Font.BOLD, 20));
		lblClearancePage.setForeground(Color.RED);
		lblClearancePage.setBounds(111, 43, 247, 35);
		frmClearStudent.getContentPane().add(lblClearancePage);
		
		JLabel lblSearchByStudents = new JLabel("SEARCH BY STUDENT'S REG NO:");
		lblSearchByStudents.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 23));
		lblSearchByStudents.setBounds(315, 43, 418, 35);
		frmClearStudent.getContentPane().add(lblSearchByStudents);
		
		getreg = new JTextField();
		getreg.setBounds(346, 81, 362, 44);
		getreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Get_Connection();
					Statement stm = conn.createStatement();
					 ResultSet rs =  stm.executeQuery("select * from Student where id = "+Integer.parseInt(getreg.getText()));
					while(rs.next()) {
						 textArea.setText("NAME: "+rs.getString(4)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
				    			 "\n"+"PHONE: "+rs.getString(5)+"\n"+"NATIONAL ID: "+rs.getString(6)+
				    			 "\n"+"GENDER "+rs.getString(7)+"\n"+"CITY: "+rs.getString(8)+"\n"+
				    			 "PROGRAMME: "+rs.getString(9)+"\n"+"FEE PAID: "+rs.getInt(10)+" "+"\n"+
				    			 "PARENT/GUARDIAN: "+rs.getString(11)+" \n"+" PARENT/GURDIAN NUMBER: "+rs.getString(12));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		frmClearStudent.getContentPane().add(getreg);
		getreg.setColumns(10);
		
	   textArea = new JTextArea();
	   textArea.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 12));
	   textArea.setForeground(Color.RED);
	   textArea.setEditable(false);
	   textArea.setBackground(Color.DARK_GRAY);
		textArea.setBounds(12, 177, 440, 240);
		frmClearStudent.getContentPane().add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.RED);
		separator.setBounds(12, 167, 721, 2);
		frmClearStudent.getContentPane().add(separator);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Get_Connection();
					ps = conn.prepareStatement("delete from Student where id = "+Integer.parseInt(getreg.getText()));
					ps.execute();
					JOptionPane.showMessageDialog(null, "Record Cleared successfully");
					textArea.setText("");
					getreg.setText("");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	    
		btnClear.setForeground(Color.BLACK);
		btnClear.setBackground(Color.GREEN);
		btnClear.setBounds(482, 366, 117, 51);
		frmClearStudent.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmClearStudent.setVisible(false);	
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.GREEN);
		btnExit.setBounds(616, 366, 117, 51);
		frmClearStudent.getContentPane().add(btnExit);
	}
}

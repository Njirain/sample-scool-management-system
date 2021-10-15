package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Show_student extends Admin{

	public JFrame frmStudentRecord;
	private JTextField getregno;
	JTextArea results ;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Show_student window = new Show_student();
					window.frmStudentRecord.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Show_student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentRecord = new JFrame();
		frmStudentRecord.getContentPane().setBackground(SystemColor.desktop);
		frmStudentRecord.setBackground(Color.GREEN);
		frmStudentRecord.setTitle("STUDENT RECORD");
		frmStudentRecord.setBounds(100, 100, 867, 449);
		frmStudentRecord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentRecord.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/graduate4.png"));
		lblNewLabel.setBounds(22, 39, 286, 376);
		frmStudentRecord.getContentPane().add(lblNewLabel);
		
		JLabel lblStudentsRecord = new JLabel("STUDENT'S RECORD");
		lblStudentsRecord.setForeground(SystemColor.activeCaptionText);
		lblStudentsRecord.setBounds(101, 12, 181, 15);
		frmStudentRecord.getContentPane().add(lblStudentsRecord);
		
		getregno = new JTextField();
		getregno.setBounds(326, 39, 167, 43);
		getregno.addActionListener((args)->{
			try {
				show();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		frmStudentRecord.getContentPane().add(getregno);
		getregno.setColumns(10);
		
		JLabel lblRegNo = new JLabel("REG NO:");
		lblRegNo.setForeground(SystemColor.textText);
		lblRegNo.setBounds(355, 12, 70, 15);
		frmStudentRecord.getContentPane().add(lblRegNo);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStudentRecord.setVisible(false);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(748, 7, 107, 43);
		frmStudentRecord.getContentPane().add(btnExit);
		
	     results = new JTextArea();
		results.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		results.setForeground(new Color(0, 255, 0));
		results.setBackground(new Color(0, 0, 0));
		results.setBounds(407, 123, 448, 292);
		frmStudentRecord.getContentPane().add(results);
	}
	private void show() throws SQLException {
		Get_Connection();
		Statement stm = conn.createStatement();
	    rs = stm.executeQuery("select * from Student where id = "+Integer.parseInt(getregno.getText()));
		if(rs.next()) {
		results.setText("NAME: "+rs.getString(4)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\n"+
		"PHONE: \t"+rs.getString(5)+"\n"+"NATIONAL ID: "+rs.getString(6)+"\n"+"GENDER \t"+rs.getNString(7)+"\n"+"CITY: \t"+rs.getString(8)+"\n"
		+"PROGRAMME: "+rs.getString(9)+"\n"+"PAID FEE: "+rs.getString(10)+"\n"+"GURDIAN: "+rs.getString(11)+"\n"+"GURDIAN NUMBER: "+rs.getString(12)+"+\n"+
		"FEE BALANCE: ");
		}
		else
			JOptionPane.showMessageDialog(null,"AN ERROR OCCURED PLEASE CHECK THE ADMISSION NUMBER AND TRY AGAIN!!");
		getregno.setText("");
		}

}

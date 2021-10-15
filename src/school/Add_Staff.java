package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Add_Staff extends Admin {

	public JFrame frmAddStaff;
	private JTextField getfirst;
	private JTextField getmiddle;
	private JTextField getlast;
	private JTextField getmobile;
	private JTextField getposition;
	private JTextField getsalary;
	private JTextField getcard;
	

	public Add_Staff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStaff = new JFrame();
		frmAddStaff.getContentPane().setBackground(new Color(0, 255, 255));
		frmAddStaff.setTitle("STAFF STUFF");
		frmAddStaff.setBounds(100, 100, 744, 464);
		frmAddStaff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStaff.getContentPane().setLayout(null);
		
		JLabel lblAddStaff = new JLabel("STAFF STUFF");
		lblAddStaff.setForeground(new Color(0, 0, 205));
		lblAddStaff.setBackground(Color.GREEN);
		lblAddStaff.setFont(new Font("Z003", Font.BOLD | Font.ITALIC, 36));
		lblAddStaff.setBounds(12, 29, 248, 45);
		frmAddStaff.getContentPane().add(lblAddStaff);
		
		JLabel lblFirstName = new JLabel("FIRST NAME");
		lblFirstName.setBounds(12, 109, 92, 22);
		frmAddStaff.getContentPane().add(lblFirstName);
		
		getfirst = new JTextField();
		getfirst.setForeground(Color.BLACK);
		getfirst.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 13));
		getfirst.setBounds(110, 103, 204, 36);
		frmAddStaff.getContentPane().add(getfirst);
		getfirst.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("MIDDLE NAME");
		lblMiddleName.setBounds(9, 154, 95, 22);
		frmAddStaff.getContentPane().add(lblMiddleName);
		
		getmiddle = new JTextField();
		getmiddle.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 12));
		getmiddle.setForeground(Color.BLACK);
		getmiddle.setColumns(10);
		getmiddle.setBounds(110, 148, 204, 36);
		frmAddStaff.getContentPane().add(getmiddle);
		
		JLabel lblLastName = new JLabel("LAST NAME");
		lblLastName.setBounds(12, 203, 95, 15);
		frmAddStaff.getContentPane().add(lblLastName);
		
		getlast = new JTextField();
		getlast.setForeground(Color.BLACK);
		getlast.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 12));
		getlast.setColumns(10);
		getlast.setBounds(110, 196, 204, 36);
		frmAddStaff.getContentPane().add(getlast);
		
		JLabel lblMobile = new JLabel("MOBILE");
		lblMobile.setBounds(23, 245, 70, 15);
		frmAddStaff.getContentPane().add(lblMobile);
		
		getmobile = new JTextField();
		getmobile.setForeground(Color.BLACK);
		getmobile.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 12));
		getmobile.setColumns(10);
		getmobile.setBounds(110, 244, 204, 36);
		frmAddStaff.getContentPane().add(getmobile);
		
		JLabel lblPosition = new JLabel("POSITION");
		lblPosition.setBounds(12, 298, 70, 15);
		frmAddStaff.getContentPane().add(lblPosition);
		
		getposition = new JTextField();
		getposition.setForeground(Color.BLACK);
		getposition.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 12));
		getposition.setColumns(10);
		getposition.setBounds(110, 292, 204, 36);
		frmAddStaff.getContentPane().add(getposition);
		
		JLabel lblSalary = new JLabel("SALARY");
		lblSalary.setBounds(23, 346, 70, 15);
		frmAddStaff.getContentPane().add(lblSalary);
		
		getsalary = new JTextField();
		getsalary.setFont(new Font("Lato Black", Font.BOLD | Font.ITALIC, 12));
		getsalary.setForeground(Color.BLACK);
		getsalary.setBounds(110, 340, 204, 36);
		frmAddStaff.getContentPane().add(getsalary);
		getsalary.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
             try {
				Add();
				Get_Connection();
				ResultSet rs = conn.createStatement().executeQuery("select * from Staff");
				while(rs.next()) {
					getcard.setText(rs.getInt(1)+"");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		btnAdd.setBounds(131, 387, 117, 45);
		frmAddStaff.getContentPane().add(btnAdd);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getcard.setText("");
			getfirst.setText("");
			getmiddle.setText("");
			getlast.setText("");
			getmobile.setText("");
			getposition.setText("");
			getsalary.setText("");
			}
		});
		btnClear.setBounds(387, 387, 117, 45);
		frmAddStaff.getContentPane().add(btnClear);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					update();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		});
		btnUpdate.setBounds(258, 387, 117, 45);
		frmAddStaff.getContentPane().add(btnUpdate);
		
		JLabel lblNewLabel = new JLabel("ADD STAFF");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Z003", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/admins.jpeg"));
		lblNewLabel.setBounds(347, 120, 385, 239);
		frmAddStaff.getContentPane().add(lblNewLabel);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFocusPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAddStaff.setVisible(false);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(561, 22, 159, 54);
		frmAddStaff.getContentPane().add(btnExit);
		
		JLabel lblSearchByCard = new JLabel("search by card no:");
		lblSearchByCard.setBounds(276, 12, 147, 22);
		frmAddStaff.getContentPane().add(lblSearchByCard);
		
		getcard = new JTextField();
		getcard.setForeground(Color.BLUE);
		getcard.setFont(new Font("Lato Heavy", Font.BOLD | Font.ITALIC, 16));
		getcard.setBackground(Color.LIGHT_GRAY);
		getcard.setBounds(278, 46, 127, 36);
		getcard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					search();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		frmAddStaff.getContentPane().add(getcard);
		getcard.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					search();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		});
		btnSearch.setBackground(new Color(128, 0, 128));
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBounds(417, 45, 106, 34);
		frmAddStaff.getContentPane().add(btnSearch);
		
		JButton btndelete = new JButton("CLEAR FROM RECORD");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClearRecord();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btndelete.setForeground(Color.WHITE);
		btndelete.setBackground(Color.BLACK);
		btndelete.setBounds(516, 388, 204, 42);
		frmAddStaff.getContentPane().add(btndelete);
	}
	private void Add() throws SQLException {
		Get_Connection();
		ps = conn.prepareStatement("insert into Staff values(?,?,?,?,?,?,?)");
		ps.setString(1, null);
		ps.setString(2, getfirst.getText());
		ps.setString(3, getmiddle.getText());
		ps.setString(4, getlast.getText());
		ps.setInt(5, Integer.parseInt(getmobile.getText()));
		ps.setString(6, getposition.getText());
		ps.setInt(7, Integer.parseInt(getsalary.getText()));
		ps.execute();
			JOptionPane.showMessageDialog(null, "Employee "+getfirst.getText()+" added successfully!!");
	}
	
	
	private void update() throws SQLException {
		Get_Connection();
		getfirst.setEditable(false);
		getmiddle.setEditable(false);
		getlast.setEditable(false);
		getmobile.setEditable(true);
		getposition.setEditable(true);
		getsalary.setEditable(true);
		ps = conn.prepareStatement("update Staff set mobile = ?,position = ?,salary = ? where cardno = "+Integer.parseInt(getcard.getText()));
		ps.setInt(1, Integer.parseInt(getmobile.getText()));
		ps.setString(2, getposition.getText());
		ps.setInt(3, Integer.parseInt(getsalary.getText()));
		ps.execute();
			JOptionPane.showMessageDialog(null,"Data update a success!!");
			
	}
	private void ClearRecord() throws SQLException {
		Get_Connection();
		getfirst.setEditable(false);
		getmiddle.setEditable(false);
		getlast.setEditable(false);
		getmobile.setEditable(false);
		getposition.setEditable(false);
		getsalary.setEditable(false);
		if(getcard.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "please enter card number");
		}
		ps = conn.prepareStatement("delete from Staff where cardno = "+Integer.parseInt(getcard.getText()));
		 ps.execute();
		 JOptionPane.showMessageDialog(null, "Clearance a success!!");
			getcard.setText("");
			getfirst.setText("");
			getmiddle.setText("");
			getlast.setText("");
			getmobile.setText("");
			getposition.setText("");
			getsalary.setText("");
			
	}
	private void search() throws SQLException  {
		Get_Connection();
		getfirst.setEditable(false);
		getmiddle.setEditable(false);
		getlast.setEditable(false);
		getmobile.setEditable(true);
		getposition.setEditable(true);
		getsalary.setEditable(true);
		 Statement stm = conn.createStatement();
		 ResultSet rs = stm.executeQuery("select * from Staff where cardno = "+Integer.parseInt(getcard.getText()));
		 if(rs.next()) {
			 getfirst.setText(rs.getString(2));
			 getmiddle.setText(rs.getString(3));
			 getlast.setText(rs.getString(4));
			 getmobile.setText(rs.getInt(5)+"");
			 getposition.setText(rs.getString(6));
			 getsalary.setText(rs.getInt(7)+"");
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "Staff not found!!");
		 }
	}
}

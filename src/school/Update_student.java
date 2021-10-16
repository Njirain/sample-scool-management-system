package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Update_student extends Admin {

	public JFrame frmUpdateData;
	private JTextField getregno;
	private JTextField phone;
	private JTextField amount;
	private JTextField parentno;

	public Update_student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateData = new JFrame();
		frmUpdateData.setResizable(false);
		frmUpdateData.getContentPane().setBackground(Color.DARK_GRAY);
		frmUpdateData.getContentPane().setForeground(Color.WHITE);
		frmUpdateData.setTitle("UPDATE DATA");
		frmUpdateData.setBounds(100, 100, 736, 439);
		frmUpdateData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateData.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/index.png"));
		lblNewLabel.setBounds(12, 84, 228, 321);
		frmUpdateData.getContentPane().add(lblNewLabel);
		
		getregno = new JTextField();
		getregno.setForeground(Color.GREEN);
		getregno.setFont(new Font("Open Sans Condensed", Font.BOLD | Font.ITALIC, 12));
		getregno.setBackground(Color.BLACK);
		getregno.setBounds(534, 55, 179, 35);
		getregno.addActionListener((args)->{
			
			try {
				QueryDb();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		frmUpdateData.getContentPane().add(getregno);
		getregno.setColumns(10);
		
		JLabel lblStudentsRegNo = new JLabel("SEARCH BY STUDENT'S REG NO:");
		lblStudentsRegNo.setForeground(Color.RED);
		lblStudentsRegNo.setFont(new Font("Open Sans Condensed Light", Font.BOLD | Font.ITALIC, 22));
		lblStudentsRegNo.setBounds(503, 12, 210, 31);
		frmUpdateData.getContentPane().add(lblStudentsRegNo);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFocusPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUpdateData.setVisible(false);
			}
		});
		btnExit.setForeground(Color.GREEN);
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(12, 5, 136, 53);
		frmUpdateData.getContentPane().add(btnExit);
		
		phone = new JTextField();
		phone.setBounds(534, 127, 189, 35);
		frmUpdateData.getContentPane().add(phone);
		phone.setColumns(10);
		
		amount = new JTextField();
		amount.setColumns(10);
		amount.setBounds(534, 174, 189, 35);
		frmUpdateData.getContentPane().add(amount);
		
		parentno = new JTextField();
		parentno.setColumns(10);
		parentno.setBounds(534, 235, 189, 35);
		frmUpdateData.getContentPane().add(parentno);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setForeground(Color.GREEN);
		lblPhone.setBounds(473, 134, 56, 21);
		frmUpdateData.getContentPane().add(lblPhone);
		
		JLabel lblGurdian = new JLabel("Gurdian_no");
		lblGurdian.setForeground(Color.GREEN);
		lblGurdian.setBounds(449, 245, 80, 15);
		frmUpdateData.getContentPane().add(lblGurdian);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setForeground(Color.GREEN);
		lblFee.setBounds(473, 189, 56, 25);
		frmUpdateData.getContentPane().add(lblFee);
		
		JButton btnUpdate = new JButton("UPdate");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					UpdateData();
					btnUpdate.setEnabled(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnUpdate.setFont(new Font("Lato Heavy", Font.BOLD | Font.ITALIC, 15));
		btnUpdate.setForeground(Color.BLUE);
		btnUpdate.setBackground(Color.MAGENTA);
		btnUpdate.setBounds(453, 316, 117, 66);
		frmUpdateData.getContentPane().add(btnUpdate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Liberation Mono", Font.BOLD | Font.ITALIC, 20));
		btnClear.setFocusPainted(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getregno.setText("");
				phone.setText("");
				amount.setText("");
				parentno.setText("");
				btnClear.setEnabled(false);
			}
		});
		btnClear.setForeground(Color.BLUE);
		btnClear.setBackground(Color.MAGENTA);
		btnClear.setBounds(596, 316, 117, 66);
		frmUpdateData.getContentPane().add(btnClear);
	}
	private void QueryDb() throws SQLException {
		// TODO Auto-generated method stub
		Get_Connection();
		ResultSet rs = conn.createStatement().executeQuery("select * from Student where id = "+getregno.getText());
		while(rs.next()) {
			phone.setText(rs.getString(5));
			amount.setText(rs.getString(10));
			parentno.setText(rs.getString(12));
		}
		
	}

	private void UpdateData() throws SQLException {
		Get_Connection();
		String sql = "update Student set phone = ?,fee = ?,gurduannumber = ?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, phone.getText());
		ps.setInt(2, Integer.parseInt(amount.getText()));
		ps.setString(3,parentno.getText() );
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "record update a success");
	}
}

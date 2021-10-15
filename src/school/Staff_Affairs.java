package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Staff_Affairs {

	public JFrame frmStaffsOption;


	public Staff_Affairs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStaffsOption = new JFrame();
		frmStaffsOption.getContentPane().setBackground(UIManager.getColor("controlDkShadow"));
		frmStaffsOption.setTitle("Staffs Option");
		frmStaffsOption.setBounds(100, 100, 736, 460);
		frmStaffsOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStaffsOption.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STAFF OPTION");
		lblNewLabel.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/employees.jpeg"));
		lblNewLabel.setBounds(313, 164, 411, 262);
		frmStaffsOption.getContentPane().add(lblNewLabel);
		
		JLabel lblStaffOption = new JLabel("STAFF OPTION");
		lblStaffOption.setFont(new Font("Z003", Font.BOLD | Font.ITALIC, 30));
		lblStaffOption.setForeground(Color.RED);
		lblStaffOption.setBackground(SystemColor.inactiveCaptionText);
		lblStaffOption.setBounds(153, 12, 283, 101);
		frmStaffsOption.getContentPane().add(lblStaffOption);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFocusPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStaffsOption.setVisible(false);	
			}
		});
		btnExit.setForeground(Color.GREEN);
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(568, 12, 156, 48);
		frmStaffsOption.getContentPane().add(btnExit);
		

		JButton btnAddEmployee = new JButton("STAFF OPTION");
		btnAddEmployee.setBackground(Color.GREEN);
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_Staff add = new Add_Staff();	
				frmStaffsOption.setVisible(false);
				add.frmAddStaff.setVisible(true);
			}	
		});
		btnAddEmployee.setBounds(12, 227, 192, 53);
		frmStaffsOption.getContentPane().add(btnAddEmployee);
		
		JLabel lblAdddeleteupdateStaffs = new JLabel("ADD/DELETE/UPDATE STAFFS");
		lblAdddeleteupdateStaffs.setFont(new Font("Z003", Font.BOLD | Font.ITALIC, 30));
		lblAdddeleteupdateStaffs.setForeground(Color.BLACK);
		lblAdddeleteupdateStaffs.setBounds(23, 121, 471, 31);
		frmStaffsOption.getContentPane().add(lblAdddeleteupdateStaffs);
	}
}

package school;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

public class Show_Admins extends Admin {

	public JFrame frmAdmis;
	JTextArea text;


	public Show_Admins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdmis = new JFrame();
		frmAdmis.setResizable(false);
		frmAdmis.setTitle("ADMIS");
		frmAdmis.setBounds(100, 100, 652, 455);
		frmAdmis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdmis.getContentPane().setLayout(null);
		
		JLabel lblAvailableAdmis = new JLabel("AVAILABLE ADMIS");
		lblAvailableAdmis.setForeground(new Color(0, 128, 128));
		lblAvailableAdmis.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 25));
		lblAvailableAdmis.setBounds(130, 12, 262, 48);
		frmAdmis.getContentPane().add(lblAvailableAdmis);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(389, 55, 231, 220);
		frmAdmis.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/home/franc/eclipse-workspace/School Management/icons/admins.jpeg"));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFocusPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAdmis.setVisible(false);
				Dash dash=new Dash();
			}
		});
		btnExit.setBackground(new Color(128, 128, 0));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBounds(500, 297, 120, 72);
		frmAdmis.getContentPane().add(btnExit);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 callTable();
			}
		});
		btnShow.setBackground(new Color(173, 255, 47));
		btnShow.setBounds(358, 297, 127, 72);
		frmAdmis.getContentPane().add(btnShow);
		
		text = new JTextArea();
		text.setEditable(false);
		text.setBounds(39, 120, 319, 301);
		frmAdmis.getContentPane().add(text);
		frmAdmis.setVisible(true);
		
	}
	private void callTable() {
		try {
			Get_Connection();
			Statement stm = conn.createStatement();
			ResultSet rs =  stm.executeQuery("select username,email,password from Admins");
			while (rs.next()) {	
			
				String name = rs.getString(1);
				String email=rs.getString(2);
				String pass = rs.getString(3);
				text.setText("1. "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

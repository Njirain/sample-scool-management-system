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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class Show_Admins extends Admin {

	public JFrame frmAdmis;


	public Show_Admins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdmis = new JFrame();
		frmAdmis.setTitle("ADMIS");
		frmAdmis.setBounds(100, 100, 585, 453);
		frmAdmis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdmis.getContentPane().setLayout(null);
		
		JLabel lblAvailableAdmis = new JLabel("AVAILABLE ADMIS");
		lblAvailableAdmis.setForeground(new Color(0, 128, 128));
		lblAvailableAdmis.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 25));
		lblAvailableAdmis.setBounds(130, 12, 262, 48);
		frmAdmis.getContentPane().add(lblAvailableAdmis);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "ADMINS:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBounds(12, 72, 287, 347);
		frmAdmis.getContentPane().add(panel);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.GREEN);
		textArea.setBackground(Color.BLACK);
		panel.add(textArea);
		textArea.setColumns(25);
		textArea.setRows(21);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(297, 55, 262, 220);
		frmAdmis.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/home/franc/icons/Annotation 2021-09-30 095701.png"));
		
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
		btnExit.setBounds(453, 287, 120, 72);
		frmAdmis.getContentPane().add(btnExit);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	DefaultTableModel tb = (DefaultTableModel) table.getModel();
				try {
					Get_Connection();
					Statement stm = conn.createStatement();
					ResultSet rs =  stm.executeQuery("select username,email,password from Admins");
					while (rs.next()) {
						textArea.append(rs.getString(1));
						textArea.append(rs.getString(2));
						textArea.append(rs.getString(3));
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
		});
		btnShow.setBackground(new Color(173, 255, 47));
		btnShow.setBounds(307, 287, 127, 72);
		frmAdmis.getContentPane().add(btnShow);
		frmAdmis.setVisible(true);
		
	}
}

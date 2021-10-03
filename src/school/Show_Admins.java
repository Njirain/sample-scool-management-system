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
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Show_Admins {

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
		frmAdmis.setBounds(100, 100, 585, 393);
		frmAdmis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdmis.getContentPane().setLayout(null);
		
		JLabel lblAvailableAdmis = new JLabel("AVAILABLE ADMIS");
		lblAvailableAdmis.setForeground(new Color(0, 128, 128));
		lblAvailableAdmis.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 25));
		lblAvailableAdmis.setBounds(130, 12, 262, 48);
		frmAdmis.getContentPane().add(lblAvailableAdmis);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "ADMINS:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBounds(31, 72, 268, 287);
		frmAdmis.getContentPane().add(panel);
		
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
		btnExit.setBounds(434, 287, 139, 72);
		frmAdmis.getContentPane().add(btnExit);
		frmAdmis.setVisible(true);
		
	}
}

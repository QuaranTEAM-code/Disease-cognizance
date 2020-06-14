
import java.awt.BorderLayout;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
import java.awt.EventQueue;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.DropMode;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtVXc;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1082, 663);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(-36, -22, 1222, 674);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Create Account");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp obj = new SignUp();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnNewButton_1.setBounds(608, 474, 180, 37);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New to Disease Cognizance ? Create Account .");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(151, 478, 426, 29);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(389, 430, 101, 29);
		panel_1.add(btnNewButton);
		btnNewButton.setBackground(SystemColor.textHighlightText);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement pst;
				ResultSet rs;
				String name = txtVXc.getText();
				String pass = String.copyValueOf(passwordField.getPassword());
				
				String query = "select * from student where USERNAME=? and PASSWORD_1=?";
				Connection cont = null;
				try {
					cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false","root","linux2020");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					PreparedStatement ps = cont.prepareStatement(query);
					
					ps.setString(1,  name);
					ps.setString(2, pass );
					
					rs = ps.executeQuery();
					
					if(rs.next()) {
						 Page mf = new Page();
		                 mf.setVisible(true);
		                 dispose();
		                    //mf.pack();
		                    //mf.setLocationRelativeTo(null);
		                   //mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		                 //mf.lblNewLabel.setText("Welcome < "+name+" >");   
		  
					}
					
					else{
						JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
					}

				}catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setDropMode(DropMode.INSERT);
		passwordField.setBounds(309, 357, 246, 29);
		panel_1.add(passwordField);
		
		txtVXc = new JTextField();
		txtVXc.setForeground(SystemColor.menuText);
		txtVXc.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		txtVXc.setBackground(SystemColor.text);
		txtVXc.setBounds(309, 239, 246, 29);
		panel_1.add(txtVXc);
		txtVXc.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(309, 299, 167, 30);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(309, 174, 246, 37);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Sign In");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(328, 80, 204, 60);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 40));
		
		JButton btnNewButton_2 = new JButton("BACK\r\n");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front ff = new Front();
				ff.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(796, 87, 89, 29);
		panel_1.add(btnNewButton_2);
	}
}

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(-12, -1, 539, 656);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\karth\\Downloads\\Webp.net-resizeimage.png"));
		lblNewLabel.setBounds(74, 29, 328, 318);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Disease Cognizance User ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 34));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(54, 394, 409, 49);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(508, 0, 576, 643);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Sign Up");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 48));
		lblNewLabel_2.setBounds(201, 29, 204, 69);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 34));
		lblNewLabel_3.setBounds(34, 109, 196, 46);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField.setForeground(SystemColor.menuText);
		textField.setBounds(34, 159, 464, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email Address");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 34));
		lblNewLabel_4.setBounds(34, 196, 223, 33);
		panel_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		textField_1.setBounds(34, 240, 464, 33);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 34));
		lblNewLabel_5.setBounds(34, 277, 254, 42);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Confirm Password");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 34));
		lblNewLabel_6.setBounds(33, 367, 298, 33);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btnNewButton) {
					
					try {
						Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false","root","linux2020");
						PreparedStatement pst = cont.prepareStatement("insert into student values(?,?,?,?)");
						
						pst.setString(1, textField.getText());
						pst.setString(2, textField_1.getText());
						pst.setString(3, passwordField.getText());
						pst.setString(4, passwordField_1.getText());
						
						if(passwordField.getText().equalsIgnoreCase(passwordField_1.getText())) {
							pst.executeUpdate();
							Page obj = new Page();
							obj.setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null , "Password did not match");
						}
					} catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 27));
		btnNewButton.setForeground(SystemColor.menuText);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(201, 491, 130, 42);
		panel_1.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(34, 319, 464, 33);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField_1.setBounds(34, 411, 455, 33);
		panel_1.add(passwordField_1);
	}
}

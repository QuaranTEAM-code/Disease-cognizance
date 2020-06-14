import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class assessment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					assessment frame = new assessment();
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
	public assessment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1096, 718);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Self Assessment Test -->");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 39));
		lblNewLabel.setBounds(10, 21, 1005, 69);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("~ Answer Only In Yes / No");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(30, 117, 370, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Q 1  Are you experiencing any of the following symptoms --> Cough , Fever , Difficulty in Breathing ?\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(30, 184, 951, 41);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(40, 228, 861, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Q 2 Are you Suffering with any of the following \r\ndisease  --> Diabetes , Hypertension , Lung Disease , Heart Disease ?");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(30, 292, 985, 31);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 334, 861, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Q 3 Have you traveled anywhere internationally in the last 14 days ?");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(30, 380, 935, 31);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(40, 422, 861, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Q 4 Have you recently interacted or lived with someone who has tested positive for COVID-19 ?");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(30, 488, 923, 31);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(40, 530, 861, 31);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btnNewButton) {
					
					try {
						Connection cont = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdata?useSSL=false","root","linux2020");
						PreparedStatement pst = cont.prepareStatement("insert into question values(?,?,?,?)");
						
						pst.setString(1, textField.getText());
						pst.setString(2, textField_1.getText());
						pst.setString(3, textField_2.getText());
						pst.setString(4, textField_3.getText());
						pst.executeUpdate();
						
						result obj = new result();
						obj.setVisible(true);
						dispose();
					} catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnNewButton.setBounds(473, 598, 133, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page obj = new Page();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		btnNewButton_1.setBounds(891, 57, 102, 33);
		contentPane.add(btnNewButton_1);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Front extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front frame = new Front();
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
	public Front() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1103, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Disease Cognizance is the Deus Ex Machina of the medical information");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(187, 336, 813, 38);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("JOIN US NOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn obj = new SignIn();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
		btnNewButton.setBounds(458, 411, 180, 38);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(214, 321, 664, 4);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("To   Disease   Cognizance");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 45));
		lblNewLabel_2.setBounds(290, 243, 577, 67);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME\r\n  ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 76));
		lblNewLabel_1.setBounds(339, 143, 474, 89);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\karth\\Downloads\\Webp.net-resizeimage (6).jpg"));
		lblNewLabel.setBounds(-12, 0, 1185, 560);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(859, 11, 49, 38);
		panel.add(lblNewLabel_4);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class StressBuster extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StressBuster frame = new StressBuster();
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
	public StressBuster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1094, 565);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STRESS BUSTER -->");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 36));
		lblNewLabel.setBounds(10, 11, 1045, 55);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PLAY");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tGame jf=new tGame("Tic Tac Toe");
				 jf.setComponent(); 
				 jf.setSize(325,450);
				 jf.setLocation(100,100);
				 jf.getContentPane().setLayout(null);
				 jf.setVisible(true);
				 jf.setResizable(false);
				 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnNewButton.setBounds(899, 171, 120, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PLAY");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//StressBuster = new FlappyBird();
				FlappyBird.main(new String[0]);
				
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnNewButton_1.setBounds(899, 316, 120, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setBackground(Color.WHITE);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page obj2 = new  Page();
				obj2.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		btnNewButton_2.setBounds(899, 38, 102, 28);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Tic Tac Toe Game -->>");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 29));
		lblNewLabel_1.setBounds(352, 171, 537, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Flappy Bird Game -->>");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 29));
		lblNewLabel_2.setBounds(352, 316, 448, 34);
		contentPane.add(lblNewLabel_2);
	}

}

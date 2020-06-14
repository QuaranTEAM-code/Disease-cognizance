import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page frame = new Page();
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
	public Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1089, 567);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("COVID -19 UPDATES");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ccovi cc = new ccovi();
				cc.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("SELF ASSESSMENT");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assessment obj = new assessment();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnNewButton_2.setBounds(876, 338, 172, 36);
		contentPane.add(btnNewButton_2);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnNewButton.setBounds(876, 152, 172, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("STRESS ~ BUSTER");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StressBuster obj = new StressBuster();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnNewButton_1.setBounds(876, 244, 172, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("SIGN OUT");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn obj = new SignIn();
				obj.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		btnNewButton_3.setBounds(947, 11, 101, 36);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("COVID-19 UPDATES -->>");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 29));
		lblNewLabel_1.setBounds(258, 152, 480, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("STRESS BUSTER -- >>");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 29));
		lblNewLabel_2.setBounds(260, 239, 293, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SELF ASSESSMENT -->>");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		lblNewLabel_3.setBounds(262, 338, 428, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Welcome -->");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 50));
		lblNewLabel.setBounds(10, 11, 1038, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("About COVID- 19 -->>");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(262, 416, 316, 33);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_4 = new JButton("ABOUT");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about_covid19 obj = new about_covid19();
				obj.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnNewButton_4.setBounds(876, 416, 172, 33);
		contentPane.add(btnNewButton_4);
	}
}

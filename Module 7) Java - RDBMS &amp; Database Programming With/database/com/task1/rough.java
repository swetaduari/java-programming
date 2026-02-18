package com.task1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class rough extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rough frame = new rough();
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
	public rough() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Welcome to Chai Adda");
		lblNewLabel.setBounds(130, 46, 176, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login As");
		lblNewLabel_1.setBounds(184, 101, 59, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("User");
		btnNewButton.setBounds(94, 144, 88, 22);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.setBounds(218, 144, 88, 22);
		contentPane.add(btnNewButton_1);

	}
}

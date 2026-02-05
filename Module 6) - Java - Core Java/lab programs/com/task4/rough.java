package com.task4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rough extends JFrame {

	private static final long serialVersionUID = 1L;
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
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(26, 33, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(26, 58, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(26, 86, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setBounds(26, 111, 56, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact");
		lblNewLabel_4.setBounds(26, 136, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(85, 30, 116, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 55, 116, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(85, 108, 116, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 133, 116, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("male");
		rdbtnNewRadioButton.setBounds(88, 82, 49, 22);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("female");
		rdbtnNewRadioButton_1.setBounds(140, 82, 61, 22);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(34, 168, 78, 22);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBounds(113, 168, 88, 22);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(34, 194, 78, 22);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.setBounds(113, 194, 88, 22);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.setBounds(71, 230, 88, 22);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("Regsitration Form");
		lblNewLabel_5.setBounds(50, 2, 125, 20);
		contentPane.add(lblNewLabel_5);
		

	}
}

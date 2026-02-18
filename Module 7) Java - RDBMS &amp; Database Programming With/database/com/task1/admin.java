package com.task1;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;



public class admin extends JFrame {
	
	
	
	
	JTable table;
	DefaultTableModel model;
	JScrollPane sp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	public admin()
	{     

		 setTitle("Cafe Shop Management System");
	        setSize(900, 500);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        getContentPane().setLayout(null);
	        
	        JPanel panel = new JPanel();
	        panel.setBackground(new Color(200, 121, 181));
	        panel.setBounds(0, 0, 205, 463);
	        getContentPane().add(panel);
	        panel.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("Welcome Admin");
	 
	        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel.setForeground(new Color(0, 0, 0));
	        lblNewLabel.setBounds(33, 54, 132, 14);
	        panel.add(lblNewLabel);
	        
	        JButton btnNewButton = new JButton("Check data");
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) 
	        	{
	        		
	        	}
	        });
	        
	        
	        btnNewButton.setBounds(33, 100, 132, 22);
	        panel.add(btnNewButton);
	        
	        JButton btnNewButton_1 = new JButton("Check no cust");
	        btnNewButton_1.setBounds(33, 133, 132, 22);
	        panel.add(btnNewButton_1);
	        
	        JButton btnNewButton_2 = new JButton("Check income");
	        btnNewButton_2.setBounds(33, 166, 132, 22);
	        panel.add(btnNewButton_2);
	        
	      //table
			String[] columns = {"S.No", "ID", "Gender", "Items", "Total Amount", "Date "};
	        model = new DefaultTableModel(columns, 0);

	        table = new JTable(model);
	        JScrollPane sp = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	        sp.setBounds(294, 135, 533, 258);
	       

	        JButton btnRefresh = new JButton("Refresh Table");
	        btnRefresh.setBounds(430, 404, 180, 28);
	        
	        getContentPane().add(sp);
	        
	        JScrollBar scrollBar = new JScrollBar();
	        sp.setRowHeaderView(scrollBar);
		    getContentPane().add(btnRefresh);
		    
		    JPanel panel_1 = new JPanel();
		    panel_1.setBackground(new Color(184, 136, 185));
		    panel_1.setBounds(242, 11, 170, 89);
		    getContentPane().add(panel_1);
		    panel_1.setLayout(null);
		    
		    JLabel lblNewLabel_1 = new JLabel("Income");
		    lblNewLabel_1.setBounds(21, 64, 48, 14);
		    panel_1.add(lblNewLabel_1);
		    
		    textField = new JTextField();
		    textField.setBounds(64, 61, 96, 20);
		    panel_1.add(textField);
		    textField.setColumns(10);
		    
		    JPanel panel_1_1 = new JPanel();
		    panel_1_1.setBackground(new Color(184, 136, 185));
		    panel_1_1.setBounds(440, 11, 170, 89);
		    getContentPane().add(panel_1_1);
		    panel_1_1.setLayout(null);
		    
		    textField_1 = new JTextField();
		    textField_1.setColumns(10);
		    textField_1.setBounds(97, 58, 63, 20);
		    panel_1_1.add(textField_1);
		    
		    JLabel lblNewLabel_1_1 = new JLabel("Customers");
		    lblNewLabel_1_1.setBounds(10, 61, 77, 14);
		    panel_1_1.add(lblNewLabel_1_1);
		    
		    JPanel panel_1_1_1 = new JPanel();
		    panel_1_1_1.setBackground(new Color(184, 136, 185));
		    panel_1_1_1.setBounds(636, 11, 170, 89);
		    getContentPane().add(panel_1_1_1);
		    panel_1_1_1.setLayout(null);
		    
		    textField_2 = new JTextField();
		    textField_2.setColumns(10);
		    textField_2.setBounds(98, 58, 62, 20);
		    panel_1_1_1.add(textField_2);
		    
		    JLabel lblNewLabel_1_1_1 = new JLabel("annual Income");
		    lblNewLabel_1_1_1.setBounds(10, 61, 77, 14);
		    panel_1_1_1.add(lblNewLabel_1_1_1);
	        
	       
			
			  
	        
	    
	}


	
	    public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            admin a = new admin();
	            a.setVisible(true);
	        });
	    }
}

package com.task4;

import java.awt.EventQueue;

import javax.swing.*;   


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;

public class Form extends JFrame {

	
	
	JFrame frame;
	JTextField t1,t2,t3,t4;
	JLabel l, l1,l2,l3,l4,l5;
	JButton b1,b2,b3,b4,b5,btnRefresh;
	JRadioButton m;
	JRadioButton f;
	JTable table;
	DefaultTableModel model;
	JScrollPane sp;
	ButtonGroup group;
	
	public Form()
	{
		frame=new JFrame("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout()); 
		
	   frame.setTitle("Registration Form");
        //heading
	   l=new JLabel("Registration Form");
       l.setBounds(50, 2, 125, 20);
	    //id
		l1= new JLabel("ID");
		l1.setBounds(26, 33, 56, 14);
		
		t1= new JTextField();
		t1.setBounds(85, 30, 116, 20);
		
		//name
		l2= new JLabel("NAME");
		l2.setBounds(26, 58, 56, 14);
		
		t2= new JTextField();
		t2.setBounds(85, 55, 116, 20);
		
		//gender
		l3= new JLabel("GENDER");
		l3.setBounds(26, 86, 56, 14);
  
		m = new JRadioButton("Male");
		m.setBounds(88, 82, 49, 22);
		
        f = new JRadioButton("Female");
        f.setBounds(140, 82, 61, 22);
        
        ButtonGroup group =new ButtonGroup();
        group.add(f);
        group.add(m);

		//contact
		l5= new JLabel("CONTACT");
		l5.setBounds(26, 111, 56, 14);//26, 111, 56, 14
		
		t4= new JTextField();
		t4.setBounds(85, 108, 116, 20);//85, 108, 116, 20
		
        
		//adress
		l4= new JLabel("ADDRESS");
		l4.setBounds(26, 136, 56, 14);
		
		t3= new JTextField();
		t3.setBounds(85, 133, 116, 20);
		
		//exit
		
		b1 = new JButton("EXIT");
		b1.setBounds(34, 168, 78, 22);
		
		//register
		
		b2 = new JButton("Register");
	    b2.setBounds(113, 168, 88, 22);
	    
	    //delete
			
        b3 = new JButton("Delete");
		b3.setBounds(34, 194, 78, 22);
		
		//update
		
		b4 = new JButton("Update");
		b4.setBounds(113, 194, 88, 22);
		
		//reset
		
		b5 = new JButton("Reset");
		b5.setBounds(71, 230, 88, 22);
		//table
		String[] columns = {"S.No", "ID", "Name", "Gender", "Address", "Contact"};
        model = new DefaultTableModel(columns, 0);

        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(320, 10, 550, 340);
       

        JButton btnRefresh = new JButton("Refresh Table");
        btnRefresh.setBounds(500, 360, 180, 30);
        

		  
	      
		
		
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t4);
		frame.add(t3);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(m);
		frame.add(f);
		frame.add(l);
	    frame.add(sp);
	    frame.add(btnRefresh);
		
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}
	   public static void main(String[] args)
	   {
		   new Form();
	   }

}

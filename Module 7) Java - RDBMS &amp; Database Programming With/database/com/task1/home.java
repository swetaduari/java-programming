package com.task1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;



public class home implements ActionListener

  {   
	JFrame frame;
    JButton bt1,bt2;
    JLabel l1,l2;
	public home()
	{
		frame= new JFrame();
		frame.getContentPane().setBackground(new Color(200, 121, 181));
		
		
		l1= new JLabel("    Welcome To Chai Adda");
		l1.setFont(new Font("Tahoma", Font.BOLD, 18));
		l1.setForeground(new Color(255, 0, 0));
		l1.setBackground(new Color(128, 0, 255));
		l1.setBounds(124, 73, 242, 24);
		
		l2= new JLabel("         Login As");
		l2.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		l2.setForeground(new Color(0, 0, 0));
		l2.setBounds(193, 109, 117, 24);
		
		bt1= new JButton("User");
		bt1.setBackground(new Color(255, 255, 255));
		bt1.setFont(new Font("Tahoma", Font.BOLD, 11));
		bt1.setForeground(new Color(0, 0, 0));
		bt1.setBounds(143, 144, 88, 22);
		
		
		bt2= new JButton("Admin");
		bt2.setBackground(new Color(255, 255, 255));
		bt2.setForeground(new Color(0, 0, 0));
		bt2.setBounds(278, 144, 98, 22);
		
		 bt1.addActionListener(this);
	     bt2.addActionListener(this);
		
		frame.getContentPane().add(l1);
		frame.getContentPane().add(bt1);
		frame.getContentPane().add(bt2);
		frame.getContentPane().add(l2);
		frame.setSize(500,500);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);	
 
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==bt2)
		{  
			frame.dispose();
			new LoginForm();
		}
		if(e.getSource()==bt1)
		{
			frame.dispose();
		
		}
		
	}
	public static void main(String[] args) 
	{
		new home();
	}
	
	
	
}
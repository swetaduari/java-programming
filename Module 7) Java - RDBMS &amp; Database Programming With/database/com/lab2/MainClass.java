package com.lab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass implements ActionListener
{
	JFrame frame;
	JButton btnsignup,btnlogin;
	
	public MainClass() 
	{
		frame = new JFrame();
		
		btnsignup = new JButton("Signup");
		btnsignup.setBounds(100, 30, 89, 50);
		
		
		btnlogin = new JButton("Login");
		btnlogin.setBounds(100, 100, 89, 50);
		
		btnsignup.addActionListener(this);
		btnlogin.addActionListener(this);
		
		frame.add(btnsignup);
		frame.add(btnlogin);
		
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
			new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		ActionClass a = new ActionClass();
		
		if(e.getSource()==btnsignup)
		{
			a.signupframe();
		}
		if(e.getSource()==btnlogin)
		{
			a.loginframe();
		}
		
	}	
}
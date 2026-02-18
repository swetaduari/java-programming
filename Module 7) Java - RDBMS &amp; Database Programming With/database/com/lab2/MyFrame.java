package com.lab2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame implements ActionListener
{
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public MyFrame()
	{
		frame = new JFrame();
		
		btn1 = new JButton("Add");
		btn2 = new JButton("View");
		btn3 = new JButton("Update");
		btn4 = new JButton("Delete");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		AllOperations a = new AllOperations();
		if(e.getSource()==btn1)
		{
			a.insertdata();
		}
		if(e.getSource()==btn2)
		{
			a.viewdata();
		}
		if(e.getSource()==btn3)
		{
			a.updatedata();
		}
		if(e.getSource()==btn4)
		{
			a.deletedata();
		}
		
	}
}

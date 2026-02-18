package com.lab2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton insert,delete,edit,update;
	JPanel jp,jp2;
	String id;
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		insert = new JButton("Insert");
		
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String name = tf1.getText().toString();
				String pass = tf2.getText().toString();
				
				String host ="jdbc:mysql://localhost:3306/";
				String db = "test";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "insert into students (name,password) values ('"+name+"','"+pass+"')";
					Statement stmt = con.createStatement();
					int ans = stmt.executeUpdate(sql);
					
					if(ans>0)
					{
						System.out.println("Success");
						JOptionPane.showMessageDialog(insertframe,"Success");
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Fail");
					}
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(insert);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	public void viewdata()
	{
				String host ="jdbc:mysql://localhost:3306/";
				String db = "test";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "select * from students";
					Statement stmt = con.createStatement();
					ResultSet set =stmt.executeQuery(sql);
					System.out.println("ID"+" "+"\t NAME"+" "+"\t PASSWORD");
					while(set.next())
					{
						int id = set.getInt(1);
						String name = set.getString(2);
						String pass = set.getString(3);
						
						System.out.println(id+"\t "+name+"\t "+pass);
					}
				}	
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	
	public void deletedata()
	{
		deleteframe = new JFrame();
		
		tf1 = new JTextField(20);
		
		delete = new JButton("Delete");
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String id = tf1.getText().toString();
			
				
				String host ="jdbc:mysql://localhost:3306/";
				String db = "test";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "delete from students where id='"+id+"'";
					Statement stmt = con.createStatement();
					int ans = stmt.executeUpdate(sql);
					
					if(ans>0)
					{
						System.out.println("Success");
						JOptionPane.showMessageDialog(deleteframe,"Success");
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Fail");
					}
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		
		deleteframe.add(tf1);
		deleteframe.add(delete);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
	}
	public void updatedata()
	{
		updateframe = new JFrame();
		
		jp = new JPanel();
		jp2 = new JPanel();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		edit = new JButton("Edit");
		update = new JButton("Update");
		
		jp.add(tf3);
		jp.add(edit);
		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(update);
		jp2.setVisible(false);
		
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				jp2.setVisible(true);
				jp.setVisible(false);
				id = tf3.getText().toString();
			
				String host ="jdbc:mysql://localhost:3306/";
				String db = "test";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "select * from students where id='"+id+"'";
					
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						int id1 = set.getInt(1);
						String name = set.getString(2);
						String pass =set.getString(3);
						
						tf1.setText(name);
						tf2.setText(pass);
						
						update.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
							
								String host ="jdbc:mysql://localhost:3306/";
								String db = "test";
								String url = host+db;
								
								try 
								{
									Class.forName("com.mysql.jdbc.Driver");
									Connection con = DriverManager.getConnection(url,"root","");
									String a = tf1.getText().toString();
									String b = tf2.getText().toString();
									int id2 = Integer.parseInt(id);
									String sql = "update students set name='"+a+"',password='"+b+"' where id='"+id1+"'";
									//System.out.println(sql);
									Statement stmt = con.createStatement();
									
									int status = stmt.executeUpdate(sql);
									
									System.out.println(status);
									updateframe.setVisible(false);
									
								} 
								
//								
								catch (Exception e1) 
								{
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						
						
						
						
					}
					
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
			}
		});
		
		
		
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
	}
}
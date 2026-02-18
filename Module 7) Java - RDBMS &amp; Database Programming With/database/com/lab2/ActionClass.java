package com.lab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class ActionClass 
{
	JFrame signupframe,loginframe;
	JTextField Lname, Fname, Email;
	JPasswordField Pass;
	JLabel Ln, Fn, Em, Ps, Er;
	JButton Log, Sig;
	
	String host="jdbc:mysql://localhost:3306/";
	String dbname="crud";
	String url=host+dbname;
	
	
	
	
	String myemail="",mypass="";
	
	public void signupframe()
	{
		signupframe = new JFrame();
		
		Fn = new JLabel("Firstname");
		Fn.setBounds(44, 25, 70, 17);
		
		Ln = new JLabel("Lastname");
		Ln.setBounds(44, 67, 70, 17);
		
		Em = new JLabel("Email");
		Em.setBounds(44, 107, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 145, 70, 17);
		
		Fname = new JTextField();
		Fname.setBounds(115, 22, 195, 20);
		
		Lname = new JTextField();
		Lname.setBounds(115, 64, 195, 20);
		
		Email = new JTextField();
		Email.setBounds(115, 104, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 142, 195, 20);
		
		Sig = new JButton("Sign Up");
		Sig.setBounds(115, 188, 89, 23);
		
		Sig.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				String f = Fname.getText().toString();
				String l = Lname.getText().toString();
				String e2 = Email.getText().toString();
				String p = Pass.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
				
					String sql = "insert into signup(firstname,lastname,email,password)values('"+f+"','"+l+"','"+e2+"','"+p+"')";
				
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
				
					if(status>0)
					{
						signupframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		
		signupframe.add(Em);
		signupframe.add(Email);
		signupframe.add(Ps);
		signupframe.add(Fn);
		signupframe.add(Fname);
		signupframe.add(Ln);
		signupframe.add(Lname);
		signupframe.add(Pass);
		signupframe.add(Sig);
		signupframe.setSize(450, 300);
		signupframe.setLayout(null);
		signupframe.setVisible(true);
		
	}
	public void loginframe()
	{
		loginframe = new JFrame();
		
		
		
		Em = new JLabel("Email");
		Em.setBounds(44, 22, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 64, 70, 17);
		
		
		Email = new JTextField();
		Email.setBounds(115, 22, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 64, 195, 20);
		
		Log = new JButton("Login");
		Log.setBounds(115, 100, 89, 23);
		
		Log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				
				String e2 = Email.getText().toString();
				String p = Pass.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
				
					String sql = "select email,password from signup where email='"+e2+"'";
					
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						 myemail = set.getString(1);
						 mypass = set.getString(2);
						 
						 if(mypass.equals(p))
						 {
								JOptionPane.showMessageDialog(loginframe,"Logged in Succesfully");
						 }
						 else
						 {
								JOptionPane.showMessageDialog(loginframe,"Your Password is Wrong");

						 }
						 
						 
						 
						 
						 
					}
					else
					{
						JOptionPane.showMessageDialog(loginframe,"Your Email id is not registered");
					}
					
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		
		loginframe.add(Em);
		loginframe.add(Email);
		loginframe.add(Ps);
		loginframe.add(Pass);
		loginframe.add(Log);
		loginframe.setSize(450, 300);
		loginframe.setLayout(null);
		loginframe.setVisible(true);
	}
	
}
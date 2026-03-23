package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.model;
import com.user.SignupModel;

public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static int savedata(model m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			String sql = "insert into users(name,email,address,phone)values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getAddress());
			ps.setString(4,m.getPhone());
			
			status = ps.executeUpdate();
			

		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	public static List<model>viewdata()
	{
		List<model>list = new ArrayList();
		Connection con = Dao.getconnect();
		String sql = "select * from users";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				model m = new model();
				m.setId(set.getInt(1));
				m.setName(set.getString(2));
				m.setEmail(set.getString(3));
				m.setAddress(set.getString(4));
				m.setPhone(set.getString(5));
				
				list.add(m);
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	public static int deletedata(int id)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			String sql = "delete from users where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			
			
			status = ps.executeUpdate();
			

		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static model getrecord(int id)
	{
		model m = null;
		Connection con = Dao.getconnect();
		String sql = "select * from users where id=?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				m = new model();
				m.setId(set.getInt(1));
				m.setName(set.getString(2));
				m.setEmail(set.getString(3));
				m.setAddress(set.getString(4));
				m.setPhone(set.getString(5));
				
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return m;
	}
	
	public static int updatedata(model m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			String sql = "update users set name=?,email=?,address=?,phone=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getAddress());
			ps.setString(4,m.getPhone());
			ps.setInt(5,m.getId());
			
			status = ps.executeUpdate();
			

		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	public static int signupdata(SignupModel m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			String sql = "insert into sign(username,email,password)values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getUsername());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPassword());
			
			status = ps.executeUpdate();
			

		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static SignupModel checksignin(SignupModel m)
	{
		SignupModel m2 = null;
		Connection con = Dao.getconnect();
		String sql = "select * from sign where email=? and password=?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getPassword());
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				
				int id = set.getInt(1);
				String uname = set.getString(2);
				String email = set.getString(3);
				String pass = set.getString(4);
				
				
				m2 = new SignupModel();
				m2.setId(id);
				m2.setUsername(uname);
				m2.setEmail(email);
				m2.setPassword(pass);				
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return m2;
	}
	
	
	
}
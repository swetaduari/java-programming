import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Dao {
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tak","root","");
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
				String sql = "insert into detail(username,password,email)values(?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,m.getUname());
				ps.setString(2,m.getPass());
				ps.setString(3,m.getEmail());
				
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
				String sql = "select * from detail";
				try 
				{
					PreparedStatement ps = con.prepareStatement(sql);
					ResultSet set = ps.executeQuery();
					
					while(set.next())
					{
						model m = new model();
						m.setId(set.getInt(1));
						m.setUname(set.getString(2));
						m.setEmail(set.getString(3));
						m.setPass(set.getString(4));
						
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
			String sql = "delete from detail where id=?";
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
		String sql = "select * from detail where id=?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				m = new model();
				
				System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getString(4));
				
				m.setId(set.getInt(1));
				m.setUname(set.getString(2));
				m.setEmail(set.getString(3));
				m.setPass(set.getString(4));
				
				
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
			String sql = "update detail set username=?,email=?,password=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getUname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPass());
			ps.setInt(4,m.getId());
			
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
		String sql = "select * from detail where email=? and password=?";
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
		
	//product
	
	public static int savedata1(Model1 s)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			String sql = "insert into products(pname,pprice,pdes)values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,s.getPname());
			ps.setString(2,s.getPprice());
			ps.setString(3,s.getPdes());
			
			status = ps.executeUpdate();
			

		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<Model1>viewdata2()
	{
		List<Model1>list = new ArrayList();
		Connection con = Dao.getconnect();
		String sql = "select * from products";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				Model1 s = new Model1();
				s.setId(set.getInt(1));
				s.setPname(set.getString(2));
				s.setPprice(set.getString(3));
				s.setPdes(set.getString(4));
				
				list.add(s);
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	public static int deletedata2(int id)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			String sql = "delete from products where id=?";
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
	public static Model1 getrecord2(int id)
	{
		Model1 s = null;
		Connection con = Dao.getconnect();
		String sql = "select * from products where id=?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				s = new Model1();
				s.setId(set.getInt(1));
				s.setPname(set.getString(2));
				s.setPprice(set.getString(3));
				s.setPdes(set.getString(4));
				
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return s;
	}
	
	public static int updatedata2(Model1 s)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			String sql = "update products set pname=?,pprice=?,pdes=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,s.getPname());
			ps.setString(2,s.getPprice());
			ps.setString(3,s.getPdes());
			ps.setInt(4,s.getId());
			
			status = ps.executeUpdate();
			

		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	
	
}

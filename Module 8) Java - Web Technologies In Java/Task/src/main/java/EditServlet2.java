import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/update")
public class EditServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String Uname1 = req.getParameter("uname");
		String pass1 = req.getParameter("pass");
		String email1 = req.getParameter("email");
		
		model m = new model();
		m.setId(id2);
		m.setUname(Uname1);
		m.setEmail(email1);
		m.setPass(pass1);
//		
		int status = Dao.updatedata(m);
//		
		if(status>0)
		{
			out.print("Updated");
			resp.sendRedirect("ViewServlet");
			//System.out.println("Inserted");
		}
		else
		{
			out.print("Fail");
			
		}
//		
		
		
	}
}
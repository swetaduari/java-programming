import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/update2")
public class EditServlet4 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String pname = req.getParameter("pname");
		String pprice = req.getParameter("pprice");
		String pdes = req.getParameter("pdes");
		
		Model1 s = new Model1 ();
		s.setId(id2);
		s.setPname(pname);
		s.setPprice(pprice);
		s.setPdes(pdes);
//		
		int status = Dao.updatedata2(s);
//		
		if(status>0)
		{
			out.print("Updated");
			resp.sendRedirect("ViewServlet2");
			//System.out.println("Inserted");
		}
		else
		{
			out.print("Fail");
			
		}
//		
		
		
	}
}
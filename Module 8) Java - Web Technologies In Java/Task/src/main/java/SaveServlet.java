import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/save2")
public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String pname = req.getParameter("pname");
		String pprice = req.getParameter("pprice");
		String pdes = req.getParameter("pdes");
		
		Model1 s = new Model1();
		s.setPname(pname);
		s.setPprice(pprice);
		s.setPdes(pdes);
		
		int status = Dao.savedata1(s);
		
		if(status>0)
		{
			out.print("Inserted");
			resp.sendRedirect("ViewServlet2");
			//System.out.println("Inserted");
		}
		else
		{
			out.print("Fail");
			
		}
		
		
		
	}
}
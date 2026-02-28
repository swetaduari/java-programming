import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		System.out.println(id);
		int myid = Integer.parseInt(id); 
		model m = Dao.getrecord(myid);
		
		

	        out.print("<form action='update' method='post'>");

	        out.print("<p>");
	        
	        out.print("<input type='hidden' name='id' value='"+m.getId()+"'>");
	        out.print("</p>");
	        
	        out.print("<p>");
	        out.print("Enter uname:");
	        out.print("<input type='text' name='uname' value='"+m.getUname()+"'>");
	        out.print("</p>");

	        out.print("<p>");
	        out.print("Enter email email:");
	        out.print("<input type='text' name='email' value='"+m.getEmail()+"'>");
	        out.print("</p>");

	        out.print("<p>");
	        out.print("Enter Password:");
	        out.print("<input type='text' name='pass' value='"+m.getPass()+"'>");
	        out.print("</p>");

	        out.print("<p>");
	        out.print("<input type='submit' value='Update'>");
	        out.print("</p>");

	        out.print("</form>");

	       

	   
	}
}
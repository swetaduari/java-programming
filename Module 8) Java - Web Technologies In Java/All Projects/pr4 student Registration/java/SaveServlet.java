import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/save")
public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		
		if(session.getAttribute("user")!=null)
		{
		String name = req.getParameter("sname");
	    String surname = req.getParameter("ssurname");
	    String stream = req.getParameter("stream");
	    String city = req.getParameter("city");
	    String edu = req.getParameter("edu");
	    String percentage = req.getParameter("percentage");
	    String ptech = req.getParameter("ptech");
	    String gender = req.getParameter("gender");
	    int fees = Integer.parseInt(req.getParameter("fees"));

	    StudentModel m = new StudentModel();

	    m.setSname(name);
	    m.setSsurname(surname);
	    m.setStream(stream);
	    m.setCity(city);
	    m.setEdu(edu);
	    m.setPercentage(percentage);
	    m.setPtech(ptech);
	    m.setGender(gender);
	    m.setFees(fees);
	    
	    System.out.println(name);
	    System.out.println(surname);
	    System.out.println(stream);
	    System.out.println(city);
	    System.out.println(edu);
	    System.out.println(percentage);
	    System.out.println(ptech);
	    System.out.println(gender);
	    System.out.println(fees);

	   int status= Dao.savedata(m);

	    
	
		if(status>0)
		{
			out.print("Inserted");
			resp.sendRedirect("viewServlet");
			//System.out.println("Inserted");
		}
		else
		{
			out.print("Fail");
			
		}
		
	}
		else
		{
			out.print("<p>Please Login First</p>");
		}
		
	}
}
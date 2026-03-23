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
		//String sname = req.getParameter("sname");
		//String ssurname = req.getParameter("ssurname");
		String sname = req.getParameter("sname");
		String ssurname = req.getParameter("ssurname");
		String ptech = req.getParameter("ptech");
		String stream = req.getParameter("stream");
		String city=req.getParameter("city");
		String edu=req.getParameter("edu");
		String percentage=req.getParameter("percentage");
		//String ptech=req.getParameter("ptech");
		String gender=req.getParameter("gender");
		String fees=req.getParameter("fees");
		int fee=Integer.parseInt(fees);
		
		
		StudentModel m = new StudentModel();
		m.setId(id2);
		m.setSname(sname);
		m.setSsurname(ssurname);
		m.setStream(stream);
		m.setCity(city);
		m.setEdu(edu);
		m.setPercentage(percentage);
		m.setPtech(ptech);
		m.setGender(gender);
		m.setFees(fee);
//		
		int status = Dao.updatedata(m);
//		
		if(status>0)
		{
			out.print("Updated");
			resp.sendRedirect("viewServlet");
			//System.out.println("Inserted");
		}
		else
		{
			out.print("Fail");
			
		}
//		
		
		
	}
}
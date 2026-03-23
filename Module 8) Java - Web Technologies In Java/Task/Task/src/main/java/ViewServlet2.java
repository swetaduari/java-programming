import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet2")
public class ViewServlet2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		List<Model1>list = Dao.viewdata2();
		out.print("<a href=''>Add data</a>");
		out.print("<table border='1' cellpadding='5px' cellspacing='5px'>");
		out.print("<tr>");
		out.print("<th>Id</th><th>Product Name</th><th>Product Price</th><th>Product Description</th><th>Edit</th><th>Delete</th>");
		out.print("</tr>");
		for(Model1 s : list)
		{
			out.print("<tr>");
			out.print("<td>"+s.getId()+"</td><td>"+s.getPname()+"</td><td>"+s.getPprice()+"</td><td>"+s.getPdes()+"</td><td><a href='EditServlet3?id="+s.getId()+"'>Edit</a></td><td><a href='DeleteServlet2?id="+s.getId()+"'>Delete</a></td>");
			out.print("</tr>");
			
			
			//System.out.println(m.getId()+" "+m.getPname());
		}
		out.print("</table>");
	}
}
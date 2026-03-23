import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class SigninServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		SignupModel m = new SignupModel();
		m.setEmail(email);
		m.setPassword(pass);
		
		SignupModel m2 = Dao.checksignin(m);
		System.out.println(m2);
		if(m2!=null)
		{
			resp.sendRedirect("dashboard.html");
		}
		else
		{
			out.print("<center><h2 style='color:red;'>Fail</h2><center>");
		}
		
	}
}
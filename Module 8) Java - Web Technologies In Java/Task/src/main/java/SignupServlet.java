import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("test");
		
		String uname = request.getParameter("username");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		System.out.println(uname+email+pass);
		
		model m = new model();
		m.setEmail(email);
	    m.setPass(pass);
		m.setUname(uname);
		int status = Dao.savedata(m);
		
		if(status>0)
		{
			out.print("Inserted");
            response.sendRedirect("ViewServlet");
			System.out.println("Inserted");
		}
		else
		{
			out.print("Fail");
			
		}
		
	}

}

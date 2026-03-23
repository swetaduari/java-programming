import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession; 

@WebServlet("/Login")
public class LoginServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("email");
        String pass = req.getParameter("password");

        AdminModel m = new AdminModel();
        m.setEmail(email);
        m.setPassword(pass);

        AdminModel m2 = Dao.checksignin(m);

        if (m2 != null) 
        {
            HttpSession session = req.getSession(); 
            session.setAttribute("user", email);  
            
            resp.sendRedirect("dashboard.html");
        } 
        else 
        {
            out.print("<center><h2 style='color:red;'>Login Failed! Invalid Email or Password.</h2></center>");
            out.print("<center><a href='index.html'>Try Again</a></center>");
        }
    }
}




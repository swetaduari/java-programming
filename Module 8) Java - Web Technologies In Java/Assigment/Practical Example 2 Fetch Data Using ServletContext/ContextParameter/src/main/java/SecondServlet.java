import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();

        String appName = context.getInitParameter("appName");
        String email = context.getInitParameter("adminEmail");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Second Servlet</h2>");
        out.println("App Name: " + appName + "<br>");
        out.println("Admin Email: " + email);
    }
}
package genericServlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/GenericExample")
public class GenericExample extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>Hello " + name + " from GenericServlet</h2>");
        out.println("</body></html>");
    }
}
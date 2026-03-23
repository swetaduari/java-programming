import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import jakarta.servlet.ServletConfig;

public class ConfigServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get ServletConfig object
        ServletConfig config = getServletConfig();

        // Fetch init parameters
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");

        out.println("<html><body>");
        out.println("<h2>ServletConfig Example</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body></html>");
    }
}
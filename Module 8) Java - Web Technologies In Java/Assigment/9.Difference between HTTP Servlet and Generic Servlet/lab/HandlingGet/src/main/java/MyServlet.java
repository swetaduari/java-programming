import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

    // Handle GET request
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>GET Request Received</h2>");
        out.println("<p>Hello, " + name + "</p>");
        out.println("</body></html>");
    }
}
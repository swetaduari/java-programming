package servletProgramming;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get parameters from request
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        // Generate response
        out.println("<html><body>");
        out.println("<h2>Welcome " + name + "!</h2>");
        out.println("<p>Your age is: " + age + "</p>");
        out.println("</body></html>");
    }
}
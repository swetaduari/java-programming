package lifecycle;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {

    // Initialization method
    public void init() throws ServletException {
        System.out.println("Servlet is being initialized (init method called)");
    }

    // Service method (handles all requests)
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Servlet is servicing a request (service method called)");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        out.println("<p>Check server console for life cycle messages.</p>");
        out.println("</body></html>");
    }

    // Destroy method
    public void destroy() {
        System.out.println("Servlet is being destroyed (destroy method called)");
    }
}
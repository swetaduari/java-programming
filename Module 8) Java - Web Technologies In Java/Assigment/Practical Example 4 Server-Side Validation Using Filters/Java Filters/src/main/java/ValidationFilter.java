import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ValidationFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Validation Filter Initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Validation logic
        if (username == null || username.isEmpty() ||
            password == null || password.isEmpty()) {

            out.println("<h3 style='color:red'>All fields are required!</h3>");

            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);

        } else {
            // Pass request to next resource (Servlet)
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
        System.out.println("Validation Filter Destroyed");
    }
}
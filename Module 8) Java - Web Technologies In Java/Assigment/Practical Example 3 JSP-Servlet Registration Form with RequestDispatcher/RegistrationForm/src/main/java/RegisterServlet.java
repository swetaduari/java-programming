import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Simple processing (you can add DB logic here)
        String message;
        if(name != null && email != null && password != null) {
            message = "Registration Successful!";
        } else {
            message = "Registration Failed!";
        }

        // Set data in request scope
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("message", message);

        // Forward to result JSP
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
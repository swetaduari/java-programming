import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/headers")
public class HeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set custom response headers
        response.setHeader("X-Custom-Header", "MyCustomValue");
        response.setHeader("X-App-Version", "1.0");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>HTTP Request Headers (Jakarta)</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

        // Access headers without Enumeration
        out.println("<tr><td>Host</td><td>" + request.getHeader("Host") + "</td></tr>");
        out.println("<tr><td>User-Agent</td><td>" + request.getHeader("User-Agent") + "</td></tr>");
        out.println("<tr><td>Accept</td><td>" + request.getHeader("Accept") + "</td></tr>");
        out.println("<tr><td>Accept-Language</td><td>" + request.getHeader("Accept-Language") + "</td></tr>");
        out.println("<tr><td>Connection</td><td>" + request.getHeader("Connection") + "</td></tr>");

        out.println("</table>");
        out.println("</body></html>");
    }
}
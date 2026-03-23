import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession; 

@WebServlet("/viewServlet")
public class ViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        if (session == null) 
        {
            resp.sendRedirect("index.html");
            return;
        }

        List<StudentModel> list = Dao.viewdata();

        // 1. Output the HTML structure and CSS Styling
        out.print("<!DOCTYPE html>");
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("<meta charset='UTF-8'>");
        out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.print("<title>Student Directory</title>");
        
        out.print("<style>");
        // General Page Styling
        out.print("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f4f8; margin: 0; padding: 40px; color: #333; }");
        
        // --- ADDED ANIMATION KEYFRAMES ---
        out.print("@keyframes slideUpFade { from { opacity: 0; transform: translateY(20px); } to { opacity: 1; transform: translateY(0); } }");
        out.print("@keyframes rowFadeIn { from { opacity: 0; transform: translateX(-15px); } to { opacity: 1; transform: translateX(0); } }");

        // Container with entrance animation
        out.print(".container { max-width: 1200px; margin: 0 auto; background: #ffffff; padding: 30px; border-radius: 12px; box-shadow: 0 8px 20px rgba(0,0,0,0.05); ");
        out.print("animation: slideUpFade 0.6s ease-out forwards; }"); // Container Animation
        
        // Header Text
        out.print(".page-header { text-align: center; color: #1e3a8a; margin-bottom: 30px; font-size: 28px; font-weight: 700; text-transform: uppercase; letter-spacing: 1px; border-bottom: 2px solid #e2e8f0; padding-bottom: 15px;}");
        out.print(".page-header span { color: #d97706; }");
        
        // Table Styling
        out.print("table { width: 100%; border-collapse: collapse; overflow: hidden; border-radius: 8px; box-shadow: 0 0 0 1px #e2e8f0; }");
        out.print("th { background-color: #1e3a8a; color: #ffffff; text-align: left; padding: 14px 16px; font-weight: 600; text-transform: uppercase; font-size: 13px; letter-spacing: 0.5px; }");
        out.print("td { padding: 12px 16px; border-bottom: 1px solid #e2e8f0; font-size: 14px; }");
        
        // Starting state for rows (invisible until animation plays)
        out.print("tbody tr { opacity: 0; animation: rowFadeIn 0.5s ease-out forwards; }"); 
        
        // Row hover effect (subtly lifts the row!)
        out.print("tbody tr:nth-child(even) { background-color: #f8fafc; }");
        out.print("tbody tr:hover { background-color: #eff6ff; transform: scale(1.01); box-shadow: 0 4px 10px rgba(0,0,0,0.06); transition: all 0.2s ease-in-out; position: relative; z-index: 10; }");

        // Status Badges & Buttons
        out.print(".btn { padding: 6px 12px; border-radius: 6px; text-decoration: none; font-size: 13px; font-weight: 600; display: inline-block; transition: all 0.2s; text-align: center;}");
        
        // Button hover animations
        out.print(".btn:hover { transform: translateY(-2px); box-shadow: 0 4px 8px rgba(0,0,0,0.1); }");
        out.print(".btn:active { transform: translateY(0); }");

        out.print(".btn-edit { background-color: #dbeafe; color: #1d4ed8; }");
        out.print(".btn-edit:hover { background-color: #bfdbfe; color: #1e40af; }");
        
        out.print(".btn-delete { background-color: #fee2e2; color: #b91c1c; }");
        out.print(".btn-delete:hover { background-color: #fecaca; color: #991b1b; }");
        
        // A nice badge for Stream/Education
        out.print(".badge { background-color: #f1f5f9; color: #475569; padding: 4px 8px; border-radius: 20px; font-size: 12px; font-weight: bold; border: 1px solid #cbd5e1; }");
        out.print("</style>");
        out.print("</head>");
        
        out.print("<body>");
        
        // 2. Container and Title
        out.print("<div class='container'>");
        out.print("<h1 class='page-header'>Student <span>Course</span> Directory</h1>");

        // 3. Start Table
        out.print("<table>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>Id</th><th>Name</th><th>Surname</th><th>Stream</th><th>City</th><th>Education</th><th>Percentage</th><th>Pref. Tech</th><th>Gender</th><th>Fees</th><th>Actions</th>");
        out.print("</tr>");
        out.print("</thead>");
        
        out.print("<tbody>");

        // 4. Input Student Rows (with dynamic animation delays)
        int delayMultiplier = 1;
        for (StudentModel m : list) {
            
            // NOTE: Dynamic animation delay! E.g. 0.1s, 0.2s, 0.3s...
            double delaySeconds = delayMultiplier * 0.08; 
            
            out.print("<tr style='animation-delay: " + delaySeconds + "s;'>");
            out.print("<td><strong>#" + m.getId() + "</strong></td>"
                    + "<td>" + m.getSname() + "</td>"
                    + "<td>" + m.getSsurname() + "</td>"
                    + "<td><span class='badge'>" + m.getStream() + "</span></td>"
                    + "<td>" + m.getCity() + "</td>"
                    + "<td>" + m.getEdu() + "</td>"
                    + "<td>" + m.getPercentage() + "%</td>"
                    + "<td>" + m.getPtech() + "</td>"
                    + "<td>" + m.getGender() + "</td>"
                    + "<td>Rs" + m.getFees() + "</td>"
                    
                    + "<td>"
                    + "<a href='EditServlet?id=" + m.getId() + "' class='btn btn-edit' style='margin-right:5px;'>Edit</a>"
                    + "<a href='DeleteServlet?id=" + m.getId() + "' class='btn btn-delete'>Delete</a>"
                    + "</td>");
            out.print("</tr>");
            
            delayMultiplier++; // Increase delay for the next row
        }

        out.print("</tbody>");
        out.print("</table>");
        
        out.print("</div>"); 
        out.print("</body>");
        out.print("</html>");
    }
}

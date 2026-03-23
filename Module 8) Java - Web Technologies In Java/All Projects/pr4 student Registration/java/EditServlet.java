import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int myid = Integer.parseInt(id); 
		StudentModel m = Dao.getrecord(myid);
		
		out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.print("<title>Edit Student Profile</title>");
		out.print("<link href='https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600&display=swap' rel='stylesheet'>");
		
		// Applying the Mature Dark Theme
		out.print("<style>");
		out.print(":root { --bg-color: #0f172a; --card-bg: rgba(30, 41, 59, 0.7); --primary: #3b82f6; --primary-hover: #2563eb; --secondary: #10b981; --secondary-hover: #059669; --text-main: #f8fafc; --text-muted: #94a3b8; --input-bg: rgba(15, 23, 42, 0.6); --border: rgba(255, 255, 255, 0.1); }");
		out.print("* { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Inter', sans-serif; }");
		out.print("body { min-height: 100vh; display: flex; justify-content: center; align-items: center; background: var(--bg-color); color: var(--text-main); background-image: radial-gradient(at 0% 0%, rgba(59, 130, 246, 0.15) 0px, transparent 50%), radial-gradient(at 100% 100%, rgba(139, 92, 246, 0.15) 0px, transparent 50%); padding: 40px 20px; }");
		out.print(".dashboard-container { width: 100%; max-width: 800px; background: var(--card-bg); backdrop-filter: blur(20px); -webkit-backdrop-filter: blur(20px); border: 1px solid var(--border); border-radius: 20px; box-shadow: 0 25px 50px -12px rgba(0, 0, 0, 0.5); padding: 40px; animation: fadeIn 0.8s ease-out; }");
		out.print("@keyframes fadeIn { from { opacity: 0; transform: translateY(20px); } to { opacity: 1; transform: translateY(0); } }");
		out.print(".header { text-align: center; margin-bottom: 40px; border-bottom: 1px solid var(--border); padding-bottom: 20px; }");
		out.print(".header h2 { font-size: 28px; font-weight: 600; letter-spacing: -0.5px; margin-bottom: 10px; }");
		out.print(".header p { color: var(--text-muted); font-size: 15px; }");
		out.print(".form-grid { display: grid; grid-template-columns: 1fr 1fr; gap: 24px; }");
		out.print(".form-group { display: flex; flex-direction: column; text-align: left; }");
		out.print(".form-group.full-width { grid-column: 1 / -1; }");
		out.print(".form-group label { color: var(--text-muted); font-size: 14px; margin-bottom: 8px; font-weight: 500; }");
		out.print(".form-control { width: 100%; padding: 14px 18px; background: var(--input-bg); border: 1px solid var(--border); border-radius: 10px; font-size: 15px; color: var(--text-main); transition: all 0.3s ease; outline: none; }");
		out.print(".form-control:focus { border-color: var(--primary); box-shadow: 0 0 0 3px rgba(59, 130, 246, 0.15); }");
		out.print("select.form-control { appearance: none; background-image: url(\"data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='24' height='24' viewBox='0 0 24 24' fill='none' stroke='%2394a3b8' stroke-width='2' stroke-linecap='round' stroke-linejoin='round'%3E%3Cpolyline points='6 9 12 15 18 9'%3E%3C/polyline%3E%3C/svg%3E\"); background-repeat: no-repeat; background-position: right 14px center; background-size: 16px; cursor: pointer; }");
		out.print("select.form-control option { background-color: var(--bg-color); color: var(--text-main); }");
		out.print(".radio-group { display: flex; gap: 20px; flex-wrap: wrap; margin-top: 5px; }");
		out.print(".radio-label { display: flex; align-items: center; cursor: pointer; font-size: 15px; color: var(--text-main); transition: all 0.2s; }");
		out.print(".radio-label hover { color: var(--primary); }");
		out.print(".radio-label input[type='radio'] { appearance: none; width: 20px; height: 20px; border: 2px solid var(--text-muted); margin-right: 8px; outline: none; transition: all 0.2s; cursor: pointer; border-radius: 50%; }");
		out.print(".radio-label input[type='radio']:checked { border-color: var(--primary); background: var(--primary); box-shadow: inset 0 0 0 4px var(--card-bg); }");
		out.print(".btn { width: 100%; padding: 16px; background: var(--primary); color: #fff; border: none; border-radius: 10px; font-size: 16px; font-weight: 500; cursor: pointer; transition: all 0.3s ease; margin-top: 20px; box-shadow: 0 4px 15px rgba(59, 130, 246, 0.3); }");
		out.print(".btn:hover { background: var(--primary-hover); transform: translateY(-2px); box-shadow: 0 8px 25px rgba(59, 130, 246, 0.4); }");
		out.print("@media (max-width: 650px) { .form-grid { grid-template-columns: 1fr; } }");
		out.print("</style>");
		out.print("</head>");
		
		out.print("<body>");
		out.print("<div class='dashboard-container'>");
		
		out.print("<div class='header'>");
		out.print("<h2>Edit Student Profile</h2>");
		out.print("<p>Update the records below</p>");
		out.print("</div>");

		out.print("<form action='update' method='post'>");
		out.print("<input type='hidden' name='id' value='"+m.getId()+"'>");
		out.print("<div class='form-grid'>");
		
		// First Name
		out.print("<div class='form-group'>");
		out.print("<label for='name'>First Name</label>");
		out.print("<input type='text' id='name' name='sname' class='form-control' value='" + (m.getSname() != null ? m.getSname() : "") + "' required>");
		out.print("</div>");

		// Surname
		out.print("<div class='form-group'>");
		out.print("<label for='surname'>Surname</label>");
		out.print("<input type='text' id='surname' name='ssurname' class='form-control' value='" + (m.getSsurname() != null ? m.getSsurname() : "") + "' required>");
		out.print("</div>");

		// Stream
		out.print("<div class='form-group'>");
		out.print("<label for='stream'>Stream / Degree</label>");
		out.print("<input type='text' id='stream' name='stream' class='form-control' value='" + (m.getStream() != null ? m.getStream() : "") + "' required>");
		out.print("</div>");

		// Percentage
		out.print("<div class='form-group'>");
		out.print("<label for='percentage'>Percentage</label>");
		out.print("<input type='number' id='percentage' name='percentage' class='form-control' min='0' max='100' step='0.01' value='" + m.getPercentage() + "' required>");
		out.print("</div>");

		// Status (Dropdown helper logic)
		String runningSelect = ("Running".equals(m.getPtech())) ? "selected" : "";
		String completedSelect = ("Completed".equals(m.getPtech())) ? "selected" : "";
		
		out.print("<div class='form-group'>");
		out.print("<label for='status'>Course Status</label>");
		out.print("<select id='status' name='edu' class='form-control' required>");
		out.print("<option value='Running' " + runningSelect + ">Running</option>");
		out.print("<option value='Completed' " + completedSelect + ">Completed</option>");
		out.print("</select>");
		out.print("</div>");

		// City
		out.print("<div class='form-group'>");
		out.print("<label for='city'>City (Gujarat)</label>");
		out.print("<select id='city' name='city' class='form-control' required>");
		// Select helper logic for city
		String[] cities = {"Ahmedabad", "Surat", "Vadodara", "Rajkot", "Bhavnagar", "Jamnagar", "Gandhinagar", "Junagadh"};
		for(String city : cities) {
			String citySel = (city.equals(m.getCity())) ? "selected" : "";
			out.print("<option value='" + city + "' " + citySel + ">" + city + "</option>");
		}
		out.print("</select>");
		out.print("</div>");

		// Fees
		out.print("<div class='form-group'>");
		out.print("<label for='fees'>Fees (₹)</label>");
		out.print("<input type='number' id='fees' name='fees' class='form-control' min='0' step='500' value='" + m.getFees() + "' required>");
		out.print("</div>");

		// Gender
		String maleChk = ("Male".equals(m.getGender())) ? "checked" : "";
		String femaleChk = ("Female".equals(m.getGender())) ? "checked" : "";
		String otherChk = ("Other".equals(m.getGender())) ? "checked" : "";
		out.print("<div class='form-group'>");
		out.print("<label>Gender</label>");
		out.print("<div class='radio-group'>");
		out.print("<label class='radio-label'><input type='radio' name='gender' value='Male' " + maleChk + " required> Male</label>");
		out.print("<label class='radio-label'><input type='radio' name='gender' value='Female' " + femaleChk + "> Female</label>");
		out.print("<label class='radio-label'><input type='radio' name='gender' value='Other' " + otherChk + "> Other</label>");
		out.print("</div>");
		out.print("</div>");

		// Preferred Tech
		String javaChk = ("Java".equals(m.getPtech())) ? "checked" : "";
		String pythonChk = ("Python".equals(m.getPtech()))? "checked" : "";
		String htmlChk = ("Fullstack".equals(m.getPtech())) ? "checked" : "";
		String flutterChk = ("Flutter".equals(m.getPtech())) ? "checked" : "";
		String dataChk = ("Data Analytics".equals(m.getPtech())) ? "checked" : "";
		out.print("<div class='form-group full-width'>");
		out.print("<label>Preferred Technology (Select one)</label>");
		out.print("<div class='radio-group'>");
		out.print("<label class='radio-label'><input type='radio' name='ptech' value='Java' " + javaChk + " required> Java</label>");
		out.print("<label class='radio-label'><input type='radio' name='ptech' value='Python' " + pythonChk + "> Python</label>");
		out.print("<label class='radio-label'><input type='radio' name='ptech' value='Fullstack' " + htmlChk + "> Fullstack Web</label>");
		out.print("<label class='radio-label'><input type='radio' name='ptech' value='Flutter' " + flutterChk + "> Flutter</label>");
		out.print("<label class='radio-label'><input type='radio' name='ptech' value='Data Analytics' " + dataChk + "> Data Analytics</label>");
		out.print("</div>");
		out.print("</div>");

		out.print("</div>"); // End form-grid

		out.print("<button type='submit' class='btn'>Update Student</button>");

		out.print("</form>");
		
		out.print("</div>"); // End dashboard-container
		out.print("</body>");
		out.print("</html>");
	}
}

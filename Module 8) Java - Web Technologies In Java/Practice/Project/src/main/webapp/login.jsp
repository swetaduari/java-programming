<%@page import="com.model.SignupModel"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.model.SignupModel"/>
<jsp:setProperty property="*" name="m"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>
	<%
			SignupModel m2 =Dao.login(m);
	
			if(m2!=null)
			{
				 out.print("Login Success");
				session.setAttribute("project",true);
				session.setAttribute("email",m.getEmail());
				session.setAttribute("name",m2.getFullname());
				session.setAttribute("num",m2.getPhone()); 
				
				
				response.sendRedirect("dashbaord.jsp");
			}
			else
			{
				out.print("Login Fail");
			}
	%>


	

</body>
</html>
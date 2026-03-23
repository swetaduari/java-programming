<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    	if(session.getAttribute("project")!=null)
    	{
    		
    	
    %>

	<jsp:include page="header.jsp"/>


	<jsp:include page="footer.jsp"/>
	
	<%
    	}
    	else
    	{
    		response.sendRedirect("signin.jsp");
    	}
	%>
	
</body>
</html>
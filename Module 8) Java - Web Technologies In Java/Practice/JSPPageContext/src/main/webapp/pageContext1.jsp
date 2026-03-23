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

String name=request.getParameter("name");
out.print("Welcome = "+name);

pageContext.setAttribute("user", name,pageContext.SESSION_SCOPE);

%>

<a href="pageContext2.jsp">Click Me</a>

</body>
</html>
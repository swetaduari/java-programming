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
String site=config.getInitParameter("site");
out.print("Website Name = "+site+"<br><br>");

String driver = application.getInitParameter("dname");
out.print("Driver Name = "+driver);

%>
</body>
</html>
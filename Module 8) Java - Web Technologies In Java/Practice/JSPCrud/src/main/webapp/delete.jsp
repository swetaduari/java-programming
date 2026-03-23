<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		int status = Dao.deletedata(id2);
		if(status>0)
		{
			response.sendRedirect("index.jsp");	
		}
		else
		{
			out.print("fail");
		}
	%>

</body>
</html>
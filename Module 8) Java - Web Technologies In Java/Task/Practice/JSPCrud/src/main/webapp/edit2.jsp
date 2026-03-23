<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:useBean id="m" class="com.Model.model"/>
 <jsp:setProperty property="*" name="m"/>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		System.out.print("Id: "+m.getId());
		System.out.print("Name: "+m.getName());
		System.out.print("Email: "+m.getEmail());
		System.out.print("Address: "+m.getAddress());
		System.out.print("Phone: "+m.getPhone());
	
		int status = Dao.updatedata(m);
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
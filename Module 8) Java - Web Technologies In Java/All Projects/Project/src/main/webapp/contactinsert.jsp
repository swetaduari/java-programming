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
<jsp:useBean id="m" class="com.model.ContactModel"/>
<jsp:setProperty property="*" name="m"/>

<%
		int status = Dao.contactinsert(m);
	
		if(status>0)
		{
			response.sendRedirect("contact.jsp");
		}
		else
		{
			out.print("Not Able to Add Content");
		}
%>

</body>
</html>
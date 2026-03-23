<%@page import="com.dao.Dao"%>
<%@page import="com.user.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="m" class="com.user.SignupModel"/>
<jsp:setProperty property="*" name="m"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
    SignupModel user = Dao.checksignin(m);
    if(user != null) {
       
        session.setAttribute("user", user.getUsername());
        response.sendRedirect("index.jsp");
    } else {
        out.print("<script>alert('Invalid Email or Password'); window.location='login.jsp';</script>");
    }
%>

</body>
</html>
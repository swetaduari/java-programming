<%@page import="com.dao.Dao"%>
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


        System.out.println("id"+m.getId());
        System.out.println("user"+m.getUsername());
        System.out.println("email"+m.getEmail());
        System.out.println("pass"+m.getPassword());
       
		int status = Dao.signupdata(m);
		 System.out.println("status"+status);

		if(status>0)
		{
			response.sendRedirect("signin.jsp");
		}
		else
		{
			out.print("fail");
		}
	%>
</body>
</html>
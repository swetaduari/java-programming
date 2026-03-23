<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>ServletContext Demo</title>
</head>
<body>

<h2>ServletContext Example</h2>

<p>Click below to fetch shared data from web.xml:</p>

<a href="first">Go to First Servlet</a><br><br>
<a href="second">Go to Second Servlet</a>

<hr>

<h3>Using Implicit Objects</h3>
<p>Application Name: <%= application.getInitParameter("appName") %></p>
<p>Admin Email: <%= application.getInitParameter("adminEmail") %></p>

</body>
</html>
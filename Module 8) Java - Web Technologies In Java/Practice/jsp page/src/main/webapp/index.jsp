<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    // Create a list using scriptlet
    List<String> fruits = new ArrayList<String>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");

    // Store list in request scope
    request.setAttribute("fruitList", fruits);
%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP JSTL Example</title>
</head>
<body>

<h2>JSTL Iteration Example</h2>

<!-- JSTL forEach loop -->
<ul>
<c:forEach var="fruit" items="${fruitList}">
    <li>${fruit}</li>
</c:forEach>
</ul>

<hr>

<h2>Scriptlet Example</h2>
<%
    out.println("Current Date and Time: " + new Date());
%>

<hr>

<h2>Implicit Objects Example</h2>

<p>Request Method: <%= request.getMethod() %></p>
<p>Context Path: <%= application.getContextPath() %></p>
<p>Session ID: <%= session.getId() %></p>

</body>
</html>
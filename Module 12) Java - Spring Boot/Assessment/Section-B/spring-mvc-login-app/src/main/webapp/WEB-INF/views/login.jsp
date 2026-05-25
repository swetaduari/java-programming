<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Login</title>

    <link rel="stylesheet"
          href="/resources/css/style.css">
</head>

<body>

<div class="container">

    <h2>Login Form</h2>

    <form action="login" method="post">

        <input type="text"
               name="username"
               placeholder="Enter Username"
               required>

        <input type="password"
               name="password"
               placeholder="Enter Password"
               required>

        <button type="submit">Login</button>

    </form>

    <p class="error">${error}</p>

</div>

</body>
</html>

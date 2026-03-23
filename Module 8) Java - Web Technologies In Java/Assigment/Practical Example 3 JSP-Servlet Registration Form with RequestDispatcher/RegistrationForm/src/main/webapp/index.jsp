<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
    <h2>Registration Form</h2>
    
    <form action="RegisterServlet" method="post">
        Name: <input type="text" name="name" required /><br><br>
        Email: <input type="email" name="email" required /><br><br>
        Password: <input type="password" name="password" required /><br><br>
        
        <input type="submit" value="Register" />
    </form>
</body>
</html>
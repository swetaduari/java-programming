<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>OTP Verification Form</title>

<link href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css" rel="stylesheet" />

<style>
body {
  margin: 0;
  padding: 0;
  font-family: 'Poppins', sans-serif;
  height: 100vh;
  background: linear-gradient(135deg, #667eea, #764ba2);
  display: flex;
  justify-content: center;
  align-items: center;
}

.container {
  background: #fff;
  padding: 40px;
  border-radius: 15px;
  text-align: center;
  width: 320px;
  box-shadow: 0 10px 25px rgba(0,0,0,0.2);
  animation: fadeIn 0.8s ease-in-out;
}

@keyframes fadeIn {
  from { opacity: 0; transform: translateY(20px);}
  to { opacity: 1; transform: translateY(0);}
}

header i {
  font-size: 50px;
  color: #6a5af9;
  margin-bottom: 10px;
}

h4 {
  margin-bottom: 25px;
  color: #333;
}

.input-field {
  display: flex;
  justify-content: space-between;
}

.input-field input {
  width: 50px;
  height: 55px;
  border: 2px solid #ddd;
  border-radius: 10px;
  text-align: center;
  font-size: 22px;
  outline: none;
  transition: 0.3s;
}

.input-field input:focus {
  border-color: #6a5af9;
  box-shadow: 0 0 10px rgba(106,90,249,0.4);
}

input[type="submit"] {
  margin-top: 25px;
  width: 100%;
  padding: 12px;
  border: none;
  border-radius: 10px;
  background: linear-gradient(135deg, #6a5af9, #8360c3);
  color: white;
  font-size: 16px;
  cursor: pointer;
  transition: 0.3s;
}

input[type="submit"]:hover {
  transform: scale(1.05);
  box-shadow: 0 5px 15px rgba(0,0,0,0.2);
}

</style>
</head>

<body>
<div class="container">
  <header>
    <i class="bx bxs-check-shield"></i>
  </header>

  <h4>Enter OTP Code</h4>

  <form action="otpcheck.jsp">

    <div class="input-field">
      <input type="number" name="otp" />
      <input type="number" name="otp2" />
      <input type="number" name="otp3" />
      <input type="number" name="otp4" />
    </div>

    <input type="submit" value="Verify OTP"/>

  </form>
</div>
</body>
</html>
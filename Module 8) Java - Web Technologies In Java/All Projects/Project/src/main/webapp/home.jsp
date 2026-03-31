<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>WebWing</title>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: Arial, sans-serif;
}



.logo {
  color: #f1c40f;
  font-size: 28px;
}

/* Buttons */
.btn {
  background: #f1c40f;
  padding: 6px 12px;
  margin-left: 5px;
  border-radius: 5px;
  color: black;
  text-decoration: none;
  font-weight: bold;
  transition: 0.3s;
}

.btn:hover {
  background: #ffd700;
  transform: scale(1.1);
}

/* Marquee */
.marquee {
  background: #f1c40f;
  color: black;
  font-weight: bold;
  padding: 8px;
}

/* HERO SECTION */
.hero {
  height: 90vh;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
  color: white;

  /* Animated Gradient */
  background: linear-gradient(-45deg, #0b2c5a, #1a4c8b, #162447, #0b2c5a);
  background-size: 400% 400%;
  animation: gradientBG 10s ease infinite;
  position: relative;
  overflow: hidden;
}

/* Gradient Animation */
@keyframes gradientBG {
  0% { background-position: 0% 50%; }
  50% { background-position: 100% 50%; }
  100% { background-position: 0% 50%; }
}

/* Floating Circles Animation */
.hero::before, .hero::after {
  content: "";
  position: absolute;
  border-radius: 50%;
  opacity: 0.3;
}

.hero::before {
  width: 200px;
  height: 200px;
  background: #f1c40f;
  top: 10%;
  left: 10%;
  animation: float 6s infinite ease-in-out;
}

.hero::after {
  width: 300px;
  height: 300px;
  background: #ffffff;
  bottom: 10%;
  right: 10%;
  animation: float 8s infinite ease-in-out;
}

@keyframes float {
  0% { transform: translateY(0px); }
  50% { transform: translateY(-30px); }
  100% { transform: translateY(0px); }
}

/* Content */
.content {
  z-index: 2;
}

.content h2 {
  font-size: 50px;
  margin-bottom: 10px;
  animation: fadeIn 2s ease-in-out;
}

.content p {
  margin-bottom: 20px;
  animation: fadeIn 3s ease-in-out;
}

/* Fade Animation */
@keyframes fadeIn {
  from { opacity: 0; transform: translateY(20px); }
  to { opacity: 1; transform: translateY(0); }
}

/* Hero Button */
.hero-btn {
  background: #f1c40f;
  color: black;
  padding: 10px 20px;
  border-radius: 5px;
  text-decoration: none;
  font-weight: bold;
  transition: 0.3s;
  animation: fadeIn 4s ease-in-out;
}

.hero-btn:hover {
  background: #ffd700;
  transform: scale(1.1);
}


</style>

</head>
<body>

<!-- Top Bar -->
  


<!-- Marquee -->
<div class="marquee">
  <marquee>🔥 BIG SALE! 50% OFF | FREE HOSTING | LIMITED OFFER 🔥</marquee>
</div>

<!-- Hero -->
<section class="hero">
  <div class="content">
    <h2>Welcome to WEBWING</h2>
    <p>We create modern, animated and powerful websites</p>
    <a href="#" class="hero-btn">Get Started</a>
  </div>
</section>
<jsp:include page="footer.jsp"/>  
</body>
</html>
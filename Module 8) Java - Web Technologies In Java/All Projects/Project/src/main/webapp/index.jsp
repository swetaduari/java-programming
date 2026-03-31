<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WEBWING</title>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
<style>
/* ===== Global Styling ===== */
body {
    margin: 0;
    font-family: 'Poppins', 'Segoe UI', sans-serif;
    background-color: #f4f6f9;
}

/* ===== Announcement Bar ===== */
.marquee {
    background: linear-gradient(to right, #0056b3, #007bff, #0056b3);
    color: white;
    padding: 12px;
    text-align: center;
    font-weight: bold;
    font-size: 18px;
    letter-spacing: 1px;
    animation: fadeIn 2s ease-in-out;
    position: relative;
    z-index: 10;
}

/* ===== Hero Section ===== */
.hero {
    position: relative;
    height: 90vh;
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    color: white;
    overflow: hidden;
}

/* Background Images Animation */
.hero-bg-images {
    position: absolute;
    top: 0; left: 0; right: 0; bottom: 0;
    z-index: 1;
}

.hero-bg-images .bg-img {
    position: absolute;
    top: 0; left: 0; width: 100%; height: 100%;
    background-size: cover;
    background-position: center;
    opacity: 0;
    animation: fadeZoom 18s infinite;
}

/* Adding Premium Cloth Images */
.hero-bg-images .bg-img:nth-child(1) {
    background-image: url('https://images.unsplash.com/photo-1441984904996-e0b6ba687e04?q=80&w=1920&auto=format&fit=crop'); 
    animation-delay: 0s;
}

.hero-bg-images .bg-img:nth-child(2) {
    background-image: url('https://images.unsplash.com/photo-1489987707023-af81f1816f12?q=80&w=1920&auto=format&fit=crop'); 
    animation-delay: 6s;
}

.hero-bg-images .bg-img:nth-child(3) {
    background-image: url('https://images.unsplash.com/photo-1523381210434-271e8be1f52b?q=80&w=1920&auto=format&fit=crop'); 
    animation-delay: 12s;
}

/* Overlay gradient with the same color palette as requested */
.hero-overlay {
    position: absolute;
    top: 0; left: 0; width: 100%; height: 100%;
    /* Same color palette but semi-transparent */
    background: linear-gradient(-45deg, rgba(15,32,39,0.85), rgba(32,58,67,0.85), rgba(44,83,100,0.85), rgba(249,212,35,0.7), rgba(255,221,0,0.7));
    background-size: 400% 400%;
    animation: gradientMove 10s ease infinite;
    z-index: 2;
}

/* Hero Content Animation */
.hero .content {
    position: relative;
    z-index: 3;
    animation: slideUpFade 1.5s cubic-bezier(0.25, 0.46, 0.45, 0.94) forwards;
}

.hero .content h2 {
    font-size: 55px;
    margin-bottom: 15px;
    text-shadow: 2px 2px 8px rgba(0,0,0,0.6);
    text-transform: uppercase;
    letter-spacing: 2px;
}

.hero .content p {
    font-size: 22px;
    margin-bottom: 30px;
    font-weight: 300;
    text-shadow: 1px 1px 5px rgba(0,0,0,0.6);
    letter-spacing: 1px;
}

/* ===== Button Styling ===== */
.hero-btn {
    display: inline-block;
    padding: 14px 35px;
    background: linear-gradient(45deg, #ff5722, #ff9800);
    color: white;
    text-decoration: none;
    border-radius: 30px;
    font-weight: 600;
    letter-spacing: 1px;
    text-transform: uppercase;
    transition: 0.3s ease;
    box-shadow: 0 4px 15px rgba(255, 87, 34, 0.4);
    animation: pulse 2s infinite;
}

.hero-btn:hover {
    background: linear-gradient(45deg, #e64a19, #f57c00);
    transform: translateY(-3px) scale(1.05);
    box-shadow: 0 8px 25px rgba(255, 87, 34, 0.6);
}

/* ===== Animations ===== */

@keyframes fadeZoom {
    0% { opacity: 0; transform: scale(1); }
    10% { opacity: 1; }
    33% { opacity: 1; }
    43% { opacity: 0; }
    100% { opacity: 0; transform: scale(1.1); }
}

@keyframes fadeIn {
    from { opacity: 0; }
    to { opacity: 1; }
}

@keyframes slideUpFade {
    from {
        transform: translateY(50px);
        opacity: 0;
    }
    to {
        transform: translateY(0);
        opacity: 1;
    }
}

@keyframes pulse {
    0% { transform: scale(1); box-shadow: 0 4px 15px rgba(255, 87, 34, 0.4); }
    50% { transform: scale(1.05); box-shadow: 0 4px 25px rgba(255, 87, 34, 0.8); }
    100% { transform: scale(1); box-shadow: 0 4px 15px rgba(255, 87, 34, 0.4); }
}

@keyframes gradientMove {
    0% { background-position: 0% 50%; }
    50% { background-position: 100% 50%; }
    100% { background-position: 0% 50%; }
}

/* ===== Responsive ===== */
@media (max-width: 768px) {
    .hero .content h2 {
        font-size: 35px;
    }

    .hero .content p {
        font-size: 18px;
    }
    
    .hero-btn {
        padding: 12px 25px;
        font-size: 14px;
    }
}
</style>
</head>

<body>

<jsp:include page="header.jsp"/>

<!-- Announcement -->
<div class="marquee">
  <marquee>  BIG SALE! 50% OFF | FREE HOSTING | LIMITED OFFER </marquee> 
</div>

<!-- Hero Section -->
<section class="hero">
  <!-- Dynamic Clothing Image Layer -->
  <div class="hero-bg-images">
      <div class="bg-img"></div>
      <div class="bg-img"></div>
      <div class="bg-img"></div>
  </div>
  
  <!-- Gradient Overlay (same color palette) -->
  <div class="hero-overlay"></div>

  <div class="content">
    <h2><b>Welcome to WEBWING</b></h2>
    <p> fashion in sense fashion in mind </p>
    <a href="signin.jsp" class="hero-btn">Get Started</a>
  </div>
</section>

<jsp:include page="footer.jsp"/>

</body>
</html>

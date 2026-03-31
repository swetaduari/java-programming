<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>About - webwing</title>

   <!-- CSS SAME AS THEME -->
   <link rel="stylesheet" href="css/bootstrap.min.css">
   <link rel="stylesheet" href="css/style.css">
   <link rel="stylesheet" href="css/responsive.css">
   <link rel="stylesheet" href="css/owl.carousel.min.css">
   <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
   <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

   <style>
      .about_section {
         padding: 60px 0;
      }
      .about_title {
         font-size: 32px;
         font-weight: bold;
         margin-bottom: 20px;
      }
      .about_text {
         font-size: 16px;
         line-height: 28px;
         color: #555;
      }
      .feature_box {
         background: #f9f9f9;
         padding: 25px;
         border-radius: 8px;
         margin-top: 20px;
         text-align: center;
         transition: 0.3s;
      }
      .feature_box:hover {
         background: #f2db18;
         color: white;
      }
   </style>
</head>

<body class="main-layout">

<!-- HEADER (COPY SAME HEADER FROM YOUR THEME PAGE HERE) -->

<jsp:include page="header.jsp" />

<!-- ABOUT SECTION -->
<div class="about_section">
   <div class="container">
      <div class="row">

         <div class="col-md-6">
            <h2 class="about_title">About WebWing</h2>
            <p class="about_text">
               Welcome to <strong>WebWing</strong>, your one-stop destination for quality products and seamless online shopping.
               Our platform is designed to provide users with a smooth and secure experience while browsing and purchasing products.
            </p>

            <p class="about_text">
               We aim to deliver the best products at competitive prices while maintaining high standards of customer satisfaction.
               With a user-friendly interface, secure transactions, and fast delivery, WebWing ensures a reliable shopping journey.
            </p>

            <p class="about_text">
               Whether you're exploring new products, adding items to your wishlist, or managing your cart,
               our system is built to make everything simple and efficient.
            </p>
         </div>

         <div class="col-md-6">
            <img src="images/about_img2.jpg" alt="About Image" class="img-fluid">
         </div>

      </div>
   </div>
</div>

<!-- FEATURES SECTION -->
<div class="container">
   <div class="row">

      <div class="col-md-4">
         <div class="feature_box">
            <i class="fa fa-shopping-cart fa-3x"></i>
            <h4>Easy Shopping</h4>
            <p>Browse and purchase products بسهولة with a simple and clean interface.</p>
         </div>
      </div>

      <div class="col-md-4">
         <div class="feature_box">
            <i class="fa fa-heart fa-3x"></i>
            <h4>Wishlist Feature</h4>
            <p>Save your favorite items and access them anytime.</p>
         </div>
      </div>

      <div class="col-md-4">
         <div class="feature_box">
            <i class="fa fa-lock fa-3x"></i>
            <h4>Secure System</h4>
            <p>Your data and transactions are completely safe with us.</p>
         </div>
      </div>

   </div>
</div>

<!-- MISSION SECTION -->
<div class="about_section">
   <div class="container">
      <div class="row">

         <div class="col-md-12 text-center">
            <h2 class="about_title">Our Mission</h2>
            <p class="about_text">
               Our mission is to create a powerful and user-friendly e-commerce platform that connects customers
               with high-quality products while ensuring trust, speed, and satisfaction.
            </p>
         </div>

      </div>
   </div>
</div>

<!-- FOOTER -->
<footer>
   <div class="footer">
      <div class="container">
         <p style="text-align:center;">© 2026 WebWing. All Rights Reserved.</p>
      </div>
   </div>
</footer>



<!-- JS FILES -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/custom.js"></script>

</body>
</html>
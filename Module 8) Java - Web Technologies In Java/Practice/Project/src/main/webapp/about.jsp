<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Course | Tech Academy</title>
    <!-- Google Fonts -->
    <link
        href="https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;600;800&family=Inter:wght@400;500;700&display=swap"
        rel="stylesheet">
    <!-- Boxicons -->
    <link href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css" rel="stylesheet">
    
    
    <style>
    @charset "UTF-8";

/* Fonts */
:root {
    --bg-color: #040914;
    --text-color: #e2e8f0;
    --main-color: #00f0ff;
    --second-color: #bd00ff;
    --glass-bg: rgba(255, 255, 255, 0.03);
    --glass-border: rgba(76, 32, 32, 0.08);
}

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    text-decoration: none;
    border: none;
    outline: none;
    scroll-behavior: smooth;
    font-family: 'Inter', sans-serif;
}

body {
    background-color: var(--bg-color);
    color: var(--text-color);
    overflow-x: hidden;
    position: relative;
    background-image: radial-gradient(circle at 15% 50%, rgba(189, 0, 255, 0.1), transparent 30%),
                      radial-gradient(circle at 85% 30%, rgba(0, 240, 255, 0.1), transparent 30%);
}

html {
    font-size: 62.5%;
}

.blob-bg {
    position: absolute;
    width: 60rem;
    height: 60rem;
    background: linear-gradient(to right, var(--main-color), var(--second-color));
    filter: blur(150px);
    border-radius: 50%;
    z-index: -1;
    opacity: 0.2;
    top: -10%;
    left: -10%;
    animation: float 10s ease-in-out infinite alternate;
}

.blob-2 {
    top: 60%;
    left: auto;
    right: -10%;
    width: 50rem;
    height: 50rem;
    background: linear-gradient(to right, #ff007b, var(--second-color));
    animation-delay: 2s;
}

@keyframes float {
    0% { transform: translateY(0) scale(1); }
    100% { transform: translateY(50px) scale(1.1); }
}

h1, h2, h3, h4, h5, h6, .logo {
    font-family: 'Outfit', sans-serif;
}

/* Glassmorphism Classes */
.glass-card {
    background: var(--glass-bg);
    backdrop-filter: blur(15px);
    -webkit-backdrop-filter: blur(15px);
    border: 1px solid var(--glass-border);
    border-radius: 2rem;
    box-shadow: 0 8px 32px 0 rgba(0, 0, 0, 0.3);
}

.blur-element {
    background: rgba(4, 9, 20, 0.4);
    backdrop-filter: blur(8px);
    border-radius: 2rem;
    padding: 3rem;
}

/* Typography & Titles */
.heading {
    text-align: center;
    font-size: 4.8rem;
    margin-bottom: 5rem;
    font-weight: 700;
}
.heading span {
    color: var(--main-color);
    text-shadow: 0 0 10px rgba(0, 240, 255, 0.5);
}

/* Header */
.header {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    padding: 3rem 9%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    z-index: 100;
    transition: 0.3s;
    background: rgba(4, 9, 20, 0.7);
    backdrop-filter: blur(12px);
    border-bottom: 1px solid var(--glass-border);
}

.header.sticky {
    padding: 1.5rem 9%;
    background: rgba(4, 9, 20, 0.95);
    box-shadow: 0 .2rem 1rem rgba(0, 0, 0, 0.5);
}

.logo {
    font-size: 2.8rem;
    color: var(--text-color);
    font-weight: 800;
    cursor: pointer;
    letter-spacing: 1px;
}
.logo span {
    color: var(--main-color);
    text-shadow: 0 0 5px rgba(0, 240, 255, 0.4);
}

#menu-icon {
    font-size: 3.6rem;
    color: var(--text-color);
    display: none;
    cursor: pointer;
}

.navbar {
    display: flex;
    align-items: center;
}

.navbar a {
    font-size: 1.7rem;
    color: var(--text-color);
    margin-left: 4rem;
    font-weight: 500;
    transition: .3s;
    position: relative;
}

.navbar a::before {
    content: '';
    position: absolute;
    top: 100%;
    left: 0;
    width: 0;
    height: 2px;
    background: var(--main-color);
    transition: .3s;
}

.navbar a:hover::before, .navbar a.active::before {
    width: 100%;
    box-shadow: 0 0 10px var(--main-color);
}
.navbar a:hover, .navbar a.active {
    color: var(--main-color);
    text-shadow: 0 0 8px rgba(0, 240, 255, 0.3);
}

/* Navbar Button */
.btn-nav {
    display: inline-block;
    padding: 1rem 2.2rem !important;
    background: rgba(0, 240, 255, 0.1);
    border: 2px solid var(--main-color);
    border-radius: 4rem;
    box-shadow: 0 0 15px rgba(0, 240, 255, 0.3);
    font-weight: 600 !important;
}

.btn-nav::before {
    display: none;
}

.btn-nav:hover {
    background: var(--main-color);
    color: var(--bg-color) !important;
    text-shadow: none !important;
}

/* Buttons */
.btn {
    display: inline-block;
    padding: 1.2rem 2.8rem;
    background: transparent;
    border: 2px solid var(--main-color);
    border-radius: 4rem;
    box-shadow: 0 0 10px rgba(0, 240, 255, 0.2);
    font-size: 1.6rem;
    color: var(--main-color);
    letter-spacing: .1rem;
    font-weight: 600;
    transition: .5s ease;
    cursor: pointer;
    font-family: 'Outfit', sans-serif;
    position: relative;
    overflow: hidden;
    z-index: 1;
}

.btn::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 0%;
    height: 100%;
    background: var(--main-color);
    z-index: -1;
    transition: .5s ease;
}

.btn:hover::before {
    width: 100%;
    box-shadow: 0 0 20px var(--main-color);
}
.btn:hover {
    color: var(--bg-color);
}

/* Base Sections */
section {
    min-height: 100vh;
    padding: 12rem 9% 2rem;
    display: flex;
    align-items: center;
}

/* Hero Section */
.hero-about {
    gap: 5rem;
    justify-content: space-between;
}

.hero-content {
    flex: 1 1 50%;
}

.badge {
    display: inline-block;
    padding: 0.8rem 1.6rem;
    background: rgba(0, 240, 255, 0.1);
    border: 1px solid var(--main-color);
    color: var(--main-color);
    font-size: 1.3rem;
    border-radius: 5rem;
    font-weight: 600;
    margin-bottom: 2rem;
    text-transform: uppercase;
    letter-spacing: 1px;
}

.hero-content h1 {
    font-size: 5.8rem;
    font-weight: 800;
    line-height: 1.2;
    margin-bottom: 2rem;
}
.hero-content h1 span {
    background: linear-gradient(to right, var(--main-color), var(--second-color));
    -webkit-background-clip: text;
    background-clip: text;
    -webkit-text-fill-color: transparent;
    text-shadow: none;
}

.hero-content p {
    font-size: 1.7rem;
    line-height: 1.8;
    color: #94a3b8;
    margin-bottom: 3rem;
}

.stats-container {
    display: flex;
    gap: 3rem;
    margin-bottom: 4rem;
}

.stat-box h2 {
    font-size: 3.4rem;
    color: var(--text-color);
    margin-bottom: 0.5rem;
}
.stat-box p {
    font-size: 1.5rem;
    color: var(--main-color);
    font-weight: 600;
    margin-bottom: 0;
}

.hero-image-wrapper {
    flex: 1 1 40%;
    padding: 1.5rem;
    display: flex;
    align-items: center;
    justify-content: center;
    position: relative;
}

.hero-image-wrapper::after {
    content: '';
    position: absolute;
    width: 100%;
    height: 100%;
    border: 2px solid var(--second-color);
    border-radius: 2rem;
    top: 20px;
    right: -20px;
    z-index: -1;
    opacity: 0.5;
    transition: 0.5s;
}
.hero-image-wrapper:hover::after {
    top: 10px;
    right: -10px;
}

.hero-img {
    width: 100%;
    border-radius: 1rem;
    object-fit: cover;
    display: block;
}

/* Features grid */
.why-us {
    flex-direction: column;
    justify-content: center;
}

.features-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
    gap: 3rem;
    width: 100%;
}

.feature-card {
    padding: 4rem 3rem;
    text-align: center;
    transition: 0.4s;
    cursor: default;
    position: relative;
    overflow: hidden;
}

.feature-card::before {
    content: '';
    position: absolute;
    width: 0;
    height: 3px;
    bottom: 0;
    left: 0;
    background: linear-gradient(90deg, var(--main-color), var(--second-color));
    transition: 0.4s;
}

.feature-card:hover::before {
    width: 100%;
}

.feature-card:hover {
    transform: translateY(-10px);
    box-shadow: 0 15px 40px rgba(0,0,0,0.5);
    border-color: rgba(255,255,255,0.2);
}

.feature-icon {
    font-size: 5.5rem;
    color: var(--main-color);
    margin-bottom: 2rem;
    display: inline-block;
    filter: drop-shadow(0 0 15px rgba(0,240,255,0.4));
}

.feature-card h3 {
    font-size: 2.3rem;
    margin-bottom: 1.5rem;
}

.feature-card p {
    font-size: 1.5rem;
    color: #94a3b8;
    line-height: 1.6;
}

/* Course Journey */
.course-journey {
    gap: 5rem;
    justify-content: space-between;
}

.journey-content {
    flex: 1 1 50%;
}

.journey-content p {
    font-size: 1.7rem;
    color: #94a3b8;
    margin-bottom: 3rem;
    margin-top: -3rem;
    line-height: 1.8;
}

.journey-list {
    list-style: none;
}

.journey-list li {
    font-size: 1.8rem;
    display: flex;
    align-items: center;
    gap: 1.5rem;
    margin-bottom: 2rem;
    font-weight: 500;
}

.journey-list li i {
    color: var(--second-color);
    font-size: 2.6rem;
    filter: drop-shadow(0 0 8px rgba(189, 0, 255, 0.5));
}

.journey-visual {
    flex: 1 1 40%;
    padding: 1rem;
    position: relative;
    overflow: hidden;
}

.journey-img {
    width: 100%;
    border-radius: 1.5rem;
    object-fit: cover;
    transition: 0.5s;
}

.journey-visual:hover .journey-img {
    transform: scale(1.05);
}

/* Footer */
.footer {
    padding: 3rem 9%;
    background: rgba(4, 9, 20, 0.9);
    backdrop-filter: blur(10px);
    border-top: 1px solid var(--glass-border);
    text-align: center;
}

.footer p {
    font-size: 1.5rem;
    color: #64748b;
}

/* Animations Trigger */
.hidden {
    opacity: 0;
    transform: translateY(30px);
    transition: all 0.8s ease-out;
}
.show {
    opacity: 1;
    transform: translateY(0);
}

/* Responsive */
@media (max-width: 991px) {
    html {
        font-size: 55%;
    }
    .header {
        padding: 2rem 5%;
    }
    section {
        padding: 10rem 5% 2rem;
    }
}

@media (max-width: 768px) {
    #menu-icon {
        display: block;
    }
    .navbar {
        position: absolute;
        top: 100%;
        left: 0;
        width: 100%;
        padding: 1rem 5%;
        background: rgba(4, 9, 20, 0.95);
        backdrop-filter: blur(15px);
        border-bottom: 1px solid var(--glass-border);
        border-top: 1px solid var(--glass-border);
        display: none;
        flex-direction: column;
    }
    .navbar a {
        display: block;
        font-size: 2rem;
        margin: 2rem 0;
        text-align: center;
    }
    .navbar.active {
        display: flex;
    }
    
    .hero-about, .course-journey {
        flex-direction: column;
        text-align: center;
    }
    
    .stats-container {
        justify-content: center;
    }
    
    .journey-list li {
        justify-content: center;
        text-align: left;
    }
    
    .journey-content p {
        text-align: center;
    }
    .journey-content h2 {
        text-align: center !important;
    }
}
    
    </style>
</head>

<body>
    <div class="blob-bg"></div>
    <div class="blob-bg blob-2"></div>

    <!-- Header -->


    <!-- Hero Section -->
    <section class="hero-about" id="home">
        <div class="hero-content blur-element hidden">
            <div class="badge">Next Generation Tech Course</div>
            <h1>Master the Future of <span>Technology</span></h1>
            <p>Join an immersive, hands-on learning experience designed by industry leaders. We turn beginners into
                silicon valley ready engineers focusing on Web Development, AI, and cutting-edge software engineering
                principles.</p>
            <div class="stats-container">
                <div class="stat-box">
                    <h2>98%</h2>
                    <p>Placement</p>
                </div>
                <div class="stat-box">
                    <h2>500+</h2>
                    <p>Alumni</p>
                </div>
                <div class="stat-box">
                    <h2>40+</h2>
                    <p>Projects</p>
                </div>
            </div>
            <a href="#curriculum" class="btn">Explore Curriculum</a>
        </div>
        <div class="hero-image-wrapper glass-card hidden" style="transition-delay: 200ms;">
            <img src="images1/hero.png" alt="Tech Students" class="hero-img">
        </div>
    </section>

    <!-- Why Us Section -->
    <section class="why-us" id="curriculum">
        <h2 class="heading hidden">What You'll <span>Learn</span></h2>
        <div class="features-grid">
            <div class="feature-card glass-card hidden" style="transition-delay: 100ms;">
                <i class='bx bx-code-block feature-icon'></i>
                <h3>Full-Stack Web Dev</h3>
                <p>Master React, Node.js, and modern databases. Build scalable, real-world web applications from
                    scratch.</p>
            </div>
            <div class="feature-card glass-card hidden" style="transition-delay: 200ms;">
                <i class='bx bx-brain feature-icon'></i>
                <h3>Artificial Intelligence</h3>
                <p>Dive deep into neural networks, machine learning algorithms, and prompt engineering for next-gen
                    apps.</p>
            </div>
            <div class="feature-card glass-card hidden" style="transition-delay: 300ms;">
                <i class='bx bx-data feature-icon'></i>
                <h3>Data Science</h3>
                <p>Learn Python, pandas, and data visualization tools to extract meaningful insights from big data.</p>
            </div>
            <div class="feature-card glass-card hidden" style="transition-delay: 400ms;">
                <i class='bx bx-cloud-upload feature-icon'></i>
                <h3>Cloud Computing</h3>
                <p>Deploy applications on AWS, configure CI/CD pipelines, and master modern DevOps practices.</p>
            </div>
        </div>
    </section>

    <!-- Journey Section -->
    <section class="course-journey" id="journey">
        <div class="journey-content blur-element hidden">
            <h2 class="heading" style="text-align: left; margin-bottom: 2rem;">A Journey to <span>Excellence</span></h2>
            <p>Our curriculum is not just about watching videos. It's about building, breaking, and fixing code
                alongside a community of driven peers and expert mentors.</p>
            <ul class="journey-list">
                <li><i class='bx bx-check-circle'></i> 1:1 Mentorship from Senior Engineers</li>
                <li><i class='bx bx-check-circle'></i> Real-world Capstone Projects</li>
                <li><i class='bx bx-check-circle'></i> Mock Interviews & Career Prep</li>
                <li><i class='bx bx-check-circle'></i> 24/7 Community Support Slack</li>
            </ul>
        </div>
        <div class="journey-visual glass-card hidden" style="transition-delay: 200ms;">
            <img src="images1/bg.png" alt="Abstract Background" class="journey-img">
        </div>
    </section>

    <footer class="footer">
        <div class="footer-text">
            <p>Copyright &copy; 2026 Tech Academy | Designed for the Future</p>
        </div>
    </footer>

    <script src="about-script.js"></script>
</body>

</html>
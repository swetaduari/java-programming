<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"/>

	<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>


<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
	
		
		
		<form action="contactinsert.jsp">
			
		
		<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="fullname" class="form-control" placeholder="FullName"
					type="text" id="name">
					
			</div>
		
			<!-- form-group// -->
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="email" class="form-control" placeholder="Email address"
					type="email" id="email">
					
			</div>
			
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-phone"></i>
					</span>
				</div>
				<input name="phone" class="form-control" placeholder="Phone Number"
					type="number" id="phone">
					
			</div>
			
			<div class="form-group input-group">
    <div class="input-group-prepend">
        <span class="input-group-text">
            <i class="fa fa-comment"></i>
        </span>
    </div>
    <textarea name="feedback" class="form-control" placeholder="Feedback"
        id="feedback" rows="3"></textarea>
</div>
			<!-- form-group// -->
		
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">
					Submit</button>
			</div>
			
			
		</form>
		<span id="tops"></span>
		</article>
	</div>
	<!-- card.// -->



<jsp:include page="footer.jsp"/>

</body>
</html>
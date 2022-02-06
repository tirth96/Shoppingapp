<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-Commerce Website - Login Page</title>
<%@include file="components/css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<body>
<div class="container-fluid">
<div class="row mt-5">
	<div class="col-md-4 offset-md-4">
	<%@include file="components/messagepage.jsp" %>
		<div class="card">
			<div class ="card-body">
					<p class="fs-3 text-center">Login Form</p>
						<form action="LoginServlet" method="post">
						   <div>
						    	<label for="email" class="form-label">Email*</label>
						    	<input type="email" name="user_email" class="form-control" id="email" placeholder="Enter your Email Here" required="required">
						   </div>
						   <br>
						   <div>
						    	<label for="password" class="form-label">Password*</label>
						    	<input type="password" name= "user_password"class="form-control" id="password" placeholder="Enter your Password Here" required="required"
						    	pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,16}$">
						   </div>
						   <br>
						   <a href="register.jsp">Click here if not Registered!</a>
						   <br>
						   <div class="container text-center">
						   		<button type="submit" class="btn btn-primary">Submit</button>
						   		<button type="reset" class="btn btn-primary">Reset</button>
						   
						   </div>
						</form>	
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-Commerce Website - User Registration</title>
<%@include file="components/css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<div class="container-fluid">
<div class="row mt-5">
	<div class="col-md-4 offset-md-4">
	<%@include file="components/messagepage.jsp" %>
		<div class="card">
			<div class ="card-body">
					<p class="fs-3 text-center">Registration Form</p>
						<form action="RegisterServlet" method="post">
							<div>
						    	<label for="username" class="form-label">Username*</label>
						    	<input type="text" name="user_name" class="form-control" id="username" placeholder="Enter your Username Here" required="required">
						   </div>
						   <br>
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
						   <div>
						    	<label for="contactno" class="form-label">ContactNo*</label>
						    	<input type="text" class="form-control" name= "user_contactno"id="contactno"
						    	 placeholder="Enter your ContactNo. Here" 
						    	 pattern="[0-9]{3}[0-9]{3}[0-9]{4}"
						    	 required="required" maxlength="10">
						   </div>
						   <br>
						   <div>
						    	<label for="address" class="form-label">Address*</label>
						    	<input type="text" name="user_address" class="form-control" id="address" placeholder="Enter your Address" required="required">
						    	<div id="addressHelp" class="form-text">Address in 1234 Main St ,(Apartment, studio, or floor(whichever applicable))
						    	,City,State,zipcode
						    	</div>
						   </div>
						   <br>
						   <a href="login.jsp">Already Registered? Click here to Login</a>
						   <br>
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
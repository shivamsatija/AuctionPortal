<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Franchise Sign Up</title>
</head>
<body>
	<div>
	<h2>Admin Login</h2>
		<form action='<%=request.getContextPath()%>/FranchiseLoginServlet'  method='POST'>

			Please enter your emailId		
			<input type="text" name="franchiseId"/><br>
			
			Please Enter your Team Name
			<input type="text" name="franchiseTeamName"/><br>
			
			Please Enter your Owner
			<input type="text" name="franchiseOwner"/><br>
			
			Please Enter your Coach
			<input type="text" name="franchiseCoach"/><br>
			
			
			Please enter your password
			<input type="password" name="franchisePassword"/>
			
			<input type="submit" name ="franchiseSignUpLogin" value="Franchise SignUp">			
		
		</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Login Page</title>
</head>

<body>
	<div>
		<h2>Admin Login</h2>
		<form action='<%=request.getContextPath()%>/AdminLoginServlet'
			method='POST'>

			Please enter your username (emailId) 
			<input type="text" name="username" />
			<br>
			Please enter your password 
			<input type="password" name="password" /> <input type="submit"
				name="AdminLogin" value="submit">

		</form>
		<br> If not a registered Admin, please Sign up
		<form action="<%=request.getContextPath()%>/AdminSignUpServlet"
			method="POST">
			<input type="submit" value="Admin SignUp">
		</form>
	</div>


	<div>
		<h2>Franchise Login</h2>
		<form action='<%=request.getContextPath()%>/FranchiseLoginServlet'
			method="POST">

			Please enter your Franchise Id (emailId) <input type="text"
				name="franchiseId" /><br> Please enter your password <input
				type="password" name="franchisePassword" /> <input type="submit"
				name="franchiseSignUpLogin" value="Franchise Login">

		</form>
		<br> If not a registered Franchise, please Sign up
		<form action="<%=request.getContextPath()%>/FranchiseSignUpServlet"
			method="post">
			<input type="submit" value="Franchise SignUp">
		</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256" import="soaPackage.UserBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Auction</title>
</head>
<body>
	<center>
		<% UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");%>

		Welcome
		<%= currentUser.getEmailId()  %>
		<br>		
	</center>
</body>
</html>
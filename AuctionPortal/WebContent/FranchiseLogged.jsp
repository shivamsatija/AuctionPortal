<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256" import="franchise.FranchiseDetails"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Franchise Logged Successfully</title>
</head>
<body>
	<center>
		<% FranchiseDetails franchiseUser = (FranchiseDetails) session.getAttribute("FranchiseSessionUser");%>

		Welcome
		<%= franchiseUser.getFranchiseId()%> 
		to your home page
		
		<form action="<%=request.getContextPath()%>/FranchiseAuctionStartServlet"
		method="post">
        <input type="submit" name="AuctionStart" value="Franchise Start Auction">
		</form>
	</center>
</body>
</html>
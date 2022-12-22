<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VoteOnline: E-Voting Platform</title>
<link  rel ="stylesheet" href="style.css">
</head>
<body>
<%@include file ="navbar.jsp" %>

<div class="form-container">
<form action="User_Login" method="post">
<p>Enter Voter ID Number</p>
<label for="voterID">Voter ID NO</label><br>
<input type="text" id="voterID" name="voterID" placeholder="Enter Your Voter Number"><br>
<button type="submit">Login</button><br>
<a href = "admin_login.jsp">Admin Login</a>
</form>
</div>
</body>
</html>
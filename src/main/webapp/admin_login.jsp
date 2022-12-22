<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<link  rel ="stylesheet" href="style.css">
</head>
<body>
<%@include file ="navbar.jsp" %>

<div class="form-container">
<form action="Admin_Login" method="post">
<p>Admin Login</p>
<label for="aName">Name :</label><br>
<input type="text" id="aName" name="aName"><br>
<label for="password">Password :</label><br>
<input type="password" id="password" name="password"><br>
<button type="submit">Login</button><br>
</form>
</div>
</body>
</html>
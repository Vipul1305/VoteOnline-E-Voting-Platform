<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact us</title>
<link  rel ="stylesheet" href="style.css">
</head>
<%@include file ="navbar.jsp" %>
<body>

<div class="form-container">
<form action="Contact" method="post">
<p>Please fill details</p>
<label for="uName">Name :</label><br>
<input type="text" id="uName" name="uName">
<br>
<label for="phone_no">Phone No. :</label><br>
<input type="number" id="phone_no" name="phone_no">
<br>
<label for="email">Email :</label><br>
<input type="email" id="email" name="email">
<br>
<label for="comments">Comments :</label><br><br>
<textarea rows="4" cols= "26" name="comments"></textarea>
<br>
<button type="submit">Submit</button><br>
</form>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Register</title>
<link  rel ="stylesheet" href="style.css">
</head>
<body>

<nav>
<a href = "index.jsp">HOME</a> |
<a href = "aboutus.jsp">ABOUT</a> |
<a href = "logout.jsp">LOGOUT</a>
</nav>


<div class="form-container">
<form action= "VoterList" method= "post">
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
<label for="voterNo">Voter Card Number :</label><br>
<input type="text" id="voterNo" name="voterNo">
<br>
<label for="address">Address :</label><br>
<input type="text" id="address" name="address">
<br>
<label for="dob">Date of birth :</label><br>
<input type="date" id="dob" name="dob">
<br>
<button type="submit">Register</button><br>
</form>
</div>

</body>
</html>
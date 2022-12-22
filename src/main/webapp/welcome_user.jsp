<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome User!</title>
<link  rel ="stylesheet" href="style.css">
</head>
<body>
<%@include file ="navbar.jsp" %>

<div class="form-container">
<form action="Vote" method="post">
<label for="voterNo">Enter Your Voter Card No.</label><br>
<input type="text" id="voterNo" name="voterNo" placeholder="Enter Your Voter Number"><br><br>
<label for="partyName">Choose your Partie</label><br><br>
<select  name="partyName" id="partyName">
<option value="aap">Aam Aadmi Party</option>
<option value="bjp">BJP</option>
<option value="bsp">BSP</option>
<option value="congress">Congress</option>
<option value="cpi">CPI</option>
</select>
<br>
<button type="submit">Submit</button><br>
</form>
</div>
</body>
</html>
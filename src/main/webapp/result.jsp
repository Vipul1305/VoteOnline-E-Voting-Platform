<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.DriverManager" %>
<%@ page import ="java.sql.ResultSet" %>
<%@ page import ="java.sql.Statement" %>
<%@ page import ="java.sql.Connection" %>
<%@ page import ="java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
<link  rel ="stylesheet" href="style.css">
<%

int a[] = new int[100];

Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevotingdb","root","Vipul@singh1305");

PreparedStatement st = con.prepareStatement("select partie,count(partie)as c from vote group by partie");
ResultSet rs = ((java.sql.Statement)st).executeQuery("select partie,count(partie)as c from vote group by partie");

int i = 0;
while(rs.next()){
	int temp = Integer.valueOf(rs.getString("c"));
	a[i] = temp-1;
	i++;
}
%>

</head>

<body>
<%@include file ="admin_navbar.jsp" %>
<div class = "table">
<table>
<tr>
<th>Parties</th>
<th> Names </th>
<th> Votes </th>
</tr>
<tr>
<td> <img src="Image/Aap.jpg" alt="AAP Logo"> </td>
<td> Aam Aadmi Party </td>
<td> <%=a[0] %></td>
</tr>
<tr>
<td> <img src="Image/bjp.jpg" alt="BJP Logo"> </td>
<td> BJP </td>
<td> <%=a[1] %></td>
</tr>
<tr>
<td> <img src="Image/bsp.jpg" alt="BSP Logo"> </td>
<td> BSP </td>
<td> <%=a[2] %></td>
</tr>
<tr>
<td> <img src="Image/congress.png" alt="Congress Logo"> </td>
<td> Congress </td>
<td> <%=a[3] %></td>
</tr>
<tr>
<td> <img src="Image/CPI-banner.jpeg" alt="CPI Logo"> </td>
<td> CPI </td>
<td> <%=a[4] %></td>
</tr>
</table>
</div>
</body>
</html>
<%@ page import = "com.pack1.AdminBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
    <h1>
      <%
        AdminBean abean=(AdminBean)session.getAttribute("abean");
        out.println("<u>Welcome "+abean.getA_fname()+"</u><br><br>");
      %> 
      <a href="AddProduct.html">Add Products</a>
      <br> <br>
      <a href="view1">View Products</a>
      <br><br>
      <a href="Logout">Logout</a>
    </h1>

 
</body>
</html>
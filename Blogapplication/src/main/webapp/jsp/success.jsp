<%@ page language="java" contentType="text/html; charset=ISO-8859-1m
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login successfully</h1>

<table  border="2px" cellpadding="2">
    <tr>
    <th>ROLLNO</th>
    <th>NAME</th>
    <th>USERNAME</th>
    <th>PASSWORD</th>
    <th>ACTION</th>
    </tr>
    <c:forEach items="${data}" var="s">
    <tr>
        <td>${s.roolno}</td>
        <td>${s.name}</td>
        <td>${s.username}</td>
        <td>${s.password}</td>
         <td><a href="delete?roolno=${s.roolno}" >DELETE</a>||<a href="edit?roolno=${s.roolno}" >EDIT</a></td>
         
    </tr>
    </c:forEach>

</body>
</html>
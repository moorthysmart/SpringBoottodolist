<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task data</title>
</head>
<body>
<form action="gettaskdata"method="post">
Enter your Task_No:<input type="text" name="taskno"><br>
<input type="submit" value="Gettask">
</form>
click to go back to HomePage:<input type="button" value ="Homepage"onclick=window.location.href="http://localhost:8084/home">
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task data</title>
</head>
<body>
<form action="updatetaskdata"method="post">
Enter your Task_No(can't change Task_No):<input type="text" name="taskno"><br>
Enter your Task_name:<input type="text" name="taskname"><br>
Enter your Task_progress(True (Done) or False-(Not_done)):<input type="text" name="taskcomplete"><br>
<input type="submit" value="UpdateTask">
</form>
click to go back to HomePage:<input type="button" value ="Homepage"onclick=window.location.href="http://localhost:8084/home">
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Task</title>
</head>
<body>
<form action="gettask" method="post">
Enter your TaskNo:<input type="text" name="taskno"><br>
Enter your TaskName:<input type="text" name="taskname"><br>
Enter your Taskcompelte_(enter-false):<input type="text" name="taskcomplete"><br>
<input type="submit" value="AddNewTask">


</form>
click to go view your Task:<input type="button" value ="ViewAllTask"onclick=window.location.href="http://localhost:8084/alltaskdata">
click to go back to HomePage:<input type="button" value ="Homepage"onclick=window.location.href="http://localhost:8084/home">
</body>
</html>
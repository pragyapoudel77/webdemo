<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LogInservlet" method="post">
	
	<p style="color:red">${message}</p>
		UserName <input type="text" name="username"> <br> <br>
		Password <input type="password" name= "password"> <br><br>
		
		<input type="submit" value = "Login">
	</form>
</body>
</html>
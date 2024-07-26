<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SignUpServlet" method="post">
	
	<p style="color:red">${message}</p>
		FirstName<input type="text" name="firstname"><br> <br>
		LastName <input type="text" name="lastname"> <br> <br>
		UserName <input type="text" name="username"> <br> <br>
		Password <input type="password" name= "password"> <br><br>
		
		<input type="submit" value = "Signup">
	</form>
</body>
</html>
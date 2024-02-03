<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action=<%= request.getContextPath()%>/Controller  method="post" >
User Name:<input type="text" name="name" required><br>
Gender:<input type="radio" name="gender"checked> Male
     <input type = "radio" name="gender" >Female<br>
Languages Known :<br/><input type ="checkbox" name="language" value="Java">Java<br/>
 <input type ="checkbox" name="language" value="C">C<br>
 <input type ="checkbox" name="language" value="Python">Python<br>
 <input type="submit" value="Submit">
 </form>
</body>
</html>
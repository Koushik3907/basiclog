<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INFO</title>
</head>
<body>
Name :<%=request.getParameter("name") %><br>
Gender:<%=request.getParameter("Gender") %><br>
Languages:


<%
String [] languages =request.getParameterValues("language");
if(languages!=null){
for(int i=0;i<languages.length;i++){
	out.println("<br>");
	out.println(languages[i]);
}
}
%>

</body>
</html>
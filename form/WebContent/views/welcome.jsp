<%@ page language="java" session = "true" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> welcome user </h1>

<a href = "/form/views/happy.jsp">happy</a>
<a href = "/form/views/sad.jsp">sad</a>
<form action = "formvalidation" method = "post">
	<input type="submit" value = "logout">
	<input type = "hidden" name = "purpose" value = "logout">

</form>
</body>
</html>
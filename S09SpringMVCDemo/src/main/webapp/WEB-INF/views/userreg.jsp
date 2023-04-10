<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Registration</h1>
<form action="registeruser" method="post">
<pre>
Name:<input type="text" name="name"/>
Email:<input type="text" name="email"/>
Password:<input type="text" name="password"/>
<input type="submit" value="submit"/>


</pre>
<p>${"message"}</p>
<form>
<ul>
<c:forEach items="${users }" var="user">
<li>${user.id}|${user.email}|${user.password}</li>
</c:forEach>
</ul>

</form>
</form>
</body>
</html>
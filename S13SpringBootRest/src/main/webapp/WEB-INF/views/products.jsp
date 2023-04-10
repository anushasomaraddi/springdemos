<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
 <html>
 <head>
 
 <title></title>
 </head>
 <body>
 <h1>Manage Products</h1>
 <form action="products" method="post">
 
 <pre>
 
 Name:<input type="text" name="name"/>
 Description:<input type="text" name="desc"/>
 Price:<input type="text" name="price"/>
 <input type="submit" name="submit"/>
 
 </pre>
 </form>
 <p>${message}</p>
 <ul><c:forEach items="${products }" var="product">
 <li> ${product.id }|${product.name }|${product.desc }|${product.price}</li>
 </c:forEach></ul>
 </body>
 </html>
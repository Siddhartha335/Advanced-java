<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Database form</title>
</head>
<body>
<h1>Siddhartha Raut</h1>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<form action="database-form" method="post">
    <label>Name:</label>
    <input type="text" placeholder="Your Name" name="sname"> <br>
    <label>Email:</label>
    <input type="email" placeholder="Your email" name="semail"> <br>
    <label>Address:</label>
    <input type="text" placeholder="Your address" name="saddress"> <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
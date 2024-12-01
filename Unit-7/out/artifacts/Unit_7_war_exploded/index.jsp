<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>JSP - Database form</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Siddhartha Raut</h1>--%>
<%--<br/>--%>
<%--&lt;%&ndash;<a href="hello-servlet">Hello Servlet</a>&ndash;%&gt;--%>
<%--<form action="database-form" method="post">--%>
<%--    <label>Name:</label>--%>
<%--    <input type="text" placeholder="Your Name" name="sname"> <br>--%>
<%--    <label>Email:</label>--%>
<%--    <input type="email" placeholder="Your email" name="semail"> <br>--%>
<%--    <label>Address:</label>--%>
<%--    <input type="text" placeholder="Your address" name="saddress"> <br>--%>
<%--    <input type="submit" value="Submit">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Cookies</title>
</head>
<body>
<%
    // Create a cookie with a name and value
    String userName = "sidraut";
    Cookie userCookie = new Cookie("username", userName);
    // Set the cookie expiration time (in seconds)
    userCookie.setMaxAge(60 * 60); // 1 hour
    response.addCookie(userCookie); // Add the cookie to the response
%>
<h3>Cookie created successfully!</h3>
</body>
</html>

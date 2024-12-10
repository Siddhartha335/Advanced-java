<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World with Cookie and Session</title>
</head>
<body>
<!-- Display a simple Hello World message -->
<h1><%= "Hello World!" %></h1>

<br/>

<!-- Link to Create Cookie and Session -->
<p><a href="createCookieAndSession.jsp">Create Cookie and Session</a></p>

<!-- Link to Read Cookie and Session -->
<p><a href="readCookieAndSession.jsp">Read Cookie and Session</a></p>

<!-- Optional: Link to a Hello Servlet -->
<p><a href="hello-servlet">Hello Servlet</a></p>

<!-- Optionally, you can add a message indicating what happens on these links -->
<p>
  <strong>Note:</strong> The first link will create a cookie and a session with the username "SidRaut".<br/>
  The second link will display the username stored in the cookie and session.
</p>
</body>
</html>

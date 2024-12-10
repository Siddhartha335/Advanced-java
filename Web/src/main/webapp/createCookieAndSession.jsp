<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP- creating cookies and sessions</title>
</head>
<body>
  <h2>Create Cookie and Session</h2>
  <%
    // Create a Cookie
    String userName = "SidRaut";
    Cookie userCookie = new Cookie("username", userName);
    userCookie.setMaxAge(60 * 60); // Cookie will expire in 1 hour
    response.addCookie(userCookie); // Add the cookie to the response

    // Use the implicit session object (no need to declare it explicitly)
    session.setAttribute("username", userName); // Store username in session
  %>
  <h3>Cookie and Session created successfully!</h3>
  <p>${"Cookie and Session created successfully!"}</p>
  <p><a href="readCookieAndSession.jsp">Go to Read Cookie and Session</a></p>
</body>
</html>

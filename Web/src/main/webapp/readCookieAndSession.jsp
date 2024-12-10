<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP - Read Cookies and Sessions</title>
</head>
<body>
<h2>Read Cookie and Session</h2>
<%
  // Retrieve the cookie
  Cookie[] cookies = request.getCookies();
  String cookieUserName = null;

  if (cookies != null) {
    for (Cookie cookie : cookies) {
      if ("username".equals(cookie.getName())) {
        cookieUserName = cookie.getValue(); // Get the value of the "username" cookie
      }
    }
  }

  // Retrieve the session
  HttpSession session = request.getSession(false); // Don't create a new session if one doesn't exist
  String sessionUserName = (session != null) ? (String) session.getAttribute("username") : null;

  // Set attributes to be displayed using EL
  request.setAttribute("cookieUserName", cookieUserName);
  request.setAttribute("sessionUserName", sessionUserName);
%>

<!-- Display cookie and session values using EL -->
<h3>Cookie Username: ${cookieUserName != null ? cookieUserName : 'No cookie found!'}</h3>
<h3>Session Username: ${sessionUserName != null ? sessionUserName : 'No session found!'}</h3>

<p><a href="createCookieAndSession.jsp">Go back to Create Cookie and Session</a></p>
</body>
</html>

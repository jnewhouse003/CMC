<%@ page import = "Account.*" %>
<%@ page import = "user.*" %>
<%@ page import = "Admin.*" %>
<%@ page import = "DB.*" %>



// this just send the user to the Login page 
// doesn't actually logOut the user


<%
session.invalidate();
response.sendRedirect("index.jsp");

%>
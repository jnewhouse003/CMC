<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going to College</title>
</head>
 <%String un = (String)session.getAttribute("uName"); %>
<p> Welcome User: <%out.print(un); %></p>
<body>
	<a href="manageProfile.jsp">Manage My Profile</a><br>
	<a href="manageSavedSchools.jsp">Manage My Saved Schools</a><br>
	<a href="searchMenu.jsp">Search for Schools</a><br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%String un = (String)session.getAttribute("uName");
if(session == null){
	response.sendRedirect("index.jsp");
}
else{
%>
<style>
.logOut{
position:fixed;
left: 300px;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Going to College</title>
<form  action="logOutAction.jsp">
<label class="logOut">
<input type="submit" name="logOut" value="LogOut">
<input type="hidden" value="<%=un%>" name="log">
</label>
</form>
</head>
 
<p> Welcome User: <%out.print(un); %></p>
<body>
	<a href="manageProfile.jsp">Manage My Profile</a><br>
	<a href="manageSavedSchools.jsp">Manage My Saved Schools</a><br>
	<a href="searchMenu.jsp">Search for Schools</a><br>
</body>
<%} %>
</html>
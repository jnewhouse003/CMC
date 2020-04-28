<%@ page import = "Account.*" %>
<%@ page import = "user.*" %>
<%@ page import = "Admin.*" %>
<%@ page import = "DB.*" %>

// update user info

<%
		DBController dataBase = new DBController("goldencircle","csci230");
		AccountController temp = new AccountController();
		temp.createController(dataBase);
		temp.editUserInfo(dataBase.getAccount((String)session.getAttribute("uName")),request.getParameter("Password"), request.getParameter("FirstName"), request.getParameter("LastName"));
		
		 response.sendRedirect("logOnMenu.jsp");%>
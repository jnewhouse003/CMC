<%@ page import = "Account.*" %>
<%@ page import = "user.*" %>
<%@ page import = "Admin.*" %>
<%@ page import = "DB.*" %>

// update user info

<%AccountUI.createController((DBController)session.getAttribute("database"));
		AdminUI.createController((DBController)session.getAttribute("database"));
		UserUI.createController((DBController)session.getAttribute("database"),AccountUI.getAccountController());
		DBController temp = (DBController)session.getAttribute("database");
		
		UserUI.editUserInfo(temp.getAccount((String)session.getAttribute("uName")),request.getParameter("Password"), request.getParameter("FirstName"), request.getParameter("LastName"));
		
		 response.sendRedirect("manageProfile.jsp");%>
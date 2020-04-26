
<%@ page import = "javax.swing.*" %>
<%@ page import = "java.awt.*" %>
<%@ page import = "java.awt.event.*" %>
<%@ page import = "Account.*" %>
<%@ page import = "DB.DBController" %>
<%@page language="java" %>

<% String userName = request.getParameter("Username");
        String pass = request.getParameter("Password");
  
		DBController dataBase = new DBController("goldencircle","csci230");
		//session.setAttribute("database",dataBase);
		
		AccountController controller = new AccountController();
		controller.createController(dataBase);
	   
	   //If Type is a User go to response.sendRedirect("logOnMenu.jsp");
	   //If Type is Admin go to  response.sendRedirect("adminMenu.jsp");
	   
	   
	   // Set to just go to user's menu page username and password are not checked

	    
     if (controller.logOn(userName, pass) == true){
    	 if(dataBase.getAccount(userName).getType() =='u'){
    		 session.setAttribute("uName", userName);
    	     response.sendRedirect("logOnMenu.jsp");
   		 }
    	 else{
    		 session.setAttribute("uName", userName);
    	     response.sendRedirect("adminMenu.jsp");
    	 }
      }
      else{ %>
      <script>
      alert("WRONG USERNAME OR PASSWORD:");
      window.location.href = "index.jsp";
      </script>
      <%
       } %>
       
      
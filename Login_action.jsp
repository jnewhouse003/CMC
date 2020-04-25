
<%@ page import = "javax.swing.*" %>
<%@ page import = "java.awt.*" %>
<%@ page import = "java.awt.event.*" %>
<%@ page import = "Account.*" %>

<% String userName = request.getParameter("Username");
        String pass = request.getParameter("Password");
  
	   
	   //If Type is a User go to response.sendRedirect("logOnMenu.jsp");
	   //If Type is Admin go to  response.sendRedirect("adminMenu.jsp");
	   
	   
	   // Set to just go to user's menu page username and password are not checked

	    response.sendRedirect("logOnMenu.jsp");
    //  if ()){
    //  session.setAttribute("uName", userName);
    //     response.sendRedirect("logOnMenu.jsp");
    //  }
    //  else{ %>
      <script>
      alert("WRONG USERNAME:");
      window.location.href = "index.jsp";
      </script>
      <%
      // } %>
      
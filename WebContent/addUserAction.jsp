<%@ page import = "user.*" %>
<%@ page import = " DB.*" %>
// add user 


<% 	String userName = request.getParameter("Username");
    String pass = request.getParameter("Password");
    String firstName = request.getParameter("FirstName");
    String lastName = request.getParameter("LastName");  
    String type = request.getParameter("Type");
    char charType = type.charAt(0);
    String status = request.getParameter("Status");
   
    DBController dataBase = new DBController("goldencircle","csci230");
   
    
   
    dataBase.addUser(firstName, lastName,userName, pass, charType);

 response.sendRedirect("manageUser.jsp");%>
<%@page import = "java.util.ArrayList"
 %>
 <%@page import = "DB.*" %>
 <%@page import ="user.*" %>
// remove school from saved schools

 <% 
 DBController dataBase = new DBController("goldencircle","csci230");
 UserController UC = new UserController();
 UC.createDataBase(dataBase);
 UC.removeSavedSchool((String)session.getAttribute("uName"),request.getParameter("school"));
 
 
 response.sendRedirect("manageSavedSchools.jsp"); %>
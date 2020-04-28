<%@page import = "java.util.ArrayList"%>
<%@page import = "Account.*" %>
<%@page import = "user.*" %>
<%@page import = "DB.*" %>
<%@page import = "Criteria.Criteria" %>
<%@page import = "university.*" %>
//add school saved school list

<% 
AccountController AC = (AccountController)session.getAttribute("AC");
DBController dataBase = new DBController("goldencircle","csci230");
UserController UC = new UserController();
UC.createDataBase(dataBase, AC);
String school = request.getParameter("savedSchool");
UC.addSavedSchool((String)session.getAttribute("uName"), school);

response.sendRedirect("searchMenu.jsp");%>
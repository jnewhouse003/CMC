


<%@page import = "java.util.ArrayList"
 %>
 <%@page import = "DB.*" %>
 <%@page import ="user.*" %>
<html>
<head>
<title>Manage saved schools</title>
</head>
<a href="logOnMenu.jsp">back to menu</a><br><br>
<body>
	 
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>

	 
     
<tr align="center">

<td colspan="3" rowspan="1" style="vertical-align: top;">
School
</td>

</tr>

<%
DBController dataBase = new DBController("goldencircle","csci230");
UserController UC = new UserController();
UC.createDataBase(dataBase);
ArrayList<ArrayList<String>> savedSchools = UC.viewSavedSchool((String)session.getAttribute("uName"));
for(int i = 0; i < savedSchools.size(); i++ ){
	String name = savedSchools.get(i).get(1);
	%>

<tr>
<td style="vertical-align: top;">
<form method="post" action="removeSavedSchool.jsp" name="Remove">
    <input name="Remove" value="Remove" type="submit">
    <input name="Username" value="???" type="hidden">
    <input name= "school" value ="<%=name%>" type= "hidden">
</form>
</td>

<td style="vertical-align: middle;"> <%=name%>
</td>


<td>
<form method="post" action="viewSavedSchoolPage.jsp" name="View">
   <input name="View" value="view" type="submit">
    <input name="Username" value="???" type="hidden">
    <input name= "school" value ="<%=name%>" type= "hidden">
   </form> </td>
<%} %>

</tr>
</tbody>
</table>
</body>
</html>


<%@page import ="DB.*" %>
<%@page import = "java.util.ArrayList"
 %>
<html>
<head>
<title></title>
</head>
<body>
<%  DBController dataBase = new DBController("goldencircle","csci230"); %>
<a href="adminMenu.jsp">back to menu</a><br>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>

	
<tr align="center">

<td colspan="8" rowspan="1" style="vertical-align: top;"><a
href="addUser.jsp">Add new User</a>
</td>

</tr>
<tr>
<td style="vertical-align: top;">
</td>
<td style="vertical-align: top; text-align: center;">First 
</td>
<td style="vertical-align: top; text-align: center;">Last 
</td>
<td style="vertical-align: top; text-align: center;">Username
</td>
<td style="vertical-align: top; text-align: center;">Password
</td>
<td style="vertical-align: top; text-align: center;">Type
</td>
<td style="vertical-align: top; text-align: center;">Status
</td>
<td style="vertical-align: top;">
</td>
</tr>
<% for(int i = 0; i < dataBase.findallUsers().size();i++){
	String f = dataBase.findallUsers().get(i).getFirstName();
	String l = dataBase.findallUsers().get(i).getLastName();
	String un =  dataBase.findallUsers().get(i).getUserName();
	String pass =  dataBase.findallUsers().get(i).getPassword();
	char type =  dataBase.findallUsers().get(i).getType();
	

%>
<tr>
<td >
<form method="post" action="deactivateAction.jsp" style="text-align: center;" >
    <input name="deactivate" value="deactivate" type="submit" style= "text-align: center;">
    <input name="Username" value="???" type="hidden">
</form>


</td>
<td style="vertical-align: top;"><%=f %>
</td>
<td style="vertical-align: top;"><%=l %>
</td>
<td style="vertical-align: top;"><%=un %>
</td>
<td style="vertical-align: top;"><%=pass %>
</td>
<td style="vertical-align: top;"><%=type %>
</td>
<td style="vertical-align: top;">
<td style="vertical-align: top;">
<form method="post" action="viewOrEditUser.jsp" style=" text-align: center;">
    <input name="edit" value="edit" type="submit" style="vertical-align: center;">
    <input name="Username" value="<%=un%>" type="hidden">
</form>

</td>

</tr>
<%} %>
</tbody>
</table>
</body>
</html>


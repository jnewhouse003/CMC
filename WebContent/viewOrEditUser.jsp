<%@ page import = "DB.*" %>
<html>
<head>

<title>View/Edit a User</title>
</head>
<body>
<script>
  document.write('<a href="' + document.referrer + '">Go Back</a>');
</script><br><br>

View/Edit a User 
<br>
<form method="post" action="editUserAction.jsp" name="addUser"><br>
<table style="text-align: left; width: 100%;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<%String userName = request.getParameter("Username"); 
DBController dataBase = new DBController("goldencircle","csci230");
dataBase.lookUpUser(userName);

for(int i = 0; i < dataBase.findallUsers().size();i++){
	if(userName.equals(dataBase.findallUsers().get(i).getUserName())){
	String f = dataBase.findallUsers().get(i).getFirstName();
	String l = dataBase.findallUsers().get(i).getLastName();
	String un =  dataBase.findallUsers().get(i).getUserName();
	String pass =  dataBase.findallUsers().get(i).getPassword();
	char type =  dataBase.findallUsers().get(i).getType();


%>


<tr>
<td style="vertical-align: top;">First Name<br>
</td>
<td style="vertical-align: top;"><input name="FirstName" value="<%=f%>"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Last Name<br>
</td>
<td style="vertical-align: top;"><input name="LastName" value="<%=l%>"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Username<br>
</td>

<td style="vertical-align: top;"><input name="Username" value="<%=userName%>" readonly> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="Password" value="<%=pass%>"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Type<br>
</td>
<td style="vertical-align: top;"><input name="Type" value="<%=type%>"> </td>
</tr>

<tr>
<td style="vertical-align: top;">Status<br>
</td>
<td style="vertical-align: top;"><input name="Status"> </td>
</tr>
<%
	}
}

%>


</tbody>
</table>
<input value="Edit User" name="Add" type="submit">
<input value="Reset" name="Reset" type="reset">
<br>
</form>
<br>
</body>
</html>


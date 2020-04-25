<html>
<head>

<title>Edit User Form</title>
</head>
<body>
<br>
<a href="logOnMenu.jsp">back to menu</a>
<br>
<%String un = (String)session.getAttribute("uName"); %>

<form method="post" action="editUserAction.jsp" name="editUser"><br>
<table style="text-align: left; width: 266px; height: 228px;"
border="1" >
<tbody>
<tr>
<td style="vertical-align: top;">First Name<br>
</td>
<td style="vertical-align: top;"><input name="FirstName" value="???"><br>
</td>
</tr>
<tr>
<tr>
<td style="vertical-align: top;">Last Name<br>
</td>
<td style="vertical-align: top;"><input name="LastName" value="???"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Username<br>
</td>
<td style="vertical-align: top;"><input name="Username" value= <% out.println(un); %> readonly> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="Password" value="???"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Type<br>
</td>
<td style="vertical-align: top;"><input name="Type" value="???" readonly> </td>
</tr>




</tbody>
</table>
<br>
<input value="Edit"
name="Edit" type="submit">
<input value="Reset"
name="Reset" type="reset">
</form>
<br>
</body>
</html>


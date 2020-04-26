
<%@page import = "java.util.ArrayList"
 %>
<html>
<head>
<title></title>
</head>
<body>
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

<tr>
<td >
<form method="post" action="deactivateAction.jsp" style="text-align: center;" >
    <input name="deactivate" value="deactivate" type="submit" style= "text-align: center;">
    <input name="Username" value="???" type="hidden">
</form>




</td>
<td style="vertical-align: top;">
</td>
<td style="vertical-align: top;">
</td>
<td style="vertical-align: top;">
</td>
<td style="vertical-align: top;">
</td>
<td style="vertical-align: top;">
</td>
<td style="vertical-align: top;">
<td style="vertical-align: top;">
<form method="post" action="viewOrEditUser.jsp" style=" text-align: center;">
    <input name="edit" value="edit" type="submit" style="vertical-align: center;">
    <input name="Username" value="???" type="hidden">
</form>
</td>
</tr>
</tbody>
</table>
</body>
</html>





<%@page import = "java.util.ArrayList"
 %>
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


<tr>
<td style="vertical-align: top;">
<form method="post" action="removeSavedSchool.jsp" name="Remove">
    <input name="Remove" value="Remove" type="submit">
    <input name="Username" value="???" type="hidden">
</form>
</td>

<td style="vertical-align: middle;"> School Name
</td>


<td>
<form method="post" action="viewSavedSchoolPage.jsp" name="View">
   <input name="View" value="view" type="submit">
    <input name="Username" value="???" type="hidden">
   </form> </td>


</tr>
</tbody>
</table>
</body>
</html>


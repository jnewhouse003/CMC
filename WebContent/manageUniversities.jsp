
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

<td colspan="17" rowspan="1" style="vertical-align: top;"><a href="addUniversity.jsp">ADD a new University</a>
</td>

</tr>
<tr>
<td style="vertical-align: top;">School</td>
<td style="vertical-align: top; text-align: center;">State </td>
<td style="vertical-align: top; text-align: center;">Location </td>
<td style="vertical-align: top; text-align: center;">Control</td>
<td style="vertical-align: top; text-align: center;"># of Students</td>
<td style="vertical-align: top; text-align: center;">% Females</td>
<td style="vertical-align: top; text-align: center;">SAT Verbal</td>
<td style="vertical-align: top; text-align: center;">SAT Math</td>
<td style="vertical-align: top; text-align: center;">Expenses</td>
<td style="vertical-align: top; text-align: center;">% with Financial Aid</td>
<td style="vertical-align: top; text-align: center;">% of Applicants</td>
<td style="vertical-align: top; text-align: center;">% Admitted</td>
<td style="vertical-align: top; text-align: center;">% Enrolled</td>
<td style="vertical-align: top; text-align: center;">Academics Scale (1 - 5)</td>
<td style="vertical-align: top; text-align: center;">Social Scale (1 - 5)</td>
<td style="vertical-align: top; text-align: center;">Quality of Life Scale (1 - 5)</td>
<td style="vertical-align: top;"></td>
</tr>

<tr>

<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td style="vertical-align: top;"></td>
<td>
<form method="post" action="viewOrEditUniversity.jsp" style=" text-align: center;">
    <input name="edit" value="Edit" type="submit" style="vertical-align: center;">
    <input name="Username" value="???" type="hidden">
</form>
</td>

</tr>
</tbody>
</table>

</body>
</html>


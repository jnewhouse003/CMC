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
<tr>
<td style="vertical-align: top;">First Name<br>
</td>
<td style="vertical-align: top;"><input name="FirstName"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Last Name<br>
</td>
<td style="vertical-align: top;"><input name="LastName"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Username<br>
</td>
<td style="vertical-align: top;"><input name="Username" readonly> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="Password"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Type<br>
</td>
<td style="vertical-align: top;"><input name="Type"> </td>
</tr>

<tr>
<td style="vertical-align: top;">Status<br>
</td>
<td style="vertical-align: top;"><input name="Status"> </td>
</tr>



</tbody>
</table>
<input value="Edit User" name="Add" type="submit">
<input value="Reset" name="Reset" type="reset">
<br>
</form>
<br>
</body>
</html>


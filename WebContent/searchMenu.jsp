<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View saved School Page</title>
</head>
<h4 style="text-align:center"> Search Menu</h4>
<body>
<a href="logOnMenu.jsp">back to menu</a><br>
<form action="searchResults.jsp">
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>

	 
     
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by SCHOOL NAME
</td>
<td>
contains <input name="school" value="" >
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by STATE
</td>
<td>
contains <input name="state" value="" >
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by LOCATION
</td>
<td>
<input name="location" value="" > (SUBURBAN, URBAN, SMALL-CITY OR -LEAVE EMPTY for UKNOWN)
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by CONTROL
</td>
<td>
<input name="control" value="" > (PRIVATE, STATE, CITY OR LEAVE EMPTY for UKNOWN)
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by NUMBER OF STUDENTS
</td>
<td>
between <input name="numberOfStudents1" value="0" > and <input name="numberOfStudents2" value="0" >
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by % FEMALE
</td>
<td>
between <input name="female1" value="0.0" > and <input name="female2" value="0.0" >
</td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by SAT VERBAL
</td>
<td>
between <input name="satVerbal1" value="0" > and <input name="satVerbal2" value="0" >
</td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by SAT MATH
</td>
<td>
between <input name="satMath1" value="0" > and <input name="satMath2" value="0" >
</td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
by EXPENSES
</td>
<td>
between <input name="expenses1" value="0.0" > and <input name="expenses2" value="0.0" >
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by % FINANCIAL AID
</td>
<td>
 between <input name="financialAid1" value="0.0" > and <input name="financialAid2" value="0.0" >
</td>
</tr>


<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by NUMBER OF APPLICANTS
</td>
<td>
between <input name="numberOfApplicants1" value="0" > and <input name="numberOfApplicants2" value="0" >
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by % ADMITTED
</td>
<td>
between <input name="admitted1" value="0.0" > and <input name="admitted2" value="0.0" >
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by % ENROLLED
</td>
<td>
between <input name="enrolled1" value="0.0" > and <input name="enrolled2" value="0.0" >
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by ACADEMIC SCALE (1 - 5)
</td>
<td>
between <input name="academicScale1" value="0" > and <input name="academicScale2" value="0" >
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by SOCIAL SCALE (1 - 5)
</td>
<td>
between <input name="socialScale1" value="0" > and <input name="socialScale2" value="0" >
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by QUALITY OF LIFE SCALE (1 - 5)
</td>
<td>
between <input name="qualityOfLife1" value="0" > and <input name="qualityOfLife2" value="0" >
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
by EMPHASES
</td>
<td>
contains either <br>
<input name="emphases1" value="" ><br>
<input name="emphases2" value="" ><br>
<input name="emphases3" value="" ><br>
<input name="emphases4" value="" ><br>
<input name="emphases5" value="" ><br>
</td>
</tr>

</table>
<p><input name="searchForSchool" value="Search For Schools" type="submit"> <input name="resetForm" value="Reset Form" type="reset"></p>
</form>
</body>
</html>
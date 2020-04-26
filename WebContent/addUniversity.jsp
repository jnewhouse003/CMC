<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View saved School Page</title>
</head>
<body>
<form method="post" action="addUniversityAction.jsp" name="addUniverity"><br>
<table style="text-align: left; width: 45%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
     
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SCHOOL</td>
<td><input name="school" value="" ><br></td>
</tr>
<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">STATE</td>
<td><input name="state" value="" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">LOCATION</td>
<td><input name="location" value="" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">CONTROL</td>
<td><input name="control" value="" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">NUMBER OF STUDENTS</td>
<td><input name="numberOfStudents" value="" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">% FEMALE</td>
<td><input name="female" value="" ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SAT VERBAL</td>
<td><input name="satVerbal" value="" ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SAT MATH</td>
<td><input name="satMath" value="" ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">EXPENSES</td>
<td><input name="expenses" value="" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% FINANCIAL AID</td>
<td><input name="financialAid" value="" ><br></td>
</tr>


<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">NUMBER OF APPLICANTS</td>
<td><input name="numberOfApplicants" value="" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% ADMITTED</td>
<td><input name="admitted" value="" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% ENROLLED</td>
<td><input name="enrolled" value="" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">ACADEMIC SCALE (1 - 5)</td>
<td><input name="academicScale" value="" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">SOCIAL SCALE (1 - 5)</td>
<td><input name="socialScale" value="" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">QUALITY OF LIFE SCALE (1 - 5)</td>
<td><input name="qualityOfLife" value="" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">EMPASES</td>
<td>
<input name="financialAid1" value="" ><br>
<input name="financialAid2" value="" ><br>
<input name="financialAid3" value="" ><br>
<input name="financialAid4" value="" ><br>
<input name="financialAid5" value="" ><br>
</td>
</tr>
</table>
<input value="ADD SCHOOL" name="add" type="submit">
<input value="CANCLE CHANGES" name="cancle" type="reset">
<br>
</form>
</body>
</html>
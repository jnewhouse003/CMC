<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "university.*" %>
    <%@page import = "DB.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View School Page</title>
</head>
<body>
<script>
  document.write('<a href="' + document.referrer + '">Go Back</a>');
</script><br>
<table style="text-align: left; width: 45%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<%
DBController dataBase = new DBController("goldencircle","csci230");
University temp = dataBase.getUniversity((String)request.getParameter("school"));
String name = temp.getName();
String state = temp.getState();
String location = temp.getLocation();
String control = temp.getControl();
int numStudents = temp.getNumStudents();
double percentFemale = temp.getPercentFemale();
int verbalSAT = temp.getVerbalSAT();
int mathSAT = temp.getMathSAT();
double expenses = temp.getExpenses();
double financialAid = temp.getFinancialAid();
int numApplications = temp.getNumApplications();
double admitted = temp.getPercentAdmitted();
double enrolled = temp.getPercentEnrolled();
int academicScale = temp.getAcademicsScale();
int socialScale = temp.getSocialScale();
int lifeQualityScale = temp.getLifeQualityScale();



%>

	 
     
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
SCHOOL
</td>
<td>
<input name="school" value=<%=name%> readonly><br>
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
STATE
</td>
<td>
<input name="state" value=<%=state%>  readonly><br>
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
LOCATION
</td>
<td>
<input name="location" value=<%=location%>  readonly><br>
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
CONTROL
</td>
<td>
<input name="control" value=<%=control%>  readonly><br>
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
NUMBER OF STUDENTS
</td>
<td>
<input name="numberOfStudents" value=<%=numStudents%>  readonly><br>
</td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
% FEMALE
</td>
<td>
<input name="female" value=<%=percentFemale%> readonly><br>
</td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
SAT VERBAL
</td>
<td>
<input name="satVerbal" value=<%=verbalSAT%>  readonly><br>
</td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
SAT MATH
</td>
<td>
<input name="satMath" value=<%=mathSAT%>  readonly><br>
</td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">
EXPENSES
</td>
<td>
<input name="expenses" value=<%=expenses%>  readonly><br>
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
% FINANCIAL AID
</td>
<td>
<input name="financialAid" value=<%=financialAid%> readonly><br>
</td>
</tr>


<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
NUMBER OF APPLICANTS
</td>
<td>
<input name="numberOfApplicants" value=<%=numApplications%> readonly><br>
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
% ADMITTED
</td>
<td>
<input name="admitted" value=<%=admitted%>  readonly><br>
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
% ENROLLED
</td>
<td>
<input name="enrolled" value=<%=enrolled%>  readonly><br>
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
ACADEMIC SCALE (1 - 5)
</td>
<td>
<input name="academicScale" value=<%=academicScale%>  readonly><br>
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
SOCIAL SCALE (1 - 5)
</td>
<td>
<input name="socialScale" value=<%=socialScale%> readonly><br>
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
QUALITY OF LIFE SCALE (1 - 5)
</td>
<td>
<input name="qualityOfLife" value=<%=lifeQualityScale%>  readonly><br>
</td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">
EMPASES
</td>
<td>
<input name="financialAid1" value="???" readonly><br>
<input name="financialAid2" value="???" readonly><br>
<input name="financialAid3" value="???" readonly><br>
<input name="financialAid4" value="???" readonly><br>
<input name="financialAid5" value="???" readonly><br>
</td>
</tr>
</table>
</body>
</html>